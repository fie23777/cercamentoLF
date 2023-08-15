package com.fie.cercamento.cercamentoLF.resource.resourcesoudados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.CercaEsqCinco;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.CercaEsqDois;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.CercaEsqQuatro;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.CercaEsqTres;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.CercaEsqUm;

@Controller
public class SoldadosController {
    	
	@Autowired
	CercaEsqUm esqcercarUm;
	@Autowired
	CercaEsqDois esqcercarDois;
	@Autowired
	CercaEsqTres esqcercarTres;
	@Autowired
	CercaEsqQuatro esqcercarQuatro;
	@Autowired
	CercaEsqCinco esqcercarCinco;
	
	@RequestMapping("/fieesqlf/fiegeneral")
	public String general(){
		return "/fieesqlf/fiegeneral";
	}
	
	@RequestMapping("/fieesqlf/esqcercarSoldados")
	@ResponseBody
	public String cercarEsqLotoFacil() {
		
		esqcercarUm.cerca2(1, 5);  //estas linhas cercam os pequenos esquemas que compôe os maiores
		esqcercarUm.cerca3(1, 5);
		esqcercarUm.cerca4(1, 5);
		
		esqcercarDois.cerca2(6, 10);
		esqcercarDois.cerca3(6, 10);
		esqcercarDois.cerca4(6, 10);
	
		esqcercarTres.cerca2(11, 15);
		esqcercarTres.cerca3(11, 15);
		esqcercarTres.cerca4(11, 15);
		
		esqcercarQuatro.cerca2(16, 20);
		esqcercarQuatro.cerca3(16, 20);
		esqcercarQuatro.cerca4(16, 20);
		
		esqcercarCinco.cerca2(21, 25);
		esqcercarCinco.cerca3(21, 25);
		esqcercarCinco.cerca4(21, 25);
		
		return "Cercamento dos soldados realizado com sucesso!";
	}
}
