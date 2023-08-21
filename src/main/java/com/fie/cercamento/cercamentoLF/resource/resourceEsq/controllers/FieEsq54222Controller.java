package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22245;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22254;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22452;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22542;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq45222;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq54222;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao54222;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq54222Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao54222 fienumeroList;
	
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
	List<EsqUmModel> umEsq2;
	// ************************************************************

	List<EsqDoisModel> doisEsq4;
	// ************************************************************
	List<EsqDoisModel> doisEsq2;
	// ************************************************************

	List<EsqTresModel> tresEsq4;
	// ***************************************************************
	List<EsqTresModel> tresEsq2;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq4;
	// ****************************************************************
	List<EsqQuatroModel> quatroEsq2;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq4;
	// ****************************************************************
	List<EsqCincoModel> cincoEsq2;

	@RequestMapping("/esquemas/esq54222/esq54222")
	public String esq54222() {

		return "/esquemas/esq54222/esq54222";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54222")
	public void cercaFieEsq54222() {

		List<FieEsq54222> esqList = new ArrayList<FieEsq54222>();

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq54222 linhas = new FieEsq54222();
							linhas.setNumEsq54222(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq54222(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52224")
	public void cercaFieEsq52224() {

		List<FieEsq52224> esqList = new ArrayList<FieEsq52224>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
				     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52224 linhas = new FieEsq52224();
							linhas.setNumEsq52224(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52224(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52242")
	public void cercaFieEsq52242() {

		List<FieEsq52242> esqList = new ArrayList<FieEsq52242>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52242 linhas = new FieEsq52242();
							linhas.setNumEsq52242(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52242(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52422")
	public void cercaFieEsq52422() {

		List<FieEsq52422> esqList = new ArrayList<FieEsq52422>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq5);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq52422 linhas = new FieEsq52422();
							linhas.setNumEsq52422(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq52422(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq22254")
	public void cercaFieEsq22254() {

		List<FieEsq22254> esqList = new ArrayList<FieEsq22254>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22254 linhas = new FieEsq22254();
							linhas.setNumEsq22254(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22254(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq22245")
	public void cercaFieEsq22245() {

		List<FieEsq22245> esqList = new ArrayList<FieEsq22245>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22245 linhas = new FieEsq22245();
							linhas.setNumEsq22245(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22245(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq22542")
	public void cercaFieEsq22542() {

		List<FieEsq22542> esqList = new ArrayList<FieEsq22542>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22542 linhas = new FieEsq22542();
							linhas.setNumEsq22542(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22542(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq22452")
	public void cercaFieEsq22452() {

		List<FieEsq22452> esqList = new ArrayList<FieEsq22452>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq22452 linhas = new FieEsq22452();
							linhas.setNumEsq22452(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq22452(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25422")
	public void cercaFieEsq25422() {

		List<FieEsq25422> esqList = new ArrayList<FieEsq25422>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25422 linhas = new FieEsq25422();
							linhas.setNumEsq25422(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25422(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24522")
	public void cercaFieEsq24522() {

		List<FieEsq24522> esqList = new ArrayList<FieEsq24522>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24522 linhas = new FieEsq24522();
							linhas.setNumEsq24522(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24522(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25224")
	public void cercaFieEsq25224() {

		List<FieEsq25224> esqList = new ArrayList<FieEsq25224>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25224 linhas = new FieEsq25224();
							linhas.setNumEsq25224(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25224(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25242")
	public void cercaFieEsq25242() {

		List<FieEsq25242> esqList = new ArrayList<FieEsq25242>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq25242 linhas = new FieEsq25242();
							linhas.setNumEsq25242(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq25242(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24225")
	public void cercaFieEsq24225() {

		List<FieEsq24225> esqList = new ArrayList<FieEsq24225>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24225 linhas = new FieEsq24225();
							linhas.setNumEsq24225(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24225(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24252")
	public void cercaFieEsq24252() {

		List<FieEsq24252> esqList = new ArrayList<FieEsq24252>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq24252 linhas = new FieEsq24252();
							linhas.setNumEsq24252(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq24252(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45222")
	public void cercaFieEsq45222() {

		List<FieEsq45222> esqList = new ArrayList<FieEsq45222>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq5);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq45222 linhas = new FieEsq45222();
							linhas.setNumEsq45222(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq45222(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42522")
	public void cercaFieEsq42522() {

		List<FieEsq42522> esqList = new ArrayList<FieEsq42522>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq5);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42522 linhas = new FieEsq42522();
							linhas.setNumEsq42522(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42522(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42252")
	public void cercaFieEsq42252() {

		List<FieEsq42252> esqList = new ArrayList<FieEsq42252>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq5);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42252 linhas = new FieEsq42252();
							linhas.setNumEsq42252(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42252(esqList);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42225")
	public void cercaFieEsq42225() {

		List<FieEsq42225> esqList = new ArrayList<FieEsq42225>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			     umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
		   	     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 1; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq5);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq42225 linhas = new FieEsq42225();
							linhas.setNumEsq42225(linha);
							esqList.add(linhas);
						}
					}
				}
			}
		}
		fienumeroList.gravarEsq42225(esqList);
	}
	
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5,
			                 List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq2,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq2,List<EsqTresModel> tresEsq4,
			                 List<EsqTresModel> tresEsq2,List<EsqQuatroModel> quatroEsq4,List<EsqQuatroModel> quatroEsq2,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq2){
		this.umEsq5=umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5=doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5=tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5=quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5= cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
		this.umEsq4=umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq2= umEsq2 = numeroList.listarEsqUm2();
		// ************************************************************
		this.doisEsq4= doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.doisEsq2= doisEsq2 = numeroList.listarEsqDois2();
		// ************************************************************
		this.tresEsq4= tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.tresEsq2= tresEsq2 = numeroList.listarEsqTres2();
		// ***************************************************************
		this.quatroEsq4= quatroEsq4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		this.quatroEsq2= quatroEsq2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		this.cincoEsq4= cincoEsq4 = numeroList.listarEsqCinco4();
		// ****************************************************************
		this.cincoEsq2= cincoEsq2 = numeroList.listarEsqCinco2();
	}
}
