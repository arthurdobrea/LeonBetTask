package model.match;

import java.util.List;

public class MainMarket {
    private long id;
    private String name;
    private int weight;
    private List<Long> altMarketTypeIds;
    private boolean virtual;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Long> getAltMarketTypeIds() {
        return altMarketTypeIds;
    }

    public void setAltMarketTypeIds(List<Long> altMarketTypeIds) {
        this.altMarketTypeIds = altMarketTypeIds;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }
}