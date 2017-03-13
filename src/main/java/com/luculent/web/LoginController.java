package com.luculent.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yue on  2017/3/12 0012.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
