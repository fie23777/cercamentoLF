package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34134;

@Repository
public interface Irepository34134 extends JpaRepository<FieEsq34134, Integer> {

	boolean existsByNumEsq34134(String numEsq34134);
    
}
