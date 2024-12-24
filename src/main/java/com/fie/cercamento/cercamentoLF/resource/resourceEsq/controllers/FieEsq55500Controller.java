package com.fie.cercamento.cercamentoLF.resource.resourceEsq.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq00555;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55005;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55050;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55500;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.FieEsqDao55500;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.EsqLotofacilDao;
import com.fie.cercamento.cercamentoLF.util.ResponseSuccessFie;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FieEsq55500Controller {

	@Autowired
	EsqLotofacilDao numeroList;
	@Autowired
	FieEsqDao55500 fienumeroList;
	
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

	@RequestMapping("/esquemas/esq55500/esq55500")
	public String esq55410() {

		return "/esquemas/esq55500/esq55500";
	}

	@RequestMapping("/fieesqlf/cercaFieEsq55500")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55500() {

			List<FieEsq55500> esqList = new ArrayList<FieEsq55500>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);
					String linhaDois = String.valueOf(doisEsq5);
					String linhaTres = String.valueOf(tresEsq5);


					String linha = linhaUm + linhaDois + linhaTres;

					FieEsq55500 linhas = new FieEsq55500();
					linhas.setNumEsq55500(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq55500(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55050")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55050() {

		List<FieEsq55050> esqList = new ArrayList<FieEsq55050>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);
					String linhaDois = String.valueOf(doisEsq5);

					String linhaQuatro = String.valueOf(quatroEsq5);


					String linha = linhaUm + linhaDois + linhaQuatro;

					FieEsq55050 linhas = new FieEsq55050();
					linhas.setNumEsq55050(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq55050(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq55005")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq55005() {

		List<FieEsq55005> esqList = new ArrayList<FieEsq55005>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);
					String linhaDois = String.valueOf(doisEsq5);

					String linhaCinco = String.valueOf(cincoEsq5);

					String linha = linhaUm + linhaDois +linhaCinco;

					FieEsq55005 linhas = new FieEsq55005();
					linhas.setNumEsq55005(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq55005(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50505() {

		List<FieEsq50505> esqList = new ArrayList<FieEsq50505>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);

					String linhaTres = String.valueOf(tresEsq5);

					String linhaCinco = String.valueOf(cincoEsq5);

					String linha = linhaUm + linhaTres+linhaCinco;

					FieEsq50505 linhas = new FieEsq50505();
					linhas.setNumEsq50505(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq50505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50550() {

		List<FieEsq50550> esqList = new ArrayList<FieEsq50550>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);

					String linhaTres = String.valueOf(tresEsq5);
					String linhaQuatro = String.valueOf(quatroEsq5);


					String linha = linhaUm +linhaTres+linhaQuatro;

					FieEsq50550 linhas = new FieEsq50550();
					linhas.setNumEsq50550(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq50550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq50055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq50055() {

		List<FieEsq50055> esqList = new ArrayList<FieEsq50055>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaUm = String.valueOf(umEsq5);

					String linhaQuatro = String.valueOf(quatroEsq5);
					String linhaCinco = String.valueOf(cincoEsq5);

					String linha = linhaUm + linhaQuatro+linhaCinco;

					FieEsq50055 linhas = new FieEsq50055();
					linhas.setNumEsq50055(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq50055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05055")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05055() {

		List<FieEsq05055> esqList = new ArrayList<FieEsq05055>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

		
					String linhaDois = String.valueOf(doisEsq5);

					String linhaQuatro = String.valueOf(quatroEsq5);
					String linhaCinco = String.valueOf(cincoEsq5);

					String linha = linhaDois + linhaQuatro+linhaCinco;

					FieEsq05055 linhas = new FieEsq05055();
					linhas.setNumEsq05055(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq05055(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05505")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05505() {

		List<FieEsq05505> esqList = new ArrayList<FieEsq05505>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {

					String linhaDois = String.valueOf(doisEsq5);
					String linhaTres = String.valueOf(tresEsq5);

					String linhaCinco = String.valueOf(cincoEsq5);

					String linha = linhaDois + linhaTres+linhaCinco;

					FieEsq05505 linhas = new FieEsq05505();
					linhas.setNumEsq05505(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq05505(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq05550")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq05550() {

		List<FieEsq05550> esqList = new ArrayList<FieEsq05550>();

		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		
		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {


					String linhaDois = String.valueOf(doisEsq5);
					String linhaTres = String.valueOf(tresEsq5);
					String linhaQuatro = String.valueOf(quatroEsq5);


					String linha =  linhaDois + linhaTres+linhaQuatro;

					FieEsq05550 linhas = new FieEsq05550();
					linhas.setNumEsq05550(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq05550(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	
	@RequestMapping("/fieesqlf/cercaFieEsq00555")
	@ResponseBody
	public ResponseSuccessFie cercaFieEsq00555() {

		List<FieEsq00555> esqList = new ArrayList<FieEsq00555>();
		
		executaLista(umEsq5, doisEsq5, tresEsq5, quatroEsq5, cincoEsq5);
		

		for (int a = 0; a < 1; a++) {
			for (int e = 0; e < 1; e++) {
				for (int i = 0; i < 1; i++) {


					String linhaTres = String.valueOf(tresEsq5);
					String linhaQuatro = String.valueOf(quatroEsq5);
					String linhaCinco = String.valueOf(cincoEsq5);

					String linha =  linhaTres+linhaQuatro+linhaCinco;
					FieEsq00555 linhas = new FieEsq00555();
					linhas.setNumEsq00555(linha);
					esqList.add(linhas);
					
				}
			}
		}
		fienumeroList.gravarEsq00555(esqList);
		return new ResponseSuccessFie(FINALIZADO_O_CERCAMENTO_DO_ESQUEMA, "24342");
	}
	public void executaLista(String umEsq5,String doisEsq5,String tresEsq5,String quatroEsq5,String cincoEsq5  ){
		this.umEsq5= umEsq5 = numeroList.listarEsqUm5();
		// ***********************************************************
		this.doisEsq5= doisEsq5 = numeroList.listarEsqDois5();
		// ***********************************************************
		this.tresEsq5= tresEsq5 = numeroList.listarEsqTres5();
		// ***********************************************************
		this.quatroEsq5=quatroEsq5 = numeroList.listarEsqQuatro5();
		// ***********************************************************
		this.cincoEsq5=cincoEsq5 = numeroList.listarEsqCinco5();
		// ***********************************************************
	}
}
