package com.course.server.service;

import com.course.server.dao.ChapterDao;
import com.course.server.entity.Chapter;
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
    private ChapterDao chapterDao;

    public  List<Chapter> selectChapterAll(){
        System.out.println("ChapterService selectChapterAll...");
        return  chapterDao.selectChapterAll();
    }
}
