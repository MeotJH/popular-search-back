package xyz.popularsearch.popularsearchback.youtube.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.popularsearch.popularsearchback.youtube.service.YoutubeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/youtube")
public class YoutubeController {

    private final YoutubeService youtubeService;

    @GetMapping
    public ResponseEntity members() {
        return youtubeService.get();
    }
}
