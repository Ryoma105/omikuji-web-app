package com.example.omikuji;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmikujiController {

    @GetMapping("/api/omikuji")
    public String drawOmikuji() {

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        if (number <= 30) {
            return "大吉";
        } else if (number <= 80) {
            return "吉";
        } else {
            return "凶";
        }
    }
}