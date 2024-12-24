package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43314;

@Repository
public interface Irepository43314 extends JpaRepository<FieEsq43314, Integer> {

	boolean existsByNumEsq43314(String numEsq43314);
    
}
