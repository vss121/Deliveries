package org.deliveries.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
//@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) // objectMapper에서 공통으로 처리
public class AccountMeResponse {

    private String email;

    private String name;

    private LocalDateTime registeredAt;

}
