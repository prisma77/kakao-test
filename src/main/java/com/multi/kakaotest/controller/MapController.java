package com.multi.kakaotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MapController {

    @GetMapping("/map")
    public String map(Model model) {
        // 기본 지도 페이지로 이동
        return "index";
    }

    @GetMapping("/kakao")
    public String mapKaKao(Model model) {
        // 카카오 DB 연동 지도 페이지로 이동
        return "kakaodbIndex";
    }

    @GetMapping("/index-1")
    public String index1Function(Model model) {
        // 인덱스-1 페이지로 이동
        return "index-1";
    }

    @GetMapping("/index-2")
    public String index2Function(Model model) {
        // 인덱스-2 페이지로 이동
        return "index-2";
    }

    @GetMapping("/index-3")
    public String index3Function(Model model) {
        // 인덱스-3 페이지로 이동
        return "index-3";
    }

    @GetMapping("/tourism-list")
    public String tourismList(Model model) {
        // 관광지 페이지별 목록보기 페이지로 이동
        return "tourism-list";
    }
}
