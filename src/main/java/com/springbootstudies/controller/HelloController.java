package com.springbootstudies.controller;

import com.springbootstudies.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping({"/message1","/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is: " + message;
    }

    @GetMapping(path="/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false,defaultValue = "my default value") String message){
        return "Your message2 is: " + message; // @RequestParam("m") is can be track on postman as Param key value
    }
    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }
    @PostMapping("users-all")
    public List<User> saveAllUsers(@RequestBody List<User> users){
        System.out.println("All Users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }

}
