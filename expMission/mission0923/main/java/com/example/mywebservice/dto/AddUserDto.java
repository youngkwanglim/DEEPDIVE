package com.spring.exp.mission0923.main.java.com.example.mywebservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class AddUserDto {
    private String email;
    private String password;
    private String nickname;
}
