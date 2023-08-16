package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

@Controller
public class FieEsq53322Controller {
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
	public void cercaFieEsq53322() {

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
							fienumeroList.gravarEsq53322(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33522")
	public void cercaFieEsq33522() {

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
							fienumeroList.gravarEsq33522(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33252")
	public void cercaFieEsq33252() {

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
							fienumeroList.gravarEsq33252(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq33225")
	public void cercaFieEsq33225() {

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
							fienumeroList.gravarEsq33225(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35322")
	public void cercaFieEsq35322() {

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
							fienumeroList.gravarEsq35322(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35232")
	public void cercaFieEsq35232() {

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
							fienumeroList.gravarEsq35232(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq35223")
	public void cercaFieEsq35223() {

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
							fienumeroList.gravarEsq35223(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32352")
	public void cercaFieEsq32352() {

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
							fienumeroList.gravarEsq32352(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32325")
	public void cercaFieEsq32325() {

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
							fienumeroList.gravarEsq32325(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32532")
	public void cercaFieEsq32532() {

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
							fienumeroList.gravarEsq32532(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32523")
	public void cercaFieEsq32523() {

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
							fienumeroList.gravarEsq32523(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32235")
	public void cercaFieEsq32235() {

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
							fienumeroList.gravarEsq32235(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq32253")
	public void cercaFieEsq32253() {

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
							fienumeroList.gravarEsq32253(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53232")
	public void cercaFieEsq53232() {

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
							fienumeroList.gravarEsq53232(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq53223")
	public void cercaFieEsq53223() {

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
							fienumeroList.gravarEsq53223(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52233")
	public void cercaFieEsq52233() {

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
							fienumeroList.gravarEsq52233(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52323")
	public void cercaFieEsq52323() {

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
							fienumeroList.gravarEsq52323(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq52332")
	public void cercaFieEsq52332() {

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
							fienumeroList.gravarEsq52332(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22533")
	public void cercaFieEsq22533() {

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
							fienumeroList.gravarEsq22533(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22353")
	public void cercaFieEsq22353() {

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
							fienumeroList.gravarEsq22353(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22335")
	public void cercaFieEsq22335() {

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
							fienumeroList.gravarEsq22335(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25233")
	public void cercaFieEsq25233() {

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
							fienumeroList.gravarEsq25233(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25323")
	public void cercaFieEsq25323() {

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
							fienumeroList.gravarEsq25323(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq25332")
	public void cercaFieEsq25332() {

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
							fienumeroList.gravarEsq25332(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23253")
	public void cercaFieEsq23253() {

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
							fienumeroList.gravarEsq23253(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23235")
	public void cercaFieEsq23235() {

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
							fienumeroList.gravarEsq23235(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23523")
	public void cercaFieEsq23523() {

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
							fienumeroList.gravarEsq23523(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23532")
	public void cercaFieEsq23532() {

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
							fienumeroList.gravarEsq23532(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23325")
	public void cercaFieEsq23325() {

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
							fienumeroList.gravarEsq23325(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq23352")
	public void cercaFieEsq23352() {

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
							fienumeroList.gravarEsq23352(linhas);
						}
					}
				}
			}
		}
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
