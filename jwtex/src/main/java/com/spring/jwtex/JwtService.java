package com.spring.jwtex;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String secretKey = "SpringSecurityKey_P@liverpool";

    // 토큰 생성
    public String create(
            Map<String, Object> claims,
            LocalDateTime expireAt
    ){
        var secretKeyBytes = Base64.getEncoder().encode(secretKey.getBytes());
        var key = Keys.hmacShaKeyFor(secretKeyBytes);

        var _expireAt = Date.from(expireAt.atZone(ZoneId.systemDefault()).toInstant());

        return Jwts.builder()
                .signWith(key, Jwts.SIG.HS256)
                .claims(claims)
                .expiration(_expireAt)
                .compact();
    }

    // 토큰 검증
    public void validation(String token){

    }
}
