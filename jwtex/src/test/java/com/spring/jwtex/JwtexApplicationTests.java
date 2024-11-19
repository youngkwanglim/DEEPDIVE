package com.spring.jwtex;

import java.time.LocalDateTime;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwtexApplicationTests {
    @Autowired
    private JwtService jwtService;

    @Test
    void contextLoads() {
    }

    @Test
    void tokenCreate() {
        var claims = new HashMap<String, Object>();
        claims.put("user_id", 7777);

        var expiredAt = LocalDateTime.now().plusMinutes(10);

        var jwtToken = jwtService.create(claims, expiredAt);

        System.out.println(jwtToken);
    }
}
