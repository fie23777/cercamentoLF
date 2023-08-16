package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55122;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55212;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55221;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao55221;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq55221Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao55221 fienumeroList;
	
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

	List<EsqUmModel> umEsq2;
	// ************************************************************

	List<EsqDoisModel> doisEsq2;
	// ************************************************************
	List<EsqTresModel> tresEsq2;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq2;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq2;
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

	@RequestMapping("/esquemas/esq55221/esq55221")
	public String esq55221() {

		return "/esquemas/esq55221/esq55221";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55221")
	public void cercaFieEsq55221() {

executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
		     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
		     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq55221 linhas = new FieEsq55221();
							linhas.setNumEsq55221(linha);
							fienumeroList.gravarEsq55221(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55122")
	public void cercaFieEsq55122() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq55122 linhas = new FieEsq55122();
							linhas.setNumEsq55122(linha);
							fienumeroList.gravarEsq55122(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55212")
	public void cercaFieEsq55212() {
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq55212 linhas = new FieEsq55212();
							linhas.setNumEsq55212(linha);
							fienumeroList.gravarEsq55212(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51522")
	public void cercaFieEsq51522() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51522 linhas = new FieEsq51522();
							linhas.setNumEsq51522(linha);
							fienumeroList.gravarEsq51522(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51252")
	public void cercaFieEsq51252() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51252 linhas = new FieEsq51252();
							linhas.setNumEsq51252(linha);
							fienumeroList.gravarEsq51252(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq51225")
	public void cercaFieEsq51225() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq51225 linhas = new FieEsq51225();
							linhas.setNumEsq51225(linha);
							fienumeroList.gravarEsq51225(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52512")
	public void cercaFieEsq52512() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52512 linhas = new FieEsq52512();
							linhas.setNumEsq52512(linha);
							fienumeroList.gravarEsq52512(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52521")
	public void cercaFieEsq52521() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52521 linhas = new FieEsq52521();
							linhas.setNumEsq52521(linha);
							fienumeroList.gravarEsq52521(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52152")
	public void cercaFieEsq52152() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52152 linhas = new FieEsq52152();
							linhas.setNumEsq52152(linha);
							fienumeroList.gravarEsq52152(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52125")
	public void cercaFieEsq52125() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52125 linhas = new FieEsq52125();
							linhas.setNumEsq52125(linha);
							fienumeroList.gravarEsq52125(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52251")
	public void cercaFieEsq52251() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52251 linhas = new FieEsq52251();
							linhas.setNumEsq52251(linha);
							fienumeroList.gravarEsq52251(linhas);
						}
					}
				}
			}
		}
	}
	

	@RequestMapping("/fieesqlf/cercaFieEsq52215")
	public void cercaFieEsq52215() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52215 linhas = new FieEsq52215();
							linhas.setNumEsq52215(linha);
							fienumeroList.gravarEsq52215(linhas);
						}
					}
				}
			}
		}
	}
	

	@RequestMapping("/fieesqlf/cercaFieEsq15522")
	public void cercaFieEsq15522() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15522 linhas = new FieEsq15522();
							linhas.setNumEsq15522(linha);
							fienumeroList.gravarEsq15522(linhas);
						}
					}
				}
			}
		}
	}
	

	@RequestMapping("/fieesqlf/cercaFieEsq15252")
	public void cercaFieEsq15252() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15252 linhas = new FieEsq15252();
							linhas.setNumEsq15252(linha);
							fienumeroList.gravarEsq15252(linhas);
						}
					}
				}
			}
		}
	}


	@RequestMapping("/fieesqlf/cercaFieEsq15225")
	public void cercaFieEsq15225() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq15225 linhas = new FieEsq15225();
							linhas.setNumEsq15225(linha);
							fienumeroList.gravarEsq15225(linhas);
						}
					}
				}
			}
		}
	}


	@RequestMapping("/fieesqlf/cercaFieEsq12255")
	public void cercaFieEsq12255() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12255 linhas = new FieEsq12255();
							linhas.setNumEsq12255(linha);
							fienumeroList.gravarEsq12255(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq12525")
	public void cercaFieEsq12525() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12525 linhas = new FieEsq12525();
							linhas.setNumEsq12525(linha);
							fienumeroList.gravarEsq12525(linhas);
						}
					}
				}
			}
		}
	}
	

	@RequestMapping("/fieesqlf/cercaFieEsq12552")
	public void cercaFieEsq12552() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq12552 linhas = new FieEsq12552();
							linhas.setNumEsq12552(linha);
							fienumeroList.gravarEsq12552(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22155")
	public void cercaFieEsq22155() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22155 linhas = new FieEsq22155();
							linhas.setNumEsq22155(linha);
							fienumeroList.gravarEsq22155(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22515")
	public void cercaFieEsq22515() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22515 linhas = new FieEsq22515();
							linhas.setNumEsq22515(linha);
							fienumeroList.gravarEsq22515(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq22551")
	public void cercaFieEsq22551() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22551 linhas = new FieEsq22551();
							linhas.setNumEsq22551(linha);
							fienumeroList.gravarEsq22551(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq21255")
	public void cercaFieEsq21255() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21255 linhas = new FieEsq21255();
							linhas.setNumEsq21255(linha);
							fienumeroList.gravarEsq21255(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq21525")
	public void cercaFieEsq21525() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21525 linhas = new FieEsq21525();
							linhas.setNumEsq21525(linha);
							fienumeroList.gravarEsq21525(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq21552")
	public void cercaFieEsq21552() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq21552 linhas = new FieEsq21552();
							linhas.setNumEsq21552(linha);
							fienumeroList.gravarEsq21552(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25215")
	public void cercaFieEsq25215() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25215 linhas = new FieEsq25215();
							linhas.setNumEsq25215(linha);
							fienumeroList.gravarEsq25215(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25251")
	public void cercaFieEsq25251() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25251 linhas = new FieEsq25251();
							linhas.setNumEsq25251(linha);
							fienumeroList.gravarEsq25251(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25125")
	public void cercaFieEsq25125() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25125 linhas = new FieEsq25125();
							linhas.setNumEsq25125(linha);
							fienumeroList.gravarEsq25125(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25152")
	public void cercaFieEsq25152() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25152 linhas = new FieEsq25152();
							linhas.setNumEsq25152(linha);
							fienumeroList.gravarEsq25152(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25521")
	public void cercaFieEsq25521() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25521 linhas = new FieEsq25521();
							linhas.setNumEsq25521(linha);
							fienumeroList.gravarEsq25521(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25512")
	public void cercaFieEsq25512() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq2, doisEsq2, tresEsq2, quatroEsq2, cincoEsq2,
			     cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25512 linhas = new FieEsq25512();
							linhas.setNumEsq25512(linha);
							fienumeroList.gravarEsq25512(linhas);
						}
					}
				}
			}
		}
	}
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5,
			                 List<EsqUmModel> umEsq2,List<EsqDoisModel> doisEsq2,List<EsqTresModel> tresEsq2,List<EsqQuatroModel> quatroEsq2,
			                 List<EsqCincoModel> cincoEsq2,String[] cincoEsq1,String[] quatroEsq1,
			                 String[] tresEsq1,String[] doisEsq1,String[] umEsq1){
		
		this.umEsq5=umEsq5 = numeroList.listarEsqUm5();
	// ***********************************************************
		this.doisEsq5= doisEsq5 = numeroList.listarEsqDois5();
	// ***********************************************************
		this.tresEsq5= tresEsq5 = numeroList.listarEsqTres5();
	// ***********************************************************
		this.quatroEsq5= quatroEsq5 = numeroList.listarEsqQuatro5();
	// ***********************************************************
		this.cincoEsq5= cincoEsq5 = numeroList.listarEsqCinco5();
	// ***********************************************************
		this.umEsq2= umEsq2 = numeroList.listarEsqUm2();
	// ************************************************************
		this.doisEsq2= doisEsq2 = numeroList.listarEsqDois2();
	// ************************************************************
		this.tresEsq2= tresEsq2 = numeroList.listarEsqTres2();
	// ***************************************************************
		this.quatroEsq2= quatroEsq2 = numeroList.listarEsqQuatro2();
	// ****************************************************************
		this.cincoEsq2= cincoEsq2 = numeroList.listarEsqCinco2();
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

	}
}
