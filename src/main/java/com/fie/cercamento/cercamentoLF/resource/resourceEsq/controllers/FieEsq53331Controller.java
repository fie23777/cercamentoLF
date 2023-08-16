package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq15333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq51333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao53331;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq53331Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao53331 fienumeroList;
	
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

	List<EsqDoisModel> doisEsq3;
	// ************************************************************

	List<EsqTresModel> tresEsq3;
	// ***************************************************************
	
	List<EsqQuatroModel> quatroEsq3;
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

	@RequestMapping("/esquemas/esq53331/esq53331")
	public String esq53331() {

		return "/esquemas/esq53331/esq53331";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53331")
	public void cercaFieEsq53331() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
				     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
				     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53331 linhas = new FieEsq53331();
							linhas.setNumEsq53331(linha);
							fienumeroList.gravarEsq53331(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53313")
	public void cercaFieEsq53313() {
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53313 linhas = new FieEsq53313();
							linhas.setNumEsq53313(linha);
							fienumeroList.gravarEsq53313(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53133")
	public void cercaFieEsq53133() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));
							
							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq53133 linhas = new FieEsq53133();
							linhas.setNumEsq53133(linha);
							fienumeroList.gravarEsq53133(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51333")
	public void cercaFieEsq51333() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));
							
							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51333 linhas = new FieEsq51333();
							linhas.setNumEsq51333(linha);
							fienumeroList.gravarEsq51333(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33351")
	public void cercaFieEsq33351() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33351 linhas = new FieEsq33351();
							linhas.setNumEsq33351(linha);
							fienumeroList.gravarEsq33351(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33315")
	public void cercaFieEsq33315() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33315 linhas = new FieEsq33315();
							linhas.setNumEsq33315(linha);
							fienumeroList.gravarEsq33315(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33513")
	public void cercaFieEsq33513() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33513 linhas = new FieEsq33513();
							linhas.setNumEsq33513(linha);
							fienumeroList.gravarEsq33513(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33153")
	public void cercaFieEsq33153() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33153 linhas = new FieEsq33153();
							linhas.setNumEsq33153(linha);
							fienumeroList.gravarEsq33153(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35133")
	public void cercaFieEsq35133() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35133 linhas = new FieEsq35133();
							linhas.setNumEsq35133(linha);
							fienumeroList.gravarEsq35133(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31533")
	public void cercaFieEsq31533() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31533 linhas = new FieEsq31533();
							linhas.setNumEsq31533(linha);
							fienumeroList.gravarEsq31533(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35331")
	public void cercaFieEsq35331() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35331 linhas = new FieEsq35331();
							linhas.setNumEsq35331(linha);
							fienumeroList.gravarEsq35331(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35313")
	public void cercaFieEsq35313() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq35313 linhas = new FieEsq35313();
							linhas.setNumEsq35313(linha);
							fienumeroList.gravarEsq35313(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31335")
	public void cercaFieEsq31335() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31335 linhas = new FieEsq31335();
							linhas.setNumEsq31335(linha);
							fienumeroList.gravarEsq31335(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31353")
	public void cercaFieEsq31353() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31353 linhas = new FieEsq31353();
							linhas.setNumEsq31353(linha);
							fienumeroList.gravarEsq31353(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15333")
	public void cercaFieEsq15333() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15333 linhas = new FieEsq15333();
							linhas.setNumEsq15333(linha);
							fienumeroList.gravarEsq15333(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13533")
	public void cercaFieEsq13533() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13533 linhas = new FieEsq13533();
							linhas.setNumEsq13533(linha);
							fienumeroList.gravarEsq13533(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13353")
	public void cercaFieEsq13353() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13353 linhas = new FieEsq13353();
							linhas.setNumEsq13353(linha);
							fienumeroList.gravarEsq13353(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13335")
	public void cercaFieEsq13335() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3,
			     doisEsq3, tresEsq3, quatroEsq3, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13335 linhas = new FieEsq13335();
							linhas.setNumEsq13335(linha);
							fienumeroList.gravarEsq13335(linhas);
						}
					}
				}
			}
		}
	}
	
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5,
			                        List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq3,List<EsqTresModel> tresEsq3,
			                        List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq3,String[] cincoEsq1,
			                        String[] quatroEsq1,String[] tresEsq1,String[] doisEsq1,String[] umEsq1){
		this.umEsq5=umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5=doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5= tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5= quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5= cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.doisEsq3= doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.tresEsq3= tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.quatroEsq3= quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.cincoEsq3= cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq1= cincoEsq1 = numeroList.listarEsqCinco1();
		// ******************************************************************
		this.quatroEsq1= quatroEsq1 = numeroList.listarEsqQuatro1();
		// ******************************************************************
		this.tresEsq1= tresEsq1 = numeroList.listarEsqTres1();
		// ******************************************************************
		this.doisEsq1= doisEsq1 = numeroList.listarEsqDois1();
		// ******************************************************************
		this.umEsq1= umEsq1 = numeroList.listarEsqUm1();
		// ******************************************************************
	}
}
