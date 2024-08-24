package dev.vini.spotify_api.service;

import dev.vini.spotify_api.client.AlbumSpotifyClient;
import dev.vini.spotify_api.dto.AlbumResponse;
import dev.vini.spotify_api.model.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumService(AlbumSpotifyClient albumSpotifyClient) {
        this.albumSpotifyClient = albumSpotifyClient;
    }

    public List<Album> getNewReleases(String token){
        return albumSpotifyClient.getNewReleases("Bearer: " + token).getAlbums().getItems();
    }

}
