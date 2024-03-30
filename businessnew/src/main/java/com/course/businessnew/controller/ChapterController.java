package com.course.businessnew.controller;

import com.course.server.dto.ResponseDto;
import com.course.server.entity.Chapter;
import com.course.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 大章控制层
 *
 * @author mingtu
 * @create 2024-03-30 10:19
 */
@RestController
@RequestMapping("/chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping("/selectChapterAll")
    public ResponseDto selectChapterAll(){
        System.out.println("ChapterController selectChapterAll....");
        List<Chapter> chapterList = chapterService.selectChapterAll();
        ResponseDto responseDto=new ResponseDto();
        responseDto.setData(chapterList);
        return responseDto;
    }
}
