package com.lab.manage.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @RequestMapping(value = "/")
    public String show() {
        return "index";
    }

    @RequestMapping(value = "/index")
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value = "/index2")
    public String showIndex2() {
        return "index2";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE
                                                                             + ";charset=utf-8")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

}
