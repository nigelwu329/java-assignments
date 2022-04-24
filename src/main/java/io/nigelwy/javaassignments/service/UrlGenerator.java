package io.nigelwy.javaassignments.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ShortUrlProperties.class)
public interface UrlGenerator {
    String generateShortUrl(String originUrl);
}
