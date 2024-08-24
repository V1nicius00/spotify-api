package dev.vini.spotify_api.dto;

public class AlbumResponse {

    private AlbumWrapper albums;

    public AlbumResponse() {
    }

    public AlbumResponse(AlbumWrapper albums) {
        this.albums = albums;
    }

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }
}
