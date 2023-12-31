package com.reactive.webflux.exception;

import com.reactive.webflux.dto.InputValidationResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

  @ExceptionHandler(InputValidationException.class)
  public ResponseEntity<InputValidationResponseDto> exception(InputValidationException exception) {
    return ResponseEntity.badRequest()
        .body(new InputValidationResponseDto(1, "", 100, 1));
  }
}
