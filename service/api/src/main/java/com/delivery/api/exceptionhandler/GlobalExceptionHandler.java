package com.delivery.api.exceptionhandler;

import com.delivery.api.common.api.Api;
import com.delivery.api.common.error.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order(value = Integer.MAX_VALUE) // 가장 마지막에 실행 적용
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class) // 일어나는 모든 exception 캐치
    public ResponseEntity<Api<Object>> exception(Exception exception) {
        log.error(" ", exception);

        return ResponseEntity
                .status(500)
                .body(Api.ERROR(ErrorCode.SERVER_ERROR));
    }
}
