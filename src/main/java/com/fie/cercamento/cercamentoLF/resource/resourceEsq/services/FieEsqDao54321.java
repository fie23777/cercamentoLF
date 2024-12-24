package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54321.*;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54321.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao54321 {
	
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
	
	@PersistenceContext
	private EntityManager manager;

	private int limite = 20;

	@Autowired private Irepository12345 irepository12345;
	@Autowired private Irepository12354 irepository12354;
	@Autowired private Irepository12435 irepository12435;
	@Autowired private Irepository12453 irepository12453;
	@Autowired private Irepository12534 irepository12534;
	@Autowired private Irepository12543 irepository12543;
	@Autowired private Irepository13245 irepository13245;
	@Autowired private Irepository13254 irepository13254;
	@Autowired private Irepository13425 irepository13425;
	@Autowired private Irepository13452 irepository13452;
	@Autowired private Irepository13524 irepository13524;
	@Autowired private Irepository13542 irepository13542;
	@Autowired private Irepository14235 irepository14235;
	@Autowired private Irepository14253 irepository14253;
	@Autowired private Irepository14325 irepository14325;
	@Autowired private Irepository14352 irepository14352;
	@Autowired private Irepository14523 irepository14523;
	@Autowired private Irepository14532 irepository14532;
	@Autowired private Irepository15234 irepository15234;
	@Autowired private Irepository15243 irepository15243;
	@Autowired private Irepository15324 irepository15324;
	@Autowired private Irepository15342 irepository15342;
	@Autowired private Irepository15423 irepository15423;
	@Autowired private Irepository15432 irepository15432;
	@Autowired private Irepository21345 irepository21345;
	@Autowired private Irepository21354 irepository21354;
	@Autowired private Irepository21435 irepository21435;
	@Autowired private Irepository21453 irepository21453;
	@Autowired private Irepository21534 irepository21534;
	@Autowired private Irepository21543 irepository21543;
	@Autowired private Irepository23145 irepository23145;
	@Autowired private Irepository23154 irepository23154;
	@Autowired private Irepository23415 irepository23415;
	@Autowired private Irepository23451 irepository23451;
	@Autowired private Irepository23514 irepository23514;
	@Autowired private Irepository23541 irepository23541;
	@Autowired private Irepository24135 irepository24135;
	@Autowired private Irepository24153 irepository24153;
	@Autowired private Irepository24315 irepository24315;
	@Autowired private Irepository24351 irepository24351;
	@Autowired private Irepository24513 irepository24513;
	@Autowired private Irepository24531 irepository24531;
	@Autowired private Irepository25134 irepository25134;
	@Autowired private Irepository25143 irepository25143;
	@Autowired private Irepository25314 irepository25314;
	@Autowired private Irepository25341 irepository25341;
	@Autowired private Irepository25413 irepository25413;
	@Autowired private Irepository25431 irepository25431;
	@Autowired private Irepository31245 irepository31245;
	@Autowired private Irepository31254 irepository31254;
	@Autowired private Irepository31425 irepository31425;
	@Autowired private Irepository31452 irepository31452;
	@Autowired private Irepository31524 irepository31524;
	@Autowired private Irepository31542 irepository31542;
	@Autowired private Irepository32145 irepository32145;
	@Autowired private Irepository32154 irepository32154;
	@Autowired private Irepository32415 irepository32415;
	@Autowired private Irepository32451 irepository32451;
	@Autowired private Irepository32514 irepository32514;
	@Autowired private Irepository32541 irepository32541;
	@Autowired private Irepository34125 irepository34125;
	@Autowired private Irepository34152 irepository34152;
	@Autowired private Irepository34215 irepository34215;
	@Autowired private Irepository34251 irepository34251;
	@Autowired private Irepository34512 irepository34512;
	@Autowired private Irepository34521 irepository34521;
	@Autowired private Irepository35124 irepository35124;
	@Autowired private Irepository35142 irepository35142;
	@Autowired private Irepository35214 irepository35214;
	@Autowired private Irepository35241 irepository35241;
	@Autowired private Irepository35412 irepository35412;
	@Autowired private Irepository35421 irepository35421;
	@Autowired private Irepository41235 irepository41235;
	@Autowired private Irepository41253 irepository41253;
	@Autowired private Irepository41325 irepository41325;
	@Autowired private Irepository41352 irepository41352;
	@Autowired private Irepository41523 irepository41523;
	@Autowired private Irepository41532 irepository41532;
	@Autowired private Irepository42135 irepository42135;
	@Autowired private Irepository42153 irepository42153;
	@Autowired private Irepository42315 irepository42315;
	@Autowired private Irepository42351 irepository42351;
	@Autowired private Irepository42513 irepository42513;
	@Autowired private Irepository42531 irepository42531;
	@Autowired private Irepository43125 irepository43125;
	@Autowired private Irepository43152 irepository43152;
	@Autowired private Irepository43215 irepository43215;
	@Autowired private Irepository43251 irepository43251;
	@Autowired private Irepository43512 irepository43512;
	@Autowired private Irepository43521 irepository43521;
	@Autowired private Irepository45123 irepository45123;
	@Autowired private Irepository45132 irepository45132;
	@Autowired private Irepository45213 irepository45213;
	@Autowired private Irepository45231 irepository45231;
	@Autowired private Irepository45312 irepository45312;
	@Autowired private Irepository45321 irepository45321;
	@Autowired private Irepository51234 irepository51234;
	@Autowired private Irepository51243 irepository51243;
	@Autowired private Irepository51324 irepository51324;
	@Autowired private Irepository51342 irepository51342;
	@Autowired private Irepository51423 irepository51423;
	@Autowired private Irepository51432 irepository51432;
	@Autowired private Irepository52134 irepository52134;
	@Autowired private Irepository52143 irepository52143;
	@Autowired private Irepository52314 irepository52314;
	@Autowired private Irepository52341 irepository52341;
	@Autowired private Irepository52413 irepository52413;
	@Autowired private Irepository52431 irepository52431;
	@Autowired private Irepository53124 irepository53124;
	@Autowired private Irepository53142 irepository53142;
	@Autowired private Irepository53214 irepository53214;
	@Autowired private Irepository53241 irepository53241;
	@Autowired private Irepository53412 irepository53412;
	@Autowired private Irepository53421 irepository53421;
	@Autowired private Irepository54123 irepository54123;
	@Autowired private Irepository54132 irepository54132;
	@Autowired private Irepository54213 irepository54213;
	@Autowired private Irepository54231 irepository54231;
	@Autowired private Irepository54312 irepository54312;
	@Autowired private Irepository54321 irepository54321;

	// para o esquema fie gravar em banco

	// *******************************************************************************8
	public String gravarEsq14325(List<FieEsq14325> esquemas) {
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

	public String gravarEsq14352(List<FieEsq14352> esquemas) {
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

	public String gravarEsq14253(List<FieEsq14253> esquemas) {
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

	public String gravarEsq51522(List<FieEsq14523> esquemas) {
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

	public String gravarEsq14235(List<FieEsq14235> esquemas) {//
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

	public String gravarEsq14532(List<FieEsq14532> esquemas) {//
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

	public String gravarEsq13425(List<FieEsq13425> esquemas) {//
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

	public String gravarEsq13452(List<FieEsq13452> esquemas) {//
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

	public String gravarEsq13245(List<FieEsq13245> esquemas) {//
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

	public String gravarEsq13254(List<FieEsq13254> esquemas) {//
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

	public String gravarEsq13542(List<FieEsq13542> esquemas) {//
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

	public String gravarEsq13524(List<FieEsq13524> esquemas) {//
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

	public String gravarEsq12435(List<FieEsq12435> esquemas) {//
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

	public String gravarEsq12453(List<FieEsq12453> esquemas) {//
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

	public String gravarEsq12345(List<FieEsq12345> esquemas) {//
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

	public String gravarEsq12354(List<FieEsq12354> esquemas) {//
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

	public String gravarEsq12543(List<FieEsq12543> esquemas) {//
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

	public String gravarEsq12534(List<FieEsq12534> esquemas) {//
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

	public String gravarEsq15432(List<FieEsq15432> esquemas) {//
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

	public String gravarEsq15423(List<FieEsq15423> esquemas) {//
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

	public String gravarEsq15342(List<FieEsq15342> esquemas) {//
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

	public String gravarEsq15324(List<FieEsq15324> esquemas) {//
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
	public String gravarEsq14523(List<FieEsq14523> esquemas) {//
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
	public String gravarEsq15243(List<FieEsq15243> esquemas) {//
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

	public String gravarEsq15234(List<FieEsq15234> esquemas) {//
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

	public String gravarEsq24315(List<FieEsq24315> esquemas) {//
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

	public String gravarEsq24351(List<FieEsq24351> esquemas) {//
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

	public String gravarEsq24153(List<FieEsq24153> esquemas) {//
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

	public String gravarEsq24513(List<FieEsq24513> esquemas) {//
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

	public String gravarEsq24135(List<FieEsq24135> esquemas) {//
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

	public String gravarEsq24531(List<FieEsq24531> esquemas) {//
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

	public String gravarEsq23415(List<FieEsq23415> esquemas) {
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

	public String gravarEsq23451(List<FieEsq23451> esquemas) {
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

	public String gravarEsq23145(List<FieEsq23145> esquemas) {
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

	public String gravarEsq23154(List<FieEsq23154> esquemas) {
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

	public String gravarEsq23541(List<FieEsq23541> esquemas) {//
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

	public String gravarEsq23514(List<FieEsq23514> esquemas) {//
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

	public String gravarEsq21435(List<FieEsq21435> esquemas) {//
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

	public String gravarEsq21453(List<FieEsq21453> esquemas) {//
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

	public String gravarEsq21345(List<FieEsq21345> esquemas) {//
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

	public String gravarEsq21354(List<FieEsq21354> esquemas) {//
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

	public String gravarEsq21543(List<FieEsq21543> esquemas) {//
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

	public String gravarEsq21534(List<FieEsq21534> esquemas) {//
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

	public String gravarEsq25431(List<FieEsq25431> esquemas) {//
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

	public String gravarEsq25413(List<FieEsq25413> esquemas) {//
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

	public String gravarEsq25341(List<FieEsq25341> esquemas) {//
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

	public String gravarEsq25314(List<FieEsq25314> esquemas) {//
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

	public String gravarEsq25143(List<FieEsq25143> esquemas) {//
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

	public String gravarEsq25134(List<FieEsq25134> esquemas) {//
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

	public String gravarEsq34215(List<FieEsq34215> esquemas) {//
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

	public String gravarEsq34251(List<FieEsq34251> esquemas) {//
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

	public String gravarEsq34152(List<FieEsq34152> esquemas) {//
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

	public String gravarEsq34512(List<FieEsq34512> esquemas) {//
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

	public String gravarEsq34125(List<FieEsq34125> esquemas) {//
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

	public String gravarEsq34521(List<FieEsq34521> esquemas) {//
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

	public String gravarEsq32415(List<FieEsq32415> esquemas) {//
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

	public String gravarEsq32451(List<FieEsq32451> esquemas) {//
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

	public String gravarEsq32145(List<FieEsq32145> esquemas) {//
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

	public String gravarEsq32154(List<FieEsq32154> esquemas) {//
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

	public String gravarEsq32541(List<FieEsq32541> esquemas) {//
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

	public String gravarEsq32514(List<FieEsq32514> esquemas) {//
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

	public String gravarEsq31425(List<FieEsq31425> esquemas) {
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

	public String gravarEsq31452(List<FieEsq31452> esquemas) {
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

	public String gravarEsq31245(List<FieEsq31245> esquemas) {
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

	public String gravarEsq31254(List<FieEsq31254> esquemas) {
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

	public String gravarEsq31542(List<FieEsq31542> esquemas) {//
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

	public String gravarEsq31524(List<FieEsq31524> esquemas) {//
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

	public String gravarEsq35421(List<FieEsq35421> esquemas) {//
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

	public String gravarEsq35412(List<FieEsq35412> esquemas) {//
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

	public String gravarEsq35241(List<FieEsq35241> esquemas) {//
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

	public String gravarEsq35214(List<FieEsq35214> esquemas) {//
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

	public String gravarEsq35142(List<FieEsq35142> esquemas) {//
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

	public String gravarEsq35124(List<FieEsq35124> esquemas) {//
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

	public String gravarEsq43215(List<FieEsq43215> esquemas) {//
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

	public String gravarEsq43251(List<FieEsq43251> esquemas) {//
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

	public String gravarEsq43152(List<FieEsq43152> esquemas) {//
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

	public String gravarEsq43512(List<FieEsq43512> esquemas) {//
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

	public String gravarEsq43125(List<FieEsq43125> esquemas) {//
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

	public String gravarEsq43521(List<FieEsq43521> esquemas) {//
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

	public String gravarEsq42315(List<FieEsq42315> esquemas) {//
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

	public String gravarEsq42351(List<FieEsq42351> esquemas) {//
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

	public String gravarEsq42135(List<FieEsq42135> esquemas) {//
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

	public String gravarEsq42153(List<FieEsq42153> esquemas) {//
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

	public String gravarEsq42531(List<FieEsq42531> esquemas) {//
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

	public String gravarEsq42513(List<FieEsq42513> esquemas) {//
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

	public String gravarEsq41325(List<FieEsq41325> esquemas) {//
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

	public String gravarEsq41352(List<FieEsq41352> esquemas) {//
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

	public String gravarEsq41235(List<FieEsq41235> esquemas) {//
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

	public String gravarEsq41253(List<FieEsq41253> esquemas) {//
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

	public String gravarEsq41532(List<FieEsq41532> esquemas) {//
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

	public String gravarEsq41523(List<FieEsq41523> esquemas) {//
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

	public String gravarEsq45321(List<FieEsq45321> esquemas) {
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

	public String gravarEsq24342(List<FieEsq45312> esquemas) {
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
	public String gravarEsq45312(List<FieEsq45312> esquemas) {
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

	public String gravarEsq45231(List<FieEsq45231> esquemas) {
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

	public String gravarEsq45213(List<FieEsq45213> esquemas) {
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

	public String gravarEsq45132(List<FieEsq45132> esquemas) {//
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

	public String gravarEsq45123(List<FieEsq45123> esquemas) {//
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

	public String gravarEsq54321(List<FieEsq54321> esquemas) {//
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

	public String gravarEsq54312(List<FieEsq54312> esquemas) {//
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

	public String gravarEsq54213(List<FieEsq54213> esquemas) {//
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

	public String gravarEsq54123(List<FieEsq54123> esquemas) {//
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

	public String gravarEsq54231(List<FieEsq54231> esquemas) {//
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

	public String gravarEsq54132(List<FieEsq54132> esquemas) {//
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

	public String gravarEsq53421(List<FieEsq53421> esquemas) {//
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

	public String gravarEsq53412(List<FieEsq53412> esquemas) {//
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

	public String gravarEsq53241(List<FieEsq53241> esquemas) {//
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

	public String gravarEsq53214(List<FieEsq53214> esquemas) {//
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

	public String gravarEsq53142(List<FieEsq53142> esquemas) {//
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

	public String gravarEsq53124(List<FieEsq53124> esquemas) {//
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

	public String gravarEsq52431(List<FieEsq52431> esquemas) {//
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

	public String gravarEsq52413(List<FieEsq52413> esquemas) {//
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

	public String gravarEsq52341(List<FieEsq52341> esquemas) {//
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

	public String gravarEsq52314(List<FieEsq52314> esquemas) {//
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

	public String gravarEsq52143(List<FieEsq52143> esquemas) {//
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

	public String gravarEsq52134(List<FieEsq52134> esquemas) {//
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

	public String gravarEsq51432(List<FieEsq51432> esquemas) {//
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

	public String gravarEsq51423(List<FieEsq51423> esquemas) {//
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

	public String gravarEsq51342(List<FieEsq51342> esquemas) {//
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

	public String gravarEsq51324(List<FieEsq51324> esquemas) {//
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

	public String gravarEsq51243(List<FieEsq51243> esquemas) {//
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

	public String gravarEsq51234(List<FieEsq51234> esquemas) {//
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

	// para listar em tela 14325

	public List<FieEsq14325> listarFieEsq14325(String filtro) {
		String consulta = "select l from FieEsq14325 l where l.numEsq14325 like :nuncerc";
		TypedQuery<FieEsq14325> query = manager.createQuery(consulta, FieEsq14325.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 14352

	public List<FieEsq14352> listarFieEsq14352(String filtro) {
		String consulta = "select l from FieEsq14352 l where l.numEsq14352 like :nuncerc";
		TypedQuery<FieEsq14352> query = manager.createQuery(consulta, FieEsq14352.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 14253

	public List<FieEsq14253> listarFieEsq14253(String filtro) {
		String consulta = "select l from FieEsq14253 l where l.numEsq14253 like :nuncerc";
		TypedQuery<FieEsq14253> query = manager.createQuery(consulta, FieEsq14253.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 51522

	public List<FieEsq51522> listarFieEsq51522(String filtro) {
		String consulta = "select l from FieEsq14523l where l.numEsq14523like :nuncerc";
		TypedQuery<FieEsq51522> query = manager.createQuery(consulta, FieEsq51522.class).setMaxResults(10);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// ************************************************************************************************************************

	public List<FieEsq24531> listarFieEsq24531(String filtro) {
		String consulta = "select l from FieEsq24531 l where l.numEsq24531 like :nuncerc";
		TypedQuery<FieEsq24531> query = manager.createQuery(consulta, FieEsq24531.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq24513> listarFieEsq24513(String filtro) {
		String consulta = "select l from FieEsq24513 l where l.numEsq24513 like :nuncerc";
		TypedQuery<FieEsq24513> query = manager.createQuery(consulta, FieEsq24513.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq24153> listarFieEsq24153(String filtro) {
		String consulta = "select l from FieEsq24153 l where l.numEsq24153 like :nuncerc";
		TypedQuery<FieEsq24153> query = manager.createQuery(consulta, FieEsq24153.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq24351> listarFieEsq24351(String filtro) {
		String consulta = "select l from FieEsq24351 l where l.numEsq24351 like :nuncerc";
		TypedQuery<FieEsq24351> query = manager.createQuery(consulta, FieEsq24351.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq24315> listarFieEsq24315(String filtro) {
		String consulta = "select l from FieEsq24315 l where l.numEsq24315 like :nuncerc";
		TypedQuery<FieEsq24315> query = manager.createQuery(consulta, FieEsq24315.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15234> listarFieEsq15234(String filtro) {
		String consulta = "select l from FieEsq15234 l where l.numEsq15234 like :nuncerc";
		TypedQuery<FieEsq15234> query = manager.createQuery(consulta, FieEsq15234.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15243> listarFieEsq15243(String filtro) {
		String consulta = "select l from FieEsq15243 l where l.numEsq15243 like :nuncerc";
		TypedQuery<FieEsq15243> query = manager.createQuery(consulta, FieEsq15243.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15324> listarFieEsq15324(String filtro) {
		String consulta = "select l from FieEsq15324 l where l.numEsq15324 like :nuncerc";
		TypedQuery<FieEsq15324> query = manager.createQuery(consulta, FieEsq15324.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15342> listarFieEsq15342(String filtro) {
		String consulta = "select l from FieEsq15342 l where l.numEsq15342 like :nuncerc";
		TypedQuery<FieEsq15342> query = manager.createQuery(consulta, FieEsq15342.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15423> listarFieEsq15423(String filtro) {
		String consulta = "select l from FieEsq15423 l where l.numEsq15423 like :nuncerc";
		TypedQuery<FieEsq15423> query = manager.createQuery(consulta, FieEsq15423.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq15432> listarFieEsq15432(String filtro) {
		String consulta = "select l from FieEsq15432 l where l.numEsq15432 like :nuncerc";
		TypedQuery<FieEsq15432> query = manager.createQuery(consulta, FieEsq15432.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12534> listarFieEsq12534(String filtro) {
		String consulta = "select l from FieEsq12534 l where l.numEsq12534 like :nuncerc";
		TypedQuery<FieEsq12534> query = manager.createQuery(consulta, FieEsq12534.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12543> listarFieEsq12543(String filtro) {
		String consulta = "select l from FieEsq12543 l where l.numEsq12543 like :nuncerc";
		TypedQuery<FieEsq12543> query = manager.createQuery(consulta, FieEsq12543.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12354> listarFieEsq12354(String filtro) {
		String consulta = "select l from FieEsq12354 l where l.numEsq12354 like :nuncerc";
		TypedQuery<FieEsq12354> query = manager.createQuery(consulta, FieEsq12354.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12345> listarFieEsq12345(String filtro) {
		String consulta = "select l from FieEsq12345 l where l.numEsq12345 like :nuncerc";
		TypedQuery<FieEsq12345> query = manager.createQuery(consulta, FieEsq12345.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12453> listarFieEsq12453(String filtro) {
		String consulta = "select l from FieEsq12453 l where l.numEsq12453 like :nuncerc";
		TypedQuery<FieEsq12453> query = manager.createQuery(consulta, FieEsq12453.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq12435> listarFieEsq12435(String filtro) {
		String consulta = "select l from FieEsq12435 l where l.numEsq12435 like :nuncerc";
		TypedQuery<FieEsq12435> query = manager.createQuery(consulta, FieEsq12435.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13524> listarFieEsq13524(String filtro) {
		String consulta = "select l from FieEsq13524 l where l.numEsq13524 like :nuncerc";
		TypedQuery<FieEsq13524> query = manager.createQuery(consulta, FieEsq13524.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13542> listarFieEsq13542(String filtro) {
		String consulta = "select l from FieEsq13542 l where l.numEsq13542 like :nuncerc";
		TypedQuery<FieEsq13542> query = manager.createQuery(consulta, FieEsq13542.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13254> listarFieEsq13254(String filtro) {
		String consulta = "select l from FieEsq13254 l where l.numEsq13254 like :nuncerc";
		TypedQuery<FieEsq13254> query = manager.createQuery(consulta, FieEsq13254.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13245> listarFieEsq13245(String filtro) {
		String consulta = "select l from FieEsq13245 l where l.numEsq13245 like :nuncerc";
		TypedQuery<FieEsq13245> query = manager.createQuery(consulta, FieEsq13245.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13452> listarFieEsq13452(String filtro) {
		String consulta = "select l from FieEsq13452 l where l.numEsq13452 like :nuncerc";
		TypedQuery<FieEsq13452> query = manager.createQuery(consulta, FieEsq13452.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq13425> listarFieEsq13425(String filtro) {
		String consulta = "select l from FieEsq13425 l where l.numEsq13425 like :nuncerc";
		TypedQuery<FieEsq13425> query = manager.createQuery(consulta, FieEsq13425.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq14532> listarFieEsq14532(String filtro) {
		String consulta = "select l from FieEsq14532 l where l.numEsq14532 like :nuncerc";
		TypedQuery<FieEsq14532> query = manager.createQuery(consulta, FieEsq14532.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq14235> listarFieEsq14235(String filtro) {
		String consulta = "select l from FieEsq14235 l where l.numEsq14235 like :nuncerc";
		TypedQuery<FieEsq14235> query = manager.createQuery(consulta, FieEsq14235.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq23415> listarFieEsq23415(String filtro) {
		String consulta = "select l from FieEsq23415 l where l.numEsq23415 like :nuncerc";
		TypedQuery<FieEsq23415> query = manager.createQuery(consulta, FieEsq23415.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 23451

	public List<FieEsq23451> listarFieEsq23451(String filtro) {
		String consulta = "select l from FieEsq23451 l where l.numEsq23451 like :nuncerc";
		TypedQuery<FieEsq23451> query = manager.createQuery(consulta, FieEsq23451.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 23145

	public List<FieEsq23145> listarFieEsq23145(String filtro) {
		String consulta = "select l from FieEsq23145 l where l.numEsq23145 like :nuncerc";
		TypedQuery<FieEsq23145> query = manager.createQuery(consulta, FieEsq23145.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 23154

	public List<FieEsq23154> listarFieEsq23154(String filtro) {
		String consulta = "select l from FieEsq23154 l where l.numEsq23154 like :nuncerc";
		TypedQuery<FieEsq23154> query = manager.createQuery(consulta, FieEsq23154.class).setMaxResults(10);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// ************************************************************************************************************************

	public List<FieEsq32514> listarFieEsq32514(String filtro) {
		String consulta = "select l from FieEsq32514 l where l.numEsq32514 like :nuncerc";
		TypedQuery<FieEsq32514> query = manager.createQuery(consulta, FieEsq32514.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq32541> listarFieEsq32541(String filtro) {
		String consulta = "select l from FieEsq32541 l where l.numEsq32541 like :nuncerc";
		TypedQuery<FieEsq32541> query = manager.createQuery(consulta, FieEsq32541.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq32154> listarFieEsq32154(String filtro) {
		String consulta = "select l from FieEsq32154 l where l.numEsq32154 like :nuncerc";
		TypedQuery<FieEsq32154> query = manager.createQuery(consulta, FieEsq32154.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq32145> listarFieEsq32145(String filtro) {
		String consulta = "select l from FieEsq32145 l where l.numEsq32145 like :nuncerc";
		TypedQuery<FieEsq32145> query = manager.createQuery(consulta, FieEsq32145.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq32451> listarFieEsq32451(String filtro) {
		String consulta = "select l from FieEsq32451 l where l.numEsq32451 like :nuncerc";
		TypedQuery<FieEsq32451> query = manager.createQuery(consulta, FieEsq32451.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq32415> listarFieEsq32415(String filtro) {
		String consulta = "select l from FieEsq32415 l where l.numEsq32415 like :nuncerc";
		TypedQuery<FieEsq32415> query = manager.createQuery(consulta, FieEsq32415.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34521> listarFieEsq34521(String filtro) {
		String consulta = "select l from FieEsq34521 l where l.numEsq34521 like :nuncerc";
		TypedQuery<FieEsq34521> query = manager.createQuery(consulta, FieEsq34521.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34125> listarFieEsq34125(String filtro) {
		String consulta = "select l from FieEsq34125 l where l.numEsq34125 like :nuncerc";
		TypedQuery<FieEsq34125> query = manager.createQuery(consulta, FieEsq34125.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34512> listarFieEsq34512(String filtro) {
		String consulta = "select l from FieEsq34512 l where l.numEsq34512 like :nuncerc";
		TypedQuery<FieEsq34512> query = manager.createQuery(consulta, FieEsq34512.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34152> listarFieEsq34152(String filtro) {
		String consulta = "select l from FieEsq34152 l where l.numEsq34152 like :nuncerc";
		TypedQuery<FieEsq34152> query = manager.createQuery(consulta, FieEsq34152.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34251> listarFieEsq34251(String filtro) {
		String consulta = "select l from FieEsq34251 l where l.numEsq34251 like :nuncerc";
		TypedQuery<FieEsq34251> query = manager.createQuery(consulta, FieEsq34251.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq34215> listarFieEsq34215(String filtro) {
		String consulta = "select l from FieEsq34215 l where l.numEsq34215 like :nuncerc";
		TypedQuery<FieEsq34215> query = manager.createQuery(consulta, FieEsq34215.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25134> listarFieEsq25134(String filtro) {
		String consulta = "select l from FieEsq25134 l where l.numEsq25134 like :nuncerc";
		TypedQuery<FieEsq25134> query = manager.createQuery(consulta, FieEsq25134.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25143> listarFieEsq25143(String filtro) {
		String consulta = "select l from FieEsq25143 l where l.numEsq25143 like :nuncerc";
		TypedQuery<FieEsq25143> query = manager.createQuery(consulta, FieEsq25143.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25314> listarFieEsq25314(String filtro) {
		String consulta = "select l from FieEsq25314 l where l.numEsq25314 like :nuncerc";
		TypedQuery<FieEsq25314> query = manager.createQuery(consulta, FieEsq25314.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25341> listarFieEsq25341(String filtro) {
		String consulta = "select l from FieEsq25341 l where l.numEsq25341 like :nuncerc";
		TypedQuery<FieEsq25341> query = manager.createQuery(consulta, FieEsq25341.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25413> listarFieEsq25413(String filtro) {
		String consulta = "select l from FieEsq25413 l where l.numEsq25413 like :nuncerc";
		TypedQuery<FieEsq25413> query = manager.createQuery(consulta, FieEsq25413.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq25431> listarFieEsq25431(String filtro) {
		String consulta = "select l from FieEsq25431 l where l.numEsq25431 like :nuncerc";
		TypedQuery<FieEsq25431> query = manager.createQuery(consulta, FieEsq25431.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21534> listarFieEsq21534(String filtro) {
		String consulta = "select l from FieEsq21534 l where l.numEsq21534 like :nuncerc";
		TypedQuery<FieEsq21534> query = manager.createQuery(consulta, FieEsq21534.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21543> listarFieEsq21543(String filtro) {
		String consulta = "select l from FieEsq21543 l where l.numEsq21543 like :nuncerc";
		TypedQuery<FieEsq21543> query = manager.createQuery(consulta, FieEsq21543.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21354> listarFieEsq21354(String filtro) {
		String consulta = "select l from FieEsq21354 l where l.numEsq21354 like :nuncerc";
		TypedQuery<FieEsq21354> query = manager.createQuery(consulta, FieEsq21354.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21345> listarFieEsq21345(String filtro) {
		String consulta = "select l from FieEsq21345 l where l.numEsq21345 like :nuncerc";
		TypedQuery<FieEsq21345> query = manager.createQuery(consulta, FieEsq21345.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21453> listarFieEsq21453(String filtro) {
		String consulta = "select l from FieEsq21453 l where l.numEsq21453 like :nuncerc";
		TypedQuery<FieEsq21453> query = manager.createQuery(consulta, FieEsq21453.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq21435> listarFieEsq21435(String filtro) {
		String consulta = "select l from FieEsq21435 l where l.numEsq21435 like :nuncerc";
		TypedQuery<FieEsq21435> query = manager.createQuery(consulta, FieEsq21435.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq23514> listarFieEsq23514(String filtro) {
		String consulta = "select l from FieEsq23514 l where l.numEsq23514 like :nuncerc";
		TypedQuery<FieEsq23514> query = manager.createQuery(consulta, FieEsq23514.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq23541> listarFieEsq23541(String filtro) {
		String consulta = "select l from FieEsq23541 l where l.numEsq23541 like :nuncerc";
		TypedQuery<FieEsq23541> query = manager.createQuery(consulta, FieEsq23541.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq31425> listarFieEsq31425(String filtro) {
		String consulta = "select l from FieEsq31425 l where l.numEsq31425 like :nuncerc";
		TypedQuery<FieEsq31425> query = manager.createQuery(consulta, FieEsq31425.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 31452

	public List<FieEsq31452> listarFieEsq31452(String filtro) {
		String consulta = "select l from FieEsq31452 l where l.numEsq31452 like :nuncerc";
		TypedQuery<FieEsq31452> query = manager.createQuery(consulta, FieEsq31452.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 31245

	public List<FieEsq31245> listarFieEsq31245(String filtro) {
		String consulta = "select l from FieEsq31245 l where l.numEsq31245 like :nuncerc";
		TypedQuery<FieEsq31245> query = manager.createQuery(consulta, FieEsq31245.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 31254

	public List<FieEsq31254> listarFieEsq31254(String filtro) {
		String consulta = "select l from FieEsq31254 l where l.numEsq31254 like :nuncerc";
		TypedQuery<FieEsq31254> query = manager.createQuery(consulta, FieEsq31254.class).setMaxResults(10);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// ************************************************************************************************************************

	public List<FieEsq41523> listarFieEsq41523(String filtro) {
		String consulta = "select l from FieEsq41523 l where l.numEsq41523 like :nuncerc";
		TypedQuery<FieEsq41523> query = manager.createQuery(consulta, FieEsq41523.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq41532> listarFieEsq41532(String filtro) {
		String consulta = "select l from FieEsq41532 l where l.numEsq41532 like :nuncerc";
		TypedQuery<FieEsq41532> query = manager.createQuery(consulta, FieEsq41532.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq41253> listarFieEsq41253(String filtro) {
		String consulta = "select l from FieEsq41253 l where l.numEsq41253 like :nuncerc";
		TypedQuery<FieEsq41253> query = manager.createQuery(consulta, FieEsq41253.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq41235> listarFieEsq41235(String filtro) {
		String consulta = "select l from FieEsq41235 l where l.numEsq41235 like :nuncerc";
		TypedQuery<FieEsq41235> query = manager.createQuery(consulta, FieEsq41235.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq41352> listarFieEsq41352(String filtro) {
		String consulta = "select l from FieEsq41352 l where l.numEsq41352 like :nuncerc";
		TypedQuery<FieEsq41352> query = manager.createQuery(consulta, FieEsq41352.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq41325> listarFieEsq41325(String filtro) {
		String consulta = "select l from FieEsq41325 l where l.numEsq41325 like :nuncerc";
		TypedQuery<FieEsq41325> query = manager.createQuery(consulta, FieEsq41325.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42513> listarFieEsq42513(String filtro) {
		String consulta = "select l from FieEsq42513 l where l.numEsq42513 like :nuncerc";
		TypedQuery<FieEsq42513> query = manager.createQuery(consulta, FieEsq42513.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42531> listarFieEsq42531(String filtro) {
		String consulta = "select l from FieEsq42531 l where l.numEsq42531 like :nuncerc";
		TypedQuery<FieEsq42531> query = manager.createQuery(consulta, FieEsq42531.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42153> listarFieEsq42153(String filtro) {
		String consulta = "select l from FieEsq42153 l where l.numEsq42153 like :nuncerc";
		TypedQuery<FieEsq42153> query = manager.createQuery(consulta, FieEsq42153.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42135> listarFieEsq42135(String filtro) {
		String consulta = "select l from FieEsq42135 l where l.numEsq42135 like :nuncerc";
		TypedQuery<FieEsq42135> query = manager.createQuery(consulta, FieEsq42135.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42351> listarFieEsq42351(String filtro) {
		String consulta = "select l from FieEsq42351 l where l.numEsq42351 like :nuncerc";
		TypedQuery<FieEsq42351> query = manager.createQuery(consulta, FieEsq42351.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq42315> listarFieEsq42315(String filtro) {
		String consulta = "select l from FieEsq42315 l where l.numEsq42315 like :nuncerc";
		TypedQuery<FieEsq42315> query = manager.createQuery(consulta, FieEsq42315.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43521> listarFieEsq43521(String filtro) {
		String consulta = "select l from FieEsq43521 l where l.numEsq43521 like :nuncerc";
		TypedQuery<FieEsq43521> query = manager.createQuery(consulta, FieEsq43521.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43125> listarFieEsq43125(String filtro) {
		String consulta = "select l from FieEsq43125 l where l.numEsq43125 like :nuncerc";
		TypedQuery<FieEsq43125> query = manager.createQuery(consulta, FieEsq43125.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43512> listarFieEsq43512(String filtro) {
		String consulta = "select l from FieEsq43512 l where l.numEsq43512 like :nuncerc";
		TypedQuery<FieEsq43512> query = manager.createQuery(consulta, FieEsq43512.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43152> listarFieEsq43152(String filtro) {
		String consulta = "select l from FieEsq43152 l where l.numEsq43152 like :nuncerc";
		TypedQuery<FieEsq43152> query = manager.createQuery(consulta, FieEsq43152.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43251> listarFieEsq43251(String filtro) {
		String consulta = "select l from FieEsq43251 l where l.numEsq43251 like :nuncerc";
		TypedQuery<FieEsq43251> query = manager.createQuery(consulta, FieEsq43251.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq43215> listarFieEsq43215(String filtro) {
		String consulta = "select l from FieEsq43215 l where l.numEsq43215 like :nuncerc";
		TypedQuery<FieEsq43215> query = manager.createQuery(consulta, FieEsq43215.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35124> listarFieEsq35124(String filtro) {
		String consulta = "select l from FieEsq35124 l where l.numEsq35124 like :nuncerc";
		TypedQuery<FieEsq35124> query = manager.createQuery(consulta, FieEsq35124.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35142> listarFieEsq35142(String filtro) {
		String consulta = "select l from FieEsq35142 l where l.numEsq35142 like :nuncerc";
		TypedQuery<FieEsq35142> query = manager.createQuery(consulta, FieEsq35142.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35214> listarFieEsq35214(String filtro) {
		String consulta = "select l from FieEsq35214 l where l.numEsq35214 like :nuncerc";
		TypedQuery<FieEsq35214> query = manager.createQuery(consulta, FieEsq35214.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35241> listarFieEsq35241(String filtro) {
		String consulta = "select l from FieEsq35241 l where l.numEsq35241 like :nuncerc";
		TypedQuery<FieEsq35241> query = manager.createQuery(consulta, FieEsq35241.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35412> listarFieEsq35412(String filtro) {
		String consulta = "select l from FieEsq35412 l where l.numEsq35412 like :nuncerc";
		TypedQuery<FieEsq35412> query = manager.createQuery(consulta, FieEsq35412.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq35421> listarFieEsq35421(String filtro) {
		String consulta = "select l from FieEsq35421 l where l.numEsq35421 like :nuncerc";
		TypedQuery<FieEsq35421> query = manager.createQuery(consulta, FieEsq35421.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq31524> listarFieEsq31524(String filtro) {
		String consulta = "select l from FieEsq31524 l where l.numEsq31524 like :nuncerc";
		TypedQuery<FieEsq31524> query = manager.createQuery(consulta, FieEsq31524.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq31542> listarFieEsq31542(String filtro) {
		String consulta = "select l from FieEsq31542 l where l.numEsq31542 like :nuncerc";
		TypedQuery<FieEsq31542> query = manager.createQuery(consulta, FieEsq31542.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq45321> listarFieEsq45321(String filtro) {
		String consulta = "select l from FieEsq45321 l where l.numEsq45321 like :nuncerc";
		TypedQuery<FieEsq45321> query = manager.createQuery(consulta, FieEsq45321.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 24342

	public List<FieEsq24342> listarFieEsq24342(String filtro) {
		String consulta = "select l from FieEsq45312l where l.numEsq45312like :nuncerc";
		TypedQuery<FieEsq24342> query = manager.createQuery(consulta, FieEsq24342.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 45231

	public List<FieEsq45231> listarFieEsq45231(String filtro) {
		String consulta = "select l from FieEsq45231 l where l.numEsq45231 like :nuncerc";
		TypedQuery<FieEsq45231> query = manager.createQuery(consulta, FieEsq45231.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// para listar em tela 45213

	public List<FieEsq45213> listarFieEsq45213(String filtro) {
		String consulta = "select l from FieEsq45213 l where l.numEsq45213 like :nuncerc";
		TypedQuery<FieEsq45213> query = manager.createQuery(consulta, FieEsq45213.class).setMaxResults(10);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	// ************************************************************************************************************************

	public List<FieEsq51234> listarFieEsq51234(String filtro) {
		String consulta = "select l from FieEsq51234 l where l.numEsq51234 like :nuncerc";
		TypedQuery<FieEsq51234> query = manager.createQuery(consulta, FieEsq51234.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq51243> listarFieEsq51243(String filtro) {
		String consulta = "select l from FieEsq51243 l where l.numEsq51243 like :nuncerc";
		TypedQuery<FieEsq51243> query = manager.createQuery(consulta, FieEsq51243.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq51324> listarFieEsq51324(String filtro) {
		String consulta = "select l from FieEsq51324 l where l.numEsq51324 like :nuncerc";
		TypedQuery<FieEsq51324> query = manager.createQuery(consulta, FieEsq51324.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq51342> listarFieEsq51342(String filtro) {
		String consulta = "select l from FieEsq51342 l where l.numEsq51342 like :nuncerc";
		TypedQuery<FieEsq51342> query = manager.createQuery(consulta, FieEsq51342.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq51423> listarFieEsq51423(String filtro) {
		String consulta = "select l from FieEsq51423 l where l.numEsq51423 like :nuncerc";
		TypedQuery<FieEsq51423> query = manager.createQuery(consulta, FieEsq51423.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq51432> listarFieEsq51432(String filtro) {
		String consulta = "select l from FieEsq51432 l where l.numEsq51432 like :nuncerc";
		TypedQuery<FieEsq51432> query = manager.createQuery(consulta, FieEsq51432.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52134> listarFieEsq52134(String filtro) {
		String consulta = "select l from FieEsq52134 l where l.numEsq52134 like :nuncerc";
		TypedQuery<FieEsq52134> query = manager.createQuery(consulta, FieEsq52134.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52143> listarFieEsq52143(String filtro) {
		String consulta = "select l from FieEsq52143 l where l.numEsq52143 like :nuncerc";
		TypedQuery<FieEsq52143> query = manager.createQuery(consulta, FieEsq52143.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52314> listarFieEsq52314(String filtro) {
		String consulta = "select l from FieEsq52314 l where l.numEsq52314 like :nuncerc";
		TypedQuery<FieEsq52314> query = manager.createQuery(consulta, FieEsq52314.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52341> listarFieEsq52341(String filtro) {
		String consulta = "select l from FieEsq52341 l where l.numEsq52341 like :nuncerc";
		TypedQuery<FieEsq52341> query = manager.createQuery(consulta, FieEsq52341.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52413> listarFieEsq52413(String filtro) {
		String consulta = "select l from FieEsq52413 l where l.numEsq52413 like :nuncerc";
		TypedQuery<FieEsq52413> query = manager.createQuery(consulta, FieEsq52413.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq52431> listarFieEsq52431(String filtro) {
		String consulta = "select l from FieEsq52431 l where l.numEsq52431 like :nuncerc";
		TypedQuery<FieEsq52431> query = manager.createQuery(consulta, FieEsq52431.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53124> listarFieEsq53124(String filtro) {
		String consulta = "select l from FieEsq53124 l where l.numEsq53124 like :nuncerc";
		TypedQuery<FieEsq53124> query = manager.createQuery(consulta, FieEsq53124.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53142> listarFieEsq53142(String filtro) {
		String consulta = "select l from FieEsq53142 l where l.numEsq53142 like :nuncerc";
		TypedQuery<FieEsq53142> query = manager.createQuery(consulta, FieEsq53142.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53214> listarFieEsq53214(String filtro) {
		String consulta = "select l from FieEsq53214 l where l.numEsq53214 like :nuncerc";
		TypedQuery<FieEsq53214> query = manager.createQuery(consulta, FieEsq53214.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53241> listarFieEsq53241(String filtro) {
		String consulta = "select l from FieEsq53241 l where l.numEsq53241 like :nuncerc";
		TypedQuery<FieEsq53241> query = manager.createQuery(consulta, FieEsq53241.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53412> listarFieEsq53412(String filtro) {
		String consulta = "select l from FieEsq53412 l where l.numEsq53412 like :nuncerc";
		TypedQuery<FieEsq53412> query = manager.createQuery(consulta, FieEsq53412.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq53421> listarFieEsq53421(String filtro) {
		String consulta = "select l from FieEsq53421 l where l.numEsq53421 like :nuncerc";
		TypedQuery<FieEsq53421> query = manager.createQuery(consulta, FieEsq53421.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54132> listarFieEsq54132(String filtro) {
		String consulta = "select l from FieEsq54132 l where l.numEsq54132 like :nuncerc";
		TypedQuery<FieEsq54132> query = manager.createQuery(consulta, FieEsq54132.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54231> listarFieEsq54231(String filtro) {
		String consulta = "select l from FieEsq54231 l where l.numEsq54231 like :nuncerc";
		TypedQuery<FieEsq54231> query = manager.createQuery(consulta, FieEsq54231.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54123> listarFieEsq54123(String filtro) {
		String consulta = "select l from FieEsq54123 l where l.numEsq54123 like :nuncerc";
		TypedQuery<FieEsq54123> query = manager.createQuery(consulta, FieEsq54123.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54213> listarFieEsq54213(String filtro) {
		String consulta = "select l from FieEsq54213 l where l.numEsq54213 like :nuncerc";
		TypedQuery<FieEsq54213> query = manager.createQuery(consulta, FieEsq54213.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54312> listarFieEsq54312(String filtro) {
		String consulta = "select l from FieEsq54312 l where l.numEsq54312 like :nuncerc";
		TypedQuery<FieEsq54312> query = manager.createQuery(consulta, FieEsq54312.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq54321> listarFieEsq54321(String filtro) {
		String consulta = "select l from FieEsq54321 l where l.numEsq54321 like :nuncerc";
		TypedQuery<FieEsq54321> query = manager.createQuery(consulta, FieEsq54321.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq45123> listarFieEsq45123(String filtro) {
		String consulta = "select l from FieEsq45123 l where l.numEsq45123 like :nuncerc";
		TypedQuery<FieEsq45123> query = manager.createQuery(consulta, FieEsq45123.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}

	public List<FieEsq45132> listarFieEsq45132(String filtro) {
		String consulta = "select l from FieEsq45132 l where l.numEsq45132 like :nuncerc";
		TypedQuery<FieEsq45132> query = manager.createQuery(consulta, FieEsq45132.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}
	public List<FieEsq45312> listarFieEsq45312(String filtro) {
		String consulta = "select l from FieEsq45312 l where l.numEsq45312 like :nuncerc";
		TypedQuery<FieEsq45312> query = manager.createQuery(consulta, FieEsq45312.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}
	public List<FieEsq14523> listarFieEsq14523(String filtro) {
		String consulta = "select l from FieEsq14523 l where l.numEsq14523 like :nuncerc";
		TypedQuery<FieEsq14523> query = manager.createQuery(consulta, FieEsq14523.class).setMaxResults(limite);
		query.setParameter("nuncerc", "%" + filtro + "%");
		return query.getResultList();
	}
	

}
