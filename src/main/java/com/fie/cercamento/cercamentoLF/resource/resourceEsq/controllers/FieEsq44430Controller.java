package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq03444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq30444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44430;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq44430Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44430 fienumeroList;

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


	@RequestMapping("/esquemas/esq44430/esq44430")
	public String esq44430() {

		return "/esquemas/esq44430/esq44430";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44430")
	public void cercaFieEsq44430() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
				      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq44430 linhas = new FieEsq44430();
						linhas.setNumEsq44430(linha);
						fienumeroList.gravarEsq44430(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34440")
	public void cercaFieEsq34440() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
		

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq34440 linhas = new FieEsq34440();
						linhas.setNumEsq34440(linha);
						fienumeroList.gravarEsq34440(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34404")
	public void cercaFieEsq34404() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq34404 linhas = new FieEsq34404();
						linhas.setNumEsq34404(linha);
						fienumeroList.gravarEsq34404(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34044")
	public void cercaFieEsq34044() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
					
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq34044 linhas = new FieEsq34044();
						linhas.setNumEsq34044(linha);
						fienumeroList.gravarEsq34044(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30444")
	public void cercaFieEsq30444() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
					
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq30444 linhas = new FieEsq30444();
						linhas.setNumEsq30444(linha);
						fienumeroList.gravarEsq30444(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44403")
	public void cercaFieEsq44403() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
					
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq44403 linhas = new FieEsq44403();
						linhas.setNumEsq44403(linha);
						fienumeroList.gravarEsq44403(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44304")
	public void cercaFieEsq44304() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
				
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq44304 linhas = new FieEsq44304();
						linhas.setNumEsq44304(linha);
						fienumeroList.gravarEsq44304(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44034")
	public void cercaFieEsq44034() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq4.get(e));
					
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq44034 linhas = new FieEsq44034();
						linhas.setNumEsq44034(linha);
						fienumeroList.gravarEsq44034(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43044")
	public void cercaFieEsq43044() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq43044 linhas = new FieEsq43044();
						linhas.setNumEsq43044(linha);
						fienumeroList.gravarEsq43044(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40344")
	public void cercaFieEsq40344() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
					
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq40344 linhas = new FieEsq40344();
						linhas.setNumEsq40344(linha);
						fienumeroList.gravarEsq40344(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43440")
	public void cercaFieEsq43440() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));
						
						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq43440 linhas = new FieEsq43440();
						linhas.setNumEsq43440(linha);
						fienumeroList.gravarEsq43440(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43404")
	public void cercaFieEsq43404() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq4.get(i));
						
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq43404 linhas = new FieEsq43404();
						linhas.setNumEsq43404(linha);
						fienumeroList.gravarEsq43404(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40443")
	public void cercaFieEsq40443() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm +  linhaTres + linhaQuatro+linhaCinco;

						FieEsq40443 linhas = new FieEsq40443();
						linhas.setNumEsq40443(linha);
						fienumeroList.gravarEsq40443(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq40434")
	public void cercaFieEsq40434() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
					
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq40434 linhas = new FieEsq40434();
						linhas.setNumEsq40434(linha);
						fienumeroList.gravarEsq40434(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03444")
	public void cercaFieEsq03444() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq03444 linhas = new FieEsq03444();
						linhas.setNumEsq03444(linha);
						fienumeroList.gravarEsq03444(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04344")
	public void cercaFieEsq04344() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04344 linhas = new FieEsq04344();
						linhas.setNumEsq04344(linha);
						fienumeroList.gravarEsq04344(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04434")
	public void cercaFieEsq04434() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {

					
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04434 linhas = new FieEsq04434();
						linhas.setNumEsq04434(linha);
						fienumeroList.gravarEsq04434(linhas);

					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq04443")
	public void cercaFieEsq04443() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			      quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {

						
						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04443 linhas = new FieEsq04443();
						linhas.setNumEsq04443(linha);
						fienumeroList.gravarEsq04443(linhas);

					}
				}
			}
		}
	}
	
	public void executaLista(List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq3,
			                 List<EsqTresModel> tresEsq4,List<EsqTresModel> tresEsq3,List<EsqQuatroModel> quatroEsq4,
			                 List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq3){
		this.umEsq4= umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		 this.doisEsq4=doisEsq4 = numeroList.listarEsqDois4();
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
