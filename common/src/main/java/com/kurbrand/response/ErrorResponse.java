package com.kurbrand.response;

/**
 * Exception에러일 경우
 */
public record ErrorResponse(String errorMessage, ErrorType errorType) {

}
