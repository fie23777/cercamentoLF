package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43224;

@Repository
public interface Irepository43224 extends JpaRepository<FieEsq43224, Integer> {

	boolean existsByNumEsq43224(String numEsq43224);
    
}
