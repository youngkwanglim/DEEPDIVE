package com.delivery.api.resolver;

import com.delivery.api.common.annotation.UserSession;
import com.delivery.api.domain.user.model.User;
import com.delivery.api.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
@RequiredArgsConstructor
public class UserSessionResolver implements HandlerMethodArgumentResolver {
    private final UserService userService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        // 지원하는 파라미터 체크, 어노테이션 체크하는 영역

        // 1. 어노테이션이 있는지 체크
        var annotation = parameter.hasParameterAnnotation(UserSession.class);

        // 2. 파라미터의 타입 체크
        var parameterType = parameter.getParameterType().equals(User.class);

        return (annotation && parameterType);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        // supportParameter 함수에서 true 반환 시 여기 실행

        // parameter가 @UserSession User user이면 request context holder에서 user 정보 찾아오기
        var requestContext = RequestContextHolder.getRequestAttributes();

        var userId = requestContext.getAttribute("userId", RequestAttributes.SCOPE_REQUEST);

        var userentity = userService.getUserWithThrow(Long.parseLong(userId.toString()));

        return User.builder()
                .id(userentity.getId())
                .name(userentity.getName())
                .email(userentity.getEmail())
                .status(userentity.getStatus())
                .password(userentity.getPassword())
                .address(userentity.getAddress())
                .registeredAt(userentity.getRegisteredAt())
                .unregisteredAt(userentity.getUnregisteredAt())
                .lastLoginAt(userentity.getLastLoginAt())
                .build();
    }
}
