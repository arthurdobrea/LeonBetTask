package model.match;

class Region {
    private long id;
    private String name;
    private String nameDefault;
    private String family;
    private String url;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
