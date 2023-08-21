package xyz.popularsearch.popularsearchback.youtube.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class YoutubeServiceImplV1 implements YoutubeService{

    @Value("${env.YOUTUBE_URL}")
    private String YOUTUBE_URL;

    @Override
    public ResponseEntity get() {

        RestTemplate restTemplate = new RestTemplate();
        String url = YOUTUBE_URL;
        return restTemplate.getForEntity(url, String.class);
    }
}
