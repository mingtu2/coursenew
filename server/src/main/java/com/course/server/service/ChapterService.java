package com.course.server.service;

import com.course.server.dao.ChapterMapper;
import com.course.server.entity.Chapter;
import com.course.server.entity.ChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mingtu
 * @create 2024-03-30 10:22
 */
@Service
public class ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;

    public  List<Chapter> selectChapterAll(){
        System.out.println("ChapterService selectChapterAll...");
        ChapterExample chapterExample=new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("1007"); //增加查询条件
        chapterExample.setOrderByClause("id desc"); // 排序
      //  BeanUtils.copyProperties(tource, Target);//复制
        return  chapterMapper.selectByExample(chapterExample);
    }
}
