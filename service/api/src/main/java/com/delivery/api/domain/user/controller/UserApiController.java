package com.delivery.api.domain.user.controller;

import com.delivery.api.common.annotation.UserSession;
import com.delivery.api.common.api.Api;
import com.delivery.api.domain.user.business.UserBusiness;
import com.delivery.api.domain.user.controller.model.UserResponse;
import com.delivery.api.domain.user.model.User;
import com.delivery.db.user.UserRepository;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserBusiness userBusiness;

    @GetMapping("/me")
    public Api<UserResponse> me(@UserSession User user) {


//        var requestContext = Objects.requireNonNull(RequestContextHolder.getRequestAttributes());
//        var userId = requestContext.getAttribute("userId", RequestAttributes.SCOPE_REQUEST);
//
//        var response = userBusiness.me(Long.parseLong(userId.toString()));
        var response = userBusiness.me(user);
        return Api.OK(response);
    }
}
