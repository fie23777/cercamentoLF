package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44322;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;



@Controller
public class FieEsq44322Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44322 fienumeroList;

	@RequestMapping("/esquemas/esq44322/esq44322")
	public String esq44322() {

		return "/esquemas/esq44322/esq44322";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44322")
	public void cercaFieEsq44322() {

		List<FieEsq44322> esqList = new ArrayList<FieEsq44322>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;
							
							FieEsq44322 linhas = new FieEsq44322();
							linhas.setNumEsq44322(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq44322(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24342")
	public void cercaFieEsq24342() {

		List<FieEsq24342> esqList = new ArrayList<FieEsq24342>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24342 linhas = new FieEsq24342();
							linhas.setNumEsq24342(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24342(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42324")
	public void cercaFieEsq42324() {

		List<FieEsq42324> esqList = new ArrayList<FieEsq42324>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42324 linhas = new FieEsq42324();
							linhas.setNumEsq42324(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42324(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42342")
	public void cercaFieEsq42342() {

		List<FieEsq42342> esqList = new ArrayList<FieEsq42342>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42342 linhas = new FieEsq42342();
							linhas.setNumEsq42342(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42342(esqList);
	}

	// ********************************************************************************************************
	@RequestMapping("/fieesqlf/cercaFieEsq22344")
	public void cercaFieEsq22344() {

		List<FieEsq22344> esqList = new ArrayList<FieEsq22344>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {



							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22344 linhas = new FieEsq22344();
							linhas.setNumEsq22344(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22344(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22434")
	public void cercaFieEsq22434() {

		List<FieEsq22434> esqList = new ArrayList<FieEsq22434>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22434 linhas = new FieEsq22434();
							linhas.setNumEsq22434(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22434(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22443")
	public void cercaFieEsq22443() {

		List<FieEsq22443> esqList = new ArrayList<FieEsq22443>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22443 linhas = new FieEsq22443();
							linhas.setNumEsq22443(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22443(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23244")
	public void cercaFieEsq23244() {

		List<FieEsq23244> esqList = new ArrayList<FieEsq23244>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23244 linhas = new FieEsq23244();
							linhas.setNumEsq23244(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23244(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23424")
	public void cercaFieEsq23424() {

		List<FieEsq23424> esqList = new ArrayList<FieEsq23424>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23424 linhas = new FieEsq23424();
							linhas.setNumEsq23424(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23424(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23442")
	public void cercaFieEsq23442() {

		List<FieEsq23442> esqList = new ArrayList<FieEsq23442>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23442 linhas = new FieEsq23442();
							linhas.setNumEsq23442(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23442(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24234")
	public void cercaFieEsq24234() {

		List<FieEsq24234> esqList = new ArrayList<FieEsq24234>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24234 linhas = new FieEsq24234();
							linhas.setNumEsq24234(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24234(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24243")
	public void cercaFieEsq24243() {

		List<FieEsq24243> esqList = new ArrayList<FieEsq24243>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24243 linhas = new FieEsq24243();
							linhas.setNumEsq24243(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24243(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24423")
	public void cercaFieEsq24423() {

		List<FieEsq24423> esqList = new ArrayList<FieEsq24423>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24423 linhas = new FieEsq24423();
							linhas.setNumEsq24423(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24423(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24432")
	public void cercaFieEsq24432() {

		List<FieEsq24432> esqList = new ArrayList<FieEsq24432>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24432 linhas = new FieEsq24432();
							linhas.setNumEsq24432(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24432(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32244")
	public void cercaFieEsq32244() {

		List<FieEsq32244> esqList = new ArrayList<FieEsq32244>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32244 linhas = new FieEsq32244();
							linhas.setNumEsq32244(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32244(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32424") // ultimo passado
	public void cercaFieEsq32424() {

		List<FieEsq32424> esqList = new ArrayList<FieEsq32424>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32424 linhas = new FieEsq32424();
							linhas.setNumEsq32424(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32424(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32442")
	public void cercaFieEsq32442() {

		List<FieEsq32442> esqList = new ArrayList<FieEsq32442>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32442 linhas = new FieEsq32442();
							linhas.setNumEsq32442(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32442(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34224")
	public void cercaFieEsq34224() {

		List<FieEsq34224> esqList = new ArrayList<FieEsq34224>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34224 linhas = new FieEsq34224();
							linhas.setNumEsq34224(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34224(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34242")
	public void cercaFieEsq34242() {

		List<FieEsq34242> esqList = new ArrayList<FieEsq34242>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34242 linhas = new FieEsq34242();
							linhas.setNumEsq34242(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34242(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34422") // parou aqui
	public void cercaFieEsq34422() {

		List<FieEsq34422> esqList = new ArrayList<FieEsq34422>();

		List<EsqUmModel> numEsqUm3 = numeroList.listarEsqUm3();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm3.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34422 linhas = new FieEsq34422();
							linhas.setNumEsq34422(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34422(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42234")
	public void cercaFieEsq42234() {

		List<FieEsq42234> esqList = new ArrayList<FieEsq42234>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42234 linhas = new FieEsq42234();
							linhas.setNumEsq42234(linha);

						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42234(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42243")
	public void cercaFieEsq42243() {

		List<FieEsq42243> esqList = new ArrayList<FieEsq42243>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42243 linhas = new FieEsq42243();
							linhas.setNumEsq42243(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42243(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42423")
	public void cercaFieEsq42423() {

		List<FieEsq42423> esqList = new ArrayList<FieEsq42423>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42423 linhas = new FieEsq42423();
							linhas.setNumEsq42423(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42423(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42432")
	public void cercaFieEsq42432() {

		List<FieEsq42432> esqList = new ArrayList<FieEsq42432>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois2 = numeroList.listarEsqDois2();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois2.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42432 linhas = new FieEsq42432();
							linhas.setNumEsq42432(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42432(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43224")
	public void cercaFieEsq43224() {

		List<FieEsq43224> esqList = new ArrayList<FieEsq43224>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43224 linhas = new FieEsq43224();
							linhas.setNumEsq43224(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43224(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43242")
	public void cercaFieEsq43242() {

		List<FieEsq43242> esqList = new ArrayList<FieEsq43242>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro4.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43242 linhas = new FieEsq43242();
							linhas.setNumEsq43242(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43242(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43422")
	public void cercaFieEsq43422() {

		List<FieEsq43422> esqList = new ArrayList<FieEsq43422>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> numEsqTres4 = numeroList.listarEsqTres4();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois3.get(e));
							String linhaTres = String.valueOf(numEsqTres4.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43422 linhas = new FieEsq43422();
							linhas.setNumEsq43422(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43422(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44223")
	public void cercaFieEsq44223() {

		List<FieEsq44223> esqList = new ArrayList<FieEsq44223>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco3 = numeroList.listarEsqCinco3();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {


							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44223 linhas = new FieEsq44223();
							linhas.setNumEsq44223(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq44223(esqList);
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44232")
	public void cercaFieEsq44232() {

		List<FieEsq44232> esqList = new ArrayList<FieEsq44232>();

		List<EsqUmModel> numEsqUm4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres2 = numeroList.listarEsqTres2();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsqUm4.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres2.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro3.get(o));
							String linhaCinco = String.valueOf(numEsqCinco2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44232 linhas = new FieEsq44232();
							linhas.setNumEsq44232(linha);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq44232(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24324")
	public void cercaFieEsq24324() {

		List<FieEsq24324> esqList = new ArrayList<FieEsq24324>();

		List<EsqUmModel> numEsqUm2 = numeroList.listarEsqUm2();
		// ***********************************************************
		List<EsqDoisModel> numEsqDois4 = numeroList.listarEsqDois4();
		// ************************************************************
		List<EsqTresModel> numEsqTres3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> numEsqQuatro2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		List<EsqCincoModel> numEsqCinco4 = numeroList.listarEsqCinco4();
		// ******************************************************************

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(numEsqUm2.get(a));
							String linhaDois = String.valueOf(numEsqDois4.get(e));
							String linhaTres = String.valueOf(numEsqTres3.get(i));
							String linhaQuatro = String.valueOf(numEsqQuatro2.get(o));
							String linhaCinco = String.valueOf(numEsqCinco4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24324 linhas = new FieEsq24324();
							linhas.setNumEsq24324(linha);

						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24324(esqList);
	}

}
