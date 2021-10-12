package com.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

    @RequestMapping(path = "/home")
    public String home(String name){
        return "home";
    }
}
