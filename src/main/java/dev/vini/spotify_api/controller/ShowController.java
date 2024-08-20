package dev.vini.spotify_api.controller;

import dev.vini.spotify_api.client.AuthSpotifyClient;
import dev.vini.spotify_api.client.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class ShowController {

    private final AuthSpotifyClient authSpotifyClient;

    public ShowController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/shows")
    public ResponseEntity<String> login(){
        var request = new LoginRequest(
                "client_credentials",
                "your_client_id",
                "your_client_secret"
        );

        return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken());
    }

}
