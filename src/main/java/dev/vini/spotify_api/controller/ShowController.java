package dev.vini.spotify_api.controller;

import dev.vini.spotify_api.client.AuthSpotifyClient;
import dev.vini.spotify_api.client.LoginRequest;
import dev.vini.spotify_api.client.Show;
import dev.vini.spotify_api.client.ShowSpotifyClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class ShowController {

    private final AuthSpotifyClient authSpotifyClient;

    private final ShowSpotifyClient showSpotifyClient;

    public ShowController(AuthSpotifyClient authSpotifyClient, ShowSpotifyClient showSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.showSpotifyClient = showSpotifyClient;
    }

    @GetMapping("/shows")
    public ResponseEntity<List<Show>> getShows(){
        var request = new LoginRequest(
                "client_credentials",
                "your_client_id",
                "your_client_secret"
        );
        var token = authSpotifyClient.login(request).getAccessToken();

        var response = showSpotifyClient.getShows("Bearer " + token);
        return ResponseEntity.ok(response.getShows());
    }

}
