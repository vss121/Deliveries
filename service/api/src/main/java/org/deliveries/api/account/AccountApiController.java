package org.deliveries.api.account;

import lombok.RequiredArgsConstructor;
import org.deliveries.api.account.model.AccountMeResponse;
import org.deliveries.db.account.AccountEntity;
import org.deliveries.db.account.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("/me")
    public AccountMeResponse me() {

        return AccountMeResponse.builder()
                .name("홍길동")
                .email("a@gmail.com")
                .registeredAt(LocalDateTime.now())
                .build();
    }
}
