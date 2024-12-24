package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43323;

@Repository
public interface Irepository43323 extends JpaRepository<FieEsq43323, Integer> {

	boolean existsByNumEsq43323(String numEsq43323);
    
}
