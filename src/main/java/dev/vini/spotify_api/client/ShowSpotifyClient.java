package dev.vini.spotify_api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "ShowSpotifyClient",
        url = "https://api.spotify.com"
)
public interface ShowSpotifyClient {

    @GetMapping("v1/shows")
    ShowResponse getShows(@RequestHeader("Authorization") String authorization);
}
