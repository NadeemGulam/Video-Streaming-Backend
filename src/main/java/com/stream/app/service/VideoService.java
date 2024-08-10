package com.stream.app.service;

import com.stream.app.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {
//    Save video

    Video save(Video video, MultipartFile file);

    //    Get Video by ID
    Video get(String videoId);

//    Get Video By Title

    Video getByTitle(String title);

    List<Video> getAll();
}

