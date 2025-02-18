import model.bet.Region;
import model.match.Market;
import model.match.Match;
import model.match.RootGameMatch;
import service.GetDataService;
import util.TypeOfSport;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import static util.UrlUtil.MatchUrl;
import static util.UrlUtil.leagueUrl;

public class Main {

    static GetDataService getDataService = new GetDataService();

    public static void main(String[] args) throws Exception {
        List<Region> result = getDataService.FindDesiredSportEvent(TypeOfSport.HOCKEY);

        getDataService.ExcludeOtherLeaguesBesideTopTwo(result);

        List<Long> matchUrls = getDataService.ListOfMatches(result);

        List<String> matchLinks = matchUrls.stream().map(match -> String.format(leagueUrl, match)).collect(Collectors.toList());

        matchLinks.forEach(matchLink -> {
            RootGameMatch matches = getDataService.FindAllMatchesToSpecificLeague(matchLink);

            List<Match> listOfMatches = matches.getEvents().subList(0, 2);

            List<String> matchUrl = listOfMatches.stream().map(match -> String.format(MatchUrl, match.getId())).collect(Collectors.toList());

            matchUrl.forEach(url -> {
                Match match = getDataService.FindDesiredMatch(url);
                PrintAllInformation(match);
            });
        });

    }

    private static void PrintAllInformation(Match match) {
        System.out.println(match.getLeague().getSport().getName() + "," + match.getLeague().getRegion().getName() + " " + match.getLeague().getName());
        System.out.print(match.getName() + " ");
        System.out.println(convertToUTC(match.getKickoff()));
        System.out.println(match.getId());
        match.getMarkets().forEach(Market::GetFormatedTable);
    }

    private static String convertToUTC(long timestampMillis) {
        Instant instant = Instant.ofEpochMilli(timestampMillis);

        ZonedDateTime dateTime = instant.atZone(ZoneId.of("UTC"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss 'UTC'");
        String formattedDate = dateTime.format(formatter);
        return formattedDate;
    }

}