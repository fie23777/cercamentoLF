package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23244;

@Repository
public interface Irepository23244 extends JpaRepository<FieEsq23244, Integer> {

	boolean existsByNumEsq23244(String numEsq23244);
    
}
