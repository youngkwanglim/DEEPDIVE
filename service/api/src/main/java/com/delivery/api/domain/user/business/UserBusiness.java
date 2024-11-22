package com.delivery.api.domain.user.business;

import com.delivery.api.common.annotation.Business;
import com.delivery.api.common.annotation.UserSession;
import com.delivery.api.domain.token.business.TokenBusiness;
import com.delivery.api.domain.token.controller.model.TokenResponse;
import com.delivery.api.domain.user.controller.model.UserLoginRequest;
import com.delivery.api.domain.user.controller.model.UserRegisterRequest;
import com.delivery.api.domain.user.controller.model.UserResponse;
import com.delivery.api.domain.user.converter.UserConverter;
import com.delivery.api.domain.user.model.User;
import com.delivery.api.domain.user.service.UserService;
import com.delivery.db.user.UserEntity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Business
public class UserBusiness {

    private final UserService userService;

    private final UserConverter userConverter;

    private final TokenBusiness tokenBusiness;

    /**
     *  사용자에 대한 가입 처리 로직
     *  1. request dto -> entity (converter)
     *  2. entity -> save (service)
     *  3. save entity -> response dto (converter)
     *  4. response return
     * */
    public UserResponse register(@Valid UserRegisterRequest request) {
        var entity = userConverter.toEntity(request);
        var newEntity = userService.register(entity);
        var response = userConverter.toResponse(newEntity);
        return response;
    }

    /**
     * 로그인 로직
     * 1. email, password를 가지고 사용차 체크
     * 2. user entity 로그인 확인
     * 3. token 생성 => 일단은 코드로 확인
     * 4. token response
     * */
    public TokenResponse login(@Valid UserLoginRequest request) {
        var userEntity = userService.login(request.getEmail(), request.getPassword());

        // 사용자가 없으면 throw

        // TODO: 토큰 생성
        var tokenResponse = tokenBusiness.issueToken(userEntity);

        return tokenResponse;
    }

    public UserResponse me(@UserSession User user) {
        var userEntity = userService.getUserWithThrow(user.getId());
        var response = userConverter.toResponse(userEntity);
        return response;
    }
}
