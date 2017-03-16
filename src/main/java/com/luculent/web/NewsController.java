package com.luculent.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yue on  2017/3/13 0013.
 */
@Controller
public class NewsController {

    @RequestMapping("/tables")
    public String  table() {
        return "tables";
    }
}
