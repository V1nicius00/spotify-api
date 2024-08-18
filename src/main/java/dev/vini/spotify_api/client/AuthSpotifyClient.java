package dev.vini.spotify_api.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "AuthSpotifyClient",
        url = "https://accounts.spotify.com"
)
public interface AuthSpotifyClient {

}
