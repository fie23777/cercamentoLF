package com.fie.cercamento.cercamentoLF.resource.resourceEsq.model33333;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Service
class FieEsq33333Service {

	@Autowired
	private EsqLotofacilDao numeroList;
	@Autowired
	private FieEsqDao33333 gravar;


	public String getEsq33333() {
		List<FieEsq33333Model> listLinhas = new ArrayList<FieEsq33333Model>();

		List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
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

							FieEsq33333Model linhas = new FieEsq33333Model();
							linhas.setNumEsq33333(linha);
							listLinhas.add(linhas);
							
						}
					}
				}
			}
		}
		gravar.gravarEsq33333(listLinhas);
		return "esquemas/esq33333/esq33333";
	}
}