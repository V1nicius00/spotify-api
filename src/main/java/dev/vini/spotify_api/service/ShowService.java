package dev.vini.spotify_api.service;

import dev.vini.spotify_api.model.Show;
import dev.vini.spotify_api.client.ShowSpotifyClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    private final ShowSpotifyClient showSpotifyClient;

    public ShowService(ShowSpotifyClient showSpotifyClient) {
        this.showSpotifyClient = showSpotifyClient;
    }

    public List<Show> getShows(String token, String ids){
        return showSpotifyClient.getShows("Bearer " + token, ids).getShows();
    }
}
