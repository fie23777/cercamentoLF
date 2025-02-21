package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44331;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq44331Controller {

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44331 fienumeroList;
	

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

	
	

	@RequestMapping("/esquemas/esq44331/esq44331")
	public String esq44331() {

		return "/esquemas/esq44331/esq44331";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44331")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44331() {
        List<FieEsq44331> esqList = new ArrayList<FieEsq44331>();
        FieEsq44331 linhas;
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
				     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
				     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							linhas = new FieEsq44331();
							linhas.setNumEsq44331(linha);
							esqList.add(linhas);							
						}
					}
				}
			}
		}
		
		fienumeroList.gravarEsq44331(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33144")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33144() {

		List<FieEsq33144> esqList = new ArrayList<FieEsq33144>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33144 linhas = new FieEsq33144();
							linhas.setNumEsq33144(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33144(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33414")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33414() {

		List<FieEsq33414> esqList = new ArrayList<FieEsq33414>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33414 linhas = new FieEsq33414();
							linhas.setNumEsq33414(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33414(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33441")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33441() {
		
		List<FieEsq33441> esqList = new ArrayList<FieEsq33441>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33441 linhas = new FieEsq33441();
							linhas.setNumEsq33441(linha);
							esqList.add(linhas);
							
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq33441(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31344")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31344() {

	
		List<FieEsq31344> esqList = new ArrayList<FieEsq31344>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31344 linhas = new FieEsq31344();
							linhas.setNumEsq31344(linha);
							esqList.add(linhas);
							
						}
					}
				}
			} 
		}
		fienumeroList.gravarEsq31344(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31434")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31434() {

		List<FieEsq31434> esqList = new ArrayList<FieEsq31434>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31434 linhas = new FieEsq31434();
							linhas.setNumEsq31434(linha);
							esqList.add(linhas);
							
						}
					}
				}
			} 
		}
		fienumeroList.gravarEsq31434(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31443")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq31443() {

		List<FieEsq31443> esqList = new ArrayList<FieEsq31443>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31443 linhas = new FieEsq31443();
							linhas.setNumEsq31443(linha);
							esqList.add(linhas);							
						}
					}
				}
			}
		} 
		fienumeroList.gravarEsq31443(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34314")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34314() {
		
		List<FieEsq34314> esqList = new ArrayList<FieEsq34314>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34314 linhas = new FieEsq34314();
							linhas.setNumEsq34314(linha);
							esqList.add(linhas);							
						}
					}
				}
			}
		}  
		fienumeroList.gravarEsq34314(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34341")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34341() {

		List<FieEsq34341> esqList = new ArrayList<FieEsq34341>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34341 linhas = new FieEsq34341();
							linhas.setNumEsq34341(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34341(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34143")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34143() {

		List<FieEsq34143> esqList = new ArrayList<FieEsq34143>();


		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34143 linhas = new FieEsq34143();
							linhas.setNumEsq34143(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34143(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34134")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34134() {

		List<FieEsq34134> esqList = new ArrayList<FieEsq34134>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34134 linhas = new FieEsq34134();
							linhas.setNumEsq34134(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34134(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34431")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34431() {

		List<FieEsq34431> esqList = new ArrayList<FieEsq34431>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34431 linhas = new FieEsq34431();
							linhas.setNumEsq34431(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34431(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34413")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34413() {

		List<FieEsq34413> esqList = new ArrayList<FieEsq34413>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34413 linhas = new FieEsq34413();
							linhas.setNumEsq34413(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq34413(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13344")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13344() {

		List<FieEsq13344> esqList = new ArrayList<FieEsq13344>();
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13344 linhas = new FieEsq13344();
							linhas.setNumEsq13344(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13344(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13434")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13434() {

		List<FieEsq13434> esqList = new ArrayList<FieEsq13434>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13434 linhas = new FieEsq13434();
							linhas.setNumEsq13434(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13434(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13443")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq13443() {

		List<FieEsq13443> esqList = new ArrayList<FieEsq13443>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13443 linhas = new FieEsq13443();
							linhas.setNumEsq13443(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq13443(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14433")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14433() {

		List<FieEsq14433> esqList = new ArrayList<FieEsq14433>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14433 linhas = new FieEsq14433();
							linhas.setNumEsq14433(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14433(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14343")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14343() {

		List<FieEsq14343> esqList = new ArrayList<FieEsq14343>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14343 linhas = new FieEsq14343();
							linhas.setNumEsq14343(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14343(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14334")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14334() {
		
		List<FieEsq14334> esqList = new ArrayList<FieEsq14334>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14334 linhas = new FieEsq14334();
							linhas.setNumEsq14334(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq14334(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44133")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44133() {

		List<FieEsq44133> esqList = new ArrayList<FieEsq44133>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44133 linhas = new FieEsq44133();
							linhas.setNumEsq44133(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq44133(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44313")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq44313() {

		List<FieEsq44313> esqList = new ArrayList<FieEsq44313>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44313 linhas = new FieEsq44313();
							linhas.setNumEsq44313(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq44313(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	
	@RequestMapping("/fieesqlf/cercaFieEsq41433")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41433() {

		List<FieEsq41433> esqList = new ArrayList<FieEsq41433>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41433 linhas = new FieEsq41433();
							linhas.setNumEsq41433(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41433(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41343")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41343() {

		List<FieEsq41343> esqList = new ArrayList<FieEsq41343>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41343 linhas = new FieEsq41343();
							linhas.setNumEsq41343(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41343(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41334")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41334() {

		List<FieEsq41334> esqList = new ArrayList<FieEsq41334>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41334 linhas = new FieEsq41334();
							linhas.setNumEsq41334(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq41334(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43413")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43413() {

		List<FieEsq43413> esqList = new ArrayList<FieEsq43413>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43413 linhas = new FieEsq43413();
							linhas.setNumEsq43413(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43413(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43431")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43431() {

		List<FieEsq43431> esqList = new ArrayList<FieEsq43431>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43431 linhas = new FieEsq43431();
							linhas.setNumEsq43431(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43431(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43143")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43143() {

		List<FieEsq43143> esqList = new ArrayList<FieEsq43143>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43143 linhas = new FieEsq43143();
							linhas.setNumEsq43143(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43143(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43134")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43134() {

		List<FieEsq43134> esqList = new ArrayList<FieEsq43134>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43134 linhas = new FieEsq43134();
							linhas.setNumEsq43134(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43134(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43341")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43341() {

		List<FieEsq43341> esqList = new ArrayList<FieEsq43341>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43341 linhas = new FieEsq43341();
							linhas.setNumEsq43341(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43341(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43314")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43314() {

		List<FieEsq43314> esqList = new ArrayList<FieEsq43314>();

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43314 linhas = new FieEsq43314();
							linhas.setNumEsq43314(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq43314(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	public void executaLista(List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq3,List<EsqTresModel> tresEsq4,
			List<EsqTresModel> tresEsq3,List<EsqQuatroModel> quatroEsq4,List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq3,
			String[] cincoEsq1,String[] quatroEsq1,String[] tresEsq1,String[] doisEsq1,String[] umEsq1){
		
		this.umEsq4 = umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3 = umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.doisEsq4 = doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.doisEsq3 = doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.tresEsq4 = tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.tresEsq3 = tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.quatroEsq4 = quatroEsq4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		this.quatroEsq3 = quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.cincoEsq4 = cincoEsq4 = numeroList.listarEsqCinco4();
		// ****************************************************************
		this.cincoEsq3 = cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq1 = cincoEsq1 = numeroList.listarEsqCinco1();
		// ******************************************************************
		this.quatroEsq1 = quatroEsq1 = numeroList.listarEsqQuatro1();
		// ******************************************************************
		this.tresEsq1 = tresEsq1 = numeroList.listarEsqTres1();
		// ******************************************************************
		this.doisEsq1 = doisEsq1 = numeroList.listarEsqDois1();
		// ******************************************************************
		this.umEsq1 = umEsq1 = numeroList.listarEsqUm1();
		// ******************************************************************
	}

	
}
