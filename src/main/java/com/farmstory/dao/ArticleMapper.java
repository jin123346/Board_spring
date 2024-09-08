package com.farmstory.dao;


import com.farmstory.dto.ArticleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    public void insertArticle(ArticleDTO articledto);
    public ArticleDTO selectArticle(String boardNo);
    public List<ArticleDTO> selectArticles();
    public void updateArticle(ArticleDTO articledto);
    public void deleteArticle(String boardNo);

}
