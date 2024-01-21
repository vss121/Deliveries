package org.deliveries.api.config.objectmapper;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // config 커스텀해서 설정
public class ObjectMapperConfig {

    @Bean
    public ObjectMapper objectMapper() {
        var objectMapper = new ObjectMapper();

        objectMapper.registerModule(new Jdk8Module());  // jdk8 버전 이후 클래스

        objectMapper.registerModule(new JavaTimeModule());  // << local date

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);   // 모르는 json field에 대해서 무시

        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);    // 비어있는 bean

        // 날짜 관련 직렬화
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        // snake case
        objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategies.SnakeCaseStrategy());

        return objectMapper;

    }
}
