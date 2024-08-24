package dev.vini.spotify_api.client;

import dev.vini.spotify_api.dto.ShowResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "ShowSpotifyClient",
        url = "https://api.spotify.com"
)
public interface ShowSpotifyClient {

    @GetMapping("v1/shows")
    ShowResponse getShows(@RequestHeader("Authorization") String authorization,
                          @RequestParam String ids);
}
