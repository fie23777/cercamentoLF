package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao44331;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;



@Controller
public class FieEsq44331Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao44331 fienumeroList;
	

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

	
	

	@RequestMapping("/esquemas/esq44331/esq44331")
	public String esq44331() {

		return "/esquemas/esq44331/esq44331";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq44331")
	public void cercaFieEsq44331() {
        List<FieEsq44331> listaFieEsq44331 = new ArrayList<FieEsq44331>();
        FieEsq44331 linhas;
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
				     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
				     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							linhas = new FieEsq44331();
							linhas.setNumEsq44331(linha);
							listaFieEsq44331.add(linhas);
							System.out.println("Linha aqui "+linha);
							
						}
					}
				}
			}
		}
		
		fienumeroList.gravarEsq44331(listaFieEsq44331);
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq33144")
	public void cercaFieEsq33144() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33144 linhas = new FieEsq33144();
							linhas.setNumEsq33144(linha);
							fienumeroList.gravarEsq33144(linhas);
						}
					}
				}
			}
		}
	}
	@RequestMapping("/fieesqlf/cercaFieEsq33414")
	public void cercaFieEsq33414() {


		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33414 linhas = new FieEsq33414();
							linhas.setNumEsq33414(linha);
							fienumeroList.gravarEsq33414(linhas);
						}
					}
				}
			}
		}
	}
	@RequestMapping("/fieesqlf/cercaFieEsq33441")
	public void cercaFieEsq33441() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq33441 linhas = new FieEsq33441();
							linhas.setNumEsq33441(linha);
							fienumeroList.gravarEsq33441(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31344")
	public void cercaFieEsq31344() {

	
		
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31344 linhas = new FieEsq31344();
							linhas.setNumEsq31344(linha);
							fienumeroList.gravarEsq31344(linhas);
						}
					}
				}
			} 
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31434")
	public void cercaFieEsq31434() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31434 linhas = new FieEsq31434();
							linhas.setNumEsq31434(linha);
							fienumeroList.gravarEsq31434(linhas);
						}
					}
				}
			} 
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq31443")
	public void cercaFieEsq31443() {

		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq31443 linhas = new FieEsq31443();
							linhas.setNumEsq31443(linha);
							fienumeroList.gravarEsq31443(linhas);
						}
					}
				}
			}
		} 
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34314")
	public void cercaFieEsq34314() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34314 linhas = new FieEsq34314();
							linhas.setNumEsq34314(linha);
							fienumeroList.gravarEsq34314(linhas);
						}
					}
				}
			}
		}  
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34341")
	public void cercaFieEsq34341() {

		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34341 linhas = new FieEsq34341();
							linhas.setNumEsq34341(linha);
							fienumeroList.gravarEsq34341(linhas);
						}
					}
				}
			}
		}
	}
	@RequestMapping("/fieesqlf/cercaFieEsq34143")
	public void cercaFieEsq34143() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34143 linhas = new FieEsq34143();
							linhas.setNumEsq34143(linha);
							fienumeroList.gravarEsq34143(linhas);
						}
					}
				}
			} // ate aqui
		}
	}
	@RequestMapping("/fieesqlf/cercaFieEsq34134")
	public void cercaFieEsq34134() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34134 linhas = new FieEsq34134();
							linhas.setNumEsq34134(linha);
							fienumeroList.gravarEsq34134(linhas);
						}
					}
				}
			}
		}// fim aqui
	}
	@RequestMapping("/fieesqlf/cercaFieEsq34431")
	public void cercaFieEsq34431() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34431 linhas = new FieEsq34431();
							linhas.setNumEsq34431(linha);
							fienumeroList.gravarEsq34431(linhas);
						}
					}
				}
			}
		} // fim aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq34413")
	public void cercaFieEsq34413() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq3.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq34413 linhas = new FieEsq34413();
							linhas.setNumEsq34413(linha);
							fienumeroList.gravarEsq34413(linhas);
						}
					}
				}
			}
		}//fim aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13344")
	public void cercaFieEsq13344() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13344 linhas = new FieEsq13344();
							linhas.setNumEsq13344(linha);
							fienumeroList.gravarEsq13344(linhas);
						}
					}
				}
			}
		}//ate aqui
	}
	@RequestMapping("/fieesqlf/cercaFieEsq13434")
	public void cercaFieEsq13434() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13434 linhas = new FieEsq13434();
							linhas.setNumEsq13434(linha);
							fienumeroList.gravarEsq13434(linhas);
						}
					}
				}
			}
		}//ate aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq13443")
	public void cercaFieEsq13443() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq13443 linhas = new FieEsq13443();
							linhas.setNumEsq13443(linha);
							fienumeroList.gravarEsq13443(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14433")
	public void cercaFieEsq14433() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14433 linhas = new FieEsq14433();
							linhas.setNumEsq14433(linha);
							fienumeroList.gravarEsq14433(linhas);
						}
					}
				}
			}
		}//ate aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14343")
	public void cercaFieEsq14343() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14343 linhas = new FieEsq14343();
							linhas.setNumEsq14343(linha);
							fienumeroList.gravarEsq14343(linhas);
						}
					}
				}
			}
		}//ate aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq14334")
	public void cercaFieEsq14334() {
		
		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq1[a]);
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq14334 linhas = new FieEsq14334();
							linhas.setNumEsq14334(linha);
							fienumeroList.gravarEsq14334(linhas);
						}
					}
				}
			}
		}//ate aqui
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44133")
	public void cercaFieEsq44133() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44133 linhas = new FieEsq44133();
							linhas.setNumEsq44133(linha);
							fienumeroList.gravarEsq44133(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq44313")
	public void cercaFieEsq44313() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq4.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq44313 linhas = new FieEsq44313();
							linhas.setNumEsq44313(linha);
							fienumeroList.gravarEsq44313(linhas);
						}
					}
				}
			}
		}
	}
	
	
	@RequestMapping("/fieesqlf/cercaFieEsq41433")
	public void cercaFieEsq41433() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41433 linhas = new FieEsq41433();
							linhas.setNumEsq41433(linha);
							fienumeroList.gravarEsq41433(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41343")
	public void cercaFieEsq41343() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41343 linhas = new FieEsq41343();
							linhas.setNumEsq41343(linha);
							fienumeroList.gravarEsq41343(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq41334")
	public void cercaFieEsq41334() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq1[e]);
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq41334 linhas = new FieEsq41334();
							linhas.setNumEsq41334(linha);
							fienumeroList.gravarEsq41334(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43413")
	public void cercaFieEsq43413() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43413 linhas = new FieEsq43413();
							linhas.setNumEsq43413(linha);
							fienumeroList.gravarEsq43413(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43431")
	public void cercaFieEsq43431() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq4.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43431 linhas = new FieEsq43431();
							linhas.setNumEsq43431(linha);
							fienumeroList.gravarEsq43431(linhas);
						}
					}
				}
			}
		}
	}
	@RequestMapping("/fieesqlf/cercaFieEsq43143")
	public void cercaFieEsq43143() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq3.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43143 linhas = new FieEsq43143();
							linhas.setNumEsq43143(linha);
							fienumeroList.gravarEsq43143(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43134")
	public void cercaFieEsq43134() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq1[i]);
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43134 linhas = new FieEsq43134();
							linhas.setNumEsq43134(linha);
							fienumeroList.gravarEsq43134(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43341")
	public void cercaFieEsq43341() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq4.get(o));
							String linhaCinco = String.valueOf(cincoEsq1[u]);

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43341 linhas = new FieEsq43341();
							linhas.setNumEsq43341(linha);
							fienumeroList.gravarEsq43341(linhas);
						}
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq43314")
	public void cercaFieEsq43314() {

		executaLista(umEsq4, umEsq3, doisEsq4, doisEsq3, tresEsq4, tresEsq3,
			     quatroEsq4, quatroEsq3, cincoEsq4, cincoEsq3, cincoEsq1,
			     quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 5; o++) {
						for (int u = 0; u < 5; u++) {

							String linhaUm = String.valueOf(umEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq1[o]);
							String linhaCinco = String.valueOf(cincoEsq4.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco;

							FieEsq43314 linhas = new FieEsq43314();
							linhas.setNumEsq43314(linha);
							fienumeroList.gravarEsq43314(linhas);
						}
					}
				}
			}
		}
	}
	public void executaLista(List<EsqUmModel> umEsq4,List<EsqUmModel> umEsq3,List<EsqDoisModel> doisEsq4,List<EsqDoisModel> doisEsq3,List<EsqTresModel> tresEsq4,
			List<EsqTresModel> tresEsq3,List<EsqQuatroModel> quatroEsq4,List<EsqQuatroModel> quatroEsq3,List<EsqCincoModel> cincoEsq4,List<EsqCincoModel> cincoEsq3,
			String[] cincoEsq1,String[] quatroEsq1,String[] tresEsq1,String[] doisEsq1,String[] umEsq1){
		
		this.umEsq4 = umEsq4 = numeroList.listarEsqUm4();
		// ************************************************************
		this.umEsq3 = umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.doisEsq4 = doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.doisEsq3 = doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.tresEsq4 = tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.tresEsq3 = tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.quatroEsq4 = quatroEsq4 = numeroList.listarEsqQuatro4();
		// ****************************************************************
		this.quatroEsq3 = quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.cincoEsq4 = cincoEsq4 = numeroList.listarEsqCinco4();
		// ****************************************************************
		this.cincoEsq3 = cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq1 = cincoEsq1 = numeroList.listarEsqCinco1();
		// ******************************************************************
		this.quatroEsq1 = quatroEsq1 = numeroList.listarEsqQuatro1();
		// ******************************************************************
		this.tresEsq1 = tresEsq1 = numeroList.listarEsqTres1();
		// ******************************************************************
		this.doisEsq1 = doisEsq1 = numeroList.listarEsqDois1();
		// ******************************************************************
		this.umEsq1 = umEsq1 = numeroList.listarEsqUm1();
		// ******************************************************************
	}

	
}
