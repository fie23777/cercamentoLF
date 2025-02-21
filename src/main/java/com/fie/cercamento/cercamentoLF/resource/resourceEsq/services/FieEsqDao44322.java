package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.interfaceEsq.IFieEsq;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository22344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository22434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository22443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository23244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository23424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository23442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository24432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository32244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository32424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository32442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository34224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository34242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository34422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository42432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository43224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository43242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository43422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository44223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322.Irepository44322;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao44322 {
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";

	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository22344 irepository22344; 
	@Autowired private Irepository22434 irepository22434;
	@Autowired private Irepository22443 irepository22443;
	@Autowired private Irepository23244 irepository23244;
	@Autowired private Irepository23424 irepository23424;
	@Autowired private Irepository23442 irepository23442;
	@Autowired private Irepository24234 irepository24234;
	@Autowired private Irepository24243 irepository24243;
	@Autowired private Irepository24324 irepository24324;
	@Autowired private Irepository24342 irepository24342;
	@Autowired private Irepository24423 irepository24423;
	@Autowired private Irepository24432 irepository24432;
	@Autowired private Irepository32244 irepository32244;
	@Autowired private Irepository32424 irepository32424;
	@Autowired private Irepository32442 irepository32442;
	@Autowired private Irepository34224 irepository34224;
	@Autowired private Irepository34242 irepository34242;
	@Autowired private Irepository34422 irepository34422;
	@Autowired private Irepository42234 irepository42234;
	@Autowired private Irepository42243 irepository42243;
	@Autowired private Irepository42324 irepository42324;
	@Autowired private Irepository42342 irepository42342;
	@Autowired private Irepository42423 irepository42423;
	@Autowired private Irepository42432 irepository42432;
	@Autowired private Irepository43224 irepository43224;
	@Autowired private Irepository43242 irepository43242;
	@Autowired private Irepository43422 irepository43422;
	@Autowired private Irepository44223 irepository44223;
	@Autowired private Irepository44232 irepository44232;
	@Autowired private Irepository44322 irepository44322;
	
	//para o esquema fie gravar em banco
	
	public String gravarEsq24324(List<FieEsq24324> esquemas){  
        List<FieEsq24324> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24324.existsByNumEsq24324(esquema.getNumEsq24324()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24324.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq24342(List<FieEsq24342> esquemas){
        List<FieEsq24342> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24342.existsByNumEsq24342(esquema.getNumEsq24342()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24342.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42324(List<FieEsq42324> esquemas){
        List<FieEsq42324> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42324.existsByNumEsq42324(esquema.getNumEsq42324()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42324.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42342(List<FieEsq42342> esquemas){
        List<FieEsq42342> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42342.existsByNumEsq42342(esquema.getNumEsq42342()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42342.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42234(List<FieEsq42234> esquemas){//
        List<FieEsq42234> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42234.existsByNumEsq42234(esquema.getNumEsq42234()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42234.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42243(List<FieEsq42243> esquemas){//
        List<FieEsq42243> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42243.existsByNumEsq42243(esquema.getNumEsq42243()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42243.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42423(List<FieEsq42423> esquemas){//
        List<FieEsq42423> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42423.existsByNumEsq42423(esquema.getNumEsq42423()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42423.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq42432(List<FieEsq42432> esquemas){//
        List<FieEsq42432> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository42432.existsByNumEsq42432(esquema.getNumEsq42432()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository42432.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq43224(List<FieEsq43224> esquemas){//
        List<FieEsq43224> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository43224.existsByNumEsq43224(esquema.getNumEsq43224()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository43224.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq43242(List<FieEsq43242> esquemas){//
        List<FieEsq43242> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository43242.existsByNumEsq43242(esquema.getNumEsq43242()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository43242.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq43422(List<FieEsq43422> esquemas){//
        List<FieEsq43422> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository43422.existsByNumEsq43422(esquema.getNumEsq43422()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository43422.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq44223(List<FieEsq44223> esquemas){//
        List<FieEsq44223> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository44223.existsByNumEsq44223(esquema.getNumEsq44223()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository44223.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq44232(List<FieEsq44232> esquemas){//
        List<FieEsq44232> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository44232.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq44322(List<FieEsq44322> esquemas){//
        List<FieEsq44322> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = (List<FieEsq44322>) esquemas.stream()
                    .filter(esquema -> !irepository44322.existsByNumEsq44322(esquema.getNumEsq44322()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository44322.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq32244(List<FieEsq32244> esquemas){//
        List<FieEsq32244> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository32244.existsByNumEsq32244(esquema.getNumEsq32244()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository32244.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq32424(List<FieEsq32424> esquemas){//
        List<FieEsq32424> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository32424.existsByNumEsq32424(esquema.getNumEsq32424()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository32424.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq32442(List<FieEsq32442> esquemas){//
        List<FieEsq32442> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository32442.existsByNumEsq32442(esquema.getNumEsq32442()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository32442.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq34224(List<FieEsq34224> esquemas){//
        List<FieEsq34224> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository34224.existsByNumEsq34224(esquema.getNumEsq34224()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository34224.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq34242(List<FieEsq34242> esquemas){//
        List<FieEsq34242> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository34242.existsByNumEsq34242(esquema.getNumEsq34242()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository34242.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq34422(List<FieEsq34422> esquemas){//
        List<FieEsq34422> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository34422.existsByNumEsq34422(esquema.getNumEsq34422()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository34422.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq22344(List<FieEsq22344> esquemas){//
        List<FieEsq22344> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository22344.existsByNumEsq22344(esquema.getNumEsq22344()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository22344.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq22434(List<FieEsq22434> esquemas){//
        List<FieEsq22434> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository22434.existsByNumEsq22434(esquema.getNumEsq22434()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository22434.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq22443(List<FieEsq22443> esquemas){//
        List<FieEsq22443> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository22443.existsByNumEsq22443(esquema.getNumEsq22443()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository22443.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq23244(List<FieEsq23244> esquemas){//
        List<FieEsq23244> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository23244.existsByNumEsq23244(esquema.getNumEsq23244()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository23244.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq23424(List<FieEsq23424> esquemas){//
        List<FieEsq23424> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository23424.existsByNumEsq23424(esquema.getNumEsq23424()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository23424.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq23442(List<FieEsq23442> esquemas){//
        List<FieEsq23442> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository23442.existsByNumEsq23442(esquema.getNumEsq23442()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository23442.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq24234(List<FieEsq24234> esquemas){//
        List<FieEsq24234> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24234.existsByNumEsq24234(esquema.getNumEsq24234()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24234.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq24243(List<FieEsq24243> esquemas){//
        List<FieEsq24243> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24243.existsByNumEsq24243(esquema.getNumEsq24243()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24243.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq24423(List<FieEsq24423> esquemas){//
        List<FieEsq24423> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24423.existsByNumEsq24423(esquema.getNumEsq24423()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24423.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	public String gravarEsq24432(List<FieEsq24432> esquemas){//
        List<FieEsq24432> esquemasFiltrados;
        synchronized(this) {
            esquemasFiltrados = esquemas.stream()
                    .filter(esquema -> !irepository24432.existsByNumEsq24432(esquema.getNumEsq24432()))
                    .collect(Collectors.toList());

            if (!esquemasFiltrados.isEmpty()) {
                irepository24432.saveAll(esquemasFiltrados);
                return GRAVADO_COM_SUCESSO;
            } else {        	
                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
            }
        }
	}
	
	
	
//para listar em tela 24324
	
	public List<FieEsq24324> listarFieEsq24324(String filtro) {
	       String consulta = "select l from FieEsq24324 l where l.numEsq24324 like :nuncerc";
	          TypedQuery<FieEsq24324> query = manager.createQuery(consulta, FieEsq24324.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 24342
	
	public List<FieEsq24342> listarFieEsq24342(String filtro) {
	       String consulta = "select l from FieEsq24342 l where l.numEsq24342 like :nuncerc";
	          TypedQuery<FieEsq24342> query = manager.createQuery(consulta, FieEsq24342.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 42324
	
	public List<FieEsq42324> listarFieEsq42324(String filtro) {
	       String consulta = "select l from FieEsq42324 l where l.numEsq42324 like :nuncerc";
	          TypedQuery<FieEsq42324> query = manager.createQuery(consulta, FieEsq42324.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 42342
	
	public List<FieEsq42342> listarFieEsq42342(String filtro) {
	       String consulta = "select l from FieEsq42342 l where l.numEsq42342 like :nuncerc";
	          TypedQuery<FieEsq42342> query = manager.createQuery(consulta, FieEsq42342.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq24432> listarFieEsq24432(String filtro) {
	       String consulta = "select l from FieEsq24432 l where l.numEsq24432 like :nuncerc";
	          TypedQuery<FieEsq24432> query = manager.createQuery(consulta, FieEsq24432.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24423> listarFieEsq24423(String filtro) {
	       String consulta = "select l from FieEsq24423 l where l.numEsq24423 like :nuncerc";
	          TypedQuery<FieEsq24423> query = manager.createQuery(consulta, FieEsq24423.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24243> listarFieEsq24243(String filtro) {
	       String consulta = "select l from FieEsq24243 l where l.numEsq24243 like :nuncerc";
	          TypedQuery<FieEsq24243> query = manager.createQuery(consulta, FieEsq24243.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24234> listarFieEsq24234(String filtro) {
	       String consulta = "select l from FieEsq24234 l where l.numEsq24234 like :nuncerc";
	          TypedQuery<FieEsq24234> query = manager.createQuery(consulta, FieEsq24234.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23442> listarFieEsq23442(String filtro) {
	       String consulta = "select l from FieEsq23442 l where l.numEsq23442 like :nuncerc";
	          TypedQuery<FieEsq23442> query = manager.createQuery(consulta, FieEsq23442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23424> listarFieEsq23424(String filtro) {
	       String consulta = "select l from FieEsq23424 l where l.numEsq23424 like :nuncerc";
	          TypedQuery<FieEsq23424> query = manager.createQuery(consulta, FieEsq23424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23244> listarFieEsq23244(String filtro) {
	       String consulta = "select l from FieEsq23244 l where l.numEsq23244 like :nuncerc";
	          TypedQuery<FieEsq23244> query = manager.createQuery(consulta, FieEsq23244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22443> listarFieEsq22443(String filtro) {
	       String consulta = "select l from FieEsq22443 l where l.numEsq22443 like :nuncerc";
	          TypedQuery<FieEsq22443> query = manager.createQuery(consulta, FieEsq22443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22434> listarFieEsq22434(String filtro) {
	       String consulta = "select l from FieEsq22434 l where l.numEsq22434 like :nuncerc";
	          TypedQuery<FieEsq22434> query = manager.createQuery(consulta, FieEsq22434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22344> listarFieEsq22344(String filtro) {
	       String consulta = "select l from FieEsq22344 l where l.numEsq22344 like :nuncerc";
	          TypedQuery<FieEsq22344> query = manager.createQuery(consulta, FieEsq22344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34422> listarFieEsq34422(String filtro) {
	       String consulta = "select l from FieEsq34422 l where l.numEsq34422 like :nuncerc";
	          TypedQuery<FieEsq34422> query = manager.createQuery(consulta, FieEsq34422.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34242> listarFieEsq34242(String filtro) {
	       String consulta = "select l from FieEsq34242 l where l.numEsq34242 like :nuncerc";
	          TypedQuery<FieEsq34242> query = manager.createQuery(consulta, FieEsq34242.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34224> listarFieEsq34224(String filtro) {
	       String consulta = "select l from FieEsq34224 l where l.numEsq34224 like :nuncerc";
	          TypedQuery<FieEsq34224> query = manager.createQuery(consulta, FieEsq34224.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32442> listarFieEsq32442(String filtro) {
	       String consulta = "select l from FieEsq32442 l where l.numEsq32442 like :nuncerc";
	          TypedQuery<FieEsq32442> query = manager.createQuery(consulta, FieEsq32442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32424> listarFieEsq32424(String filtro) {
	       String consulta = "select l from FieEsq32424 l where l.numEsq32424 like :nuncerc";
	          TypedQuery<FieEsq32424> query = manager.createQuery(consulta, FieEsq32424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32244> listarFieEsq32244(String filtro) {
	       String consulta = "select l from FieEsq32244 l where l.numEsq32244 like :nuncerc";
	          TypedQuery<FieEsq32244> query = manager.createQuery(consulta, FieEsq32244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44322> listarFieEsq44322(String filtro) {
	       String consulta = "select l from FieEsq44322 l where l.numEsq44322 like :nuncerc";
	          TypedQuery<FieEsq44322> query = manager.createQuery(consulta, FieEsq44322.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44232> listarFieEsq44232(String filtro) {
	       String consulta = "select l from FieEsq44232 l where l.numEsq44232 like :nuncerc";
	          TypedQuery<FieEsq44232> query = manager.createQuery(consulta, FieEsq44232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44223> listarFieEsq44223(String filtro) {
	       String consulta = "select l from FieEsq44223 l where l.numEsq44223 like :nuncerc";
	          TypedQuery<FieEsq44223> query = manager.createQuery(consulta, FieEsq44223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43422> listarFieEsq43422(String filtro) {
	       String consulta = "select l from FieEsq43422 l where l.numEsq43422 like :nuncerc";
	          TypedQuery<FieEsq43422> query = manager.createQuery(consulta, FieEsq43422.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43242> listarFieEsq43242(String filtro) {
	       String consulta = "select l from FieEsq43242 l where l.numEsq43242 like :nuncerc";
	          TypedQuery<FieEsq43242> query = manager.createQuery(consulta, FieEsq43242.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43224> listarFieEsq43224(String filtro) {
	       String consulta = "select l from FieEsq43224 l where l.numEsq43224 like :nuncerc";
	          TypedQuery<FieEsq43224> query = manager.createQuery(consulta, FieEsq43224.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42432> listarFieEsq42432(String filtro) {
	       String consulta = "select l from FieEsq42432 l where l.numEsq42432 like :nuncerc";
	          TypedQuery<FieEsq42432> query = manager.createQuery(consulta, FieEsq42432.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42423> listarFieEsq42423(String filtro) {
	       String consulta = "select l from FieEsq42423 l where l.numEsq42423 like :nuncerc";
	          TypedQuery<FieEsq42423> query = manager.createQuery(consulta, FieEsq42423.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42243> listarFieEsq42243(String filtro) {
	       String consulta = "select l from FieEsq42243 l where l.numEsq42243 like :nuncerc";
	          TypedQuery<FieEsq42243> query = manager.createQuery(consulta, FieEsq42243.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42234> listarFieEsq42234(String filtro) {
	       String consulta = "select l from FieEsq42234 l where l.numEsq42234 like :nuncerc";
	          TypedQuery<FieEsq42234> query = manager.createQuery(consulta, FieEsq42234.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
