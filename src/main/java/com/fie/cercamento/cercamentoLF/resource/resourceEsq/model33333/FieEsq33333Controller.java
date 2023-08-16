package com.fie.cercamento.cercamentoLF.resource.resourceEsq.model33333;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FieEsq33333Controller {
    
	@Autowired
	public FieEsq33333Service fieEsq33333Service;

	@RequestMapping("/esquemas/esq33333")
	@ResponseBody
	public String cercaFieEsq3333() {
		fieEsq33333Service.getEsq33333();

		return "Cercamento 33333 realizado comsucesso!";
	}

}
