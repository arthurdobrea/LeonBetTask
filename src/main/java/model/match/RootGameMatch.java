package model.match;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RootGameMatch {
    private boolean enabled;
    private String betline;
    private int totalCount;
    private String vtag;
    @JsonProperty("data")
    private List<Match> data;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getBetline() {
        return betline;
    }

    public void setBetline(String betline) {
        this.betline = betline;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getVtag() {
        return vtag;
    }

    public void setVtag(String vtag) {
        this.vtag = vtag;
    }

    public List<Match> getEvents() {
        return data;
    }

    public void setEvents(List<Match> events) {
        this.data = events;
    }
}