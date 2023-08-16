package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55113;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55131;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55311;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao55311;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq55311Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao55311 fienumeroList; // apenas para gravar no banco
	
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
	// **************************************************************
	List<EsqDoisModel> doisEsq3;
	// ***************************************************************
	List<EsqTresModel> tresEsq3;
	// ***************************************************************
	List<EsqQuatroModel> quatroEsq3;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq3;
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
	
	@RequestMapping("/esquemas/esq55311/esq55311")
	public String esq55311(){
		
		return "/esquemas/esq55311/esq55311";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55311")
	public void cercaFieEsq55311() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
				     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq55311 linhas = new FieEsq55311();
							linhas.setNumEsq55311(linha);
							fienumeroList.gravarEsq55311(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55131")
	public void cercaFieEsq55131() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq55131 linhas = new FieEsq55131();
							linhas.setNumEsq55131(linha);
							fienumeroList.gravarEsq55131(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55113")
	public void cercaFieEsq55113() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq55113 linhas = new FieEsq55113();
							linhas.setNumEsq55113(linha);
							fienumeroList.gravarEsq55113(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53511")
	public void cercaFieEsq53511() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq53511 linhas = new FieEsq53511();
							linhas.setNumEsq53511(linha);
							fienumeroList.gravarEsq53511(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53151")
	public void cercaFieEsq53151() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq53151 linhas = new FieEsq53151();
							linhas.setNumEsq53151(linha);
							fienumeroList.gravarEsq53151(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53115")
	public void cercaFieEsq53115() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq53115 linhas = new FieEsq53115();
							linhas.setNumEsq53115(linha);
							fienumeroList.gravarEsq53115(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51531")
	public void cercaFieEsq51531() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq51531 linhas = new FieEsq51531();
							linhas.setNumEsq51531(linha);
							fienumeroList.gravarEsq51531(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51513")
	public void cercaFieEsq51513() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq51513 linhas = new FieEsq51513();
							linhas.setNumEsq51513(linha);
							fienumeroList.gravarEsq51513(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51351")
	public void cercaFieEsq51351() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq51351 linhas = new FieEsq51351();
							linhas.setNumEsq51351(linha);
							fienumeroList.gravarEsq51351(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51315")
	public void cercaFieEsq51315() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq51315 linhas = new FieEsq51315();
							linhas.setNumEsq51315(linha);
							fienumeroList.gravarEsq51315(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51153")
	public void cercaFieEsq51153() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq51153 linhas = new FieEsq51153();
							linhas.setNumEsq51153(linha);
							fienumeroList.gravarEsq51153(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51135")
	public void cercaFieEsq51135() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq51135 linhas = new FieEsq51135();
							linhas.setNumEsq51135(linha);
							fienumeroList.gravarEsq51135(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35511")
	public void cercaFieEsq35511() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq35511 linhas = new FieEsq35511();
							linhas.setNumEsq35511(linha);
							fienumeroList.gravarEsq35511(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35151")
	public void cercaFieEsq35151() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq35151 linhas = new FieEsq35151();
							linhas.setNumEsq35151(linha);
							fienumeroList.gravarEsq35151(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35115")
	public void cercaFieEsq35115() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq35115 linhas = new FieEsq35115();
							linhas.setNumEsq35115(linha);
							fienumeroList.gravarEsq35115(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31155")
	public void cercaFieEsq31155() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq31155 linhas = new FieEsq31155();
							linhas.setNumEsq31155(linha);
							fienumeroList.gravarEsq31155(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31515")
	public void cercaFieEsq31515() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq31515 linhas = new FieEsq31515();
							linhas.setNumEsq31515(linha);
							fienumeroList.gravarEsq31515(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31551")
	public void cercaFieEsq31551() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq31551 linhas = new FieEsq31551();
							linhas.setNumEsq31551(linha);
							fienumeroList.gravarEsq31551(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq11355")
	public void cercaFieEsq11355() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq11355 linhas = new FieEsq11355();
							linhas.setNumEsq11355(linha);
							fienumeroList.gravarEsq11355(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq11535")
	public void cercaFieEsq11535() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq11535 linhas = new FieEsq11535();
							linhas.setNumEsq11535(linha);
							fienumeroList.gravarEsq11535(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq11553")
	public void cercaFieEsq11553() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq11553 linhas = new FieEsq11553();
							linhas.setNumEsq11553(linha);
							fienumeroList.gravarEsq11553(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13155")
	public void cercaFieEsq13155() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq13155 linhas = new FieEsq13155();
							linhas.setNumEsq13155(linha);
							fienumeroList.gravarEsq13155(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13515")
	public void cercaFieEsq13515() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq13515 linhas = new FieEsq13515();
							linhas.setNumEsq13515(linha);
							fienumeroList.gravarEsq13515(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13551")
	public void cercaFieEsq13551() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq13551 linhas = new FieEsq13551();
							linhas.setNumEsq13551(linha);
							fienumeroList.gravarEsq13551(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15135")
	public void cercaFieEsq15135() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq15135 linhas = new FieEsq15135();
							linhas.setNumEsq15135(linha);
							fienumeroList.gravarEsq15135(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15153")
	public void cercaFieEsq15153() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq15153 linhas = new FieEsq15153();
							linhas.setNumEsq15153(linha);
							fienumeroList.gravarEsq15153(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15315")
	public void cercaFieEsq15315() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq15315 linhas = new FieEsq15315();
							linhas.setNumEsq15315(linha);
							fienumeroList.gravarEsq15315(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15351")
	public void cercaFieEsq15351() {
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq15351 linhas = new FieEsq15351();
							linhas.setNumEsq15351(linha);
							fienumeroList.gravarEsq15351(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15513")
	public void cercaFieEsq15513() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;  
							
							FieEsq15513 linhas = new FieEsq15513();
							linhas.setNumEsq15513(linha);
							fienumeroList.gravarEsq15513(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15531")
	public void cercaFieEsq15531() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, doisEsq3,
			     tresEsq3, cincoEsq3, cincoEsq1, quatroEsq3, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; 
							
							FieEsq15531 linhas = new FieEsq15531();
							linhas.setNumEsq15531(linha);
							fienumeroList.gravarEsq15531(linhas);
						}
					}
				}
			}
		}
	}
	
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5 ,String cincoEsq5,List<EsqUmModel> umEsq3, 
			                 List<EsqDoisModel> doisEsq3,List<EsqTresModel> tresEsq3,List<EsqCincoModel> cincoEsq3,String[] cincoEsq1,
			                 List<EsqQuatroModel> quatroEsq3,String[] quatroEsq1,String[] tresEsq1, String[] doisEsq1,String[] umEsq1){
		this.umEsq5= umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5=doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5= tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5=quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5= cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// **************************************************************
		this.doisEsq3= doisEsq3 = numeroList.listarEsqDois3();
		// ***************************************************************
		this.tresEsq3= tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.quatroEsq3=quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.cincoEsq3=cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq1= cincoEsq1 = numeroList.listarEsqCinco1();
		// ******************************************************************
		this.quatroEsq1= quatroEsq1 = numeroList.listarEsqQuatro1();
		// ******************************************************************
		this.tresEsq1=tresEsq1 = numeroList.listarEsqTres1();
		// ******************************************************************
		this.doisEsq1=doisEsq1 = numeroList.listarEsqDois1();
		// ******************************************************************
		this.umEsq1= umEsq1 = numeroList.listarEsqUm1();
		// ******************************************************************
	}
}
