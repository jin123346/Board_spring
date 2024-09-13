package com.farmstory.controller.article;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/introduction")
    public String introduction(String group,String cate) {
        return "introduction";
    }



}
