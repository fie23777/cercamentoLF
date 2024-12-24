package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23433;

@Repository
public interface Irepository23433 extends JpaRepository<FieEsq23433, Integer> {

	boolean existsByNumEsq23433(String numEsq23433);
    
}
