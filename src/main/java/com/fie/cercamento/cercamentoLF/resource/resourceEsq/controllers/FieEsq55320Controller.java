package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35205;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53205;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55023;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55032;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55203;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55230;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55302;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55320;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao55320;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq55320Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao55320 fienumeroList;
	
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
	// ****************************************************************



	@RequestMapping("/esquemas/esq55320/esq55320")
	public String esq55320() {

		return "/esquemas/esq55320/esq55320";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55320")
	public void cercaFieEsq55320() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
				      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
				      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq55320 linhas = new FieEsq55320();
						linhas.setNumEsq55320(linha);
						fienumeroList.gravarEsq55320(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32550")
	public void cercaFieEsq32550() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
	

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq32550 linhas = new FieEsq32550();
						linhas.setNumEsq32550(linha);
						fienumeroList.gravarEsq32550(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32505")
	public void cercaFieEsq32505() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq32505 linhas = new FieEsq32505();
						linhas.setNumEsq32505(linha);
						fienumeroList.gravarEsq32505(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32055")
	public void cercaFieEsq32055() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq2.get(e));

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq32055 linhas = new FieEsq32055();
						linhas.setNumEsq32055(linha);
						fienumeroList.gravarEsq32055(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35250")
	public void cercaFieEsq35250() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro ;

						FieEsq35250 linhas = new FieEsq35250();
						linhas.setNumEsq35250(linha);
						fienumeroList.gravarEsq35250(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35205")
	public void cercaFieEsq35205() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq2.get(i));

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq35205 linhas = new FieEsq35205();
						linhas.setNumEsq35205(linha);
						fienumeroList.gravarEsq35205(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35520")
	public void cercaFieEsq35520() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq35520 linhas = new FieEsq35520();
						linhas.setNumEsq35520(linha);
						fienumeroList.gravarEsq35520(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35502")
	public void cercaFieEsq35502() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
	
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq35502 linhas = new FieEsq35502();
						linhas.setNumEsq35502(linha);
						fienumeroList.gravarEsq35502(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30255")
	public void cercaFieEsq30255() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));

						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq30255 linhas = new FieEsq30255();
						linhas.setNumEsq30255(linha);
						fienumeroList.gravarEsq30255(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30525")
	public void cercaFieEsq30525() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
	
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq30525 linhas = new FieEsq30525();
						linhas.setNumEsq30525(linha);
						fienumeroList.gravarEsq30525(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30552")
	public void cercaFieEsq30552() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq30552 linhas = new FieEsq30552();
						linhas.setNumEsq30552(linha);
						fienumeroList.gravarEsq30552(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35025")
	public void cercaFieEsq35025() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq35025 linhas = new FieEsq35025();
						linhas.setNumEsq35025(linha);
						fienumeroList.gravarEsq35025(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35052")
	public void cercaFieEsq35052() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq3.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;
						
						FieEsq35052 linhas = new FieEsq35052();
						linhas.setNumEsq35052(linha);
						fienumeroList.gravarEsq35052(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23550")
	public void cercaFieEsq23550() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq23550 linhas = new FieEsq23550();
						linhas.setNumEsq23550(linha);
						fienumeroList.gravarEsq23550(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23505")
	public void cercaFieEsq23505() {
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq23505 linhas = new FieEsq23505();
						linhas.setNumEsq23505(linha);
						fienumeroList.gravarEsq23505(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23055")
	public void cercaFieEsq23055() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq23055 linhas = new FieEsq23055();
						linhas.setNumEsq23055(linha);
						fienumeroList.gravarEsq23055(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25350")
	public void cercaFieEsq25350() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq25350 linhas = new FieEsq25350();
						linhas.setNumEsq25350(linha);
						fienumeroList.gravarEsq25350(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25305")
	public void cercaFieEsq25305() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
	
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq25305 linhas = new FieEsq25305();
						linhas.setNumEsq25305(linha);
						fienumeroList.gravarEsq25305(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25530")
	public void cercaFieEsq25530() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq25530 linhas = new FieEsq25530();
						linhas.setNumEsq25530(linha);
						fienumeroList.gravarEsq25530(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25503")
	public void cercaFieEsq25503() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq25503 linhas = new FieEsq25503();
						linhas.setNumEsq25503(linha);
						fienumeroList.gravarEsq25503(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25035")
	public void cercaFieEsq25035() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq25035 linhas = new FieEsq25035();
						linhas.setNumEsq25035(linha);
						fienumeroList.gravarEsq25035(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25053")
	public void cercaFieEsq25053() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq25053 linhas = new FieEsq25053();
						linhas.setNumEsq25053(linha);
						fienumeroList.gravarEsq25053(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20355")
	public void cercaFieEsq20355() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));

						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm +linhaTres + linhaQuatro + linhaCinco;

						FieEsq20355 linhas = new FieEsq20355();
						linhas.setNumEsq20355(linha);
						fienumeroList.gravarEsq20355(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20535")
	public void cercaFieEsq20535() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq20535 linhas = new FieEsq20535();
						linhas.setNumEsq20535(linha);
						fienumeroList.gravarEsq20535(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20553")
	public void cercaFieEsq20553() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq2.get(a));

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq20553 linhas = new FieEsq20553();
						linhas.setNumEsq20553(linha);
						fienumeroList.gravarEsq20553(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53250")
	public void cercaFieEsq53250() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq53250 linhas = new FieEsq53250();
						linhas.setNumEsq53250(linha);
						fienumeroList.gravarEsq53250(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53205")
	public void cercaFieEsq53205() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq2.get(i));

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq53205 linhas = new FieEsq53205();
						linhas.setNumEsq53205(linha);
						fienumeroList.gravarEsq53205(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53520")
	public void cercaFieEsq53520() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq53520 linhas = new FieEsq53520();
						linhas.setNumEsq53520(linha);
						fienumeroList.gravarEsq53520(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53502")
	public void cercaFieEsq53502() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq53502 linhas = new FieEsq53502();
						linhas.setNumEsq53502(linha);
						fienumeroList.gravarEsq53502(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53025")
	public void cercaFieEsq53025() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));
		
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq53025 linhas = new FieEsq53025();
						linhas.setNumEsq53025(linha);
						fienumeroList.gravarEsq53025(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53052")
	public void cercaFieEsq53052() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {
						
						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq3.get(e));

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq53052 linhas = new FieEsq53052();
						linhas.setNumEsq53052(linha);
						fienumeroList.gravarEsq53052(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52350")
	public void cercaFieEsq52350() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						
						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq52350 linhas = new FieEsq52350();
						linhas.setNumEsq52350(linha);
						fienumeroList.gravarEsq52350(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52305")
	public void cercaFieEsq52305() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {
						
						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq52305 linhas = new FieEsq52305();
						linhas.setNumEsq52305(linha);
						fienumeroList.gravarEsq52305(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52530")
	public void cercaFieEsq52530() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));
	

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq52530 linhas = new FieEsq52530();
						linhas.setNumEsq52530(linha);
						fienumeroList.gravarEsq52530(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52503")
	public void cercaFieEsq52503() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));
						String linhaTres = String.valueOf(tresEsq5);

						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq52503 linhas = new FieEsq52503();
						linhas.setNumEsq52503(linha);
						fienumeroList.gravarEsq52503(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52035")
	public void cercaFieEsq52035() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq52035 linhas = new FieEsq52035();
						linhas.setNumEsq52035(linha);
						fienumeroList.gravarEsq52035(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52053")
	public void cercaFieEsq52053() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq2.get(e));

						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq52053 linhas = new FieEsq52053();
						linhas.setNumEsq52053(linha);
						fienumeroList.gravarEsq52053(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55302")
	public void cercaFieEsq55302() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));

						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq55302 linhas = new FieEsq55302();
						linhas.setNumEsq55302(linha);
						fienumeroList.gravarEsq55302(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55230")
	public void cercaFieEsq55230() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(o));


						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq55230 linhas = new FieEsq55230();
						linhas.setNumEsq55230(linha);
						fienumeroList.gravarEsq55230(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55203")
	public void cercaFieEsq55203() {
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhatres = String.valueOf(tresEsq2.get(i));
						
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhatres + linhaCinco;

						FieEsq55203 linhas = new FieEsq55203();
						linhas.setNumEsq55203(linha);
						fienumeroList.gravarEsq55203(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55032")
	public void cercaFieEsq55032() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq55032 linhas = new FieEsq55032();
						linhas.setNumEsq55032(linha);
						fienumeroList.gravarEsq55032(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55023")
	public void cercaFieEsq55023() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);

						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq55023 linhas = new FieEsq55023();
						linhas.setNumEsq55023(linha);
						fienumeroList.gravarEsq55023(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50325")
	public void cercaFieEsq50325() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50325 linhas = new FieEsq50325();
						linhas.setNumEsq50325(linha);
						fienumeroList.gravarEsq50325(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50352")
	public void cercaFieEsq50352() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50352 linhas = new FieEsq50352();
						linhas.setNumEsq50352(linha);
						fienumeroList.gravarEsq50352(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50235")
	public void cercaFieEsq50235() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50235 linhas = new FieEsq50235();
						linhas.setNumEsq50235(linha);
						fienumeroList.gravarEsq50235(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50253")
	public void cercaFieEsq50253() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50253 linhas = new FieEsq50253();
						linhas.setNumEsq50253(linha);
						fienumeroList.gravarEsq50253(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50532")
	public void cercaFieEsq50532() {


		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50532 linhas = new FieEsq50532();
						linhas.setNumEsq50532(linha);
						fienumeroList.gravarEsq50532(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50523")
	public void cercaFieEsq50523() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaUm = String.valueOf(umEsq5);

						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq50523 linhas = new FieEsq50523();
						linhas.setNumEsq50523(linha);
						fienumeroList.gravarEsq50523(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03255")
	public void cercaFieEsq03255() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq03255 linhas = new FieEsq03255();
						linhas.setNumEsq03255(linha);
						fienumeroList.gravarEsq03255(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03525")
	public void cercaFieEsq03525() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq03525 linhas = new FieEsq03525();
						linhas.setNumEsq03525(linha);
						fienumeroList.gravarEsq03525(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03552")
	public void cercaFieEsq03552() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq3.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq03552 linhas = new FieEsq03552();
						linhas.setNumEsq03552(linha);
						fienumeroList.gravarEsq03552(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02355")
	public void cercaFieEsq02355() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq2.get(a));
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq02355 linhas = new FieEsq02355();
						linhas.setNumEsq02355(linha);
						fienumeroList.gravarEsq02355(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02535")
	public void cercaFieEsq02535() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq2.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq02535 linhas = new FieEsq02535();
						linhas.setNumEsq02535(linha);
						fienumeroList.gravarEsq02535(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02553")
	public void cercaFieEsq02553() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 10; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq2.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro + linhaCinco;
						
						FieEsq02553 linhas = new FieEsq02553();
						linhas.setNumEsq02553(linha);
						fienumeroList.gravarEsq02553(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05325")
	public void cercaFieEsq05325() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05325 linhas = new FieEsq05325();
						linhas.setNumEsq05325(linha);
						fienumeroList.gravarEsq05325(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05352")
	public void cercaFieEsq05352() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq3.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05352 linhas = new FieEsq05352();
						linhas.setNumEsq05352(linha);
						fienumeroList.gravarEsq05352(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05235")
	public void cercaFieEsq05235() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05235 linhas = new FieEsq05235();
						linhas.setNumEsq05235(linha);
						fienumeroList.gravarEsq05235(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05253")
	public void cercaFieEsq05253() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq2.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05253 linhas = new FieEsq05253();
						linhas.setNumEsq05253(linha);
						fienumeroList.gravarEsq05253(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05532")
	public void cercaFieEsq05532() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq3.get(i));
						String linhaCinco = String.valueOf(cincoEsq2.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05532 linhas = new FieEsq05532();
						linhas.setNumEsq05532(linha);
						fienumeroList.gravarEsq05532(linhas);
					}
				}
			}
		}
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05523")
	public void cercaFieEsq05523() {

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5, umEsq3, 
			      umEsq2, doisEsq3, doisEsq2, tresEsq3, tresEsq2, quatroEsq3,
			      quatroEsq2, cincoEsq3, cincoEsq2);
		

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq2.get(i));
						String linhaCinco = String.valueOf(cincoEsq3.get(o));

						String linha = linhaDois + linhaTres + linhaQuatro + linhaCinco;

						FieEsq05523 linhas = new FieEsq05523();
						linhas.setNumEsq05523(linha);
						fienumeroList.gravarEsq05523(linhas);
					}
				}
			}
		}
	}
	
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5,List<EsqUmModel> umEsq3,
			                 List<EsqUmModel> umEsq2,List<EsqDoisModel> doisEsq3,List<EsqDoisModel> doisEsq2,List<EsqTresModel> tresEsq3,List<EsqTresModel> tresEsq2,
			                 List<EsqQuatroModel> quatroEsq3,List<EsqQuatroModel> quatroEsq2,List<EsqCincoModel> cincoEsq3,List<EsqCincoModel> cincoEsq2){
		
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
		this.umEsq3= umEsq3 = numeroList.listarEsqUm3();
		// ************************************************************
		this.umEsq2= umEsq2 = numeroList.listarEsqUm2();
		// ************************************************************
		this.doisEsq3= doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		this.doisEsq2= doisEsq2 = numeroList.listarEsqDois2();
		// ************************************************************
		this.tresEsq3=tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		this.tresEsq2= tresEsq2 = numeroList.listarEsqTres2();
		// ***************************************************************
		this.quatroEsq3=quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		this.quatroEsq2= quatroEsq2 = numeroList.listarEsqQuatro2();
		// ****************************************************************
		this.cincoEsq3=cincoEsq3 = numeroList.listarEsqCinco3();
		// ****************************************************************
		this.cincoEsq2=cincoEsq2 = numeroList.listarEsqCinco2();
		// ****************************************************************
		// ****************************************************************
	}
}
