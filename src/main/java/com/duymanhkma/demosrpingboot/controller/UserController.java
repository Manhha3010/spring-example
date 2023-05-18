package com.duymanhkma.demosrpingboot.controller;

import com.duymanhkma.demosrpingboot.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * /api/user
 *
 * @Controller: @responseBody la` 1 file html hoac jsp hoac servlet (view)
 * @RestController: luon luon tra ve  String
 * @RequestMapping("/api/user") Dung de khai bao duong dan URL
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/getalluser")
    public String getAllUser() {

        return "Get All User";
    }

    @RequestMapping("get-detail/{id}/{username}")
    public String getDetail(@PathVariable("id") int id, @PathVariable String username) {
        return "Get Detail User " + id + " " + username;
    }
    @RequestMapping("/get-detail")
    public String getDetail2(@RequestParam("id") int id, @RequestParam String username) {
        return "Get Detail User " + id + " " + username;
    }


    @PostMapping("/create")
    public String createUser(@RequestBody User user) {

        return "Create User " + user.getUsername() + " " + user.getPassword();
    }
}
