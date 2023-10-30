package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController 
{
    /* Don nhan requet GET */
    @GetMapping("/")    /* Neu request toi dia chi / */
    public String index()
    {
        return "index"; /* Tra ve file index.html */
    }

    @GetMapping("/about")   /* Neu nguoi dung request toi dia chi /about */
    public String about()
    {
        return "about";    /* Tra ve file about.html */
    }

    @GetMapping("/hello")   /* Neu nguoi dung request toi dia chi /hello */
    public String hello ( /* Request param "name" se duoc gan vao bien String */
                            @RequestParam(name = "name", required = false, defaultValue = "") String name,
                            /* Model la 1 object cua Spring Boot, duoc gan trong moi request */
                            Model model)
    {
        model.addAttribute("name", name);

        return "hello"; /* Tra ve file hello.html cung voi thong tin trong object Model */
    }
}
