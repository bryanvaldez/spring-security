/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author alumno
 */
@Controller
@RequestMapping("/")
public class TestController {
    @ResponseBody
    @RequestMapping(method=RequestMethod.GET)
    public String index(){
        return "Bienvenido";
    }
}

