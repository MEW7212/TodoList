package com.example.todolist.controller;

import com.example.todolist.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","Hello World!!!");
        return "hello"; //要導入的html
    }

    @GetMapping("/form")
    public String form(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        return "add";
    }
}
