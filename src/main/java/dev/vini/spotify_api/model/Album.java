package dev.vini.spotify_api.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import feign.form.FormProperty;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {

    private String id;
    private String name;
    @FormProperty(value = "release_date")
    private String releaseDate;
    @FormProperty(value = "total_tracks")
    private Integer totalTracks;

    public Album() {
    }

    public Album(String id, String name, String releaseDate, Integer totalTracks) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.totalTracks = totalTracks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }
}
