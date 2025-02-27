package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    @GetMapping("/recommendations/games")
    public List<String> getRecommendedGames() {
        return List.of("Game 1", "Game 2", "Game 3");
    }
}
