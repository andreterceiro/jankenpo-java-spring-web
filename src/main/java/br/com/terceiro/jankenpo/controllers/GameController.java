package br.com.terceiro.jankenpo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.terceiro.jankenpo.models.Game;


@RestController
@RequestMapping("game")
public class GameController {
    @GetMapping("/play")
    public ResponseEntity<String> play() {
        return ResponseEntity.ok("Game started!");
    }

    @GetMapping("/result/{option}")
    public ResponseEntity<String> result(@PathVariable String option) {
        try {
            return ResponseEntity.ok(Game.getWinner(option).concat(" win!"));
        } catch (Exception e) {
            return ResponseEntity.status(422).body("Please select a valid option");
        }
    }

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestBody String userOption) {
        return ResponseEntity.ok("ok-".concat(userOption));
    }
}
