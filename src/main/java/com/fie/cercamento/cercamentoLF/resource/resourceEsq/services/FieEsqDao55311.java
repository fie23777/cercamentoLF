package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55113;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55131;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55311;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository11355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository11535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository11553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository13155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository13515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository13551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository15531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository31155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository31515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository31551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository35115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository35151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository35511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository51531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository53115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository53151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository53511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository55113;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository55131;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55311.Irepository55311;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao55311 {
	
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
	
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository11355 irepository11355;
	@Autowired private Irepository11535 irepository11535;
	@Autowired private Irepository11553 irepository11553;
	@Autowired private Irepository13155 irepository13155;
	@Autowired private Irepository13515 irepository13515;
	@Autowired private Irepository13551 irepository13551;
	@Autowired private Irepository15135 irepository15135;
	@Autowired private Irepository15153 irepository15153;
	@Autowired private Irepository15315 irepository15315;
	@Autowired private Irepository15351 irepository15351;
	@Autowired private Irepository15513 irepository15513;
	@Autowired private Irepository15531 irepository15531;
	@Autowired private Irepository31155 irepository31155;
	@Autowired private Irepository31515 irepository31515;
	@Autowired private Irepository31551 irepository31551;
	@Autowired private Irepository35115 irepository35115;
	@Autowired private Irepository35151 irepository35151;
	@Autowired private Irepository35511 irepository35511;
	@Autowired private Irepository51135 irepository51135;
	@Autowired private Irepository51153 irepository51153;
	@Autowired private Irepository51315 irepository51315;
	@Autowired private Irepository51351 irepository51351;
	@Autowired private Irepository51513 irepository51513;
	@Autowired private Irepository51531 irepository51531;
	@Autowired private Irepository53115 irepository53115;
	@Autowired private Irepository53151 irepository53151;
	@Autowired private Irepository53511 irepository53511;
	@Autowired private Irepository55113 irepository55113;
	@Autowired private Irepository55131 irepository55131;
	@Autowired private Irepository55311 irepository55311; 
	
	//para o esquema fie gravar em banco
	
	public String gravarEsq55311(List<FieEsq55311> esquemas){  
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
	public String gravarEsq55131(List<FieEsq55131> esquemas){
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
	public String gravarEsq55113(List<FieEsq55113> esquemas){
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
	public String gravarEsq53511(List<FieEsq53511> esquemas){
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
	public String gravarEsq53151(List<FieEsq53151> esquemas){//
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
	public String gravarEsq53115(List<FieEsq53115> esquemas){//
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
	public String gravarEsq51531(List<FieEsq51531> esquemas){//
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
	public String gravarEsq51513(List<FieEsq51513> esquemas){//
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
	public String gravarEsq51351(List<FieEsq51351> esquemas){//
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
	public String gravarEsq51315(List<FieEsq51315> esquemas){//
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
	public String gravarEsq51153(List<FieEsq51153> esquemas){//
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
	public String gravarEsq51135(List<FieEsq51135> esquemas){//
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
	public String gravarEsq35511(List<FieEsq35511> esquemas){//
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
	public String gravarEsq35151(List<FieEsq35151> esquemas){//
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
	public String gravarEsq35115(List<FieEsq35115> esquemas){//
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
	public String gravarEsq31155(List<FieEsq31155> esquemas){//
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
	public String gravarEsq31515(List<FieEsq31515> esquemas){//
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
	public String gravarEsq31551(List<FieEsq31551> esquemas){//
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
	public String gravarEsq11355(List<FieEsq11355> esquemas){//
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
	public String gravarEsq11535(List<FieEsq11535> esquemas){//
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
	public String gravarEsq11553(List<FieEsq11553> esquemas){//
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
	public String gravarEsq13155(List<FieEsq13155> esquemas){//
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
	public String gravarEsq13515(List<FieEsq13515> esquemas){//
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
	public String gravarEsq15135(List<FieEsq15135> esquemas){//
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
	public String gravarEsq15153(List<FieEsq15153> esquemas){//
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
	public String gravarEsq15315(List<FieEsq15315> esquemas){//
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
	public String gravarEsq15351(List<FieEsq15351> esquemas){//
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
	public String gravarEsq15513(List<FieEsq15513> esquemas){//
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
	public String gravarEsq15531(List<FieEsq15531> esquemas){//
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
	public String gravarEsq13551(List<FieEsq13551> esquemas){//
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
	
	
	
//para listar em tela 55311
	
	public List<FieEsq55311> listarFieEsq55311(String filtro) {
	       String consulta = "select l from FieEsq55311 l where l.numEsq55311 like :nuncerc";
	          TypedQuery<FieEsq55311> query = manager.createQuery(consulta, FieEsq55311.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55131
	
	public List<FieEsq55131> listarFieEsq55131(String filtro) {
	       String consulta = "select l from FieEsq55131 l where l.numEsq55131 like :nuncerc";
	          TypedQuery<FieEsq55131> query = manager.createQuery(consulta, FieEsq55131.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55113
	
	public List<FieEsq55113> listarFieEsq55113(String filtro) {
	       String consulta = "select l from FieEsq55113 l where l.numEsq55113 like :nuncerc";
	          TypedQuery<FieEsq55113> query = manager.createQuery(consulta, FieEsq55113.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53511
	
	public List<FieEsq53511> listarFieEsq53511(String filtro) {
	       String consulta = "select l from FieEsq53511 l where l.numEsq53511 like :nuncerc";
	          TypedQuery<FieEsq53511> query = manager.createQuery(consulta, FieEsq53511.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq15531> listarFieEsq15531(String filtro) {
	       String consulta = "select l from FieEsq15531 l where l.numEsq15531 like :nuncerc";
	          TypedQuery<FieEsq15531> query = manager.createQuery(consulta, FieEsq15531.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15351> listarFieEsq15351(String filtro) {
	       String consulta = "select l from FieEsq15351 l where l.numEsq15351 like :nuncerc";
	          TypedQuery<FieEsq15351> query = manager.createQuery(consulta, FieEsq15351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15315> listarFieEsq15315(String filtro) {
	       String consulta = "select l from FieEsq15315 l where l.numEsq15315 like :nuncerc";
	          TypedQuery<FieEsq15315> query = manager.createQuery(consulta, FieEsq15315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15153> listarFieEsq15153(String filtro) {
	       String consulta = "select l from FieEsq15153 l where l.numEsq15153 like :nuncerc";
	          TypedQuery<FieEsq15153> query = manager.createQuery(consulta, FieEsq15153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15135> listarFieEsq15135(String filtro) {
	       String consulta = "select l from FieEsq15135 l where l.numEsq15135 like :nuncerc";
	          TypedQuery<FieEsq15135> query = manager.createQuery(consulta, FieEsq15135.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13515> listarFieEsq13515(String filtro) {
	       String consulta = "select l from FieEsq13515 l where l.numEsq13515 like :nuncerc";
	          TypedQuery<FieEsq13515> query = manager.createQuery(consulta, FieEsq13515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13155> listarFieEsq13155(String filtro) {
	       String consulta = "select l from FieEsq13155 l where l.numEsq13155 like :nuncerc";
	          TypedQuery<FieEsq13155> query = manager.createQuery(consulta, FieEsq13155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11553> listarFieEsq11553(String filtro) {
	       String consulta = "select l from FieEsq11553 l where l.numEsq11553 like :nuncerc";
	          TypedQuery<FieEsq11553> query = manager.createQuery(consulta, FieEsq11553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11535> listarFieEsq11535(String filtro) {
	       String consulta = "select l from FieEsq11535 l where l.numEsq11535 like :nuncerc";
	          TypedQuery<FieEsq11535> query = manager.createQuery(consulta, FieEsq11535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11355> listarFieEsq11355(String filtro) {
	       String consulta = "select l from FieEsq11355 l where l.numEsq11355 like :nuncerc";
	          TypedQuery<FieEsq11355> query = manager.createQuery(consulta, FieEsq11355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31551> listarFieEsq31551(String filtro) {
	       String consulta = "select l from FieEsq31551 l where l.numEsq31551 like :nuncerc";
	          TypedQuery<FieEsq31551> query = manager.createQuery(consulta, FieEsq31551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31515> listarFieEsq31515(String filtro) {
	       String consulta = "select l from FieEsq31515 l where l.numEsq31515 like :nuncerc";
	          TypedQuery<FieEsq31515> query = manager.createQuery(consulta, FieEsq31515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31155> listarFieEsq31155(String filtro) {
	       String consulta = "select l from FieEsq31155 l where l.numEsq31155 like :nuncerc";
	          TypedQuery<FieEsq31155> query = manager.createQuery(consulta, FieEsq31155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35115> listarFieEsq35115(String filtro) {
	       String consulta = "select l from FieEsq35115 l where l.numEsq35115 like :nuncerc";
	          TypedQuery<FieEsq35115> query = manager.createQuery(consulta, FieEsq35115.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35151> listarFieEsq35151(String filtro) {
	       String consulta = "select l from FieEsq35151 l where l.numEsq35151 like :nuncerc";
	          TypedQuery<FieEsq35151> query = manager.createQuery(consulta, FieEsq35151.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35511> listarFieEsq35511(String filtro) {
	       String consulta = "select l from FieEsq35511 l where l.numEsq35511 like :nuncerc";
	          TypedQuery<FieEsq35511> query = manager.createQuery(consulta, FieEsq35511.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51135> listarFieEsq51135(String filtro) {
	       String consulta = "select l from FieEsq51135 l where l.numEsq51135 like :nuncerc";
	          TypedQuery<FieEsq51135> query = manager.createQuery(consulta, FieEsq51135.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51153> listarFieEsq51153(String filtro) {
	       String consulta = "select l from FieEsq51153 l where l.numEsq51153 like :nuncerc";
	          TypedQuery<FieEsq51153> query = manager.createQuery(consulta, FieEsq51153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51315> listarFieEsq51315(String filtro) {
	       String consulta = "select l from FieEsq51315 l where l.numEsq51315 like :nuncerc";
	          TypedQuery<FieEsq51315> query = manager.createQuery(consulta, FieEsq51315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51351> listarFieEsq51351(String filtro) {
	       String consulta = "select l from FieEsq51351 l where l.numEsq51351 like :nuncerc";
	          TypedQuery<FieEsq51351> query = manager.createQuery(consulta, FieEsq51351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51513> listarFieEsq51513(String filtro) {
	       String consulta = "select l from FieEsq51513 l where l.numEsq51513 like :nuncerc";
	          TypedQuery<FieEsq51513> query = manager.createQuery(consulta, FieEsq51513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51531> listarFieEsq51531(String filtro) {
	       String consulta = "select l from FieEsq51531 l where l.numEsq51531 like :nuncerc";
	          TypedQuery<FieEsq51531> query = manager.createQuery(consulta, FieEsq51531.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53115> listarFieEsq53115(String filtro) {
	       String consulta = "select l from FieEsq53115 l where l.numEsq53115 like :nuncerc";
	          TypedQuery<FieEsq53115> query = manager.createQuery(consulta, FieEsq53115.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53151> listarFieEsq53151(String filtro) {
	       String consulta = "select l from FieEsq53151 l where l.numEsq53151 like :nuncerc";
	          TypedQuery<FieEsq53151> query = manager.createQuery(consulta, FieEsq53151.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15513> listarFieEsq15513(String filtro) {
	       String consulta = "select l from FieEsq15513 l where l.numEsq15513 like :nuncerc";
	          TypedQuery<FieEsq15513> query = manager.createQuery(consulta, FieEsq15513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13551> listarFieEsq13551(String filtro) {
	       String consulta = "select l from FieEsq13551 l where l.numEsq13551 like :nuncerc";
	          TypedQuery<FieEsq13551> query = manager.createQuery(consulta, FieEsq13551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
