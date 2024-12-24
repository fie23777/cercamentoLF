package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34332;

@Repository
public interface Irepository34332 extends JpaRepository<FieEsq34332, Integer> {

	boolean existsByNumEsq34332(String numEsq34332);
    
}
