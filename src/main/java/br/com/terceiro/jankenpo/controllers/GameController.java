package br.com.terceiro.jankenpo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.terceiro.jankenpo.models.Game;

@Controller
@RequestMapping("game")
public class GameController {
    @PostMapping("/result")
    public ResponseEntity<String> result(@RequestBody String userOption) {
        try {
            return ResponseEntity.ok(Game.getWinner(userOption));
        } catch (Exception e) {
            return ResponseEntity.status(422).body("Please select a valid option");
        }
    }
}
