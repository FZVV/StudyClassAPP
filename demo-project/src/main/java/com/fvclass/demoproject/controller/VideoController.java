package com.fvclass.demoproject.controller;

import com.fvclass.demoproject.domain.Video;
import com.fvclass.demoproject.service.VideoService;
import com.fvclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频控制器
 * @author fv
 * @date 2021/2/23
 */
//@RestController返回对应json数据 =Controller+ResponseBody
//@Controller 不返回json数据

@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
//@RequestMapping(value = "list",method = RequestMethod.GET)

    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public  Object list(){
        List<Video> list = videoService.listVideo();

        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){

        System.out.println(video.toString());

        return JsonData.buildSuccess(video);
    }


}