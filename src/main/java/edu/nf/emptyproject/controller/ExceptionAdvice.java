package edu.nf.emptyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public String xxx (Exception e) {
        return "error";
    }
    
}
