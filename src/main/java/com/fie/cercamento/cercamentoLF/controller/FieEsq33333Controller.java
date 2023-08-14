package com.fie.cercamento.cercamentoLF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.dao.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.dao.FieEsqDao33333;
import com.fie.cercamento.cercamentoLF.soldados.EsqUm;

@Controller
public class FieEsq33333Controller {
   
	@Autowired
	private EsqLotofacilDao numeroList;
	@Autowired
	private FieEsqDao33333 gravar;

	@RequestMapping("esquemas/esq33333/esq33333")
	public String esq33333() {

		return "esquemas/esq33333/esq33333";
	}

	@RequestMapping("esquemas/esq33333")
	public String cercaFieEsq3333() {

		List<EsqUm> numEsq3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDois> doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTres> tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatro> quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCinco> cincoEsq3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33333 linhas = new FieEsq33333();
							linhas.setNumEsq33333(linha);
							gravar.gravarEsq33333(linhas);
						}
					}
				}
			}
		}
		return "esquemas/esq33333/esq33333";
	}
 
}
