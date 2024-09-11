package com.farmstory.dao;


import com.farmstory.dto.ArticleDTO;

import java.util.List;

public interface ArticleMapper {

    public void insertArticle(ArticleDTO articledto);
    public ArticleDTO selectArticle(String boardNo);
    public List<ArticleDTO> selectArticles();
    public void updateArticle(ArticleDTO articledto);
    public void deleteArticle(String boardNo);

}
