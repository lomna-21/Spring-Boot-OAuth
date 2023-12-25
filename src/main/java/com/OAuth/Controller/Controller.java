package com.OAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class Controller {

    @GetMapping("/hello")
    public String greet(){

        return "Hello";
    }

//    @PostMapping("/signup")
//    public void signup(@RequestBody @Valid CreateUserRequest request){
//
//
//    }

    @GetMapping("/doctor/details")
    public String doctor(){

        return "Hello Doctor";
    }

    @GetMapping("/ceo/details")
    public String ceo(){

        return "Hello ceo";
    }

    @GetMapping("/deo/details")
    public String deo(){

        return "Hello deo";
    }

    @GetMapping("/schedule/appointments")
    public String schedule(){

        return "Your appointment has been scheduled!";
    }
}
