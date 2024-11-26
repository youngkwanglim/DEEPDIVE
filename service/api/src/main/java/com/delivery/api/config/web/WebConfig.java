package com.delivery.api.config.web;

import com.delivery.api.interceptor.AuthorizationInterceptor;
import com.delivery.api.resolver.UserSessionResolver;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final AuthorizationInterceptor authorizationInterceptor;

    private final UserSessionResolver userSessionResolver;

    /* [ 규칙을 정함 ]
     * 'open-api' 로 시작하는 url은 검증하지 않음
     * 그 외 나머지는 검증
     * */

    private List<String> OPEN_API = List.of(
            "/open-api/**"
    );

    private List<String> DEFAULT_EXCLUDE = List.of(
            "/",
            "favicon.ico",
            "/error"
    );

    private List<String> SWAGGER = List.of(
            "/swagger-ui.html",
            "/swagger-ui/**",
            "/v3/api-docs/**"
    );

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor)
                .excludePathPatterns(OPEN_API)
                .excludePathPatterns(DEFAULT_EXCLUDE)
                .excludePathPatterns(SWAGGER);
    }

    // addArgumentResolvers 오버라이드
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(userSessionResolver);
    }

    // CORS 설정 추가
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 엔드포인트 허용
                .allowedOrigins("htttp://localhost:3000") // react앱 URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true); // 쿠키 허용
    }
}
