package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq24333;

@Repository
public interface Irepository24333 extends JpaRepository<FieEsq24333, Integer> {

	boolean existsByNumEsq24333(String numEsq24333);
    
}
