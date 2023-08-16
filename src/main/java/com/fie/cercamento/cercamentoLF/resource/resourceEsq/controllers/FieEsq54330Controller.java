package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

@Controller
public class FieEsq54330Controller {
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
	public void cercaFieEsq54330() {

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
						fienumeroList.gravarEsq54330(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq54303")
	public void cercaFieEsq54303() {

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
						fienumeroList.gravarEsq54303(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq54033")
	public void cercaFieEsq54033() {
		
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
						fienumeroList.gravarEsq54033(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53430")
	public void cercaFieEsq53430() {
		
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
						fienumeroList.gravarEsq53430(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53403")
	public void cercaFieEsq53403() {

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
						fienumeroList.gravarEsq53403(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53340")
	public void cercaFieEsq53340() {

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
						fienumeroList.gravarEsq53340(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53304")
	public void cercaFieEsq53304() {

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
						fienumeroList.gravarEsq53304(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50433")
	public void cercaFieEsq50433() {

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
						fienumeroList.gravarEsq50433(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50343")
	public void cercaFieEsq50343() {

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
						fienumeroList.gravarEsq50343(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50334")
	public void cercaFieEsq50334() {

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
						fienumeroList.gravarEsq50334(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53043")
	public void cercaFieEsq53043() {

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
						fienumeroList.gravarEsq53043(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53034")
	public void cercaFieEsq53034() {

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
						fienumeroList.gravarEsq53034(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45330")
	public void cercaFieEsq45330() {

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
						fienumeroList.gravarEsq45330(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45303")
	public void cercaFieEsq45303() {

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
						fienumeroList.gravarEsq45303(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45033")
	public void cercaFieEsq45033() {

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
						fienumeroList.gravarEsq45033(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43530")
	public void cercaFieEsq43530() {

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
						fienumeroList.gravarEsq43530(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43503")
	public void cercaFieEsq43503() {

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
						fienumeroList.gravarEsq43503(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43350")
	public void cercaFieEsq43350() {

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
						fienumeroList.gravarEsq43350(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43305")
	public void cercaFieEsq43305() {


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
						fienumeroList.gravarEsq43305(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43053")
	public void cercaFieEsq43053() {

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
						fienumeroList.gravarEsq43053(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43035")
	public void cercaFieEsq43035() {


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
						fienumeroList.gravarEsq43035(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40533")
	public void cercaFieEsq40533() {

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
						fienumeroList.gravarEsq40533(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40353")
	public void cercaFieEsq40353() {


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
						fienumeroList.gravarEsq40353(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40335")
	public void cercaFieEsq40335() {

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
						fienumeroList.gravarEsq40335(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35430")
	public void cercaFieEsq35430() {

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
						fienumeroList.gravarEsq35430(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35403")
	public void cercaFieEsq35403() {

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
						fienumeroList.gravarEsq35403(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35340")
	public void cercaFieEsq35340() {

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
						fienumeroList.gravarEsq35340(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35304")
	public void cercaFieEsq35304() {

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
						fienumeroList.gravarEsq35304(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35043")
	public void cercaFieEsq35043() {

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
						fienumeroList.gravarEsq35043(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35034")
	public void cercaFieEsq35034() {

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
						fienumeroList.gravarEsq35034(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34530")
	public void cercaFieEsq34530() {


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
						fienumeroList.gravarEsq34530(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34503")
	public void cercaFieEsq34503() {

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
						fienumeroList.gravarEsq34503(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34350")
	public void cercaFieEsq34350() {

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
						fienumeroList.gravarEsq34350(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34305")
	public void cercaFieEsq34305() {

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
						fienumeroList.gravarEsq34305(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34053")
	public void cercaFieEsq34053() {

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
						fienumeroList.gravarEsq34053(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34035")
	public void cercaFieEsq34035() {

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
						fienumeroList.gravarEsq34035(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33540")
	public void cercaFieEsq33540() {

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
						fienumeroList.gravarEsq33540(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33504")
	public void cercaFieEsq33504() {

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
						fienumeroList.gravarEsq33504(linhas);

					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33450")
	public void cercaFieEsq33450() {

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
						fienumeroList.gravarEsq33450(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33405")
	public void cercaFieEsq33405() {


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
						fienumeroList.gravarEsq33405(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33054")
	public void cercaFieEsq33054() {

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
						fienumeroList.gravarEsq33054(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33045")
	public void cercaFieEsq33045() {

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
						fienumeroList.gravarEsq33045(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30543")
	public void cercaFieEsq30543() {

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
						fienumeroList.gravarEsq30543(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30534")
	public void cercaFieEsq30534() {

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
						fienumeroList.gravarEsq30534(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30453")
	public void cercaFieEsq30453() {

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
						fienumeroList.gravarEsq30453(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30435")
	public void cercaFieEsq30435() {

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
						fienumeroList.gravarEsq30435(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30354")
	public void cercaFieEsq30354() {

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
						fienumeroList.gravarEsq30354(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30345")
	public void cercaFieEsq30345() {


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
						fienumeroList.gravarEsq30345(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05433")
	public void cercaFieEsq05433() {

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
						fienumeroList.gravarEsq05433(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05343")
	public void cercaFieEsq05343() {

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
						fienumeroList.gravarEsq05343(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05334")
	public void cercaFieEsq05334() {

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
						fienumeroList.gravarEsq05334(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04533")
	public void cercaFieEsq04533() {


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
						fienumeroList.gravarEsq04533(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04353")
	public void cercaFieEsq04353() {

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
						fienumeroList.gravarEsq04353(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04335")
	public void cercaFieEsq04335() {

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
						fienumeroList.gravarEsq04335(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03543")
	public void cercaFieEsq03543() {

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
						fienumeroList.gravarEsq03543(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03534")
	public void cercaFieEsq03534() {

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
						fienumeroList.gravarEsq03534(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03453")
	public void cercaFieEsq03453() {

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
						fienumeroList.gravarEsq03453(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03435")
	public void cercaFieEsq03435() {

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
						fienumeroList.gravarEsq03435(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03354")
	public void cercaFieEsq03354() {


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
						fienumeroList.gravarEsq03354(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03345")
	public void cercaFieEsq03345() {

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
						fienumeroList.gravarEsq03345(linhas);

					}
				}
			}
		}
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
