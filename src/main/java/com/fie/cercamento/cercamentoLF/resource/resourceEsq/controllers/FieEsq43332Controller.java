package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq24333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq42333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao43332;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;

@Controller
public class FieEsq43332Controller {
	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao43332 fienumeroList;

	@RequestMapping("esquemas/esq43332/esq43332")
	public String esq43332() {

		return "esquemas/esq43332/esq43332";
	}

//********************************************************************************************************
	
	@RequestMapping("/fieesqlf/cercaFieEsq43332")
	public void cercaFieEsq43332() {

		List<FieEsq43332> esqList = new ArrayList<FieEsq43332>();

		List<EsqUmModel> numEsq4 = numeroList.listarEsqUm4();
		// ***********************************************************
		List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
		// ************************************************************
		List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
		// ***************************************************************
		List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
		// ****************************************************************
		List<EsqCincoModel> cincoEsq2 = numeroList.listarEsqCinco2();
		// ******************************************************************

		for (int a = 0; a < 5; a++) {
			for (int e = 0; e < 10; e++) {
				for (int i = 0; i < 10; i++) {
					for (int o = 0; o < 10; o++) {
						for (int u = 0; u < 10; u++) {

							String linhaUm = String.valueOf(numEsq4.get(a));
							String linhaDois = String.valueOf(doisEsq3.get(e));
							String linhaTres = String.valueOf(tresEsq3.get(i));
							String linhaQuatro = String.valueOf(quatroEsq3.get(o));
							String linhaCinco = String.valueOf(cincoEsq2.get(u));

							String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																										// principal

							FieEsq43332 linhas = new FieEsq43332();
							linhas.setNumEsq43332(linha);
                            esqList.add(linhas);
						}
					}
				}
			}
		}
        fienumeroList.gravarEsq43332(esqList);
	}
	
	//********************************************************************************************************
	
		@RequestMapping("/fieesqlf/cercaFieEsq43323")
		public void cercaFieEsq43323() {

			List<FieEsq43323> esqList = new ArrayList<FieEsq43323>();

			List<EsqUmModel> numEsq4 = numeroList.listarEsqUm4();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq2 = numeroList.listarEsqQuatro2();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 5; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq4.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq2.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq43323 linhas = new FieEsq43323();
								linhas.setNumEsq43323(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq43323(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq43233")
		public void cercaFieEsq43233() {

			List<FieEsq43233> esqList = new ArrayList<FieEsq43233>();

			List<EsqUmModel> numEsq4 = numeroList.listarEsqUm4();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq2 = numeroList.listarEsqTres2();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 5; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq4.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq2.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq43233 linhas = new FieEsq43233();
								linhas.setNumEsq43233(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq43233(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq42333")
		public void cercaFieEsq42333() {

            List<FieEsq42333> esqList = new ArrayList<FieEsq42333>();

			List<EsqUmModel> numEsq4 = numeroList.listarEsqUm4();
			// ***********************************************************
			List<EsqDoisModel> doisEsq2 = numeroList.listarEsqDois2();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 5; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq4.get(a));
								String linhaDois = String.valueOf(doisEsq2.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq42333 linhas = new FieEsq42333();
								linhas.setNumEsq42333(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq42333(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq33342")
		public void cercaFieEsq33342() {

			List<FieEsq33342> esqList = new ArrayList<FieEsq33342>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq4 = numeroList.listarEsqQuatro4();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq2 = numeroList.listarEsqCinco2();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 5; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq4.get(o));
								String linhaCinco = String.valueOf(cincoEsq2.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq33342 linhas = new FieEsq33342();
								linhas.setNumEsq33342(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq33342(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq33324")
		public void cercaFieEsq33324() {

			List<FieEsq33324> esqList = new ArrayList<FieEsq33324>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq2 = numeroList.listarEsqQuatro2();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq4 = numeroList.listarEsqCinco4();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 5; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq2.get(o));
								String linhaCinco = String.valueOf(cincoEsq4.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq33324 linhas = new FieEsq33324();
								linhas.setNumEsq33324(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq33324(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq33423")
		public void cercaFieEsq33423() {

			List<FieEsq33423> esqList = new ArrayList<FieEsq33423>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq4 = numeroList.listarEsqTres4();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq2 = numeroList.listarEsqQuatro2();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 5; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq4.get(i));
								String linhaQuatro = String.valueOf(quatroEsq2.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq33423 linhas = new FieEsq33423();
								linhas.setNumEsq33423(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq33423(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq33243")
		public void cercaFieEsq33243() {

			List<FieEsq33243> esqList = new ArrayList<FieEsq33243>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq2 = numeroList.listarEsqTres2();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq4 = numeroList.listarEsqQuatro4();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 5; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq2.get(i));
								String linhaQuatro = String.valueOf(quatroEsq4.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq33243 linhas = new FieEsq33243();
								linhas.setNumEsq33243(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq33243(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq34233")
		public void cercaFieEsq34233() {

			List<FieEsq34233> esqList = new ArrayList<FieEsq34233>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq4 = numeroList.listarEsqDois4();
			// ************************************************************
			List<EsqTresModel> tresEsq2 = numeroList.listarEsqTres2();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 5; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq4.get(e));
								String linhaTres = String.valueOf(tresEsq2.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq34233 linhas = new FieEsq34233();
								linhas.setNumEsq34233(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq34233(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq32433")
		public void cercaFieEsq32433() {

			List<FieEsq32433> esqList = new ArrayList<FieEsq32433>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq2 = numeroList.listarEsqDois2();
			// ************************************************************
			List<EsqTresModel> tresEsq4 = numeroList.listarEsqTres4();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 5; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq2.get(e));
								String linhaTres = String.valueOf(tresEsq4.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq32433 linhas = new FieEsq32433();
								linhas.setNumEsq32433(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq32433(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq34332")
		public void cercaFieEsq34332() {

			List<FieEsq34332> esqList = new ArrayList<FieEsq34332>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq4 = numeroList.listarEsqDois4();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq2 = numeroList.listarEsqCinco2();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 5; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq4.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq2.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq34332 linhas = new FieEsq34332();
								linhas.setNumEsq34332(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq34332(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq34323")
		public void cercaFieEsq34323() {

			List<FieEsq34323> esqList = new ArrayList<FieEsq34323>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq4 = numeroList.listarEsqDois4();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq2 = numeroList.listarEsqQuatro2();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 5; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq4.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq2.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq34323 linhas = new FieEsq34323();
								linhas.setNumEsq34323(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq34323(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq32334")
		public void cercaFieEsq32334() {

			List<FieEsq32334> esqList = new ArrayList<FieEsq32334>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq2 = numeroList.listarEsqDois2();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq4 = numeroList.listarEsqCinco4();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 5; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq2.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq4.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq32334 linhas = new FieEsq32334();
								linhas.setNumEsq32334(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq32334(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq32343")
		public void cercaFieEsq32343() {

			List<FieEsq32343> esqList = new ArrayList<FieEsq32343>();

			List<EsqUmModel> numEsq3 = numeroList.listarEsqUm3();
			// ***********************************************************
			List<EsqDoisModel> doisEsq2 = numeroList.listarEsqDois2();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq4 = numeroList.listarEsqQuatro4();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 5; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq3.get(a));
								String linhaDois = String.valueOf(doisEsq2.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq4.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq32343 linhas = new FieEsq32343();
								linhas.setNumEsq32343(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq32343(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq24333")
		public void cercaFieEsq24333() {

			List<FieEsq24333> esqList = new ArrayList<FieEsq24333>();

			List<EsqUmModel> numEsq2 = numeroList.listarEsqUm2();
			// ***********************************************************
			List<EsqDoisModel> doisEsq4 = numeroList.listarEsqDois4();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 5; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq2.get(a));
								String linhaDois = String.valueOf(doisEsq4.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq24333 linhas = new FieEsq24333();
								linhas.setNumEsq24333(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq24333(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq23433")
		public void cercaFieEsq23433() {

			List<FieEsq23433> esqList = new ArrayList<FieEsq23433>();

			List<EsqUmModel> numEsq2 = numeroList.listarEsqUm2();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq4 = numeroList.listarEsqTres4();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 5; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq2.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq4.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq23433 linhas = new FieEsq23433();
								linhas.setNumEsq23433(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq23433(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq23343")
		public void cercaFieEsq23343() {

			List<FieEsq23343> esqList = new ArrayList<FieEsq23343>();

			List<EsqUmModel> numEsq2 = numeroList.listarEsqUm2();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq4 = numeroList.listarEsqQuatro4();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq3 = numeroList.listarEsqCinco3();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 5; o++) {
							for (int u = 0; u < 10; u++) {

								String linhaUm = String.valueOf(numEsq2.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq4.get(o));
								String linhaCinco = String.valueOf(cincoEsq3.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq23343 linhas = new FieEsq23343();
								linhas.setNumEsq23343(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq23343(esqList);
		}
		
		//********************************************************************************************************
		
		@RequestMapping("/fieesqlf/cercaFieEsq23334")
		public void cercaFieEsq23334() {

			List<FieEsq23334> esqList = new ArrayList<FieEsq23334>();

			List<EsqUmModel> numEsq2 = numeroList.listarEsqUm2();
			// ***********************************************************
			List<EsqDoisModel> doisEsq3 = numeroList.listarEsqDois3();
			// ************************************************************
			List<EsqTresModel> tresEsq3 = numeroList.listarEsqTres3();
			// ***************************************************************
			List<EsqQuatroModel> quatroEsq3 = numeroList.listarEsqQuatro3();
			// ****************************************************************
			List<EsqCincoModel> cincoEsq4 = numeroList.listarEsqCinco4();
			// ******************************************************************

			for (int a = 0; a < 10; a++) {
				for (int e = 0; e < 10; e++) {
					for (int i = 0; i < 10; i++) {
						for (int o = 0; o < 10; o++) {
							for (int u = 0; u < 5; u++) {

								String linhaUm = String.valueOf(numEsq2.get(a));
								String linhaDois = String.valueOf(doisEsq3.get(e));
								String linhaTres = String.valueOf(tresEsq3.get(i));
								String linhaQuatro = String.valueOf(quatroEsq3.get(o));
								String linhaCinco = String.valueOf(cincoEsq4.get(u));

								String linha = linhaUm + linhaDois + linhaTres + linhaQuatro + linhaCinco; // string
																											// principal

								FieEsq23334 linhas = new FieEsq23334();
								linhas.setNumEsq23334(linha);
                                esqList.add(linhas);
							}
						}
					}
				}
			}
			fienumeroList.gravarEsq23334(esqList);
		}
		
	
} // fim da classe classe completa!
