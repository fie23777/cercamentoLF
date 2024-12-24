package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34413;

@Repository
public interface Irepository34413 extends JpaRepository<FieEsq34413, Integer> {

	boolean existsByNumEsq34413(String numEsq34413);
    
}
