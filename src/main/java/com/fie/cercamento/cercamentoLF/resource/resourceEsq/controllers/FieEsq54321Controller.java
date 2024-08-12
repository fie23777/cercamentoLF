package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54321.*;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao54321;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq54321Controller {

	private static final String FINALIZADO_O_CERCAMENTO_DO_ESQUEMA = "Finalizado o cercamento do esquema";

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao54321 fienumeroList;

	String umEsq5;
	// ***********************************************************
	String doisEsq5;
	// ***********************************************************
	String tresEsq5;
	// ***********************************************************
	String quatroEsq5;
	// ***********************************************************
	String cincoEsq5;
	// ***********************************************************

	List<EsqUmModel> umEsq4;
	// ************************************************************
	List<EsqUmModel> umEsq3;
	// ************************************************************
	List<EsqUmModel> umEsq2;
	// ************************************************************

	List<EsqDoisModel> doisEsq4;
	// ************************************************************
	List<EsqDoisModel> doisEsq3;
	// ************************************************************
	List<EsqDoisModel> doisEsq2;
	// ************************************************************

	List<EsqTresModel> tresEsq4;
	// ***************************************************************
	List<EsqTresModel> tresEsq3;
	// ***************************************************************
	List<EsqTresModel> tresEsq2;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq4;
	// ****************************************************************
	List<EsqQuatroModel> quatroEsq3;
	// ****************************************************************
	List<EsqQuatroModel> quatroEsq2;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq4;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq3;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq2;
	// ****************************************************************
	// ****************************************************************

	String[] cincoEsq1;
	// ******************************************************************
	String[] quatroEsq1;
	// ******************************************************************
	String[] tresEsq1;
	// ******************************************************************
	String[] doisEsq1;
	// ******************************************************************
	String[] umEsq1;
	// ******************************************************************

	@RequestMapping("/esquemas/esq54321/esq54321")
	public String esq54321() {

		return "/esquemas/esq54321/esq54321";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54321")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54321() {

		List<FieEsq54321> esqList = new ArrayList<FieEsq54321>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54321 linhas = new FieEsq54321();
							linhas.setNumEsq54321(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54321(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14325") // final do um aqui
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14325() {

		List<FieEsq14325> esqList = new ArrayList<FieEsq14325>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14325 linhas = new FieEsq14325();
							linhas.setNumEsq14325(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14352() {

		List<FieEsq14352> esqList = new ArrayList<FieEsq14352>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14352 linhas = new FieEsq14352();
							linhas.setNumEsq14352(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14253() {

		List<FieEsq14253> esqList = new ArrayList<FieEsq14253>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14253 linhas = new FieEsq14253();
							linhas.setNumEsq14253(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14523() {

		List<FieEsq14523> esqList = new ArrayList<FieEsq14523>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14523 linhas = new FieEsq14523();
							linhas.setNumEsq14523(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14235() {

		List<FieEsq14235> esqList = new ArrayList<FieEsq14235>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14235 linhas = new FieEsq14235();
							linhas.setNumEsq14235(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14532() {

		List<FieEsq14532> esqList = new ArrayList<FieEsq14532>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14532 linhas = new FieEsq14532();
							linhas.setNumEsq14532(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13425")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13425() {

		List<FieEsq13425> esqList = new ArrayList<FieEsq13425>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13425 linhas = new FieEsq13425();
							linhas.setNumEsq13425(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13425(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13452")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13452() {

		List<FieEsq13452> esqList = new ArrayList<FieEsq13452>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13452 linhas = new FieEsq13452();
							linhas.setNumEsq13452(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13452(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13245")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13245() {

		List<FieEsq13245> esqList = new ArrayList<FieEsq13245>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13245 linhas = new FieEsq13245();
							linhas.setNumEsq13245(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13245(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13254")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13254() {

		List<FieEsq13254> esqList = new ArrayList<FieEsq13254>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13254 linhas = new FieEsq13254();
							linhas.setNumEsq13254(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13254(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13542")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13542() {

		List<FieEsq13542> esqList = new ArrayList<FieEsq13542>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3,
			    umEsq2, doisEsq4, doisEsq3, doisEsq2, tresEsq4, tresEsq3, tresEsq2, 
			    quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3, cincoEsq2, 
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13542 linhas = new FieEsq13542();
							linhas.setNumEsq13542(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13542(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13524")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13524() {

		List<FieEsq13524> esqList = new ArrayList<FieEsq13524>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13524 linhas = new FieEsq13524();
							linhas.setNumEsq13524(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		} 
		fienumeroList.gravarEsq13524(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12435")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12435() {

		List<FieEsq12435> esqList = new ArrayList<FieEsq12435>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12435 linhas = new FieEsq12435();
							linhas.setNumEsq12435(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12435(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12453")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12453() {

		List<FieEsq12453> esqList = new ArrayList<FieEsq12453>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12453 linhas = new FieEsq12453();
							linhas.setNumEsq12453(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12453(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12345")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12345() {

		List<FieEsq12345> esqList = new ArrayList<FieEsq12345>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12345 linhas = new FieEsq12345();
							linhas.setNumEsq12345(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12345(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12354")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12354() {

		List<FieEsq12354> esqList = new ArrayList<FieEsq12354>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12354 linhas = new FieEsq12354();
							linhas.setNumEsq12354(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12354(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12543")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12543() {

		List<FieEsq12543> esqList = new ArrayList<FieEsq12543>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12543 linhas = new FieEsq12543();
							linhas.setNumEsq12543(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12543(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12534")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq12534() {

		List<FieEsq12534> esqList = new ArrayList<FieEsq12534>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12534 linhas = new FieEsq12534();
							linhas.setNumEsq12534(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq12534(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15432")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15432() {

		List<FieEsq15432> esqList = new ArrayList<FieEsq15432>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15432 linhas = new FieEsq15432();
							linhas.setNumEsq15432(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15432(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15423")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15423() {

		List<FieEsq15423> esqList = new ArrayList<FieEsq15423>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15423 linhas = new FieEsq15423();
							linhas.setNumEsq15423(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15423(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15342")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15342() {

		List<FieEsq15342> esqList = new ArrayList<FieEsq15342>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15342 linhas = new FieEsq15342();
							linhas.setNumEsq15342(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15342(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15324")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15324() {

		List<FieEsq15324> esqList = new ArrayList<FieEsq15324>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15324 linhas = new FieEsq15324();
							linhas.setNumEsq15324(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15324(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15243")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15243() {

		List<FieEsq15243> esqList = new ArrayList<FieEsq15243>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15243 linhas = new FieEsq15243();
							linhas.setNumEsq15243(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15243(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15234")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15234() {

		List<FieEsq15234> esqList = new ArrayList<FieEsq15234>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15234 linhas = new FieEsq15234();
							linhas.setNumEsq15234(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq15234(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24315")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24315() {

		List<FieEsq24315> esqList = new ArrayList<FieEsq24315>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24315 linhas = new FieEsq24315();
							linhas.setNumEsq24315(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24315(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24351")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24351() {

		List<FieEsq24351> esqList = new ArrayList<FieEsq24351>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24351 linhas = new FieEsq24351();
							linhas.setNumEsq24351(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24351(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24153")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24153() {

		List<FieEsq24153> esqList = new ArrayList<FieEsq24153>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24153 linhas = new FieEsq24153();
							linhas.setNumEsq24153(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24153(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24513")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24513() {

		List<FieEsq24513> esqList = new ArrayList<FieEsq24513>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24513 linhas = new FieEsq24513();
							linhas.setNumEsq24513(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24513(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24135")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24135() {

		List<FieEsq24135> esqList = new ArrayList<FieEsq24135>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24135 linhas = new FieEsq24135();
							linhas.setNumEsq24135(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24135(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24531")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq24531() {

		List<FieEsq24531> esqList = new ArrayList<FieEsq24531>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24531 linhas = new FieEsq24531();
							linhas.setNumEsq24531(linha);
							esqList.add(linhas);
						}
					}
				} 
			}
		}
		fienumeroList.gravarEsq24531(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23415")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23415() {

		List<FieEsq23415> esqList = new ArrayList<FieEsq23415>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23415 linhas = new FieEsq23415();
							linhas.setNumEsq23415(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23415(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23451")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23451() {

		List<FieEsq23451> esqList = new ArrayList<FieEsq23451>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23451 linhas = new FieEsq23451();
							linhas.setNumEsq23451(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23451(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23145")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23145() {

		List<FieEsq23145> esqList = new ArrayList<FieEsq23145>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23145 linhas = new FieEsq23145();
							linhas.setNumEsq23145(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23145(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23154")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23154() {

		List<FieEsq23154> esqList = new ArrayList<FieEsq23154>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23154 linhas = new FieEsq23154();
							linhas.setNumEsq23154(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23154(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23541")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23541() {

		List<FieEsq23541> esqList = new ArrayList<FieEsq23541>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23541 linhas = new FieEsq23541();
							linhas.setNumEsq23541(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23541(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23514")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23514() {

		List<FieEsq23514> esqList = new ArrayList<FieEsq23514>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23514 linhas = new FieEsq23514();
							linhas.setNumEsq23514(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23514(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21435")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21435() {

		List<FieEsq21435> esqList = new ArrayList<FieEsq21435>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21435 linhas = new FieEsq21435();
							linhas.setNumEsq21435(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21435(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21453")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21453() {

		List<FieEsq21453> esqList = new ArrayList<FieEsq21453>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21453 linhas = new FieEsq21453();
							linhas.setNumEsq21453(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21453(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21345")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21345() {

		List<FieEsq21345> esqList = new ArrayList<FieEsq21345>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21345 linhas = new FieEsq21345();
							linhas.setNumEsq21345(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21345(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21354")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21354() {

		List<FieEsq21354> esqList = new ArrayList<FieEsq21354>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21354 linhas = new FieEsq21354();
							linhas.setNumEsq21354(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21354(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21543")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21543() {

		List<FieEsq21543> esqList = new ArrayList<FieEsq21543>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21543 linhas = new FieEsq21543();
							linhas.setNumEsq21543(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21543(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21534")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq21534() {

		List<FieEsq21534> esqList = new ArrayList<FieEsq21534>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21534 linhas = new FieEsq21534();
							linhas.setNumEsq21534(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq21534(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25431")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25431() {

		List<FieEsq25431> esqList = new ArrayList<FieEsq25431>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25431 linhas = new FieEsq25431();
							linhas.setNumEsq25431(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25431(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25413")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25413() {

		List<FieEsq25413> esqList = new ArrayList<FieEsq25413>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25413 linhas = new FieEsq25413();
							linhas.setNumEsq25413(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25413(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25341")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25341() {

		List<FieEsq25341> esqList = new ArrayList<FieEsq25341>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25341 linhas = new FieEsq25341();
							linhas.setNumEsq25341(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25341(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25314")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25314() {

		List<FieEsq25314> esqList = new ArrayList<FieEsq25314>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25314 linhas = new FieEsq25314();
							linhas.setNumEsq25314(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25314(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25143")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25143() {

		List<FieEsq25143> esqList = new ArrayList<FieEsq25143>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25143 linhas = new FieEsq25143();
							linhas.setNumEsq25143(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25143(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25134")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25134() {

		List<FieEsq25134> esqList = new ArrayList<FieEsq25134>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25134 linhas = new FieEsq25134();
							linhas.setNumEsq25134(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25134(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34215")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34215() {

		List<FieEsq34215> esqList = new ArrayList<FieEsq34215>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34215 linhas = new FieEsq34215();
							linhas.setNumEsq34215(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34215(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34251")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34251() {

		List<FieEsq34251> esqList = new ArrayList<FieEsq34251>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34251 linhas = new FieEsq34251();
							linhas.setNumEsq34251(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34251(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34152")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34152() {

		List<FieEsq34152> esqList = new ArrayList<FieEsq34152>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34152 linhas = new FieEsq34152();
							linhas.setNumEsq34152(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34152(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34512")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34512() {

		List<FieEsq34512> esqList = new ArrayList<FieEsq34512>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34512 linhas = new FieEsq34512();
							linhas.setNumEsq34512(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34512(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34125")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34125() {

		List<FieEsq34125> esqList = new ArrayList<FieEsq34125>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34125 linhas = new FieEsq34125();
							linhas.setNumEsq34125(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34125(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34521")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34521() {

		List<FieEsq34521> esqList = new ArrayList<FieEsq34521>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34521 linhas = new FieEsq34521();
							linhas.setNumEsq34521(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34521(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32415")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32415() {

		List<FieEsq32415> esqList = new ArrayList<FieEsq32415>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32415 linhas = new FieEsq32415();
							linhas.setNumEsq32415(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32415(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32451")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32451() {

		List<FieEsq32451> esqList = new ArrayList<FieEsq32451>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32451 linhas = new FieEsq32451();
							linhas.setNumEsq32451(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32451(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32145")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32145() {

		List<FieEsq32145> esqList = new ArrayList<FieEsq32145>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32145 linhas = new FieEsq32145();
							linhas.setNumEsq32145(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32145(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32154")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32154() {

		List<FieEsq32154> esqList = new ArrayList<FieEsq32154>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32154 linhas = new FieEsq32154();
							linhas.setNumEsq32154(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32154(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32541")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32541() {

		List<FieEsq32541> esqList = new ArrayList<FieEsq32541>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32541 linhas = new FieEsq32541();
							linhas.setNumEsq32541(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32541(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32514")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32514() {

		List<FieEsq32514> esqList = new ArrayList<FieEsq32514>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32514 linhas = new FieEsq32514();
							linhas.setNumEsq32514(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32514(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31425")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31425() {

		List<FieEsq31425> esqList = new ArrayList<FieEsq31425>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31425 linhas = new FieEsq31425();
							linhas.setNumEsq31425(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31425(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31452")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31452() {

		List<FieEsq31452> esqList = new ArrayList<FieEsq31452>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31452 linhas = new FieEsq31452();
							linhas.setNumEsq31452(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31452(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31245")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31245() {

		List<FieEsq31245> esqList = new ArrayList<FieEsq31245>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31245 linhas = new FieEsq31245();
							linhas.setNumEsq31245(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31245(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31254")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31254() {

		List<FieEsq31254> esqList = new ArrayList<FieEsq31254>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31254 linhas = new FieEsq31254();
							linhas.setNumEsq31254(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31254(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31542")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31542() {

		List<FieEsq31542> esqList = new ArrayList<FieEsq31542>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31542 linhas = new FieEsq31542();
							linhas.setNumEsq31542(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31542(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31524")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31524() {

		List<FieEsq31524> esqList = new ArrayList<FieEsq31524>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31524 linhas = new FieEsq31524();
							linhas.setNumEsq31524(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq31524(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35421")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35421() {

		List<FieEsq35421> esqList = new ArrayList<FieEsq35421>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35421 linhas = new FieEsq35421();
							linhas.setNumEsq35421(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35421(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35412")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35412() {

		List<FieEsq35412> esqList = new ArrayList<FieEsq35412>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35412 linhas = new FieEsq35412();
							linhas.setNumEsq35412(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35412(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35241")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35241() {

		List<FieEsq35241> esqList = new ArrayList<FieEsq35241>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35241 linhas = new FieEsq35241();
							linhas.setNumEsq35241(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35241(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35214")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35214() {

		List<FieEsq35214> esqList = new ArrayList<FieEsq35214>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35214 linhas = new FieEsq35214();
							linhas.setNumEsq35214(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35214(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35142")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35142() {

		List<FieEsq35142> esqList = new ArrayList<FieEsq35142>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35142 linhas = new FieEsq35142();
							linhas.setNumEsq35142(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35142(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35124")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35124() {

		List<FieEsq35124> esqList = new ArrayList<FieEsq35124>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35124 linhas = new FieEsq35124();
							linhas.setNumEsq35124(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		} 
		fienumeroList.gravarEsq35124(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43215")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43215() {

		List<FieEsq43215> esqList = new ArrayList<FieEsq43215>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43215 linhas = new FieEsq43215();
							linhas.setNumEsq43215(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43215(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43251")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43251() {

		List<FieEsq43251> esqList = new ArrayList<FieEsq43251>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43251 linhas = new FieEsq43251();
							linhas.setNumEsq43251(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43251(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43152")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43152() {

		List<FieEsq43152> esqList = new ArrayList<FieEsq43152>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43152 linhas = new FieEsq43152();
							linhas.setNumEsq43152(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43152(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43512")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43512() {

		List<FieEsq43512> esqList = new ArrayList<FieEsq43512>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43512 linhas = new FieEsq43512();
							linhas.setNumEsq43512(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43512(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43125")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43125() {

		List<FieEsq43125> esqList = new ArrayList<FieEsq43125>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43125 linhas = new FieEsq43125();
							linhas.setNumEsq43125(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43125(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43521")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43521() {

		List<FieEsq43521> esqList = new ArrayList<FieEsq43521>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43521 linhas = new FieEsq43521();
							linhas.setNumEsq43521(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43521(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42315")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42315() {

		List<FieEsq42315> esqList = new ArrayList<FieEsq42315>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42315 linhas = new FieEsq42315();
							linhas.setNumEsq42315(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42315(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42351")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42351() {

		List<FieEsq42351> esqList = new ArrayList<FieEsq42351>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42351 linhas = new FieEsq42351();
							linhas.setNumEsq42351(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42351(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42135")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42135() {

		List<FieEsq42135> esqList = new ArrayList<FieEsq42135>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42135 linhas = new FieEsq42135();
							linhas.setNumEsq42135(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42135(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42153")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42153() {

		List<FieEsq42153> esqList = new ArrayList<FieEsq42153>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42153 linhas = new FieEsq42153();
							linhas.setNumEsq42153(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42153(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42531")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42531() {

		List<FieEsq42531> esqList = new ArrayList<FieEsq42531>();

		umEsq5 = numeroList.listarEsqUm5();
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42531 linhas = new FieEsq42531();
							linhas.setNumEsq42531(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42531(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42513")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq42513() {

		List<FieEsq42513> esqList = new ArrayList<FieEsq42513>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42513 linhas = new FieEsq42513();
							linhas.setNumEsq42513(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42513(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41325")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41325() {

		List<FieEsq41325> esqList = new ArrayList<FieEsq41325>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41325 linhas = new FieEsq41325();
							linhas.setNumEsq41325(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41352() {
		
		List<FieEsq41352> esqList = new ArrayList<FieEsq41352>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41352 linhas = new FieEsq41352();
							linhas.setNumEsq41352(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41235() {

		List<FieEsq41235> esqList = new ArrayList<FieEsq41235>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41235 linhas = new FieEsq41235();
							linhas.setNumEsq41235(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41253() {

		List<FieEsq41253> esqList = new ArrayList<FieEsq41253>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41253 linhas = new FieEsq41253();
							linhas.setNumEsq41253(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41532() {

		List<FieEsq41532> esqList = new ArrayList<FieEsq41532>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41532 linhas = new FieEsq41532();
							linhas.setNumEsq41532(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41523() {

		List<FieEsq41523> esqList = new ArrayList<FieEsq41523>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41523 linhas = new FieEsq41523();
							linhas.setNumEsq41523(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45321")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45321() {

		List<FieEsq45321> esqList = new ArrayList<FieEsq45321>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45321 linhas = new FieEsq45321();
							linhas.setNumEsq45321(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45321(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45312")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45312() {

		List<FieEsq45312> esqList = new ArrayList<FieEsq45312>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45312 linhas = new FieEsq45312();
							linhas.setNumEsq45312(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45312(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45231")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45231() {

		List<FieEsq45231> esqList = new ArrayList<FieEsq45231>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45231 linhas = new FieEsq45231();
							linhas.setNumEsq45231(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45231(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45213")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45213() {

		List<FieEsq45213> esqList = new ArrayList<FieEsq45213>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45213 linhas = new FieEsq45213();
							linhas.setNumEsq45213(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45213(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45132")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45132() {

		List<FieEsq45132> esqList = new ArrayList<FieEsq45132>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45132 linhas = new FieEsq45132();
							linhas.setNumEsq45132(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45132(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45123")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45123() {

		List<FieEsq45123> esqList = new ArrayList<FieEsq45123>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45123 linhas = new FieEsq45123();
							linhas.setNumEsq45123(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45123(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54312")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54312() {

		List<FieEsq54312> esqList = new ArrayList<FieEsq54312>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54312 linhas = new FieEsq54312();
							linhas.setNumEsq54312(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54312(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54213")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54213() {

		List<FieEsq54213> esqList = new ArrayList<FieEsq54213>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54213 linhas = new FieEsq54213();
							linhas.setNumEsq54213(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54213(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54123")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54123() {

		List<FieEsq54123> esqList = new ArrayList<FieEsq54123>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54123 linhas = new FieEsq54123();
							linhas.setNumEsq54123(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54123(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54231")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54231() {

		List<FieEsq54231> esqList = new ArrayList<FieEsq54231>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54231 linhas = new FieEsq54231();
							linhas.setNumEsq54231(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54231(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54132")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54132() {

		List<FieEsq54132> esqList = new ArrayList<FieEsq54132>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54132 linhas = new FieEsq54132();
							linhas.setNumEsq54132(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54132(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53421")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53421() {

		List<FieEsq53421> esqList = new ArrayList<FieEsq53421>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53421 linhas = new FieEsq53421();
							linhas.setNumEsq53421(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53421(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53412")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53412() {

		List<FieEsq53412> esqList = new ArrayList<FieEsq53412>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53412 linhas = new FieEsq53412();
							linhas.setNumEsq53412(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53412(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53241")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53241() {

		List<FieEsq53241> esqList = new ArrayList<FieEsq53241>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53241 linhas = new FieEsq53241();
							linhas.setNumEsq53241(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53241(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53214")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53214() {

		List<FieEsq53214> esqList = new ArrayList<FieEsq53214>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53214 linhas = new FieEsq53214();
							linhas.setNumEsq53214(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53214(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53142")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53142() {

		List<FieEsq53142> esqList = new ArrayList<FieEsq53142>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53142 linhas = new FieEsq53142();
							linhas.setNumEsq53142(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53142(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53124")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53124() {

		List<FieEsq53124> esqList = new ArrayList<FieEsq53124>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53124 linhas = new FieEsq53124();
							linhas.setNumEsq53124(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53124(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52431")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52431() {

		List<FieEsq52431> esqList = new ArrayList<FieEsq52431>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52431 linhas = new FieEsq52431();
							linhas.setNumEsq52431(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52431(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52413")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52413() {

		List<FieEsq52413> esqList = new ArrayList<FieEsq52413>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52413 linhas = new FieEsq52413();
							linhas.setNumEsq52413(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52413(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52341")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52341() {

		List<FieEsq52341> esqList = new ArrayList<FieEsq52341>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52341 linhas = new FieEsq52341();
							linhas.setNumEsq52341(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52341(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52314")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52314() {

		List<FieEsq52314> esqList = new ArrayList<FieEsq52314>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52314 linhas = new FieEsq52314();
							linhas.setNumEsq52314(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52314(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52143")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52143() {

		List<FieEsq52143> esqList = new ArrayList<FieEsq52143>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						 for (int u = 0; u < 10; u++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
						String linhaCinco = String.valueOf(cincoEsq3.get(u));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq52143 linhas = new FieEsq52143();
						linhas.setNumEsq52143(linha);
						esqList.add(linhas);
					   }
				   }
			   }
		   }
	   }
	   fienumeroList.gravarEsq52143(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52134")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52134() {

		List<FieEsq52134> esqList = new ArrayList<FieEsq52134>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52134 linhas = new FieEsq52134();
							linhas.setNumEsq52134(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52134(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51432")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51432() {

		List<FieEsq51432> esqList = new ArrayList<FieEsq51432>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51432 linhas = new FieEsq51432();
							linhas.setNumEsq51432(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51432(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51423")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51423() {

		List<FieEsq51423> esqList = new ArrayList<FieEsq51423>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51423 linhas = new FieEsq51423();
							linhas.setNumEsq51423(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51423(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51342")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51342() {

		List<FieEsq51342> esqList = new ArrayList<FieEsq51342>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51342 linhas = new FieEsq51342();
							linhas.setNumEsq51342(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51342(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51324")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51324() {

		List<FieEsq51324> esqList = new ArrayList<FieEsq51324>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51324 linhas = new FieEsq51324();
							linhas.setNumEsq51324(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51324(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51243")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51243() {

		List<FieEsq51243> esqList = new ArrayList<FieEsq51243>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51243 linhas = new FieEsq51243();
							linhas.setNumEsq51243(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51243(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51234")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51234() {

		List<FieEsq51234> esqList = new ArrayList<FieEsq51234>();

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq4, umEsq3, umEsq2, doisEsq4, doisEsq3,
				doisEsq2, tresEsq4, tresEsq3, tresEsq2, quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq3, quatroEsq3,
				cincoEsq2, cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51234 linhas = new FieEsq51234();
							linhas.setNumEsq51234(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq51234(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	public void executaList(String umEsq5, String doisEsq5, String tresEsq5, String quatroEsq5, String cincoEsq5,
			List<EsqUmModel> umEsq4, List<EsqUmModel> umEsq3, List<EsqUmModel> umEsq2, List<EsqDoisModel> doisEsq4, List<EsqDoisModel> doisEsq3,
			List<EsqDoisModel> doisEsq2, List<EsqTresModel> tresEsq4, List<EsqTresModel> tresEsq3, List<EsqTresModel> tresEsq2,
			List<EsqQuatroModel> quatroEsq4, List<EsqQuatroModel> quatroEsq2, List<EsqCincoModel> cincoEsq4, List<EsqCincoModel> cincoEsq3,
			List<EsqQuatroModel> quatroEsq3, List<EsqCincoModel> cincoEsq2, String[] cincoEsq1, String[] quatroEsq1,
			String[] tresEsq1, String[] doisEsq1, String[] umEsq1) {

		// ***********************************************************
		this.umEsq5=umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5=doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5=tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5=quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5=cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
		this.umEsq4=umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3=umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.umEsq2=umEsq2 = numeroList.listarEsqUm2();
		// ************************************************************
		this.doisEsq4=doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.doisEsq3=doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.doisEsq2=doisEsq2 = numeroList.listarEsqDois2();
		// ************************************************************
		this.tresEsq4=tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.tresEsq3=tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.tresEsq2=tresEsq2 = numeroList.listarEsqTres2();
		// ***************************************************************
		this.quatroEsq4=quatroEsq4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		this.quatroEsq3=quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.quatroEsq2=quatroEsq2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		this.cincoEsq4=cincoEsq4 = numeroList.listarEsqCinco4();
		// ****************************************************************
		this.cincoEsq3=cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq2=cincoEsq2 = numeroList.listarEsqCinco2();
		// ****************************************************************
		this.cincoEsq1=cincoEsq1 = numeroList.listarEsqCinco1();
		// ******************************************************************
		this.quatroEsq1=quatroEsq1 = numeroList.listarEsqQuatro1();
		// ******************************************************************
		this.tresEsq1=tresEsq1 = numeroList.listarEsqTres1();
		// ******************************************************************
		this.doisEsq1=doisEsq1 = numeroList.listarEsqDois1();
		// ******************************************************************
		this.umEsq1=umEsq1 = numeroList.listarEsqUm1();
		// ******************************************************************
	}

}
