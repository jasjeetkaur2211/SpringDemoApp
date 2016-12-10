package com.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kaushik on 29-Nov-16.
 */
@Controller
public class TestController {
    @RequestMapping("test")
    public ModelAndView test() {
        return new ModelAndView("test");
    }
}
