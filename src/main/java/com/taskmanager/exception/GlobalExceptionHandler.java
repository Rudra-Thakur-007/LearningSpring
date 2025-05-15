package com.taskmanager.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
	
@RestControllerAdvice
public class GlobalExceptionHandler {
	
    @ExceptionHandler(UserNotFdException.class)
    public UserNotFdException  handleException(String ex) 
    {
    	
    	return new UserNotFdException(ex);
    }
}
