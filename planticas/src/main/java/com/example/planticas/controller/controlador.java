package com.example.planticas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



import com.example.planticas.entities.Cliente;

import org.springframework.ui.Model;

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

    @GetMapping("/CrearCliente")
    public String CrearCliente(Model modelo){
        modelo.addAttribute("cliente",new Cliente());
        return "CrearCliente";
    }

    

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }
}
