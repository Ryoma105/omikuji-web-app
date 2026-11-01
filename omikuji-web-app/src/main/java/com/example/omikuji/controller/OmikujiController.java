package com.example.omikuji.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.omikuji.service.OmikujiService;

@RestController
public class OmikujiController {

    private final OmikujiService omikujiService;

    public OmikujiController(OmikujiService omikujiService) {
        this.omikujiService = omikujiService;
    }

    @GetMapping("/api/omikuji")
    public String drawOmikuji() {
        return omikujiService.drawOmikuji();
    }
}