package dev.vini.spotify_api.controller;

import dev.vini.spotify_api.client.AlbumSpotifyClient;
import dev.vini.spotify_api.client.AuthSpotifyClient;
import dev.vini.spotify_api.model.Album;
import dev.vini.spotify_api.service.AlbumService;
import dev.vini.spotify_api.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AlbumService albumService;
    private final LoginService loginService;

    public AlbumController(AlbumService albumService, LoginService loginService) {
        this.albumService = albumService;
        this.loginService = loginService;
    }

    @GetMapping("/new/albums")
    public ResponseEntity<List<Album>> getNewReleases(){
        var token = loginService.getAccessToken();
        return ResponseEntity.ok(albumService.getNewReleases(token));
    }
}
