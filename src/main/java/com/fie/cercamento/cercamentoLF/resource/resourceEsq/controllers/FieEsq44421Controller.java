package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq12444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq21444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44124;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44214;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44412;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44421;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44421;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;


@Controller
public class FieEsq44421Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44421 fienumeroList;
	

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

	@RequestMapping("/esquemas/esq44421/esq44421")
	public String esq44421() {

		return "/esquemas/esq44421/esq44421";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44421")
	public void cercaFieEsq44421() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
				     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
				     quatroEsq1, tresEsq1, doisEsq1,umEsq1 );

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq44421 linhas = new FieEsq44421();
							linhas.setNumEsq44421(linha);
							fienumeroList.gravarEsq44421(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14442")
	public void cercaFieEsq14442() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq14442 linhas = new FieEsq14442();
							linhas.setNumEsq14442(linha);
							fienumeroList.gravarEsq14442(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14424")
	public void cercaFieEsq14424() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq14424 linhas = new FieEsq14424();
							linhas.setNumEsq14424(linha);
							fienumeroList.gravarEsq14424(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14244")
	public void cercaFieEsq14244() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq14244 linhas = new FieEsq14244();
							linhas.setNumEsq14244(linha);
							fienumeroList.gravarEsq14244(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq12444")
	public void cercaFieEsq12444() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq12444 linhas = new FieEsq12444();
							linhas.setNumEsq12444(linha);
							fienumeroList.gravarEsq12444(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44412")
	public void cercaFieEsq44412() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq44412 linhas = new FieEsq44412();
							linhas.setNumEsq44412(linha);
							fienumeroList.gravarEsq44412(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44124")
	public void cercaFieEsq44124() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq44124 linhas = new FieEsq44124();
							linhas.setNumEsq44124(linha);
							fienumeroList.gravarEsq44124(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44214")
	public void cercaFieEsq44214() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq44214 linhas = new FieEsq44214();
							linhas.setNumEsq44214(linha);
							fienumeroList.gravarEsq44214(linhas);
						}
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41244")
	public void cercaFieEsq41244() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq2.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq41244 linhas = new FieEsq41244();
							linhas.setNumEsq41244(linha);
							fienumeroList.gravarEsq41244(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42144")
	public void cercaFieEsq42144() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq42144 linhas = new FieEsq42144();
							linhas.setNumEsq42144(linha);
							fienumeroList.gravarEsq42144(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41442")
	public void cercaFieEsq41442() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq41442 linhas = new FieEsq41442();
							linhas.setNumEsq41442(linha);
							fienumeroList.gravarEsq41442(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41424")
	public void cercaFieEsq41424() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq2.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq41424 linhas = new FieEsq41424();
							linhas.setNumEsq41424(linha);
							fienumeroList.gravarEsq41424(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42441")
	public void cercaFieEsq42441() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq42441 linhas = new FieEsq42441();
							linhas.setNumEsq42441(linha);
							fienumeroList.gravarEsq42441(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq42414")
	public void cercaFieEsq42414() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq2.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq42414 linhas = new FieEsq42414();
							linhas.setNumEsq42414(linha);
							fienumeroList.gravarEsq42414(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq21444")
	public void cercaFieEsq21444() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq21444 linhas = new FieEsq21444();
							linhas.setNumEsq21444(linha);
							fienumeroList.gravarEsq21444(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24144")
	public void cercaFieEsq24144() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq24144 linhas = new FieEsq24144();
							linhas.setNumEsq24144(linha);
							fienumeroList.gravarEsq24144(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24414")
	public void cercaFieEsq24414() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq24414 linhas = new FieEsq24414();
							linhas.setNumEsq24414(linha);
							fienumeroList.gravarEsq24414(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq24441")
	public void cercaFieEsq24441() {

		executaLista(umEsq4, umEsq2, doisEsq4, doisEsq2, tresEsq4, tresEsq2,
			     quatroEsq4, quatroEsq2, cincoEsq4, cincoEsq2, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1,umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq2.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string

							FieEsq24441 linhas = new FieEsq24441();
							linhas.setNumEsq24441(linha);
							fienumeroList.gravarEsq24441(linhas);
						}
					}
				}
			}
		}
	}
	
public void executaLista(List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq2,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq2,
		                 List<EsqTresModel> tresEsq4,List<EsqTresModel> tresEsq2,List<EsqQuatroModel> quatroEsq4,List<EsqQuatroModel> quatroEsq2,
		                 List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq2,String[] cincoEsq1,
		                 String[] quatroEsq1,String[] tresEsq1,String[] doisEsq1,String[] umEsq1){
	
    this.umEsq4= umEsq4 = numeroList.listarEsqUm4();
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
