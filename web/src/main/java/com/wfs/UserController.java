package com.wfs;

import com.wfs.base.User;
import com.wfs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("findall")
    public List<User> test(){
        return userService.findAllUser();
    }






}
