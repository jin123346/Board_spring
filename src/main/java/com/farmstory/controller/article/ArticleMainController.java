package com.farmstory.controller.article;

import com.farmstory.service.ArticleServicce;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@RequiredArgsConstructor
@Controller
public class ArticleMainController {

    private ArticleServicce articleServicce;

    @GetMapping("/article/list")
    public String list(Model model){
        String group = "introduction";
        String cate = "intro";
        String content="intro";
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        model.addAttribute("content",content);
        return "boardIndex";}

    @GetMapping("/article/write")
    public String write(Model model){
        String group = "community";
        String cate = "notice";
        String content="write";
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        model.addAttribute("content",content);
        return "/boardIndex";}

    public String modify(){return "/article/modify";}
    public String delete(){return "/article/delete";}


}
