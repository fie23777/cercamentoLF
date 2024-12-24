package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34224;

@Repository
public interface Irepository34224 extends JpaRepository<FieEsq34224, Integer> {

	boolean existsByNumEsq34224(String numEsq34224);
    
}
