package xyz.popularsearch.popularsearchback.youtube.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import xyz.popularsearch.popularsearchback.youtube.dto.YoutubeDto;

import java.util.List;

@Service
public interface YoutubeService {
    public ResponseEntity get();
}
