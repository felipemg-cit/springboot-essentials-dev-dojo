package academy.devdojo.springboot2essentials.handler;

import academy.devdojo.springboot2essentials.exception.BadRequestException;
import academy.devdojo.springboot2essentials.exception.BadRequestExceptionDetails;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
  @ExceptionHandler(BadRequestException.class)
  public ResponseEntity<BadRequestExceptionDetails> badRequestExceptionHandler(
      BadRequestException badRequestException) {
    BadRequestExceptionDetails badRequestExceptionDetails =
        BadRequestExceptionDetails.builder()
            .title("Bad Request Exception. Please check the documentation.")
            .details(badRequestException.getMessage())
            .developerMessage(badRequestException.getClass().getName())
            .status(HttpStatus.BAD_REQUEST.value())
            .timestamp(LocalDateTime.now())
            .build();
    return new ResponseEntity<>(badRequestExceptionDetails, HttpStatus.BAD_REQUEST);
  }
}
