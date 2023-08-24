package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq55320Controller {

	private static final String FINALIZADO_O_CERCAMENTO_DO_ESQUEMA = "Finalizado o cercamento do esquema";

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
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55320() {

		List<FieEsq55320> esqList = new ArrayList<FieEsq55320>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55320(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32550() {

		List<FieEsq32550> esqList = new ArrayList<FieEsq32550>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq32550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32505() {

		List<FieEsq32505> esqList = new ArrayList<FieEsq32505>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq32505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq32055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq32055() {

		List<FieEsq32055> esqList = new ArrayList<FieEsq32055>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq32055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35250")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35250() {

		List<FieEsq35250> esqList = new ArrayList<FieEsq35250>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35250(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35205")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35205() {

		List<FieEsq35205> esqList = new ArrayList<FieEsq35205>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35205(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35520")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35520() {

		List<FieEsq35520> esqList = new ArrayList<FieEsq35520>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35520(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35502")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35502() {

		List<FieEsq35502> esqList = new ArrayList<FieEsq35502>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35502(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30255")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30255() {

		List<FieEsq30255> esqList = new ArrayList<FieEsq30255>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30255(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30525")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30525() {

		List<FieEsq30525> esqList = new ArrayList<FieEsq30525>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30525(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq30552")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq30552() {

		List<FieEsq30552> esqList = new ArrayList<FieEsq30552>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq30552(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35025")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35025() {

		List<FieEsq35025> esqList = new ArrayList<FieEsq35025>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35025(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq35052")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq35052() {

		List<FieEsq35052> esqList = new ArrayList<FieEsq35052>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq35052(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23550() {

		List<FieEsq23550> esqList = new ArrayList<FieEsq23550>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq23550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23505() {

		List<FieEsq23505> esqList = new ArrayList<FieEsq23505>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq23505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq23055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq23055() {

		List<FieEsq23055> esqList = new ArrayList<FieEsq23055>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq23055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25350")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25350() {

		List<FieEsq25350> esqList = new ArrayList<FieEsq25350>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25350(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25305")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25305() {

		List<FieEsq25305> esqList = new ArrayList<FieEsq25305>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25305(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25530")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25530() {

		List<FieEsq25530> esqList = new ArrayList<FieEsq25530>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25530(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25503")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25503() {

		List<FieEsq25503> esqList = new ArrayList<FieEsq25503>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25503(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25035")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25035() {

		List<FieEsq25035> esqList = new ArrayList<FieEsq25035>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25035(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq25053")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq25053() {

		List<FieEsq25053> esqList = new ArrayList<FieEsq25053>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq25053(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20355")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq20355() {

		List<FieEsq20355> esqList = new ArrayList<FieEsq20355>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq20355(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20535")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq20535() {

		List<FieEsq20535> esqList = new ArrayList<FieEsq20535>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq20535(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq20553")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq20553() {

		List<FieEsq20553> esqList = new ArrayList<FieEsq20553>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq20553(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53250")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53250() {

		List<FieEsq53250> esqList = new ArrayList<FieEsq53250>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53250(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53205")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53205() {

		List<FieEsq53205> esqList = new ArrayList<FieEsq53205>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53205(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53520")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53520() {

		List<FieEsq53520> esqList = new ArrayList<FieEsq53520>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53520(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53502")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53502() {

		List<FieEsq53502> esqList = new ArrayList<FieEsq53502>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53502(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53025")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53025() {

		List<FieEsq53025> esqList = new ArrayList<FieEsq53025>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53025(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq53052")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq53052() {

		List<FieEsq53052> esqList = new ArrayList<FieEsq53052>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq53052(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52350")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52350() {

		List<FieEsq52350> esqList = new ArrayList<FieEsq52350>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52350(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52305")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52305() {

		List<FieEsq52305> esqList = new ArrayList<FieEsq52305>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52305(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52530")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52530() {

		List<FieEsq52530> esqList = new ArrayList<FieEsq52530>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52530(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52503")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52503() {

		List<FieEsq52503> esqList = new ArrayList<FieEsq52503>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52503(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52035")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52035() {

		List<FieEsq52035> esqList = new ArrayList<FieEsq52035>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52035(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq52053")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq52053() {

		List<FieEsq52053> esqList = new ArrayList<FieEsq52053>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq52053(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55302")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55302() {

		List<FieEsq55302> esqList = new ArrayList<FieEsq55302>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55302(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55230")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55230() {

		List<FieEsq55230> esqList = new ArrayList<FieEsq55230>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55230(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55203")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55203() {

		List<FieEsq55203> esqList = new ArrayList<FieEsq55203>();
		
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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55203(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55032")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55032() {

		List<FieEsq55032> esqList = new ArrayList<FieEsq55032>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55032(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55023")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55023() {

		List<FieEsq55023> esqList = new ArrayList<FieEsq55023>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq55023(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50325")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50325() {

		List<FieEsq50325> esqList = new ArrayList<FieEsq50325>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50352() {

		List<FieEsq50352> esqList = new ArrayList<FieEsq50352>();


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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50235() {

		List<FieEsq50235> esqList = new ArrayList<FieEsq50235>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50253() {

		List<FieEsq50253> esqList = new ArrayList<FieEsq50253>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50532() {

		List<FieEsq50532> esqList = new ArrayList<FieEsq50532>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50523() {

		List<FieEsq50523> esqList = new ArrayList<FieEsq50523>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq50523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03255")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03255() {

		List<FieEsq03255> esqList = new ArrayList<FieEsq03255>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03255(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03525")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03525() {

		List<FieEsq03525> esqList = new ArrayList<FieEsq03525>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03525(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq03552")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq03552() {

		List<FieEsq03552> esqList = new ArrayList<FieEsq03552>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq03552(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02355")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq02355() {

		List<FieEsq02355> esqList = new ArrayList<FieEsq02355>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq02355(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02535")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq02535() {

		List<FieEsq02535> esqList = new ArrayList<FieEsq02535>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq02535(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq02553")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq02553() {

		List<FieEsq02553> esqList = new ArrayList<FieEsq02553>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq02553(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05325")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05325() {

		List<FieEsq05325> esqList = new ArrayList<FieEsq05325>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05325(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05352")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05352() {

		List<FieEsq05352> esqList = new ArrayList<FieEsq05352>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05352(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05235")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05235() {

		List<FieEsq05235> esqList = new ArrayList<FieEsq05235>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05235(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05253")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05253() {

		List<FieEsq05253> esqList = new ArrayList<FieEsq05253>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05253(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05532")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05532() {

		List<FieEsq05532> esqList = new ArrayList<FieEsq05532>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05532(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05523")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05523() {

		List<FieEsq05523> esqList = new ArrayList<FieEsq05523>();

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
						esqList.add(linhas);
					}
				}
			}
		}
		fienumeroList.gravarEsq05523(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
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
