package com.dragon.hazardragon.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // DB연동을위한 Model클래스임을 알림
@Data // lombok
public class Board {
    @Id // primary키임을 알림
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            // 기본값: AUTO(아래셋중하나로 결정됨)
    private String title;       // IDENTITY : 컬럼에서 AI쓸떈 그냥 Identity 많이하는편이다.
    private String content;     // SEQUENCE : 성능상 좋은데 SEQUENCE를 따로 설정할게 있다.
                                // TABLE    : table을 아예 따로만들어서 거기서 값을꺼내씀 .테이블락도걸리고 속도도 안좋다. 안쓰는게 좋다.
}
