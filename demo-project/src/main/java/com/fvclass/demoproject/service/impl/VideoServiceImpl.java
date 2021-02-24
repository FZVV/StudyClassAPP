package com.fvclass.demoproject.service.impl;

import com.fvclass.demoproject.domain.Video;
import com.fvclass.demoproject.mapper.VideoMapper;
import com.fvclass.demoproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fv
 * @date 2021/2/23
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}