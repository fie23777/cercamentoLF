package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54321.*;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao54321;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq54321Controller {
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
	public void cercaFieEsq54321() {

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
							fienumeroList.gravarEsq54321(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14325") // final do um aqui
	public void cercaFieEsq14325() {

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
							fienumeroList.gravarEsq14325(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14352")
	public void cercaFieEsq14352() {

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
							fienumeroList.gravarEsq14352(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14253")
	public void cercaFieEsq14253() {

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
							fienumeroList.gravarEsq14253(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14523")
	public void cercaFieEsq14523() {

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
							fienumeroList.gravarEsq14523(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14235")
	public void cercaFieEsq14235() {

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
							fienumeroList.gravarEsq14235(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14532")
	public void cercaFieEsq14532() {

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
							fienumeroList.gravarEsq14532(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13425")
	public void cercaFieEsq13425() {

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
							fienumeroList.gravarEsq13425(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13452")
	public void cercaFieEsq13452() {

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
							fienumeroList.gravarEsq13452(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13245")
	public void cercaFieEsq13245() {

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
							fienumeroList.gravarEsq13245(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13254")
	public void cercaFieEsq13254() {

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
							fienumeroList.gravarEsq13254(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13542")
	public void cercaFieEsq13542() {

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
							fienumeroList.gravarEsq13542(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq13524")
	public void cercaFieEsq13524() {

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
							fienumeroList.gravarEsq13524(linhas);
						}
					}
				}
			}
		} // ate aqui
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12435")
	public void cercaFieEsq12435() {

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
							fienumeroList.gravarEsq12435(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12453")
	public void cercaFieEsq12453() {

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
							fienumeroList.gravarEsq12453(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12345")
	public void cercaFieEsq12345() {

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
							fienumeroList.gravarEsq12345(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12354")
	public void cercaFieEsq12354() {

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
							fienumeroList.gravarEsq12354(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12543")
	public void cercaFieEsq12543() {

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
							fienumeroList.gravarEsq12543(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq12534")
	public void cercaFieEsq12534() {

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
							fienumeroList.gravarEsq12534(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15432")
	public void cercaFieEsq15432() {

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
							fienumeroList.gravarEsq15432(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15423")
	public void cercaFieEsq15423() {

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
							fienumeroList.gravarEsq15423(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15342")
	public void cercaFieEsq15342() {

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
							fienumeroList.gravarEsq15342(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15324")
	public void cercaFieEsq15324() {

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
							fienumeroList.gravarEsq15324(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15243")
	public void cercaFieEsq15243() {

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
							fienumeroList.gravarEsq15243(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15234")
	public void cercaFieEsq15234() {

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
							fienumeroList.gravarEsq15234(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24315")
	public void cercaFieEsq24315() {

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
							fienumeroList.gravarEsq24315(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24351")
	public void cercaFieEsq24351() {

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
							fienumeroList.gravarEsq24351(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24153")
	public void cercaFieEsq24153() {

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
							fienumeroList.gravarEsq24153(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24513")
	public void cercaFieEsq24513() {

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
							fienumeroList.gravarEsq24513(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24135")
	public void cercaFieEsq24135() {

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
							fienumeroList.gravarEsq24135(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq24531")
	public void cercaFieEsq24531() {

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
							fienumeroList.gravarEsq24531(linhas);
						}
					}
				} // parei aqui
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23415")
	public void cercaFieEsq23415() {

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
							fienumeroList.gravarEsq23415(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23451")
	public void cercaFieEsq23451() {

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
							fienumeroList.gravarEsq23451(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23145")
	public void cercaFieEsq23145() {

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
							fienumeroList.gravarEsq23145(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23154")
	public void cercaFieEsq23154() {

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
							fienumeroList.gravarEsq23154(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23541")
	public void cercaFieEsq23541() {

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
							fienumeroList.gravarEsq23541(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23514")
	public void cercaFieEsq23514() {

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
							fienumeroList.gravarEsq23514(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21435")
	public void cercaFieEsq21435() {

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
							fienumeroList.gravarEsq21435(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21453")
	public void cercaFieEsq21453() {

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
							fienumeroList.gravarEsq21453(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21345")
	public void cercaFieEsq21345() {

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
							fienumeroList.gravarEsq21345(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21354")
	public void cercaFieEsq21354() {

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
							fienumeroList.gravarEsq21354(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21543")
	public void cercaFieEsq21543() {

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
							fienumeroList.gravarEsq21543(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq21534")
	public void cercaFieEsq21534() {

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
							fienumeroList.gravarEsq21534(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25431")
	public void cercaFieEsq25431() {

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
							fienumeroList.gravarEsq25431(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25413")
	public void cercaFieEsq25413() {

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
							fienumeroList.gravarEsq25413(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25341")
	public void cercaFieEsq25341() {

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
							fienumeroList.gravarEsq25341(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25314")
	public void cercaFieEsq25314() {

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
							fienumeroList.gravarEsq25314(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25143")
	public void cercaFieEsq25143() {

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
							fienumeroList.gravarEsq25143(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25134")
	public void cercaFieEsq25134() {

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
							fienumeroList.gravarEsq25134(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34215")
	public void cercaFieEsq34215() {

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
							fienumeroList.gravarEsq34215(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34251")
	public void cercaFieEsq34251() {

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
							fienumeroList.gravarEsq34251(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34152")
	public void cercaFieEsq34152() {

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
							fienumeroList.gravarEsq34152(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34512")
	public void cercaFieEsq34512() {

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
							fienumeroList.gravarEsq34512(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34125")
	public void cercaFieEsq34125() {

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
							fienumeroList.gravarEsq34125(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq34521")
	public void cercaFieEsq34521() {

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
							fienumeroList.gravarEsq34521(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32415")
	public void cercaFieEsq32415() {

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
							fienumeroList.gravarEsq32415(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32451")
	public void cercaFieEsq32451() {

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
							fienumeroList.gravarEsq32451(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32145")
	public void cercaFieEsq32145() {

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
							fienumeroList.gravarEsq32145(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32154")
	public void cercaFieEsq32154() {

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
							fienumeroList.gravarEsq32154(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32541")
	public void cercaFieEsq32541() {

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
							fienumeroList.gravarEsq32541(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32514")
	public void cercaFieEsq32514() {

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
							fienumeroList.gravarEsq32514(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31425")
	public void cercaFieEsq31425() {

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
							fienumeroList.gravarEsq31425(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31452")
	public void cercaFieEsq31452() {

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
							fienumeroList.gravarEsq31452(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31245")
	public void cercaFieEsq31245() {

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
							fienumeroList.gravarEsq31245(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31254")
	public void cercaFieEsq31254() {

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
							fienumeroList.gravarEsq31254(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31542")
	public void cercaFieEsq31542() {

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
							fienumeroList.gravarEsq31542(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq31524")
	public void cercaFieEsq31524() {

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
							fienumeroList.gravarEsq31524(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35421")
	public void cercaFieEsq35421() {

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
							fienumeroList.gravarEsq35421(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35412")
	public void cercaFieEsq35412() {

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
							fienumeroList.gravarEsq35412(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35241")
	public void cercaFieEsq35241() {

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
							fienumeroList.gravarEsq35241(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35214")
	public void cercaFieEsq35214() {

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
							fienumeroList.gravarEsq35214(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35142")
	public void cercaFieEsq35142() {

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
							fienumeroList.gravarEsq35142(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35124")
	public void cercaFieEsq35124() {

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
							fienumeroList.gravarEsq35124(linhas);
						}
					}
				}
			}
		} // vamos voltar aqui
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43215")
	public void cercaFieEsq43215() {

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
							fienumeroList.gravarEsq43215(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43251")
	public void cercaFieEsq43251() {

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
							fienumeroList.gravarEsq43251(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43152")
	public void cercaFieEsq43152() {

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
							fienumeroList.gravarEsq43152(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43512")
	public void cercaFieEsq43512() {

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
							fienumeroList.gravarEsq43512(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43125")
	public void cercaFieEsq43125() {

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
							fienumeroList.gravarEsq43125(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq43521")
	public void cercaFieEsq43521() {

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
							fienumeroList.gravarEsq43521(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42315")
	public void cercaFieEsq42315() {

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
							fienumeroList.gravarEsq42315(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42351")
	public void cercaFieEsq42351() {

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
							fienumeroList.gravarEsq42351(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42135")
	public void cercaFieEsq42135() {

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
							fienumeroList.gravarEsq42135(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42153")
	public void cercaFieEsq42153() {

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
							fienumeroList.gravarEsq42153(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42531")
	public void cercaFieEsq42531() {

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
							fienumeroList.gravarEsq42531(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq42513")
	public void cercaFieEsq42513() {

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
							fienumeroList.gravarEsq42513(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41325")
	public void cercaFieEsq41325() {

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
							fienumeroList.gravarEsq41325(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41352")
	public void cercaFieEsq41352() {

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
							fienumeroList.gravarEsq41352(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41235")
	public void cercaFieEsq41235() {

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
							fienumeroList.gravarEsq41235(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41253")
	public void cercaFieEsq41253() {

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
							fienumeroList.gravarEsq41253(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41532")
	public void cercaFieEsq41532() {

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
							fienumeroList.gravarEsq41532(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41523")
	public void cercaFieEsq41523() {

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
							fienumeroList.gravarEsq41523(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45321")
	public void cercaFieEsq45321() {

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
							fienumeroList.gravarEsq45321(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45312")
	public void cercaFieEsq45312() {

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
							fienumeroList.gravarEsq45312(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45231")
	public void cercaFieEsq45231() {

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
							fienumeroList.gravarEsq45231(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45213")
	public void cercaFieEsq45213() {

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
							fienumeroList.gravarEsq45213(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45132")
	public void cercaFieEsq45132() {

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
							fienumeroList.gravarEsq45132(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45123")
	public void cercaFieEsq45123() {

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
							fienumeroList.gravarEsq45123(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54312")
	public void cercaFieEsq54312() {

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
							fienumeroList.gravarEsq54312(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54213")
	public void cercaFieEsq54213() {

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
							fienumeroList.gravarEsq54213(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54123")
	public void cercaFieEsq54123() {

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
							fienumeroList.gravarEsq54123(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54231")
	public void cercaFieEsq54231() {

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
							fienumeroList.gravarEsq54231(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54132")
	public void cercaFieEsq54132() {

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
							fienumeroList.gravarEsq54132(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53421")
	public void cercaFieEsq53421() {

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
							fienumeroList.gravarEsq53421(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53412")
	public void cercaFieEsq53412() {

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
							fienumeroList.gravarEsq53412(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53241")
	public void cercaFieEsq53241() {

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
							fienumeroList.gravarEsq53241(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53214")
	public void cercaFieEsq53214() {

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
							fienumeroList.gravarEsq53214(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53142")
	public void cercaFieEsq53142() {

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
							fienumeroList.gravarEsq53142(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53124")
	public void cercaFieEsq53124() {

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
							fienumeroList.gravarEsq53124(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52431")
	public void cercaFieEsq52431() {

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
							fienumeroList.gravarEsq52431(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52413")
	public void cercaFieEsq52413() {

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
							fienumeroList.gravarEsq52413(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52341")
	public void cercaFieEsq52341() {

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
							fienumeroList.gravarEsq52341(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52314")
	public void cercaFieEsq52314() {

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
							fienumeroList.gravarEsq52314(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52143")
	public void cercaFieEsq52143() {

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
						fienumeroList.gravarEsq52143(linhas);
					}
				}
			}
		}
	}

	}

	@RequestMapping("/fieesqlf/cercaFieEsq52134")
	public void cercaFieEsq52134() {

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
							fienumeroList.gravarEsq52134(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51432")
	public void cercaFieEsq51432() {

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
							fienumeroList.gravarEsq51432(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51423")
	public void cercaFieEsq51423() {

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
							fienumeroList.gravarEsq51423(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51342")
	public void cercaFieEsq51342() {

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
							fienumeroList.gravarEsq51342(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51324")
	public void cercaFieEsq51324() {

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
							fienumeroList.gravarEsq51324(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51243")
	public void cercaFieEsq51243() {

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
							fienumeroList.gravarEsq51243(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51234")
	public void cercaFieEsq51234() {

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
							fienumeroList.gravarEsq51234(linhas);
						}
					}
				}
			}
		}
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
