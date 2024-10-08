package dev.vini.spotify_api.dto;

import dev.vini.spotify_api.model.Show;

import java.util.List;

public class ShowResponse {

    private List<Show> shows;

    public ShowResponse() {
    }

    public ShowResponse(List<Show> shows) {
        this.shows = shows;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
