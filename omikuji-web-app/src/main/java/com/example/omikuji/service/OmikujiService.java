package com.example.omikuji.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OmikujiService {

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