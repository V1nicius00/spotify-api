package dev.vini.spotify_api.service;

import dev.vini.spotify_api.client.AuthSpotifyClient;
import dev.vini.spotify_api.client.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final AuthSpotifyClient authSpotifyClient;

    public LoginService(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    public String getAccessToken(){
        var request = new LoginRequest(
                "client_credentials",
                "your_client_id",
                "your_client_secret"
        );
        return authSpotifyClient.login(request).getAccessToken();
    }
}
