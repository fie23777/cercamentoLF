package com.fie.cercamento.cercamentoLF.controller.cercaSoldadosController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.soldados.CercaEsqCinco;
import com.fie.cercamento.cercamentoLF.soldados.CercaEsqDois;
import com.fie.cercamento.cercamentoLF.soldados.CercaEsqQuatro;
import com.fie.cercamento.cercamentoLF.soldados.CercaEsqTres;
import com.fie.cercamento.cercamentoLF.soldados.CercaEsqUm;

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
		
		return "/esqlotofacil/esqlotofacil";
	}
}
