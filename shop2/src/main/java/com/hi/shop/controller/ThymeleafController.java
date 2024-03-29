package com.hi.shop.controller;

import com.hi.shop.dto.ItemDTO;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {

    @GetMapping(value = "ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data","타임리프 예제입니다.");
        return "thymeleaf/thymeleafEX01";
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model){
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setItemDetail("상품 상세 설명");
        itemDTO.setItemNm(" 테스트 상품");
        itemDTO.setPrice(100000);
        itemDTO.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDTO",itemDTO);
        return "thymeleaf/thmeleafEx02";
    }

    @GetMapping(value = "/ex03")
    public String thymeleafExample03(Model model){
        List<ItemDTO> itemDTOList = new ArrayList<>();

        for(int i=1;i<=10;i++){
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemDetail("상품 상세 설명");
            itemDTO.setItemNm("테스트 상품" + i);
            itemDTO.setPrice(1000*i);
            itemDTO.setRegTime(LocalDateTime.now());

            itemDTOList.add(itemDTO);
        }

        model.addAttribute("itemDTOList", itemDTOList);
        return "thymeleaf/thmeleafEx03";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafExample04(Model model){
        List<ItemDTO> itemDTOList = new ArrayList<>();

        for(int i=1;i<=10;i++){
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemDetail("상품 상세 설명");
            itemDTO.setItemNm("테스트 상품" + i);
            itemDTO.setPrice(1000*i);
            itemDTO.setRegTime(LocalDateTime.now());

            itemDTOList.add(itemDTO);
        }

        model.addAttribute("itemDTOList", itemDTOList);
        return "thymeleaf/thmeleafEx04";
    }
    @GetMapping(value = "/ex05")
    public String thymeleafExample05(){
        return "thymeleaf/thmeleafEx05";
    }

    @GetMapping(value = "/ex07")
    public String thymeleafExample07(){
        return "thymeleaf/thmeleafEx07";
    }
}
