package com.farmstory.service;

import com.farmstory.dao.ArticleMapper;
import com.farmstory.dto.ArticleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleServicce {


    private ArticleMapper articleMapper;


    public void insertArticle(ArticleDTO articledto){articleMapper.insertArticle(articledto);}
    public ArticleDTO selectArticle(String boardNo){ return articleMapper.selectArticle(boardNo);}
    public List<ArticleDTO> selectArticles(){
        return articleMapper.selectArticles();
    }
    public void updateArticle(ArticleDTO articledto){articleMapper.updateArticle(articledto);}
    public void deleteArticle(String boardNo){articleMapper.deleteArticle(boardNo);}

}
