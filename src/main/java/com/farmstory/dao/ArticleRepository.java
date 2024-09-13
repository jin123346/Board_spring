package com.farmstory.dao;


import com.farmstory.dto.ArticleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArticleRepository  extends JpaRepository<ArticleDTO, Integer> {

    public void insertArticle(ArticleDTO articledto);
    public ArticleDTO selectArticle(String boardNo);
    public List<ArticleDTO> selectArticles();
    public void updateArticle(ArticleDTO articledto);
    public void deleteArticle(String boardNo);

}
