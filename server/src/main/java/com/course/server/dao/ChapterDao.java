package com.course.server.dao;

import com.course.server.entity.Chapter;

import java.util.List;

/**
 * @author mingtu
 * @create 2024-03-30 10:22
 */
public interface ChapterDao {
    List<Chapter> selectChapterAll();
}
