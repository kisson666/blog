package com.wang.service;

import com.wang.model.Article;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by hppc on 2017/1/25.
 */
public interface ArticleService {
    List<Article> searcharticle(String title, String id);
    //List<Article> getrandarticle(); 随机查找文章
    String addarticle(String id,String title,String content,int privatesee);
    List<Article> allarticlesByid(String id);
    Article findArticleByCid(int cid);
    String updatearticlebycid(String content,int privatesee,int cid);
    String deletearticlebycid(int cid);
    List<Article> recentArticle();
}
