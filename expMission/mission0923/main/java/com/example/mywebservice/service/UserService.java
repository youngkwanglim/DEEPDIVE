package com.spring.exp.mission0923.main.java.com.example.mywebservice.service;

import com.example.mywebservice.dto.AddUserDto;
import com.example.mywebservice.entity.User;
import com.example.mywebservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserDto dto) {
        User user = User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword())) // 패스워드 암호화
                .nickname(dto.getNickname())
                .build();
        return userRepository.save(user).getId();
    }
}
