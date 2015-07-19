/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.security.controller.security;

import javax.enterprise.inject.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alumno
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"login", "/"})
    public String index(@RequestParam(required = false) String error, Model model) {
        if (error != null) {model.addAttribute("loginError", true);
        }
        return "security/login";
    }
}
