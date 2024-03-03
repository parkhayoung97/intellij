package com.hi.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDTO {
    private Long id;

    private String itemNm;

    private Integer price;

    private String  itemDetail;

    private String sellStatCd;

    private int stockNumber;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

}
