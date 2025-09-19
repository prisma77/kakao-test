package com.multi.kakaotest.controller;

import com.multi.kakaotest.vo.TourismVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// import com.multi.kakaotest.service.TourismService; // Service 클래스
// import com.multi.kakaotest.vo.TourismVO; // 데이터 담을 VO 클래스

// @RestController는 페이지(HTML)가 아닌 데이터(JSON)를 반환합니다.
@RestController
public class TourismApiController {

    // @Autowired
    // private TourismService service;

    @GetMapping("/api/tourism")
    public ResponseEntity<Page<TourismVO>> getTourismData(Pageable pageable, @RequestParam(required = false) String region) {
        // 1. TourismService를 호출해서 DB로부터 관광지 데이터를 가져옵니다. (페이징 처리 포함)
        // Page<TourismVO> tourismPage = service.getTourismList(pageable, region);

        // 2. 가져온 데이터를 ResponseEntity에 담아 반환합니다.
        // return ResponseEntity.ok(tourismPage);

        // --- 아래는 실제 코드가 없을 경우를 위한 임시 데이터 반환 예시 ---
        // 실제로는 위 주석 처리된 코드를 구현해야 합니다.
        System.out.println("API 호출됨: page=" + pageable.getPageNumber() + ", size=" + pageable.getPageSize() + ", region=" + region);
        return ResponseEntity.ok().build(); // 임시로 빈 응답 반환
    }
}