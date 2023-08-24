package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao53322;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq53322Controller {

	private static final String FINALIZADO_O_CERCAMENTO_DO_ESQUEMA = "Finalizado o cercamento do esquema";

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao53322 fienumeroList;

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

	List<EsqUmModel> umEsq3;
	// ************************************************************
	List<EsqUmModel> umEsq2;
	// ************************************************************

	List<EsqDoisModel> doisEsq3;
	// ************************************************************
	List<EsqDoisModel> doisEsq2;
	// ************************************************************

	List<EsqTresModel> tresEsq3;
	// ***************************************************************
	List<EsqTresModel> tresEsq2;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq3;
	// ****************************************************************
	List<EsqQuatroModel> quatroEsq2;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq3;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq2;
	// ****************************************************************

	@RequestMapping("/esquemas/esq53322/esq53322")
	public String esq53322() {

		return "/esquemas/esq53322/esq53322";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53322")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53322() {

		List<FieEsq53322> esqList = new ArrayList<FieEsq53322>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53322 linhas = new FieEsq53322();
							linhas.setNumEsq53322(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53322(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33522")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33522() {

		List<FieEsq33522> esqList = new ArrayList<FieEsq33522>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33522 linhas = new FieEsq33522();
							linhas.setNumEsq33522(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33522(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33252")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33252() {

		List<FieEsq33252> esqList = new ArrayList<FieEsq33252>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33252 linhas = new FieEsq33252();
							linhas.setNumEsq33252(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33252(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33225")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33225() {

		List<FieEsq33225> esqList = new ArrayList<FieEsq33225>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33225 linhas = new FieEsq33225();
							linhas.setNumEsq33225(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33225(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35322")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35322() {

		List<FieEsq35322> esqList = new ArrayList<FieEsq35322>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35322 linhas = new FieEsq35322();
							linhas.setNumEsq35322(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35322(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35232")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35232() {

		List<FieEsq35232> esqList = new ArrayList<FieEsq35232>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35232 linhas = new FieEsq35232();
							linhas.setNumEsq35232(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35232(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35223")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35223() {

		List<FieEsq35223> esqList = new ArrayList<FieEsq35223>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35223 linhas = new FieEsq35223();
							linhas.setNumEsq35223(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq35223(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32352() {

		List<FieEsq32352> esqList = new ArrayList<FieEsq32352>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32352 linhas = new FieEsq32352();
							linhas.setNumEsq32352(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32325")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32325() {

		List<FieEsq32325> esqList = new ArrayList<FieEsq32325>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32325 linhas = new FieEsq32325();
							linhas.setNumEsq32325(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32532() {

		List<FieEsq32532> esqList = new ArrayList<FieEsq32532>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32532 linhas = new FieEsq32532();
							linhas.setNumEsq32532(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32523() {

		List<FieEsq32523> esqList = new ArrayList<FieEsq32523>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32523 linhas = new FieEsq32523();
							linhas.setNumEsq32523(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32235() {

		List<FieEsq32235> esqList = new ArrayList<FieEsq32235>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32235 linhas = new FieEsq32235();
							linhas.setNumEsq32235(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32253() {

		List<FieEsq32253> esqList = new ArrayList<FieEsq32253>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq32253 linhas = new FieEsq32253();
							linhas.setNumEsq32253(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq32253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53232")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53232() {

		List<FieEsq53232> esqList = new ArrayList<FieEsq53232>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53232 linhas = new FieEsq53232();
							linhas.setNumEsq53232(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53232(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53223")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53223() {

		List<FieEsq53223> esqList = new ArrayList<FieEsq53223>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53223 linhas = new FieEsq53223();
							linhas.setNumEsq53223(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq53223(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52233")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52233() {

		List<FieEsq52233> esqList = new ArrayList<FieEsq52233>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52233 linhas = new FieEsq52233();
							linhas.setNumEsq52233(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52233(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52323")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52323() {

		List<FieEsq52323> esqList = new ArrayList<FieEsq52323>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52323 linhas = new FieEsq52323();
							linhas.setNumEsq52323(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52323(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52332")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52332() {

		List<FieEsq52332> esqList = new ArrayList<FieEsq52332>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52332 linhas = new FieEsq52332();
							linhas.setNumEsq52332(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52332(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22533")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq22533() {

		List<FieEsq22533> esqList = new ArrayList<FieEsq22533>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22533 linhas = new FieEsq22533();
							linhas.setNumEsq22533(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22533(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22353")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq22353() {

		List<FieEsq22353> esqList = new ArrayList<FieEsq22353>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							;
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22353 linhas = new FieEsq22353();
							linhas.setNumEsq22353(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22353(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22335")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq22335() {

		List<FieEsq22335> esqList = new ArrayList<FieEsq22335>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22335 linhas = new FieEsq22335();
							linhas.setNumEsq22335(linha);
							esqList.add(linhas);
					}
				}
			}
		 }
	   }
	   fienumeroList.gravarEsq22335(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25233")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25233() {

		List<FieEsq25233> esqList = new ArrayList<FieEsq25233>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25233 linhas = new FieEsq25233();
							linhas.setNumEsq25233(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25233(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25323")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25323() {

		List<FieEsq25323> esqList = new ArrayList<FieEsq25323>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25323 linhas = new FieEsq25323();
							linhas.setNumEsq25323(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25323(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25332")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25332() {

		List<FieEsq25332> esqList = new ArrayList<FieEsq25332>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25332 linhas = new FieEsq25332();
							linhas.setNumEsq25332(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25332(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23253() {

		List<FieEsq23253> esqList = new ArrayList<FieEsq23253>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23253 linhas = new FieEsq23253();
							linhas.setNumEsq23253(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23235() {

		List<FieEsq23235> esqList = new ArrayList<FieEsq23235>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23235 linhas = new FieEsq23235();
							linhas.setNumEsq23235(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23523() {

		List<FieEsq23523> esqList = new ArrayList<FieEsq23523>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23523 linhas = new FieEsq23523();
							linhas.setNumEsq23523(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23532() {

		List<FieEsq23532> esqList = new ArrayList<FieEsq23532>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23532 linhas = new FieEsq23532();
							linhas.setNumEsq23532(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23325")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23325() {

		List<FieEsq23325> esqList = new ArrayList<FieEsq23325>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23325 linhas = new FieEsq23325();
							linhas.setNumEsq23325(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23352() {

		List<FieEsq23352> esqList = new ArrayList<FieEsq23352>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, umEsq2, doisEsq3, doisEsq2, tresEsq3,
				tresEsq2, quatroEsq3, quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq23352 linhas = new FieEsq23352();
							linhas.setNumEsq23352(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq23352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	public void executaLista(String umEsq5, String doisEsq5, String tresEsq5, String quatroEsq5, String cincoEsq5,
			List<EsqUmModel> umEsq3, List<EsqUmModel> umEsq2, List<EsqDoisModel> doisEsq3, List<EsqDoisModel> doisEsq2,
			List<EsqTresModel> tresEsq3, List<EsqTresModel> tresEsq2, List<EsqQuatroModel> quatroEsq3, List<EsqQuatroModel> quatroEsq2,
			List<EsqCincoModel> cincoEsq3, List<EsqCincoModel> cincoEsq2) {

		this.umEsq5 =umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5 = doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5 = tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5 = quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5 = cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
		this.umEsq3 = umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.umEsq2 = umEsq2 = numeroList.listarEsqUm2();
		// ************************************************************
		this.doisEsq3 = doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.doisEsq2 = doisEsq2 = numeroList.listarEsqDois2();
		// ************************************************************
		this.tresEsq3 = tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.tresEsq2 = tresEsq2 = numeroList.listarEsqTres2();
		// ***************************************************************
		this.quatroEsq3 = quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.quatroEsq2 = quatroEsq2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		this.cincoEsq3 = cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq2 = cincoEsq2 = numeroList.listarEsqCinco2();
		// ****************************************************************
	}
}
