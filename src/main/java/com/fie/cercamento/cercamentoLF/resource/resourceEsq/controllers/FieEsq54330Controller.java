package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45330;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54330;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao54330;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq54330Controller {

	private static final String FINALIZADO_O_CERCAMENTO_DO_ESQUEMA = "Finalizado o cercamento do esquema";

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao54330 fienumeroList;
	
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


	@RequestMapping("/esquemas/esq54330/esq54330")
	public String esq54330() {

		return "/esquemas/esq54330/esq54330";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54330")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54330() {

		List<FieEsq54330> esqList = new ArrayList<FieEsq54330>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
			   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
				      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq54330 linhas = new FieEsq54330();
						linhas.setNumEsq54330(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54330(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq54303")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54303() {

		List<FieEsq54303> esqList = new ArrayList<FieEsq54303>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq54303 linhas = new FieEsq54303();
						linhas.setNumEsq54303(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54303(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq54033")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54033() {

		List<FieEsq54033> esqList = new ArrayList<FieEsq54033>();
		
		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
	
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq54033 linhas = new FieEsq54033();
						linhas.setNumEsq54033(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54033(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53430")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53430() {

		List<FieEsq53430> esqList = new ArrayList<FieEsq53430>();
		
		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq53430 linhas = new FieEsq53430();
						linhas.setNumEsq53430(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53430(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53403")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53403() {

		List<FieEsq53403> esqList = new ArrayList<FieEsq53403>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq53403 linhas = new FieEsq53403();
						linhas.setNumEsq53403(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53403(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53340")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53340() {

		List<FieEsq53340> esqList = new ArrayList<FieEsq53340>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq53340 linhas = new FieEsq53340();
						linhas.setNumEsq53340(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53340(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53304")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53304() {

		List<FieEsq53304> esqList = new ArrayList<FieEsq53304>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq53304 linhas = new FieEsq53304();
						linhas.setNumEsq53304(linha);
						esqList.add(linhas);
					}
				}
			}
		}
			fienumeroList.gravarEsq53304(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50433")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50433() {

		List<FieEsq50433> esqList = new ArrayList<FieEsq50433>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50433 linhas = new FieEsq50433();
						linhas.setNumEsq50433(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50433(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50343")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50343() {

		List<FieEsq50343> esqList = new ArrayList<FieEsq50343>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq50343 linhas = new FieEsq50343();
						linhas.setNumEsq50343(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50343(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50334")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50334() {

		List<FieEsq50334> esqList = new ArrayList<FieEsq50334>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq50334 linhas = new FieEsq50334();
						linhas.setNumEsq50334(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50334(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53043")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53043() {

		List<FieEsq53043> esqList = new ArrayList<FieEsq53043>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq53043 linhas = new FieEsq53043();
						linhas.setNumEsq53043(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53043(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53034")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53034() {

		List<FieEsq53034> esqList = new ArrayList<FieEsq53034>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois +  linhaQuatro+linhaCinco;

						FieEsq53034 linhas = new FieEsq53034();
						linhas.setNumEsq53034(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53034(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45330")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45330() {

		List<FieEsq45330> esqList = new ArrayList<FieEsq45330>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));;

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq45330 linhas = new FieEsq45330();
						linhas.setNumEsq45330(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45330(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45303")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45303() {

		List<FieEsq45303> esqList = new ArrayList<FieEsq45303>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq45303 linhas = new FieEsq45303();
						linhas.setNumEsq45303(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45303(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45033")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45033() {

		List<FieEsq45033> esqList = new ArrayList<FieEsq45033>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						
						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq45033 linhas = new FieEsq45033();
						linhas.setNumEsq45033(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45033(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43530")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43530() {

		List<FieEsq43530> esqList = new ArrayList<FieEsq43530>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));
		

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq43530 linhas = new FieEsq43530();
						linhas.setNumEsq43530(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43530(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43503")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43503() {

		List<FieEsq43503> esqList = new ArrayList<FieEsq43503>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
	
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq43503 linhas = new FieEsq43503();
						linhas.setNumEsq43503(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43503(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43350")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43350() {

		List<FieEsq43350> esqList = new ArrayList<FieEsq43350>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq43350 linhas = new FieEsq43350();
						linhas.setNumEsq43350(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43350(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43305")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43305() {

		List<FieEsq43305> esqList = new ArrayList<FieEsq43305>();


		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq43305 linhas = new FieEsq43305();
						linhas.setNumEsq43305(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43305(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43053")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43053() {

		List<FieEsq43053> esqList = new ArrayList<FieEsq43053>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq43053 linhas = new FieEsq43053();
						linhas.setNumEsq43053(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43053(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43035")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq43035() {

		List<FieEsq43035> esqList = new ArrayList<FieEsq43035>();


		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois +  linhaQuatro+linhaCinco;

						FieEsq43035 linhas = new FieEsq43035();
						linhas.setNumEsq43035(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq43035(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40533")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40533() {

		List<FieEsq40533> esqList = new ArrayList<FieEsq40533>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq40533 linhas = new FieEsq40533();
						linhas.setNumEsq40533(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40533(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40353")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40353() {

		List<FieEsq40353> esqList = new ArrayList<FieEsq40353>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));

						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq40353 linhas = new FieEsq40353();
						linhas.setNumEsq40353(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40353(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40335")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40335() {

		List<FieEsq40335> esqList = new ArrayList<FieEsq40335>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));

						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq40335 linhas = new FieEsq40335();
						linhas.setNumEsq40335(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40335(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35430")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35430() {

		List<FieEsq35430> esqList = new ArrayList<FieEsq35430>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));
			

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq35430 linhas = new FieEsq35430();
						linhas.setNumEsq35430(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35430(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35403")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35403() {

		List<FieEsq35403> esqList = new ArrayList<FieEsq35403>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
	
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;;

						FieEsq35403 linhas = new FieEsq35403();
						linhas.setNumEsq35403(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35403(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35340")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35340() {

		List<FieEsq35340> esqList = new ArrayList<FieEsq35340>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq35340 linhas = new FieEsq35340();
						linhas.setNumEsq35340(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35340(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35304")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35304() {

		List<FieEsq35304> esqList = new ArrayList<FieEsq35304>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;
						FieEsq35304 linhas = new FieEsq35304();
						linhas.setNumEsq35304(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35304(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35043")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35043() {

		List<FieEsq35043> esqList = new ArrayList<FieEsq35043>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq35043 linhas = new FieEsq35043();
						linhas.setNumEsq35043(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35043(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35034")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35034() {

		List<FieEsq35034> esqList = new ArrayList<FieEsq35034>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois +  linhaQuatro+linhaCinco;

						FieEsq35034 linhas = new FieEsq35034();
						linhas.setNumEsq35034(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35034(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34530")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34530() {

		List<FieEsq34530> esqList = new ArrayList<FieEsq34530>();


		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));
	

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq34530 linhas = new FieEsq34530();
						linhas.setNumEsq34530(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34530(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34503")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34503() {

		List<FieEsq34503> esqList = new ArrayList<FieEsq34503>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq34503 linhas = new FieEsq34503();
						linhas.setNumEsq34503(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34503(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34350")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34350() {

		List<FieEsq34350> esqList = new ArrayList<FieEsq34350>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq34350 linhas = new FieEsq34350();
						linhas.setNumEsq34350(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34350(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34305")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34305() {

		List<FieEsq34305> esqList = new ArrayList<FieEsq34305>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
	
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;
						FieEsq34305 linhas = new FieEsq34305();
						linhas.setNumEsq34305(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34305(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34053")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34053() {

		List<FieEsq34053> esqList = new ArrayList<FieEsq34053>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
	
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois +  linhaQuatro+linhaCinco;

						FieEsq34053 linhas = new FieEsq34053();
						linhas.setNumEsq34053(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34053(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34035")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq34035() {

		List<FieEsq34035> esqList = new ArrayList<FieEsq34035>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq34035 linhas = new FieEsq34035();
						linhas.setNumEsq34035(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq34035(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33540")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33540() {

		List<FieEsq33540> esqList = new ArrayList<FieEsq33540>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
	

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq33540 linhas = new FieEsq33540();
						linhas.setNumEsq33540(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33540(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33504")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33504() {

		List<FieEsq33504> esqList = new ArrayList<FieEsq33504>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
				
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq33504 linhas = new FieEsq33504();
						linhas.setNumEsq33504(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33504(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33450")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33450() {

		List<FieEsq33450> esqList = new ArrayList<FieEsq33450>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
					

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq33450 linhas = new FieEsq33450();
						linhas.setNumEsq33450(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33450(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33405")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33405() {

		List<FieEsq33405> esqList = new ArrayList<FieEsq33405>();


		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e <10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
					
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq33405 linhas = new FieEsq33405();
						linhas.setNumEsq33405(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33405(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33054")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33054() {

		List<FieEsq33054> esqList = new ArrayList<FieEsq33054>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
				
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;
						FieEsq33054 linhas = new FieEsq33054();
						linhas.setNumEsq33054(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33054(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33045")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq33045() {

		List<FieEsq33045> esqList = new ArrayList<FieEsq33045>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
					
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq33045 linhas = new FieEsq33045();
						linhas.setNumEsq33045(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq33045(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30543")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30543() {

		List<FieEsq30543> esqList = new ArrayList<FieEsq30543>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
				
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq30543 linhas = new FieEsq30543();
						linhas.setNumEsq30543(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30543(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30534")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30534() {

		List<FieEsq30534> esqList = new ArrayList<FieEsq30534>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
					
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;
						FieEsq30534 linhas = new FieEsq30534();
						linhas.setNumEsq30534(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30534(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30453")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30453() {

		List<FieEsq30453> esqList = new ArrayList<FieEsq30453>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
					
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq30453 linhas = new FieEsq30453();
						linhas.setNumEsq30453(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30453(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30435")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30435() {

		List<FieEsq30435> esqList = new ArrayList<FieEsq30435>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq30435 linhas = new FieEsq30435();
						linhas.setNumEsq30435(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30435(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30354")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30354() {

		List<FieEsq30354> esqList = new ArrayList<FieEsq30354>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
				
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq30354 linhas = new FieEsq30354();
						linhas.setNumEsq30354(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30354(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30345")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30345() {

		List<FieEsq30345> esqList = new ArrayList<FieEsq30345>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
					
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq30345 linhas = new FieEsq30345();
						linhas.setNumEsq30345(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30345(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05433")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05433() {

		List<FieEsq05433> esqList = new ArrayList<FieEsq05433>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

					
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05433 linhas = new FieEsq05433();
						linhas.setNumEsq05433(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05433(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05343")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05343() {

		List<FieEsq05343> esqList = new ArrayList<FieEsq05343>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05343 linhas = new FieEsq05343();
						linhas.setNumEsq05343(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05343(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05334")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05334() {

		List<FieEsq05334> esqList = new ArrayList<FieEsq05334>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05334 linhas = new FieEsq05334();
						linhas.setNumEsq05334(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05334(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04533")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04533() {

		List<FieEsq04533> esqList = new ArrayList<FieEsq04533>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04533 linhas = new FieEsq04533();
						linhas.setNumEsq04533(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04533(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04353")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04353() {

		List<FieEsq04353> esqList = new ArrayList<FieEsq04353>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;
						
						FieEsq04353 linhas = new FieEsq04353();
						linhas.setNumEsq04353(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04353(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04335")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04335() {

		List<FieEsq04335> esqList = new ArrayList<FieEsq04335>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04335 linhas = new FieEsq04335();
						linhas.setNumEsq04335(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04335(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03543")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03543() {

		List<FieEsq03543> esqList = new ArrayList<FieEsq03543>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03543 linhas = new FieEsq03543();
						linhas.setNumEsq03543(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03543(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03534")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03534() {

		List<FieEsq03534> esqList = new ArrayList<FieEsq03534>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03534 linhas = new FieEsq03534();
						linhas.setNumEsq03534(linha);
						esqList.add(linhas);
					}
				}
			}
		}
			fienumeroList.gravarEsq03534(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03453")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03453() {

		List<FieEsq03453> esqList = new ArrayList<FieEsq03453>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03453 linhas = new FieEsq03453();
						linhas.setNumEsq03453(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03453(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03435")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03435() {

		List<FieEsq03435> esqList = new ArrayList<FieEsq03435>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03435 linhas = new FieEsq03435();
						linhas.setNumEsq03435(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03435(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03354")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03354() {

		List<FieEsq03354> esqList = new ArrayList<FieEsq03354>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03354 linhas = new FieEsq03354();
						linhas.setNumEsq03354(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03354(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03345")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03345() {

		List<FieEsq03345> esqList = new ArrayList<FieEsq03345>();

		executaListas(umEsq5, doisEsq5, tresEsq5, quatroEsq5,cincoEsq5,
		   	      umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3, 
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03345 linhas = new FieEsq03345();
						linhas.setNumEsq03345(linha);
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03345(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	public void executaListas(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5,
			List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq3,List<EsqTresModel> tresEsq4,
			List<EsqTresModel> tresEsq3,List<EsqQuatroModel> quatroEsq4,List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq3){
		
		this.umEsq5= umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5= doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5=tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5= quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5= cincoEsq5 = numeroList.listarEsqCinco5();
		// **********************************************************
		this.umEsq4= umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.doisEsq4= doisEsq4 = numeroList.listarEsqDois4();
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
