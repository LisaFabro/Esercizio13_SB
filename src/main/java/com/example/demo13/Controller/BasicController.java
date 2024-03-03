package com.example.demo13.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/date")
public class BasicController {
    @GetMapping("/local")
    public LocalDateTime getDataTime(){
        return LocalDateTime.now();
    }
}
