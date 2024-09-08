package com.farmstory.controller.article;

import com.farmstory.service.ArticleServicce;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Log4j2
@RequiredArgsConstructor
@Controller
public class BoardMainController {

    private ArticleServicce articleServicce;

    @GetMa
    public String list(){return "/article/list";}
    public String write(){return "/article/write";}
    public String modify(){return "/article/modify";}
    public String delete(){return "/article/delete";}


}
