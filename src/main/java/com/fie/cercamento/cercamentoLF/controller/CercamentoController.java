package com.fie.cercamento.cercamentoLF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CercamentoController {
    
    @GetMapping("/cercamento")
    @ResponseBody
    public String cercamento(){
        return "Cercamento do fie2";
    }
}
