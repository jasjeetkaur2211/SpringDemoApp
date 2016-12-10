package com.springapp.controllers;

import com.rulesapp.DroolsTest;
import com.springapp.models.TestModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by kaushik on 29-Nov-16.
 */
@Controller
public class Home2 {

    @RequestMapping(value="/home2", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ArrayList<String> home2() {
        ArrayList<String> tempList=new ArrayList<String>();
        tempList.add("asdf");
        tempList.add("haha");
        return tempList;
    }

    @RequestMapping(value="/testModel", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    TestModel testModel() {
        TestModel tm=new TestModel();
        return  tm;
    }

    @RequestMapping(value="/testDrools",method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ArrayList<String> testDrools(){
        DroolsTest dt=new DroolsTest();
       // dt.caller();
        return dt.caller();
    }

//    @RequestMapping("/")
//    public void showWelcome(){
//        return
//    }
    @RequestMapping("/home")
    public String showHomePage() {

        return "redirect:/pages/home2.html";
        // redirect way in spring.
    }
}// end class Home2
