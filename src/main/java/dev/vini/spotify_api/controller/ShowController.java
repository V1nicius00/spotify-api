package dev.vini.spotify_api.controller;

import dev.vini.spotify_api.client.AuthSpotifyClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class ShowController {

    private final AuthSpotifyClient authSpotifyClient;

    public ShowController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }
}
