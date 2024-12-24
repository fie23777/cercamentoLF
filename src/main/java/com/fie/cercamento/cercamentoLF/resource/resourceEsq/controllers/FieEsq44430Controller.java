package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq03444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq30444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44430;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq44430Controller {

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44430 fienumeroList;

	List<EsqUmModel> umEsq4;
	// ************************************************************
	List<EsqUmModel> umEsq3;
	// ************************************************************

	List<EsqDoisModel> doisEsq4;
	// ************************************************************
	List<EsqDoisModel> doisEsq3;
	// ************************************************************

	List<EsqTresModel> tresEsq4;
	// ***************************************************************
	List<EsqTresModel> tresEsq3;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq4;
	// ****************************************************************
	List<EsqQuatroModel> quatroEsq3;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq4;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq3;
	// ****************************************************************


	@RequestMapping("/esquemas/esq44430/esq44430")
	public String esq44430() {

		return "/esquemas/esq44430/esq44430";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44430")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44430() {

		List<FieEsq44430> esqList = new ArrayList<FieEsq44430>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
				      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq44430 linhas = new FieEsq44430();
						linhas.setNumEsq44430(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq44430(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34440")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34440() {

		List<FieEsq34440> esqList = new ArrayList<FieEsq34440>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
		

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq34440 linhas = new FieEsq34440();
						linhas.setNumEsq34440(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq34440(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34404")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34404() {

		List<FieEsq34404> esqList = new ArrayList<FieEsq34404>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq34404 linhas = new FieEsq34404();
						linhas.setNumEsq34404(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq34404(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34044")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34044() {

		List<FieEsq34044> esqList = new ArrayList<FieEsq34044>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
					
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq34044 linhas = new FieEsq34044();
						linhas.setNumEsq34044(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq34044(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30444")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30444() {

		List<FieEsq30444> esqList = new ArrayList<FieEsq30444>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
					
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq30444 linhas = new FieEsq30444();
						linhas.setNumEsq30444(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq30444(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44403")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44403() {

		List<FieEsq44403> esqList = new ArrayList<FieEsq44403>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
					
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq44403 linhas = new FieEsq44403();
						linhas.setNumEsq44403(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq44403(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44304")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44304() {

		List<FieEsq44304> esqList = new ArrayList<FieEsq44304>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
				
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq44304 linhas = new FieEsq44304();
						linhas.setNumEsq44304(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq44304(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44034")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44034() {

		List<FieEsq44034> esqList = new ArrayList<FieEsq44034>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
					
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq44034 linhas = new FieEsq44034();
						linhas.setNumEsq44034(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq44034(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43044")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43044() {

		List<FieEsq43044> esqList = new ArrayList<FieEsq43044>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq43044 linhas = new FieEsq43044();
						linhas.setNumEsq43044(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq43044(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40344")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40344() {

		List<FieEsq40344> esqList = new ArrayList<FieEsq40344>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
					
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq40344 linhas = new FieEsq40344();
						linhas.setNumEsq40344(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq40344(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43440")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43440() {

		List<FieEsq43440> esqList = new ArrayList<FieEsq43440>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
						
						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq43440 linhas = new FieEsq43440();
						linhas.setNumEsq43440(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq43440(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43404")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43404() {

		List<FieEsq43404> esqList = new ArrayList<FieEsq43404>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq43404 linhas = new FieEsq43404();
						linhas.setNumEsq43404(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq43404(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40443")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40443() {

		List<FieEsq40443> esqList = new ArrayList<FieEsq40443>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq40443 linhas = new FieEsq40443();
						linhas.setNumEsq40443(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq40443(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40434")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40434() {

		List<FieEsq40434> esqList = new ArrayList<FieEsq40434>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
					
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq40434 linhas = new FieEsq40434();
						linhas.setNumEsq40434(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq40434(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03444")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03444() {

		List<FieEsq03444> esqList = new ArrayList<FieEsq03444>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03444 linhas = new FieEsq03444();
						linhas.setNumEsq03444(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq03444(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04344")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04344() {

		List<FieEsq04344> esqList = new ArrayList<FieEsq04344>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04344 linhas = new FieEsq04344();
						linhas.setNumEsq04344(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq04344(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04434")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04434() {

		List<FieEsq04434> esqList = new ArrayList<FieEsq04434>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04434 linhas = new FieEsq04434();
						linhas.setNumEsq04434(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq04434(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04443")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04443() {

		List<FieEsq04443> esqList = new ArrayList<FieEsq04443>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04443 linhas = new FieEsq04443();
						linhas.setNumEsq04443(linha);
						esqList.add(linhas);

					}
				}
			}
		}
		fienumeroList.gravarEsq04443(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	public void executaLista(List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq3,
			                 List<EsqTresModel> tresEsq4,List<EsqTresModel> tresEsq3,List<EsqQuatroModel> quatroEsq4,
			                 List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq3){
		this.umEsq4= umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		 this.doisEsq4=doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.doisEsq3= doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.tresEsq4= tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.tresEsq3= tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.quatroEsq4= quatroEsq4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		this.quatroEsq3= quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.cincoEsq4= cincoEsq4 = numeroList.listarEsqCinco4();
		// ****************************************************************
		this.cincoEsq3= cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
	}
}
