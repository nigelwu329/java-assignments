package io.nigelwy.javaassignments.service;

import io.nigelwy.javaassignments.config.ShortUrlProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ShortUrlProperties.class)
public interface UrlGenerator {
    String generateShortUrl(String originUrl);
}
