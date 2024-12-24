package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34323;

@Repository
public interface Irepository34323 extends JpaRepository<FieEsq34323, Integer> {

	boolean existsByNumEsq34323(String numEsq34323);
    
}
