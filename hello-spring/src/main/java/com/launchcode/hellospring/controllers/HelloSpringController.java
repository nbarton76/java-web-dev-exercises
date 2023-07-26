package com.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
public class HelloSpringController {
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }
    // Handle request at path /hello

    @GetMapping("/hello/{name}")

    public String helloAgain(@PathVariable String name, Model model){

    String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting",greeting);
        return"hello";
}


     // Handles requests of the form /hello/LaunchCode
    @GetMapping("form")
    public String helloForm() {
        return "form";
        }
      @GetMapping("hello-names")
        public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names",names);
        return "hello-list";
      }
    }