/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author solid
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String hello(Model modal, @RequestParam(value = "name", required = false, defaultValue = "E banking") String name) {
        modal.addAttribute("name", name);
        return "hello";
    }
}
