package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;

@Repository
public interface Irepository44232 extends JpaRepository<FieEsq44232, Integer> {
	
	boolean existsByNumEsq44232(String numEsq44232);
    
}
