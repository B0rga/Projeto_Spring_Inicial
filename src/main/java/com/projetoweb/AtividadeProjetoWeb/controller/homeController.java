package com.projetoweb.AtividadeProjetoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class homeController {
    @GetMapping("/")
    public String index(ModelMap model){
        return "index";
    }

    @GetMapping("nome")
    public String nome(ModelMap model){
        String nome1 = "Beatriz";
        String nome2 = "Sousa";
        String nomeCompleto = nome1+" "+nome2;
        model.addAttribute("attNome", nomeCompleto);
        return "nome";
    }

    @GetMapping("idade")
    public String idade(ModelMap model){
        int anoNasicmento = 2007;
        int anoAtual = 2024;
        int idadePessoa = anoAtual - anoNasicmento;
        model.addAttribute("attIdade", idadePessoa);
        return "idade";
    }

    @GetMapping("salario")
    public String salario(ModelMap model){
        double antigoSal = 1200;
        double percReajuste = 3.5;
        double novoSal = antigoSal+(antigoSal*(percReajuste/100));
        model.addAttribute("attSal", novoSal);
        return "salario";
    }
}
