import model.bet.Region;
import model.match.Market;
import model.match.Match;
import model.match.RootGameMatch;
import service.GetDataService;
import util.TypeOfSport;

import java.util.List;

import static util.UrlUtil.MatchUrl;
import static util.UrlUtil.leagueUrl;

public class Main {

    static GetDataService getDataService = new GetDataService();

    public static void main(String[] args) throws Exception {
        List<Region> result = getDataService.FindDesiredSportEvent(TypeOfSport.FOOTBALL);

        getDataService.ExcludeOtherLeaguesBesideTopTwo(result);

        List<Long> matchUrls = getDataService.ListOfMatches(result);

        String formatedUrl = String.format(leagueUrl, matchUrls.get(0));

        //Get all matches from league
        RootGameMatch matches = getDataService.FindAllMatchesToSpecificLeague(formatedUrl);

        //Get top 2 match from this league
        List<Match> listOfMatches = matches.getEvents().subList(0, 2);

        String matchUrl = String.format(MatchUrl, listOfMatches.get(0).getId());
        Match match = getDataService.FindDesiredMatch(matchUrl);
        match.getMarkets().forEach(Market::GetFormatedTable);
    }

}