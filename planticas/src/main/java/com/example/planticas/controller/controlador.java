package com.example.planticas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controlador {
    @GetMapping("/logear")
    public String logearse(){
        return "logearse";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/facturar")
    public String facturar(){
        return "facturar";
    }

    @GetMapping("/inventario")
    public String inventario(){
        return "inventario";
    }

    @GetMapping("/reporte")
    public String reporte(){
        return "reporte";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }
}
