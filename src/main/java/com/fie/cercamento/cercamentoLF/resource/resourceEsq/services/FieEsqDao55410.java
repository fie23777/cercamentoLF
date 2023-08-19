package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository01455;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository01545;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository01554;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository04155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository04515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository04551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05145;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05154;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05415;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05451;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05514;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository05541;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository10455;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository10545;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository10554;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository14055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository14505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository14550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository15540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository40155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository40515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository40551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository41055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository41505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository41550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45015;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45051;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45105;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45150;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45501;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository45510;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50145;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50154;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50415;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50451;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50514;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository50541;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository51540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54015;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54051;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54105;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54150;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54501;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository54510;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55014;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55041;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55104;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55140;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55401;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55410.Irepository55410;

import jakarta.saveAllence.EntityManager;
import jakarta.saveAllence.saveAllenceContext;
import jakarta.saveAllence.TypedQuery;

@Transactional
public class FieEsqDao55410 {
	@saveAllenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository01455 irepository01455;
	@Autowired private Irepository01545 irepository01545;
	@Autowired private Irepository01554 irepository01554;
	@Autowired private Irepository04155 irepository04155;
	@Autowired private Irepository04515 irepository04515;
	@Autowired private Irepository04551 irepository04551;
	@Autowired private Irepository05145 irepository05145;
	@Autowired private Irepository05154 irepository05154;
	@Autowired private Irepository05415 irepository05415;
	@Autowired private Irepository05451 irepository05451;
	@Autowired private Irepository05514 irepository05514;
	@Autowired private Irepository05541 irepository05541;
	@Autowired private Irepository10455 irepository10455;
	@Autowired private Irepository10545 irepository10545;
	@Autowired private Irepository10554 irepository10554;
	@Autowired private Irepository14055 irepository14055;
	@Autowired private Irepository14505 irepository14505;
	@Autowired private Irepository14550 irepository14550;
	@Autowired private Irepository15045 irepository15045;
	@Autowired private Irepository15054 irepository15054;
	@Autowired private Irepository15405 irepository15405;
	@Autowired private Irepository15450 irepository15450;
	@Autowired private Irepository15504 irepository15504;
	@Autowired private Irepository15540 irepository15540;
	@Autowired private Irepository40155 irepository40155;
	@Autowired private Irepository40515 irepository40515;
	@Autowired private Irepository40551 irepository40551;
	@Autowired private Irepository41055 irepository41055;
	@Autowired private Irepository41505 irepository41505;
	@Autowired private Irepository41550 irepository41550;
	@Autowired private Irepository45015 irepository45015;
	@Autowired private Irepository45051 irepository45051;
	@Autowired private Irepository45105 irepository45105;
	@Autowired private Irepository45150 irepository45150;
	@Autowired private Irepository45501 irepository45501;
	@Autowired private Irepository45510 irepository45510;
	@Autowired private Irepository50145 irepository50145;
	@Autowired private Irepository50154 irepository50154;
	@Autowired private Irepository50415 irepository50415;
	@Autowired private Irepository50451 irepository50451;
	@Autowired private Irepository50514 irepository50514;
	@Autowired private Irepository50541 irepository50541;
	@Autowired private Irepository51045 irepository51045;
	@Autowired private Irepository51054 irepository51054;
	@Autowired private Irepository51405 irepository51405;
	@Autowired private Irepository51450 irepository51450;
	@Autowired private Irepository51504 irepository51504;
	@Autowired private Irepository51540 irepository51540;
	@Autowired private Irepository54015 irepository54015;
	@Autowired private Irepository54051 irepository54051;
	@Autowired private Irepository54105 irepository54105;
	@Autowired private Irepository54150 irepository54150;
	@Autowired private Irepository54501 irepository54501;
	@Autowired private Irepository54510 irepository54510;
	@Autowired private Irepository55014 irepository55014;
	@Autowired private Irepository55041 irepository55041;
	@Autowired private Irepository55104 irepository55104;
	@Autowired private Irepository55140 irepository55140;
	@Autowired private Irepository55401 irepository55401;
	@Autowired private Irepository55410 irepository55410;
	
	public void gravarEsq41550(List<FieEsq41550> esquemas){  
		irepository41550.saveAll(esquemas);
	}
	public void gravarEsq41505(List<FieEsq41505> esquemas){
		irepository41505.saveAll(esquemas);
	}
	public void gravarEsq41055(List<FieEsq41055> esquemas){
		irepository41055.saveAll(esquemas);
	}
	public void gravarEsq45150(List<FieEsq45150> esquemas){
		irepository45150.saveAll(esquemas);
	}
	public void gravarEsq45105(List<FieEsq45105> esquemas){//
		irepository45105.saveAll(esquemas);
	}
	public void gravarEsq45510(List<FieEsq45510> esquemas){//
		irepository45510.saveAll(esquemas);
	}
	public void gravarEsq45501(List<FieEsq45501> esquemas){//
		irepository45501.saveAll(esquemas);
	}
	public void gravarEsq40155(List<FieEsq40155> esquemas){//
		irepository40155.saveAll(esquemas);
	}
	public void gravarEsq40515(List<FieEsq40515> esquemas){//
		irepository40515.saveAll(esquemas);
	}
	public void gravarEsq40551(List<FieEsq40551> esquemas){//
		irepository40551.saveAll(esquemas);
	}
	public void gravarEsq45015(List<FieEsq45015> esquemas){//
		irepository45015.saveAll(esquemas);
	}
	public void gravarEsq45051(List<FieEsq45051> esquemas){//
		irepository45051.saveAll(esquemas);
	}
	public void gravarEsq14550(List<FieEsq14550> esquemas){//
		irepository14550.saveAll(esquemas);
	}
	public void gravarEsq14505(List<FieEsq14505> esquemas){//
		irepository14505.saveAll(esquemas);
	}
	public void gravarEsq14055(List<FieEsq14055> esquemas){//
		irepository14055.saveAll(esquemas);
	}
	public void gravarEsq15450(List<FieEsq15450> esquemas){//
		irepository15450.saveAll(esquemas);
	}
	public void gravarEsq15405(List<FieEsq15405> esquemas){//
		irepository15405.saveAll(esquemas);
	}
	public void gravarEsq15540(List<FieEsq15540> esquemas){//
		irepository15540.saveAll(esquemas);
	}
	public void gravarEsq15504(List<FieEsq15504> esquemas){//
		irepository15504.saveAll(esquemas);
	}
	public void gravarEsq15045(List<FieEsq15045> esquemas){//
		irepository15045.saveAll(esquemas);
	}
	public void gravarEsq15054(List<FieEsq15054> esquemas){//
		irepository15054.saveAll(esquemas);
	}
	public void gravarEsq10455(List<FieEsq10455> esquemas){//
		irepository10455.saveAll(esquemas);
	}
	public void gravarEsq10545(List<FieEsq10545> esquemas){//
		irepository10545.saveAll(esquemas);
	}
	public void gravarEsq10554(List<FieEsq10554> esquemas){//
		irepository10554.saveAll(esquemas);	
	}
	public void gravarEsq54150(List<FieEsq54150> esquemas){//
		irepository54150.saveAll(esquemas);
	}
	public void gravarEsq54105(List<FieEsq54105> esquemas){//
		irepository54105.saveAll(esquemas);
	}
	public void gravarEsq54510(List<FieEsq54510> esquemas){//
		irepository54510.saveAll(esquemas);
	}
	public void gravarEsq54501(List<FieEsq54501> esquemas){//
		irepository54501.saveAll(esquemas);
	}
	public void gravarEsq54015(List<FieEsq54015> esquemas){//
		irepository54015.saveAll(esquemas);
	}
	public void gravarEsq54051(List<FieEsq54051> esquemas){//
		irepository54051.saveAll(esquemas);
	}
	public void gravarEsq51450(List<FieEsq51450> esquemas){  
		irepository51450.saveAll(esquemas);
	}
	public void gravarEsq51405(List<FieEsq51405> esquemas){
		irepository51405.saveAll(esquemas);
	}
	public void gravarEsq51540(List<FieEsq51540> esquemas){
		irepository51540.saveAll(esquemas);
	}
	public void gravarEsq51504(List<FieEsq51504> esquemas){
		irepository51504.saveAll(esquemas);
	}
	public void gravarEsq51045(List<FieEsq51045> esquemas){//
		irepository51045.saveAll(esquemas);
	}
	public void gravarEsq51054(List<FieEsq51054> esquemas){//
		irepository51054.saveAll(esquemas);
	}
	public void gravarEsq55410(List<FieEsq55410> esquemas){//
		irepository55410.saveAll(esquemas);
	}
	public void gravarEsq55401(List<FieEsq55401> esquemas){//
		irepository55401.saveAll(esquemas);
	}
	public void gravarEsq55140(List<FieEsq55140> esquemas){//
		irepository55140.saveAll(esquemas);
	}
	public void gravarEsq55104(List<FieEsq55104> esquemas){//
		irepository55104.saveAll(esquemas);
	}
	public void gravarEsq55041(List<FieEsq55041> esquemas){//
		irepository55041.saveAll(esquemas);
	}
	public void gravarEsq55014(List<FieEsq55014> esquemas){//
		irepository55014.saveAll(esquemas);
	}
	public void gravarEsq50415(List<FieEsq50415> esquemas){//
		irepository50415.saveAll(esquemas);
	}
	public void gravarEsq50451(List<FieEsq50451> esquemas){//
		irepository50451.saveAll(esquemas);
	}
	public void gravarEsq50145(List<FieEsq50145> esquemas){//
		irepository50145.saveAll(esquemas);
	}
	public void gravarEsq50154(List<FieEsq50154> esquemas){//
		irepository50154.saveAll(esquemas);
	}
	public void gravarEsq50541(List<FieEsq50541> esquemas){//
		irepository50541.saveAll(esquemas);
	}
	public void gravarEsq50514(List<FieEsq50514> esquemas){//
		irepository50514.saveAll(esquemas);
	}
	public void gravarEsq04155(List<FieEsq04155> esquemas){//
		irepository04155.saveAll(esquemas);
	}
	public void gravarEsq04515(List<FieEsq04515> esquemas){//
		irepository04515.saveAll(esquemas);
	}
	public void gravarEsq04551(List<FieEsq04551> esquemas){//
		irepository04551.saveAll(esquemas);
	}
	public void gravarEsq01455(List<FieEsq01455> esquemas){//
		irepository01455.saveAll(esquemas);
	}
	public void gravarEsq01545(List<FieEsq01545> esquemas){//
		irepository01545.saveAll(esquemas);	
	}
	public void gravarEsq01554(List<FieEsq01554> esquemas){//
		irepository01554.saveAll(esquemas);
	}
	public void gravarEsq05415(List<FieEsq05415> esquemas){//
		irepository05415.saveAll(esquemas);
	}
	public void gravarEsq05451(List<FieEsq05451> esquemas){//
		irepository05451.saveAll(esquemas);
	}
	public void gravarEsq05145(List<FieEsq05145> esquemas){//
		irepository05145.saveAll(esquemas);
	}
	public void gravarEsq05154(List<FieEsq05154> esquemas){//
		irepository05154.saveAll(esquemas);
	}
	public void gravarEsq05541(List<FieEsq05541> esquemas){//
		irepository05541.saveAll(esquemas);	
	}	
	public void gravarEsq05514(List<FieEsq05514> esquemas){//
		irepository05514.saveAll(esquemas);
	}
	
	
	
//para listar em tela 41550
	
	public List<FieEsq41550> listarFieEsq41550(String filtro) {
	       String consulta = "select l from FieEsq41550 l where l.numEsq41550 like :nuncerc";
	          TypedQuery<FieEsq41550> query = manager.createQuery(consulta, FieEsq41550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 41505
	
	public List<FieEsq41505> listarFieEsq41505(String filtro) {
	       String consulta = "select l from FieEsq41505 l where l.numEsq41505 like :nuncerc";
	          TypedQuery<FieEsq41505> query = manager.createQuery(consulta, FieEsq41505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 41055
	
	public List<FieEsq41055> listarFieEsq41055(String filtro) {
	       String consulta = "select l from FieEsq41055 l where l.numEsq41055 like :nuncerc";
	          TypedQuery<FieEsq41055> query = manager.createQuery(consulta, FieEsq41055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 45150
	
	public List<FieEsq45150> listarFieEsq45150(String filtro) {
	       String consulta = "select l from FieEsq45150 l where l.numEsq45150 like :nuncerc";
	          TypedQuery<FieEsq45150> query = manager.createQuery(consulta, FieEsq45150.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq54051> listarFieEsq54051(String filtro) {
	       String consulta = "select l from FieEsq54051 l where l.numEsq54051 like :nuncerc";
	          TypedQuery<FieEsq54051> query = manager.createQuery(consulta, FieEsq54051.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq54015> listarFieEsq54015(String filtro) {
	       String consulta = "select l from FieEsq54015 l where l.numEsq54015 like :nuncerc";
	          TypedQuery<FieEsq54015> query = manager.createQuery(consulta, FieEsq54015.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq54501> listarFieEsq54501(String filtro) {
	       String consulta = "select l from FieEsq54501 l where l.numEsq54501 like :nuncerc";
	          TypedQuery<FieEsq54501> query = manager.createQuery(consulta, FieEsq54501.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq54510> listarFieEsq54510(String filtro) {
	       String consulta = "select l from FieEsq54510 l where l.numEsq54510 like :nuncerc";
	          TypedQuery<FieEsq54510> query = manager.createQuery(consulta, FieEsq54510.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq54105> listarFieEsq54105(String filtro) {
	       String consulta = "select l from FieEsq54105 l where l.numEsq54105 like :nuncerc";
	          TypedQuery<FieEsq54105> query = manager.createQuery(consulta, FieEsq54105.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq54150> listarFieEsq54150(String filtro) {
	       String consulta = "select l from FieEsq54150 l where l.numEsq54150 like :nuncerc";
	          TypedQuery<FieEsq54150> query = manager.createQuery(consulta, FieEsq54150.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq10554> listarFieEsq10554(String filtro) {
	       String consulta = "select l from FieEsq10554 l where l.numEsq10554 like :nuncerc";
	          TypedQuery<FieEsq10554> query = manager.createQuery(consulta, FieEsq10554.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq10545> listarFieEsq10545(String filtro) {
	       String consulta = "select l from FieEsq10545 l where l.numEsq10545 like :nuncerc";
	          TypedQuery<FieEsq10545> query = manager.createQuery(consulta, FieEsq10545.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq10455> listarFieEsq10455(String filtro) {
	       String consulta = "select l from FieEsq10455 l where l.numEsq10455 like :nuncerc";
	          TypedQuery<FieEsq10455> query = manager.createQuery(consulta, FieEsq10455.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15054> listarFieEsq15054(String filtro) {
	       String consulta = "select l from FieEsq15054 l where l.numEsq15054 like :nuncerc";
	          TypedQuery<FieEsq15054> query = manager.createQuery(consulta, FieEsq15054.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15045> listarFieEsq15045(String filtro) {
	       String consulta = "select l from FieEsq15045 l where l.numEsq15045 like :nuncerc";
	          TypedQuery<FieEsq15045> query = manager.createQuery(consulta, FieEsq15045.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15504> listarFieEsq15504(String filtro) {
	       String consulta = "select l from FieEsq15504 l where l.numEsq15504 like :nuncerc";
	          TypedQuery<FieEsq15504> query = manager.createQuery(consulta, FieEsq15504.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15540> listarFieEsq15540(String filtro) {
	       String consulta = "select l from FieEsq15540 l where l.numEsq15540 like :nuncerc";
	          TypedQuery<FieEsq15540> query = manager.createQuery(consulta, FieEsq15540.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15405> listarFieEsq15405(String filtro) {
	       String consulta = "select l from FieEsq15405 l where l.numEsq15405 like :nuncerc";
	          TypedQuery<FieEsq15405> query = manager.createQuery(consulta, FieEsq15405.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15450> listarFieEsq15450(String filtro) {
	       String consulta = "select l from FieEsq15450 l where l.numEsq15450 like :nuncerc";
	          TypedQuery<FieEsq15450> query = manager.createQuery(consulta, FieEsq15450.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14505> listarFieEsq14505(String filtro) {
	       String consulta = "select l from FieEsq14505 l where l.numEsq14505 like :nuncerc";
	          TypedQuery<FieEsq14505> query = manager.createQuery(consulta, FieEsq14505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14550> listarFieEsq14550(String filtro) {
	       String consulta = "select l from FieEsq14550 l where l.numEsq14550 like :nuncerc";
	          TypedQuery<FieEsq14550> query = manager.createQuery(consulta, FieEsq14550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45051> listarFieEsq45051(String filtro) {
	       String consulta = "select l from FieEsq45051 l where l.numEsq45051 like :nuncerc";
	          TypedQuery<FieEsq45051> query = manager.createQuery(consulta, FieEsq45051.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45015> listarFieEsq45015(String filtro) {
	       String consulta = "select l from FieEsq45015 l where l.numEsq45015 like :nuncerc";
	          TypedQuery<FieEsq45015> query = manager.createQuery(consulta, FieEsq45015.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40551> listarFieEsq40551(String filtro) {
	       String consulta = "select l from FieEsq40551 l where l.numEsq40551 like :nuncerc";
	          TypedQuery<FieEsq40551> query = manager.createQuery(consulta, FieEsq40551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40515> listarFieEsq40515(String filtro) {
	       String consulta = "select l from FieEsq40515 l where l.numEsq40515 like :nuncerc";
	          TypedQuery<FieEsq40515> query = manager.createQuery(consulta, FieEsq40515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40155> listarFieEsq40155(String filtro) {
	       String consulta = "select l from FieEsq40155 l where l.numEsq40155 like :nuncerc";
	          TypedQuery<FieEsq40155> query = manager.createQuery(consulta, FieEsq40155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45501> listarFieEsq45501(String filtro) {
	       String consulta = "select l from FieEsq45501 l where l.numEsq45501 like :nuncerc";
	          TypedQuery<FieEsq45501> query = manager.createQuery(consulta, FieEsq45501.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45510> listarFieEsq45510(String filtro) {
	       String consulta = "select l from FieEsq45510 l where l.numEsq45510 like :nuncerc";
	          TypedQuery<FieEsq45510> query = manager.createQuery(consulta, FieEsq45510.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45105> listarFieEsq45105(String filtro) {
	       String consulta = "select l from FieEsq45105 l where l.numEsq45105 like :nuncerc";
	          TypedQuery<FieEsq45105> query = manager.createQuery(consulta, FieEsq45105.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq51450> listarFieEsq51450(String filtro) {
	       String consulta = "select l from FieEsq51450 l where l.numEsq51450 like :nuncerc";
	          TypedQuery<FieEsq51450> query = manager.createQuery(consulta, FieEsq51450.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51405
	
	public List<FieEsq51405> listarFieEsq51405(String filtro) {
	       String consulta = "select l from FieEsq51405 l where l.numEsq51405 like :nuncerc";
	          TypedQuery<FieEsq51405> query = manager.createQuery(consulta, FieEsq51405.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51540
	
	public List<FieEsq51540> listarFieEsq51540(String filtro) {
	       String consulta = "select l from FieEsq51540 l where l.numEsq51540 like :nuncerc";
	          TypedQuery<FieEsq51540> query = manager.createQuery(consulta, FieEsq51540.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51504
	
	public List<FieEsq51504> listarFieEsq51504(String filtro) {
	       String consulta = "select l from FieEsq51504 l where l.numEsq51504 like :nuncerc";
	          TypedQuery<FieEsq51504> query = manager.createQuery(consulta, FieEsq51504.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq05541> listarFieEsq05541(String filtro) {
	       String consulta = "select l from FieEsq05541 l where l.numEsq05541 like :nuncerc";
	          TypedQuery<FieEsq05541> query = manager.createQuery(consulta, FieEsq05541.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05154> listarFieEsq05154(String filtro) {
	       String consulta = "select l from FieEsq05154 l where l.numEsq05154 like :nuncerc";
	          TypedQuery<FieEsq05154> query = manager.createQuery(consulta, FieEsq05154.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05145> listarFieEsq05145(String filtro) {
	       String consulta = "select l from FieEsq05145 l where l.numEsq05145 like :nuncerc";
	          TypedQuery<FieEsq05145> query = manager.createQuery(consulta, FieEsq05145.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05451> listarFieEsq05451(String filtro) {
	       String consulta = "select l from FieEsq05451 l where l.numEsq05451 like :nuncerc";
	          TypedQuery<FieEsq05451> query = manager.createQuery(consulta, FieEsq05451.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05415> listarFieEsq05415(String filtro) {
	       String consulta = "select l from FieEsq05415 l where l.numEsq05415 like :nuncerc";
	          TypedQuery<FieEsq05415> query = manager.createQuery(consulta, FieEsq05415.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq01554> listarFieEsq01554(String filtro) {
	       String consulta = "select l from FieEsq01554 l where l.numEsq01554 like :nuncerc";
	          TypedQuery<FieEsq01554> query = manager.createQuery(consulta, FieEsq01554.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq01545> listarFieEsq01545(String filtro) {
	       String consulta = "select l from FieEsq01545 l where l.numEsq01545 like :nuncerc";
	          TypedQuery<FieEsq01545> query = manager.createQuery(consulta, FieEsq01545.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq01455> listarFieEsq01455(String filtro) {
	       String consulta = "select l from FieEsq01455 l where l.numEsq01455 like :nuncerc";
	          TypedQuery<FieEsq01455> query = manager.createQuery(consulta, FieEsq01455.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04551> listarFieEsq04551(String filtro) {
	       String consulta = "select l from FieEsq04551 l where l.numEsq04551 like :nuncerc";
	          TypedQuery<FieEsq04551> query = manager.createQuery(consulta, FieEsq04551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04515> listarFieEsq04515(String filtro) {
	       String consulta = "select l from FieEsq04515 l where l.numEsq04515 like :nuncerc";
	          TypedQuery<FieEsq04515> query = manager.createQuery(consulta, FieEsq04515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04155> listarFieEsq04155(String filtro) {
	       String consulta = "select l from FieEsq04155 l where l.numEsq04155 like :nuncerc";
	          TypedQuery<FieEsq04155> query = manager.createQuery(consulta, FieEsq04155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50514> listarFieEsq50514(String filtro) {
	       String consulta = "select l from FieEsq50514 l where l.numEsq50514 like :nuncerc";
	          TypedQuery<FieEsq50514> query = manager.createQuery(consulta, FieEsq50514.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50541> listarFieEsq50541(String filtro) {
	       String consulta = "select l from FieEsq50541 l where l.numEsq50541 like :nuncerc";
	          TypedQuery<FieEsq50541> query = manager.createQuery(consulta, FieEsq50541.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50154> listarFieEsq50154(String filtro) {
	       String consulta = "select l from FieEsq50154 l where l.numEsq50154 like :nuncerc";
	          TypedQuery<FieEsq50154> query = manager.createQuery(consulta, FieEsq50154.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50145> listarFieEsq50145(String filtro) {
	       String consulta = "select l from FieEsq50145 l where l.numEsq50145 like :nuncerc";
	          TypedQuery<FieEsq50145> query = manager.createQuery(consulta, FieEsq50145.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14055> listarFieEsq14055(String filtro) {
	       String consulta = "select l from FieEsq14055 l where l.numEsq14055 like :nuncerc";
	          TypedQuery<FieEsq14055> query = manager.createQuery(consulta, FieEsq14055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50451> listarFieEsq50451(String filtro) {
	       String consulta = "select l from FieEsq50451 l where l.numEsq50451 like :nuncerc";
	          TypedQuery<FieEsq50451> query = manager.createQuery(consulta, FieEsq50451.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50415> listarFieEsq50415(String filtro) {
	       String consulta = "select l from FieEsq50415 l where l.numEsq50415 like :nuncerc";
	          TypedQuery<FieEsq50415> query = manager.createQuery(consulta, FieEsq50415.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55014> listarFieEsq55014(String filtro) {
	       String consulta = "select l from FieEsq55014 l where l.numEsq55014 like :nuncerc";
	          TypedQuery<FieEsq55014> query = manager.createQuery(consulta, FieEsq55014.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55041> listarFieEsq55041(String filtro) {
	       String consulta = "select l from FieEsq55041 l where l.numEsq55041 like :nuncerc";
	          TypedQuery<FieEsq55041> query = manager.createQuery(consulta, FieEsq55041.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55104> listarFieEsq55104(String filtro) {
	       String consulta = "select l from FieEsq55104 l where l.numEsq55104 like :nuncerc";
	          TypedQuery<FieEsq55104> query = manager.createQuery(consulta, FieEsq55104.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55140> listarFieEsq55140(String filtro) {
	       String consulta = "select l from FieEsq55140 l where l.numEsq55140 like :nuncerc";
	          TypedQuery<FieEsq55140> query = manager.createQuery(consulta, FieEsq55140.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55401> listarFieEsq55401(String filtro) {
	       String consulta = "select l from FieEsq55401 l where l.numEsq55401 like :nuncerc";
	          TypedQuery<FieEsq55401> query = manager.createQuery(consulta, FieEsq55401.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55410> listarFieEsq55410(String filtro) {
	       String consulta = "select l from FieEsq55410 l where l.numEsq55410 like :nuncerc";
	          TypedQuery<FieEsq55410> query = manager.createQuery(consulta, FieEsq55410.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51054> listarFieEsq51054(String filtro) {
	       String consulta = "select l from FieEsq51054 l where l.numEsq51054 like :nuncerc";
	          TypedQuery<FieEsq51054> query = manager.createQuery(consulta, FieEsq51054.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51045> listarFieEsq51045(String filtro) {
	       String consulta = "select l from FieEsq51045 l where l.numEsq51045 like :nuncerc";
	          TypedQuery<FieEsq51045> query = manager.createQuery(consulta, FieEsq51045.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05514> listarFieEsq05514(String filtro) {
	       String consulta = "select l from FieEsq05514 l where l.numEsq05514 like :nuncerc";
	          TypedQuery<FieEsq05514> query = manager.createQuery(consulta, FieEsq05514.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
