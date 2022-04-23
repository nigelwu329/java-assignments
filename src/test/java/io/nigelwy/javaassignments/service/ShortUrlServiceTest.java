package io.nigelwy.javaassignments.service;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.nigelwy.javaassignments.Constants.ANY;
import static org.assertj.core.api.Assertions.assertThat;

class ShortUrlServiceTest {

    private final ShortUrlService service = new ShortUrlService();

    @Nested
    class GenerateShortUrl {

        @Test
        void should_return_short_url() {
            assertThat(service.generateShortUrl(ANY)).isNotBlank();
        }

    }

    @Nested
    class GetOriginUrl {

        @Test
        void should_return_origin_url() {
            assertThat(service.getOriginUrl(ANY)).isNotBlank();
        }

    }

}