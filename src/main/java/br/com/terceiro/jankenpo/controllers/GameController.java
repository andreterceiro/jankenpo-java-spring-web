package br.com.terceiro.jankenpo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameController {
    @GetMapping("/play")
    public ResponseEntity<String> play() {
        return ResponseEntity.ok("Game started!");
    }

    @GetMapping("/result/{option}")
    public ResponseEntity<String> result(@PathVariable String option) {
        if (option.equals("paper")) {
            return ResponseEntity.ok("You win");            
        } else if (option.equals("rock")) {
            return ResponseEntity.ok("draw");            
        } else if (option.equals("scissors")) {
            return ResponseEntity.ok("You loss");            
        } else {
            ResponseEntity.status(422);
        }
        return null;
    }

}
