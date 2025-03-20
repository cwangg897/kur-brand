package com.kurbrand.exception;

import com.kurbrand.response.ErrorType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * 매번 같은 RuntimeException을 상속보다는 예외를 재사용
 */
@Getter
@RequiredArgsConstructor
public class ApiException extends RuntimeException{

    private final String errorMessage;
    private final ErrorType errorType;
    private final HttpStatus httpStatus;
}
