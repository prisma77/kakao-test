package com.multi.kakaotest.vo;

import lombok.Data;

@Data // Lombok: Getter, Setter, toString, EqualsAndHashCode, RequiredArgsConstructor 등을 자동으로 만들어줍니다.
public class TourismVO {

    private Long id; // 관광지 ID (PK)
    private String name; // 관광지 이름
    private String address; // 주소
    private String phone; // 전화번호
    private Double latitude; // 위도
    private Double longitude; // 경도

}