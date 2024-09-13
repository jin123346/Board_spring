package com.farmstory.service;

import com.farmstory.dao.ArticleRepository;
import com.farmstory.dao.CateRepository;
import com.farmstory.dto.ArticleDTO;
import com.farmstory.dto.CateDTO;
import com.farmstory.entity.Cate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleServicce {


    private ArticleRepository articleMapper;
    private CateRepository cateRepository;

    public void insertArticle(ArticleDTO articledto){articleMapper.insertArticle(articledto);}
    public ArticleDTO selectArticle(String boardNo){ return articleMapper.selectArticle(boardNo);}
    public List<ArticleDTO> selectArticles(){
        return articleMapper.selectArticles();
    }
    public void updateArticle(ArticleDTO articledto){articleMapper.updateArticle(articledto);}
    public void deleteArticle(String boardNo){articleMapper.deleteArticle(boardNo);}



    //category 가져오기
    public CateDTO selectCategory(int cateNo){
        Optional<Cate> opt = cateRepository.findById(cateNo);

        if(opt.isPresent()){
            Cate cate = opt.get();
            return cate.toDTO();
        }
        return null;

    }
}
