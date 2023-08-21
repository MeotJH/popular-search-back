package xyz.popularsearch.popularsearchback.youtube.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import xyz.popularsearch.popularsearchback.youtube.dto.YoutubeDto;

import java.util.List;

@RequiredArgsConstructor
@Service
public class YoutubeServiceImplV1 implements YoutubeService{

    @Override
    public ResponseEntity get() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.googleapis.com/youtube/v3/videos?part=snippet&chart=mostPopular&maxResults=10&regionCode=kr&key=AIzaSyBP8scA3DtY86nU2O5WMotUnJZNE8cbtdo";
        return restTemplate.getForEntity(url, String.class);
    }
}
