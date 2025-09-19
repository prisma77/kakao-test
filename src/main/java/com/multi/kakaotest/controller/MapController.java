package com.multi.kakaotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 지도 관련 페이지를 처리하는 컨트롤러
 * 카카오 지도 API를 활용한 다양한 지도 기능을 제공합니다.
 * 
 * @author KakaoTest Team
 * @version 1.0
 * @since 2024
 */
@Controller
public class MapController {

    /**
     * 기본 지도 페이지를 반환합니다.
     * 
     * @param model Spring MVC Model 객체
     * @return index 뷰 이름
     */
    @GetMapping("/map")
    public String map(Model model) {
        // 기본 지도 페이지로 이동
        return "index";
    }
    
    /**
     * 카카오 지도 데이터베이스 연동 페이지를 반환합니다.
     * 
     * @param model Spring MVC Model 객체
     * @return kakaodbIndex 뷰 이름
     */
    @GetMapping("/kakao")
    public String mapKaKao(Model model) {
        // 카카오 DB 연동 지도 페이지로 이동
        return "kakaodbIndex";
    }
    
    /**
     * 첫 번째 인덱스 페이지를 반환합니다.
     * 
     * @param model Spring MVC Model 객체
     * @return index-1 뷰 이름
     */
    @GetMapping("/index-1")
    public String index1Function(Model model) {
        // 인덱스-1 페이지로 이동
        return "index-1";
    }
    
    /**
     * 두 번째 인덱스 페이지를 반환합니다.
     * 
     * @param model Spring MVC Model 객체
     * @return index-2 뷰 이름
     */
    @GetMapping("/index-2")
    public String index2Function(Model model) {
        // 인덱스-2 페이지로 이동
        return "index-2";
    }
    
    /**
     * 세 번째 인덱스 페이지를 반환합니다.
     * 
     * @param model Spring MVC Model 객체
     * @return index-3 뷰 이름
     */
    @GetMapping("/index-3")
    public String index3Function(Model model) {
        // 인덱스-3 페이지로 이동
        return "index-3";
    }
}
