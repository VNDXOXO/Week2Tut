package com.example.tuteone;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/home")
    public String home() {
        return "<h1 style='color:red'>Welcome home</h1>";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "<h1 style='color:blue'>Goodbye from Springboot</h1>";
    }
    @GetMapping("/validate")
    public String validate(@PathParam("username") String username) {
        if (username.equals("movindu")) {
            return "Baduwak";
        }else{
            return "Welcome";
        }
    }



}
