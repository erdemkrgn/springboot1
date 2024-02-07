package com.springbootstudies.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class HelloController {

    @GetMapping(path="/hello")

    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save(){
        return "Data saved!";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return ("Data deleted!");
    }

    @GetMapping(path="/message/{m}")
    public String getMyMessage(@PathVariable("m") String message){
        return "Your message is: " + message;
    }

}
