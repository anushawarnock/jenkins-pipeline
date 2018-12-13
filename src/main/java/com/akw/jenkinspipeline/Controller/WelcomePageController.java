package com.akw.jenkinspipeline.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @GetMapping(value = "/")
    public String getPage(){
        return "index";
    }


}
