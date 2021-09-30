package com.dragon.hazardragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 기본이 되는 첫 페이지는 뒤에 경로없이 웹페이지 작성하면 알아서 이 컨트롤러에 이 메소드가 호출됨
    @GetMapping
    public String index() {
        return "index";
    }
}
