package com.se.qlsv.controller;


import com.se.qlsv.VO.ResponseTemplateVO;
import com.se.qlsv.entity.User;
import com.se.qlsv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@EnableEurekaClient
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                                Long userId){
        return userService.getUserWithDepartment(userId);
    }

}
