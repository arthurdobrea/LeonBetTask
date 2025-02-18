package model.match;

import java.util.List;

public class Market {
    private long id;
    private String typeTag;
    private String name;
    private long marketTypeId;
    private boolean open;
    private boolean hasZeroMargin;
    private boolean primary;
    private int cols;
    private String handicap;
    private List<Runner> runners;
    private Specifiers specifiers;
    private List<String> selectionTypes;

    public long getId() {
        return id;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeTag() {
        return typeTag;
    }

    public void setTypeTag(String typeTag) {
        this.typeTag = typeTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMarketTypeId() {
        return marketTypeId;
    }

    public void setMarketTypeId(long marketTypeId) {
        this.marketTypeId = marketTypeId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isHasZeroMargin() {
        return hasZeroMargin;
    }

    public void setHasZeroMargin(boolean hasZeroMargin) {
        this.hasZeroMargin = hasZeroMargin;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    public Specifiers getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(Specifiers specifiers) {
        this.specifiers = specifiers;
    }

    public List<String> getSelectionTypes() {
        return selectionTypes;
    }

    public void setSelectionTypes(List<String> selectionTypes) {
        this.selectionTypes = selectionTypes;
    }

    public void GetFormatedTable(){
        System.out.println(name);
        for (int i = 0; i < runners.size(); i++) {
            System.out.println(runners.get(i).getName() + " " + runners.get(i).getPriceStr() + " " + runners.get(i).getId());
        }
        System.out.println();
    }
}

