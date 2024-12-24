package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository22335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository22353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository22533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository23532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository25233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository25323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository25332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository32532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository33225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository33252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository33522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository35223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository35232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository35322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository52233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository52323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository52332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository53223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository53232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53322.Irepository53322;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao53322 {
	
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
	
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository22335 irepository22335;
	@Autowired private Irepository22353 irepository22353;
	@Autowired private Irepository22533 irepository22533;
	@Autowired private Irepository23235 irepository23235;
	@Autowired private Irepository23253 irepository23253;
	@Autowired private Irepository23325 irepository23325;
	@Autowired private Irepository23352 irepository23352;
	@Autowired private Irepository23523 irepository23523;
	@Autowired private Irepository23532 irepository23532;
	@Autowired private Irepository25233 irepository25233;
	@Autowired private Irepository25323 irepository25323;
	@Autowired private Irepository25332 irepository25332;
	@Autowired private Irepository32235 irepository32235;
	@Autowired private Irepository32253 irepository32253;
	@Autowired private Irepository32325 irepository32325;
	@Autowired private Irepository32352 irepository32352;
	@Autowired private Irepository32523 irepository32523;
	@Autowired private Irepository32532 irepository32532;
	@Autowired private Irepository33225 irepository33225;
	@Autowired private Irepository33252 irepository33252;
	@Autowired private Irepository33522 irepository33522;
	@Autowired private Irepository35223 irepository35223;
	@Autowired private Irepository35232 irepository35232;
	@Autowired private Irepository35322 irepository35322;
	@Autowired private Irepository52233 irepository52233;
	@Autowired private Irepository52323 irepository52323;
	@Autowired private Irepository52332 irepository52332;
	@Autowired private Irepository53223 irepository53223;
	@Autowired private Irepository53232 irepository53232;
	@Autowired private Irepository53322 irepository53322;
	
	//para o esquema fie gravar em banco
	
	public String gravarEsq33522(List<FieEsq33522> esquemas){  
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
        };
	}
	public String gravarEsq33252(List<FieEsq33252> esquemas){
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
	public String gravarEsq33225(List<FieEsq33225> esquemas){
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
	public String gravarEsq35322(List<FieEsq35322> esquemas){
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
	public String gravarEsq35232(List<FieEsq35232> esquemas){//
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
	public String gravarEsq35223(List<FieEsq35223> esquemas){//
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
	public String gravarEsq32352(List<FieEsq32352> esquemas){//
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
	public String gravarEsq32325(List<FieEsq32325> esquemas){//
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
	public String gravarEsq32532(List<FieEsq32532> esquemas){//
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
	public String gravarEsq32523(List<FieEsq32523> esquemas){//
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
	public String gravarEsq32235(List<FieEsq32235> esquemas){//
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
	public String gravarEsq32253(List<FieEsq32253> esquemas){//
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
	public String gravarEsq53232(List<FieEsq53232> esquemas){//
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
	public String gravarEsq53223(List<FieEsq53223> esquemas){//
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
	public String gravarEsq52233(List<FieEsq52233> esquemas){//
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
	public String gravarEsq52323(List<FieEsq52323> esquemas){//
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
	public String gravarEsq52332(List<FieEsq52332> esquemas){//
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
	public String gravarEsq22533(List<FieEsq22533> esquemas){//
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
	public String gravarEsq22353(List<FieEsq22353> esquemas){//
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
	public String gravarEsq22335(List<FieEsq22335> esquemas){//
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
	public String gravarEsq25233(List<FieEsq25233> esquemas){//
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
	public String gravarEsq25323(List<FieEsq25323> esquemas){//
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
	public String gravarEsq25332(List<FieEsq25332> esquemas){//
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
	public String gravarEsq23253(List<FieEsq23253> esquemas){//
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
	public String gravarEsq23235(List<FieEsq23235> esquemas){//
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
	public String gravarEsq23523(List<FieEsq23523> esquemas){//
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
	public String gravarEsq23532(List<FieEsq23532> esquemas){//
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
	public String gravarEsq23325(List<FieEsq23325> esquemas){//
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
	public String gravarEsq23352(List<FieEsq23352> esquemas){//
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
	public String gravarEsq53322(List<FieEsq53322> esquemas){//
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
	
	
	
//para listar em tela 33522
	
	public List<FieEsq33522> listarFieEsq33522(String filtro) {
	       String consulta = "select l from FieEsq33522 l where l.numEsq33522 like :nuncerc";
	          TypedQuery<FieEsq33522> query = manager.createQuery(consulta, FieEsq33522.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33252
	
	public List<FieEsq33252> listarFieEsq33252(String filtro) {
	       String consulta = "select l from FieEsq33252 l where l.numEsq33252 like :nuncerc";
	          TypedQuery<FieEsq33252> query = manager.createQuery(consulta, FieEsq33252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33225
	
	public List<FieEsq33225> listarFieEsq33225(String filtro) {
	       String consulta = "select l from FieEsq33225 l where l.numEsq33225 like :nuncerc";
	          TypedQuery<FieEsq33225> query = manager.createQuery(consulta, FieEsq33225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 35322
	
	public List<FieEsq35322> listarFieEsq35322(String filtro) {
	       String consulta = "select l from FieEsq35322 l where l.numEsq35322 like :nuncerc";
	          TypedQuery<FieEsq35322> query = manager.createQuery(consulta, FieEsq35322.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq53322> listarFieEsq53322(String filtro) {
	       String consulta = "select l from FieEsq53322 l where l.numEsq53322 like :nuncerc";
	          TypedQuery<FieEsq53322> query = manager.createQuery(consulta, FieEsq53322.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23325> listarFieEsq23325(String filtro) {
	       String consulta = "select l from FieEsq23325 l where l.numEsq23325 like :nuncerc";
	          TypedQuery<FieEsq23325> query = manager.createQuery(consulta, FieEsq23325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23532> listarFieEsq23532(String filtro) {
	       String consulta = "select l from FieEsq23532 l where l.numEsq23532 like :nuncerc";
	          TypedQuery<FieEsq23532> query = manager.createQuery(consulta, FieEsq23532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23523> listarFieEsq23523(String filtro) {
	       String consulta = "select l from FieEsq23523 l where l.numEsq23523 like :nuncerc";
	          TypedQuery<FieEsq23523> query = manager.createQuery(consulta, FieEsq23523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23235> listarFieEsq23235(String filtro) {
	       String consulta = "select l from FieEsq23235 l where l.numEsq23235 like :nuncerc";
	          TypedQuery<FieEsq23235> query = manager.createQuery(consulta, FieEsq23235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23253> listarFieEsq23253(String filtro) {
	       String consulta = "select l from FieEsq23253 l where l.numEsq23253 like :nuncerc";
	          TypedQuery<FieEsq23253> query = manager.createQuery(consulta, FieEsq23253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25332> listarFieEsq25332(String filtro) {
	       String consulta = "select l from FieEsq25332 l where l.numEsq25332 like :nuncerc";
	          TypedQuery<FieEsq25332> query = manager.createQuery(consulta, FieEsq25332.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25323> listarFieEsq25323(String filtro) {
	       String consulta = "select l from FieEsq25323 l where l.numEsq25323 like :nuncerc";
	          TypedQuery<FieEsq25323> query = manager.createQuery(consulta, FieEsq25323.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25233> listarFieEsq25233(String filtro) {
	       String consulta = "select l from FieEsq25233 l where l.numEsq25233 like :nuncerc";
	          TypedQuery<FieEsq25233> query = manager.createQuery(consulta, FieEsq25233.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22335> listarFieEsq22335(String filtro) {
	       String consulta = "select l from FieEsq22335 l where l.numEsq22335 like :nuncerc";
	          TypedQuery<FieEsq22335> query = manager.createQuery(consulta, FieEsq22335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22353> listarFieEsq22353(String filtro) {
	       String consulta = "select l from FieEsq22353 l where l.numEsq22353 like :nuncerc";
	          TypedQuery<FieEsq22353> query = manager.createQuery(consulta, FieEsq22353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22533> listarFieEsq22533(String filtro) {
	       String consulta = "select l from FieEsq22533 l where l.numEsq22533 like :nuncerc";
	          TypedQuery<FieEsq22533> query = manager.createQuery(consulta, FieEsq22533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52332> listarFieEsq52332(String filtro) {
	       String consulta = "select l from FieEsq52332 l where l.numEsq52332 like :nuncerc";
	          TypedQuery<FieEsq52332> query = manager.createQuery(consulta, FieEsq52332.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52323> listarFieEsq52323(String filtro) {
	       String consulta = "select l from FieEsq52323 l where l.numEsq52323 like :nuncerc";
	          TypedQuery<FieEsq52323> query = manager.createQuery(consulta, FieEsq52323.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52233> listarFieEsq52233(String filtro) {
	       String consulta = "select l from FieEsq52233 l where l.numEsq52233 like :nuncerc";
	          TypedQuery<FieEsq52233> query = manager.createQuery(consulta, FieEsq52233.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53223> listarFieEsq53223(String filtro) {
	       String consulta = "select l from FieEsq53223 l where l.numEsq53223 like :nuncerc";
	          TypedQuery<FieEsq53223> query = manager.createQuery(consulta, FieEsq53223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53232> listarFieEsq53232(String filtro) {
	       String consulta = "select l from FieEsq53232 l where l.numEsq53232 like :nuncerc";
	          TypedQuery<FieEsq53232> query = manager.createQuery(consulta, FieEsq53232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32253> listarFieEsq32253(String filtro) {
	       String consulta = "select l from FieEsq32253 l where l.numEsq32253 like :nuncerc";
	          TypedQuery<FieEsq32253> query = manager.createQuery(consulta, FieEsq32253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32235> listarFieEsq32235(String filtro) {
	       String consulta = "select l from FieEsq32235 l where l.numEsq32235 like :nuncerc";
	          TypedQuery<FieEsq32235> query = manager.createQuery(consulta, FieEsq32235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32523> listarFieEsq32523(String filtro) {
	       String consulta = "select l from FieEsq32523 l where l.numEsq32523 like :nuncerc";
	          TypedQuery<FieEsq32523> query = manager.createQuery(consulta, FieEsq32523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32532> listarFieEsq32532(String filtro) {
	       String consulta = "select l from FieEsq32532 l where l.numEsq32532 like :nuncerc";
	          TypedQuery<FieEsq32532> query = manager.createQuery(consulta, FieEsq32532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32325> listarFieEsq32325(String filtro) {
	       String consulta = "select l from FieEsq32325 l where l.numEsq32325 like :nuncerc";
	          TypedQuery<FieEsq32325> query = manager.createQuery(consulta, FieEsq32325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32352> listarFieEsq32352(String filtro) {
	       String consulta = "select l from FieEsq32352 l where l.numEsq32352 like :nuncerc";
	          TypedQuery<FieEsq32352> query = manager.createQuery(consulta, FieEsq32352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35223> listarFieEsq35223(String filtro) {
	       String consulta = "select l from FieEsq35223 l where l.numEsq35223 like :nuncerc";
	          TypedQuery<FieEsq35223> query = manager.createQuery(consulta, FieEsq35223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35232> listarFieEsq35232(String filtro) {
	       String consulta = "select l from FieEsq35232 l where l.numEsq35232 like :nuncerc";
	          TypedQuery<FieEsq35232> query = manager.createQuery(consulta, FieEsq35232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
