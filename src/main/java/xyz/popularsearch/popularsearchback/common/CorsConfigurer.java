package xyz.popularsearch.popularsearchback.common;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class CorsConfigurer implements WebMvcConfigurer {

    private final ConfigurableEnvironment env;

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        String[] activeProfiles = env.getActiveProfiles();
        String corsUrl = CorsUrlEnum.getUrl(activeProfiles[0]);
        registry.addMapping("/**").allowedOrigins(corsUrl);
    }
}
