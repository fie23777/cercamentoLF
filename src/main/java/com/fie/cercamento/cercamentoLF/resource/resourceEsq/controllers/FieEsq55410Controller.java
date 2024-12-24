package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
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
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55410() {

		List<FieEsq55410> esqList = new ArrayList<FieEsq55410>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55410(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41550() {

		List<FieEsq41550> esqList = new ArrayList<FieEsq41550>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq41550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41505() {

		List<FieEsq41505> esqList = new ArrayList<FieEsq41505>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq41505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq41055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq41055() {

		List<FieEsq41055> esqList = new ArrayList<FieEsq41055>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq41055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45150")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45150() {

		List<FieEsq45150> esqList = new ArrayList<FieEsq45150>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45150(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45105")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45105() {

		List<FieEsq45105> esqList = new ArrayList<FieEsq45105>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45105(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45510")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45510() {

		List<FieEsq45510> esqList = new ArrayList<FieEsq45510>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45510(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45501")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45501() {

		List<FieEsq45501> esqList = new ArrayList<FieEsq45501>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45501(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40155")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40155() {

		List<FieEsq40155> esqList = new ArrayList<FieEsq40155>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40155(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40515")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40515() {

		List<FieEsq40515> esqList = new ArrayList<FieEsq40515>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40515(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq40551")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq40551() {

		List<FieEsq40551> esqList = new ArrayList<FieEsq40551>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq40551(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq45015")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45015() {

		List<FieEsq45015> esqList = new ArrayList<FieEsq45015>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45015(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq45051")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq45051() {

		List<FieEsq45051> esqList = new ArrayList<FieEsq45051>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq45051(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14550() {

		List<FieEsq14550> esqList = new ArrayList<FieEsq14550>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq14550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14505() {

		List<FieEsq14505> esqList = new ArrayList<FieEsq14505>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq14505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq14055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq14055() {

		List<FieEsq14055> esqList = new ArrayList<FieEsq14055>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq14055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15450")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15450() {

		List<FieEsq15450> esqList = new ArrayList<FieEsq15450>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15450(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15405")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15405() {

		List<FieEsq15405> esqList = new ArrayList<FieEsq15405>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15405(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15540")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15540() {

		List<FieEsq15540> esqList = new ArrayList<FieEsq15540>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15540(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15504")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15504() {

		List<FieEsq15504> esqList = new ArrayList<FieEsq15504>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15504(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq15045")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15045() {

		List<FieEsq15045> esqList = new ArrayList<FieEsq15045>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15045(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq15054")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq15054() {

		List<FieEsq15054> esqList = new ArrayList<FieEsq15054>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq15054(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10455")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq10455() {

		List<FieEsq10455> esqList = new ArrayList<FieEsq10455>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq10455(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10545")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq10545() {

		List<FieEsq10545> esqList = new ArrayList<FieEsq10545>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq10545(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq10554")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq10554() {

		List<FieEsq10554> esqList = new ArrayList<FieEsq10554>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq10554(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54150")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54150() {

		List<FieEsq54150> esqList = new ArrayList<FieEsq54150>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54150(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54105")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54105() {

		List<FieEsq54105> esqList = new ArrayList<FieEsq54105>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54105(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54510")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54510() {

		List<FieEsq54510> esqList = new ArrayList<FieEsq54510>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54510(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54501")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54501() {

		List<FieEsq54501> esqList = new ArrayList<FieEsq54501>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54501(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54015")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54015() {

		List<FieEsq54015> esqList = new ArrayList<FieEsq54015>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54015(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq54051")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq54051() {

		List<FieEsq54051> esqList = new ArrayList<FieEsq54051>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq54051(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51450")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51450() {

		List<FieEsq51450> esqList = new ArrayList<FieEsq51450>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51450(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51405")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51405() {

		List<FieEsq51405> esqList = new ArrayList<FieEsq51405>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51405(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51540")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51540() {

		List<FieEsq51540> esqList = new ArrayList<FieEsq51540>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51540(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51504")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51504() {

		List<FieEsq51504> esqList = new ArrayList<FieEsq51504>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51504(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51045")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51045() {

		List<FieEsq51045> esqList = new ArrayList<FieEsq51045>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51045(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq51054")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq51054() {

		List<FieEsq51054> esqList = new ArrayList<FieEsq51054>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq51054(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55401")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55401() {

		List<FieEsq55401> esqList = new ArrayList<FieEsq55401>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55401(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55140")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55140() {

		List<FieEsq55140> esqList = new ArrayList<FieEsq55140>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55140(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55104")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55104() {

		List<FieEsq55104> esqList = new ArrayList<FieEsq55104>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55104(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55041")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55041() {

		List<FieEsq55041> esqList = new ArrayList<FieEsq55041>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55041(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55014")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55014() {

		List<FieEsq55014> esqList = new ArrayList<FieEsq55014>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55014(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50415")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50415() {

		List<FieEsq50415> esqList = new ArrayList<FieEsq50415>();
		
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
						esqList.add(linhas);esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50415(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50451")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50451() {

		List<FieEsq50451> esqList = new ArrayList<FieEsq50451>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50451(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50145")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50145() {

		List<FieEsq50145> esqList = new ArrayList<FieEsq50145>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50145(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50154")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50154() {

		List<FieEsq50154> esqList = new ArrayList<FieEsq50154>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50154(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50541")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50541() {

		List<FieEsq50541> esqList = new ArrayList<FieEsq50541>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50541(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq50514")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50514() {

		List<FieEsq50514> esqList = new ArrayList<FieEsq50514>();
		
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
						fienumeroList.gravarEsq50514(esqList);
					}
				}
			}
		}
		fienumeroList.gravarEsq50514(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04155")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04155() {

		List<FieEsq04155> esqList = new ArrayList<FieEsq04155>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04155(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04515")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04515() {

		List<FieEsq04515> esqList = new ArrayList<FieEsq04515>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04515(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq04551")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq04551() {

		List<FieEsq04551> esqList = new ArrayList<FieEsq04551>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq04551(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01455")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq01455() {

		List<FieEsq01455> esqList = new ArrayList<FieEsq01455>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq01455(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01545")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq01545() {

		List<FieEsq01545> esqList = new ArrayList<FieEsq01545>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq01545(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq01554")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq01554() {

		List<FieEsq01554> esqList = new ArrayList<FieEsq01554>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq01554(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05415")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05415() {

		List<FieEsq05415> esqList = new ArrayList<FieEsq05415>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05415(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05451")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05451() {

		List<FieEsq05451> esqList = new ArrayList<FieEsq05451>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05451(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05145")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05145() {

		List<FieEsq05145> esqList = new ArrayList<FieEsq05145>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05145(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05154")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05154() {

		List<FieEsq05154> esqList = new ArrayList<FieEsq05154>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05154(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05541")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05541() {

		List<FieEsq05541> esqList = new ArrayList<FieEsq05541>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05541(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}

	@RequestMapping("/fieesqlf/cercaFieEsq05514")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05514() {

		List<FieEsq05514> esqList = new ArrayList<FieEsq05514>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05514(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
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
