package service;

import model.bet.Region;
import model.bet.Sport;
import model.match.Match;
import model.match.RootGameMatch;
import util.TypeOfSport;

import java.util.List;
import java.util.stream.Collectors;

import static util.UrlUtil.getAllSports;

public class GetDataService {
    private SportRequestTemplate sportRequestTemplate = new SportRequestTemplate();

    public List<Region> FindDesiredSportEvent(TypeOfSport typeOfSport){
        List<Sport> sports = sportRequestTemplate.fetchListFromApi(getAllSports, Sport.class);

        return sports.stream()
                .filter(sport -> sport.getName().equals(typeOfSport.getSportName()))
                .flatMap(sport -> sport.getRegions().stream())
                .filter(region -> region.getLeagues().stream()
                        .anyMatch(league -> league.isTop() && (league.getTopOrder() == 0)))
                .limit(1)
                .collect(Collectors.toList());
    }

    public void ExcludeOtherLeaguesBesideTopOne(List<Region> result){
        result.forEach(region ->
                region.setLeagues(region.getLeagues().stream()
                        .filter(league -> league.isTop() && (league.getTopOrder() == 0))
                        .limit(1)
                        .collect(Collectors.toList()))
        );
    }
    public List<Long> ListOfMatches(List<Region> result){
        return result.stream()
                .flatMap(region -> region.getLeagues().stream()
                        .map(league -> league.getId()))
                .collect(Collectors.toList());
    }

    public RootGameMatch FindAllMatchesToSpecificLeague(String Url){
        return sportRequestTemplate.fetchFromApi(Url, RootGameMatch.class);
    }

    public Match FindDesiredMatch(String Url){
        return sportRequestTemplate.fetchFromApi(Url, Match.class);
    }
}
