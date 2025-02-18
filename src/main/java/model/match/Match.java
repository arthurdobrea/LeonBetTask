package model.match;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Match {
    private long id;
    private String name;
    private String nameDefault;
    private List<Competitor> competitors;
    private long kickoff;
    private long runnersCount;
    private long lastUpdated;
    private League league;
    private String betline;
    private boolean open;
    private String status;
    @JsonProperty("native")
    private boolean nativeGame;
    private String widgetType;
    private boolean widgetVirtual;
    private String url;
    private String matchPhase;
    private boolean hasMarketWithZeroMargin;
    private List<Market> markets;

    public List<Market> getMarkets() {
        return markets;
    }

    public long getRunnersCount() {
        return runnersCount;
    }

    public void setRunnersCount(long runnersCount) {
        this.runnersCount = runnersCount;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public boolean isHasMarketWithZeroMargin() {
        return hasMarketWithZeroMargin;
    }

    public void setHasMarketWithZeroMargin(boolean hasMarketWithZeroMargin) {
        this.hasMarketWithZeroMargin = hasMarketWithZeroMargin;
    }

    public String getMatchPhase() {
        return matchPhase;
    }

    public void setMatchPhase(String matchPhase) {
        this.matchPhase = matchPhase;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isWidgetVirtual() {
        return widgetVirtual;
    }

    public void setWidgetVirtual(boolean widgetVirtual) {
        this.widgetVirtual = widgetVirtual;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public boolean isNativeGame() {
        return nativeGame;
    }

    public void setNativeGame(boolean nativeGame) {
        this.nativeGame = nativeGame;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getBetline() {
        return betline;
    }

    public void setBetline(String betline) {
        this.betline = betline;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public long getKickoff() {
        return kickoff;
    }

    public void setKickoff(long kickoff) {
        this.kickoff = kickoff;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public String getNameDefault() {
        return nameDefault;
    }

    public void setNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
