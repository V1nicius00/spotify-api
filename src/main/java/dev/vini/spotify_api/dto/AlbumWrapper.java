package dev.vini.spotify_api.dto;

import dev.vini.spotify_api.model.Album;

import java.util.List;

public class AlbumWrapper {

    private List<Album> items;

    public AlbumWrapper() {
    }

    public AlbumWrapper(List<Album> items) {
        this.items = items;
    }

    public List<Album> getItems() {
        return items;
    }

    public void setItems(List<Album> items) {
        this.items = items;
    }
}
