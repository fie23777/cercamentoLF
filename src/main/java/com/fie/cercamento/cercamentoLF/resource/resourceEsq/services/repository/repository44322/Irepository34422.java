package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34422;

@Repository
public interface Irepository34422 extends JpaRepository<FieEsq34422, Integer> {

	boolean existsByNumEsq34422(String numEsq34422);
    
}
