package model.match;


import java.util.List;

public class Sport {
    private long id;
    private String name;
    private int weight;
    private String family;
    private List<MainMarket> mainMarkets;
    private boolean virtual;
    private String url;
    public List<MarketGroup> marketGroups;

    public long getId() {
        return id;
    }

    public List<MarketGroup> getMarketGroups() {
        return marketGroups;
    }

    public void setMarketGroups(List<MarketGroup> marketGroups) {
        this.marketGroups = marketGroups;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public List<MainMarket> getMainMarkets() {
        return mainMarkets;
    }

    public void setMainMarkets(List<MainMarket> mainMarkets) {
        this.mainMarkets = mainMarkets;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}