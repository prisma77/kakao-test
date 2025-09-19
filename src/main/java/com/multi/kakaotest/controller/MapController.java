package com.multi.kakaotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping("/map")
    public String map(Model model) {
        return "index";
    }
    @GetMapping("/kakao")
    public String mapKaKao(Model model) {
        return "kakaodbIndex";
    }
    @GetMapping("/index-1")
    public String index1Function(Model model) {
        return "index-1";
    }
    @GetMapping("/index-2")
    public String index2Function(Model model) {
        return "index-2";
    }
    @GetMapping("/index-3")
    public String index3Function(Model model) {
        return "index-3";
    }
}