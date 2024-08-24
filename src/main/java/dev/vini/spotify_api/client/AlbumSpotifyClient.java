package dev.vini.spotify_api.client;

import dev.vini.spotify_api.dto.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {

    @GetMapping("v1/browse/releases")
    AlbumResponse getNewReleases(@RequestHeader("Authorization") String authorization);
}
