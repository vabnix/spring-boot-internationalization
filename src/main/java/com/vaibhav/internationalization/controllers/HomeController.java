package com.vaibhav.internationalization.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private static final String INTL = "/international";

    @RequestMapping(path = INTL, method = RequestMethod.GET)
    public String getInternationalPage(){
        return "international";
    }
}
