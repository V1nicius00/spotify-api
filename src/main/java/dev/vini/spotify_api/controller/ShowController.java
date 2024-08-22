package dev.vini.spotify_api.controller;

import dev.vini.spotify_api.client.Show;
import dev.vini.spotify_api.service.LoginService;
import dev.vini.spotify_api.service.ShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class ShowController {

    private final ShowService showService;
    private final LoginService loginService;
    public ShowController(ShowService showService, LoginService loginService) {
        this.showService = showService;
        this.loginService = loginService;
    }

    @GetMapping("/shows")
    public ResponseEntity<List<Show>> getShows(){
        var token = loginService.getAccessToken();
        return ResponseEntity.ok(showService.getShows(token));
    }

}
