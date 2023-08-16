package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq01455;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq01545;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq01554;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq04155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq04515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq04551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05145;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05154;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05415;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05451;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05514;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq05541;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq10455;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq10545;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq10554;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq14055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq14505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq14550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq15540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq40155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq40515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq40551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq41055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq41505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq41550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45015;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45051;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45105;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45150;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45501;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq45510;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50145;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50154;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50415;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50451;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50514;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq50541;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq51540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54015;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54051;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54105;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54150;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54501;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq54510;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55014;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55041;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55104;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55140;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55401;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55410.FieEsq55410;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao55410;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq55410Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao55410 fienumeroList;

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

	List<EsqDoisModel> doisEsq4;
	// ************************************************************

	List<EsqTresModel> tresEsq4;
	// ***************************************************************

	List<EsqQuatroModel> quatroEsq4;
	// ****************************************************************

	List<EsqCincoModel> cincoEsq4;
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

	@RequestMapping("/esquemas/esq55410/esq55410")
	public String esq55410() {

		return "/esquemas/esq55410/esq55410";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55410")
	public void cercaFieEsq55410() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
				    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
				    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq55410 linhas = new FieEsq55410();
						linhas.setNumEsq55410(linha);
						fienumeroList.gravarEsq55410(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41550")
	public void cercaFieEsq41550() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq41550 linhas = new FieEsq41550();
						linhas.setNumEsq41550(linha);
						fienumeroList.gravarEsq41550(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41505")
	public void cercaFieEsq41505() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq41505 linhas = new FieEsq41505();
						linhas.setNumEsq41505(linha);
						fienumeroList.gravarEsq41505(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41055")
	public void cercaFieEsq41055() {

		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaQuatro= String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq41055 linhas = new FieEsq41055();
						linhas.setNumEsq41055(linha);
						fienumeroList.gravarEsq41055(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45150")
	public void cercaFieEsq45150() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq45150 linhas = new FieEsq45150();
						linhas.setNumEsq45150(linha);
						fienumeroList.gravarEsq45150(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45105")
	public void cercaFieEsq45105() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq45105 linhas = new FieEsq45105();
						linhas.setNumEsq45105(linha);
						fienumeroList.gravarEsq45105(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45510")
	public void cercaFieEsq45510() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq45510 linhas = new FieEsq45510();
						linhas.setNumEsq45510(linha);
						fienumeroList.gravarEsq45510(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45501")
	public void cercaFieEsq45501() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco= String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq45501 linhas = new FieEsq45501();
						linhas.setNumEsq45501(linha);
						fienumeroList.gravarEsq45501(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40155")
	public void cercaFieEsq40155() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro + linhaCinco;

						FieEsq40155 linhas = new FieEsq40155();
						linhas.setNumEsq40155(linha);
						fienumeroList.gravarEsq40155(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40515")
	public void cercaFieEsq40515() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro +linhaCinco;

						FieEsq40515 linhas = new FieEsq40515();
						linhas.setNumEsq40515(linha);
						fienumeroList.gravarEsq40515(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40551")
	public void cercaFieEsq40551() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm +linhaTres + linhaQuatro +linhaCinco;

						FieEsq40551 linhas = new FieEsq40551();
						linhas.setNumEsq40551(linha);
						fienumeroList.gravarEsq40551(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45015")
	public void cercaFieEsq45015() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq45015 linhas = new FieEsq45015();
						linhas.setNumEsq45015(linha);
						fienumeroList.gravarEsq45015(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45051")
	public void cercaFieEsq45051() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq4.get(a));
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois + linhaQuatro + linhaCinco;

						FieEsq45051 linhas = new FieEsq45051();
						linhas.setNumEsq45051(linha);
						fienumeroList.gravarEsq45051(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14550")
	public void cercaFieEsq14550() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq14550 linhas = new FieEsq14550();
						linhas.setNumEsq14550(linha);
						fienumeroList.gravarEsq14550(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14505")
	public void cercaFieEsq14505() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq14505 linhas = new FieEsq14505();
						linhas.setNumEsq14505(linha);
						fienumeroList.gravarEsq14505(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14055")
	public void cercaFieEsq14055() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro +linhaCinco;

						FieEsq14055 linhas = new FieEsq14055();
						linhas.setNumEsq14055(linha);
						fienumeroList.gravarEsq14055(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15450")
	public void cercaFieEsq15450() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq15450 linhas = new FieEsq15450();
						linhas.setNumEsq15450(linha);
						fienumeroList.gravarEsq15450(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15405")
	public void cercaFieEsq15405() {

		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq15405 linhas = new FieEsq15405();
						linhas.setNumEsq15405(linha);
						fienumeroList.gravarEsq15405(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15540")
	public void cercaFieEsq15540() {

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq15540 linhas = new FieEsq15540();
						linhas.setNumEsq15540(linha);
						fienumeroList.gravarEsq15540(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15504")
	public void cercaFieEsq15504() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq15504 linhas = new FieEsq15504();
						linhas.setNumEsq15504(linha);
						fienumeroList.gravarEsq15504(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15045")
	public void cercaFieEsq15045() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq15045 linhas = new FieEsq15045();
						linhas.setNumEsq15045(linha);
						fienumeroList.gravarEsq15045(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15054")
	public void cercaFieEsq15054() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq15054 linhas = new FieEsq15054();
						linhas.setNumEsq15054(linha);
						fienumeroList.gravarEsq15054(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10455")
	public void cercaFieEsq10455() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq10455 linhas = new FieEsq10455();
						linhas.setNumEsq10455(linha);
						fienumeroList.gravarEsq10455(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10545")
	public void cercaFieEsq10545() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq10545 linhas = new FieEsq10545();
						linhas.setNumEsq10545(linha);
						fienumeroList.gravarEsq10545(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10554")
	public void cercaFieEsq10554() {

		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);
		
		
		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq1[a]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq10554 linhas = new FieEsq10554();
						linhas.setNumEsq10554(linha);
						fienumeroList.gravarEsq10554(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54150")
	public void cercaFieEsq54150() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq54150 linhas = new FieEsq54150();
						linhas.setNumEsq54150(linha);
						fienumeroList.gravarEsq54150(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54105")
	public void cercaFieEsq54105() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaCinco= String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaCinco;

						FieEsq54105 linhas = new FieEsq54105();
						linhas.setNumEsq54105(linha);
						fienumeroList.gravarEsq54105(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54510")
	public void cercaFieEsq54510() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq54510 linhas = new FieEsq54510();
						linhas.setNumEsq54510(linha);
						fienumeroList.gravarEsq54510(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54501")
	public void cercaFieEsq54501() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq54501 linhas = new FieEsq54501();
						linhas.setNumEsq54501(linha);
						fienumeroList.gravarEsq54501(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54015")
	public void cercaFieEsq54015() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq54015 linhas = new FieEsq54015();
						linhas.setNumEsq54015(linha);
						fienumeroList.gravarEsq54015(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54051")
	public void cercaFieEsq54051() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq54051 linhas = new FieEsq54051();
						linhas.setNumEsq54051(linha);
						fienumeroList.gravarEsq54051(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51450")
	public void cercaFieEsq51450() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaQuatro = String.valueOf(quatroEsq5);

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq51450 linhas = new FieEsq51450();
						linhas.setNumEsq51450(linha);
						fienumeroList.gravarEsq51450(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51405")
	public void cercaFieEsq51405() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq51405 linhas = new FieEsq51405();
						linhas.setNumEsq51405(linha);
						fienumeroList.gravarEsq51405(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51540")
	public void cercaFieEsq51540() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq51540 linhas = new FieEsq51540();
						linhas.setNumEsq51540(linha);
						fienumeroList.gravarEsq51540(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51504")
	public void cercaFieEsq51504() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq51504 linhas = new FieEsq51504();
						linhas.setNumEsq51504(linha);
						fienumeroList.gravarEsq51504(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51045")
	public void cercaFieEsq51045() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq51045 linhas = new FieEsq51045();
						linhas.setNumEsq51045(linha);
						fienumeroList.gravarEsq51045(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51054")
	public void cercaFieEsq51054() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,  // ate aqui
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq51054 linhas = new FieEsq51054();
						linhas.setNumEsq51054(linha);
						fienumeroList.gravarEsq51054(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55401")
	public void cercaFieEsq55401() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois + linhaTres +linhaCinco;

						FieEsq55401 linhas = new FieEsq55401();
						linhas.setNumEsq55401(linha);
						fienumeroList.gravarEsq55401(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55140")
	public void cercaFieEsq55140() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaQuatro = String.valueOf(quatroEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres + linhaQuatro;

						FieEsq55140 linhas = new FieEsq55140();
						linhas.setNumEsq55140(linha);
						fienumeroList.gravarEsq55140(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55104")
	public void cercaFieEsq55104() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaTres+linhaCinco;

						FieEsq55104 linhas = new FieEsq55104();
						linhas.setNumEsq55104(linha);
						fienumeroList.gravarEsq55104(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55041")
	public void cercaFieEsq55041() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm + linhaDois +linhaQuatro+linhaCinco;

						FieEsq55041 linhas = new FieEsq55041();
						linhas.setNumEsq55041(linha);
						fienumeroList.gravarEsq55041(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55014")
	public void cercaFieEsq55014() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaDois = String.valueOf(doisEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm + linhaDois + linhaQuatro+linhaCinco;

						FieEsq55014 linhas = new FieEsq55014();
						linhas.setNumEsq55014(linha);
						fienumeroList.gravarEsq55014(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50415")
	public void cercaFieEsq50415() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm + linhaTres + linhaQuatro+linhaCinco;

						FieEsq50415 linhas = new FieEsq50415();
						linhas.setNumEsq50415(linha);
						fienumeroList.gravarEsq50415(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50451")
	public void cercaFieEsq50451() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50451 linhas = new FieEsq50451();
						linhas.setNumEsq50451(linha);
						fienumeroList.gravarEsq50451(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50145")
	public void cercaFieEsq50145() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50145 linhas = new FieEsq50145();
						linhas.setNumEsq50145(linha);
						fienumeroList.gravarEsq50145(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50154")
	public void cercaFieEsq50154() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50154 linhas = new FieEsq50154();
						linhas.setNumEsq50154(linha);
						fienumeroList.gravarEsq50154(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50541")
	public void cercaFieEsq50541() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50541 linhas = new FieEsq50541();
						linhas.setNumEsq50541(linha);
						fienumeroList.gravarEsq50541(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50514")
	public void cercaFieEsq50514() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {
						
						String linhaUm = String.valueOf(umEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha = linhaUm +linhaTres + linhaQuatro+linhaCinco;

						FieEsq50514 linhas = new FieEsq50514();
						linhas.setNumEsq50514(linha);
						fienumeroList.gravarEsq50514(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04155")
	public void cercaFieEsq04155() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04155 linhas = new FieEsq04155();
						linhas.setNumEsq04155(linha);
						fienumeroList.gravarEsq04155(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04515")
	public void cercaFieEsq04515() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04515 linhas = new FieEsq04515();
						linhas.setNumEsq04515(linha);
						fienumeroList.gravarEsq04515(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04551")
	public void cercaFieEsq04551() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq4.get(a));
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq04551 linhas = new FieEsq04551();
						linhas.setNumEsq04551(linha);
						fienumeroList.gravarEsq04551(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01455")
	public void cercaFieEsq01455() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq1[a]);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq01455 linhas = new FieEsq01455();
						linhas.setNumEsq01455(linha);
						fienumeroList.gravarEsq01455(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01545")
	public void cercaFieEsq01545() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq1[a]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq01545 linhas = new FieEsq01545();
						linhas.setNumEsq01545(linha);
						fienumeroList.gravarEsq01545(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01554")
	public void cercaFieEsq01554() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq1[a]);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq01554 linhas = new FieEsq01554();
						linhas.setNumEsq01554(linha);
						fienumeroList.gravarEsq01554(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05415")
	public void cercaFieEsq05415() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05415 linhas = new FieEsq05415();
						linhas.setNumEsq05415(linha);
						fienumeroList.gravarEsq05415(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05451")
	public void cercaFieEsq05451() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq4.get(e));
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05451 linhas = new FieEsq05451();
						linhas.setNumEsq05451(linha);
						fienumeroList.gravarEsq05451(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05145")
	public void cercaFieEsq05145() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 1; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq5);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05145 linhas = new FieEsq05145();
						linhas.setNumEsq05145(linha);
						fienumeroList.gravarEsq05145(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05154")
	public void cercaFieEsq05154() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 5; e++) {
				for (int i = 0; i < 1; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq1[e]);
						String linhaQuatro = String.valueOf(quatroEsq5);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05154 linhas = new FieEsq05154();
						linhas.setNumEsq05154(linha);
						fienumeroList.gravarEsq05154(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05541")
	public void cercaFieEsq05541() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq4.get(i));
						String linhaCinco = String.valueOf(cincoEsq1[o]);

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05541 linhas = new FieEsq05541();
						linhas.setNumEsq05541(linha);
						fienumeroList.gravarEsq05541(linhas);
					}
				}
			}
		}
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05514")
	public void cercaFieEsq05514() {
		
		executaList(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5,
			    umEsq4, doisEsq4, tresEsq4, quatroEsq4, cincoEsq4,
			    cincoEsq1, quatroEsq1, tresEsq1, doisEsq1, umEsq1);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 5; i++) {
					for (int o = 0; o < 5; o++) {

						String linhaDois = String.valueOf(doisEsq5);
						String linhaTres = String.valueOf(tresEsq5);
						String linhaQuatro = String.valueOf(quatroEsq1[i]);
						String linhaCinco = String.valueOf(cincoEsq4.get(o));

						String linha =  linhaDois + linhaTres + linhaQuatro+linhaCinco;

						FieEsq05514 linhas = new FieEsq05514();
						linhas.setNumEsq05514(linha);
						fienumeroList.gravarEsq05514(linhas);
					}
				}
			}
		}
	}

	public void executaList(String umEsq5, String doisEsq5, String tresEsq5, String quatroEsq5, String cincoEsq5,
			List<EsqUmModel> umEsq4, List<EsqDoisModel> doisEsq4, List<EsqTresModel> tresEsq4, List<EsqQuatroModel> quatroEsq4,
			List<EsqCincoModel> cincoEsq4, String[] cincoEsq1, String[] quatroEsq1, String[] tresEsq1, String[] doisEsq1,
			String[] umEsq1) {

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
		this.doisEsq4=doisEsq4 = numeroList.listarEsqDois4();
		// ************************************************************
		this.tresEsq4=tresEsq4 = numeroList.listarEsqTres4();
		// ***************************************************************
		this.quatroEsq4=quatroEsq4 = numeroList.listarEsqQuatro4();
		// **************************************************************
		this.cincoEsq4=cincoEsq4 = numeroList.listarEsqCinco4();
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
