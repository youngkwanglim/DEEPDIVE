package com.spring.exp.mission0923.main.java.com.example.mywebservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Builder
    public User(String email, String password, String nickname, String auth) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    // 권한 반환
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    // 사용자의 id를 반환(고유한 값)
    @Override
    public String getUsername() {
        return email;
    }

    // 사용자의 패스워드 반환
    @Override
    public String getPassword() {
        return password;
    }

    // 계정 만료 여부 반환
    @Override
    public boolean isAccountNonExpired() {
        //return UserDetails.super.isAccountNonExpired();
        return true; // true : 만료되지 않음
    }

    // 계정 잠금 여부 반환
    @Override
    public boolean isAccountNonLocked() {
        //return UserDetails.super.isAccountNonLocked();
        return true; // true : 잠기지 않음
    }

    //패스워드 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {
        // return UserDetails.super.isCredentialsNonExpired();
        return true; // true : 만료되지 않음
    }

    // 게정 사용 가능 여부 반환
    @Override
    public boolean isEnabled() {
        // return UserDetails.super.isEnabled();
        return true; // true :
    }
}
