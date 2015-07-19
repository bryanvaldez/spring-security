/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.security.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alumno
 */
@Controller
public class PrincipalController {

    @RequestMapping(value = "/principal")
    public String cargarPortadaVisitante(Model model) {
        model.addAttribute("mensaje", "Hoy es: " + new Date());
        return "security/principal";
    }

    @RequestMapping(value = "/ventas/principal")
    public String cargarPortadaVentas(Model model) {
        model.addAttribute("mensaje", "Registre sus Ventas");
        return "security/ventas";
    }

    @RequestMapping(value = "/adm/principal")
    public String cargarPortadaAdm(Model model) {
        model.addAttribute("mensaje", "Administración");
        return "security/adm";
    }
}