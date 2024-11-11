package com.delivery.api.account;

import com.delivery.api.account.model.AccountResponse;
import com.delivery.api.common.api.Api;
import com.delivery.db.account.AccountRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    // http://localhost:8080/api/account/me
    @GetMapping("me")
    public Api<AccountResponse> me(){
        var response = AccountResponse.builder()
                        .name("살라")
                        .email("liverpool@naver.com")
                        .registeredAt(LocalDateTime.now())
                        .build();
        return Api.OK(response);
    }
}