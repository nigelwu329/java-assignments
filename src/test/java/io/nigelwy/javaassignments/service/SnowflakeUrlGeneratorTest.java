package io.nigelwy.javaassignments.service;

import io.nigelwy.javaassignments.util.Snowflake;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.nigelwy.javaassignments.Constants.ORIGIN_URL;
import static io.nigelwy.javaassignments.Constants.TIMEMILLIS;
import static io.nigelwy.javaassignments.Constants.TIMEMILLIS_SHORT_URL;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SnowflakeUrlGeneratorTest {

    @Mock
    private ShortUrlProperties properties;

    @Spy
    private Snowflake snowflake = new Snowflake(1L);

    @InjectMocks
    private SnowflakeUrlGenerator generator;

    @Nested
    class GenerateShortUrl {
        @Test
        void should_generate_short_url() {
            when(properties.getMaxLength()).thenReturn(8);
            when(snowflake.getId()).thenReturn(TIMEMILLIS);

            var shortUrl = generator.generateShortUrl(ORIGIN_URL);

            verify(snowflake).getId();
            assertThat(shortUrl).isEqualTo(TIMEMILLIS_SHORT_URL);
        }
    }

}