package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String Welcome() {
        return "<h1>Welcome to Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" ;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<form method=Post>" +
                "<label for ='name'>Name: </label>" +
                "<input type='text' name='name' id='name'>" +
                "<br>" +
                "<label for+'skillone'>My favorite language: </label>" +
                "<select name='skillone' id='skillone'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for ='name'>Name: </label>" +
                "<input type='text' name='name' id='name'>" +
                "<br>" +
                "<label for+'skilltwo'>My second favorite language: </label>" +
                "<select name='skilltwo' id='skilltwo'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for ='name'>Name: </label>" +
                "<input type='text' name='name' id='name'>" +
                "<br>" +
                "<label for+'skillthree'>My third favorite language: </label>" +
                "<select name='skillthree' id='skillthree'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" ;


    }

    @PostMapping("form")
    @ResponseBody
    public String formsSubmittedData(@RequestParam String name, @RequestParam String skillone, @RequestParam String skilltwo, @RequestParam String skillthree) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + skillone + "</li>" +
                "<li>" + skilltwo + "</li>" +
                "<li>" + skillthree + "</li>" +
                "</ol>" ;
    }
}