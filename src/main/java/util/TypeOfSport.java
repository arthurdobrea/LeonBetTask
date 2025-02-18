package util;

public enum TypeOfSport {
    FOOTBALL("Football"),TENNIS("Tennis"),HOCKEY("Ice Hockey"),BASKETBALL("Basketball");

    private final String sportName;

    TypeOfSport(String name) {
        this.sportName = name;
    }

    public String getSportName() {
        return sportName;
    }
}
