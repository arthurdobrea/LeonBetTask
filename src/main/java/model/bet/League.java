package model.bet;


public class League {
    private long id;
    private String name;
    private String nameDefault;
    private String url;
    private int weight;
    private int prematch;
    private int inplay;
    private int outright;
    private boolean top;
    private int topOrder;
    private boolean hasZeroMarginEvents;
    private String logoUrl;
    private Object background;

    // Getters and Setters
    public long getId() {
        return id;
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

    public String getNameDefault() {
        return nameDefault;
    }

    public void setNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrematch() {
        return prematch;
    }

    public void setPrematch(int prematch) {
        this.prematch = prematch;
    }

    public int getInplay() {
        return inplay;
    }

    public void setInplay(int inplay) {
        this.inplay = inplay;
    }

    public int getOutright() {
        return outright;
    }

    public void setOutright(int outright) {
        this.outright = outright;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public int getTopOrder() {
        return topOrder;
    }

    public void setTopOrder(int topOrder) {
        this.topOrder = topOrder;
    }

    public boolean isHasZeroMarginEvents() {
        return hasZeroMarginEvents;
    }

    public void setHasZeroMarginEvents(boolean hasZeroMarginEvents) {
        this.hasZeroMarginEvents = hasZeroMarginEvents;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }
}

