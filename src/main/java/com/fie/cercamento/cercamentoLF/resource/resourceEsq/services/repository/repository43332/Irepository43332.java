package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43332;

@Repository
public interface Irepository43332 extends JpaRepository<FieEsq43332,  Integer> {

	boolean existsByNumEsq43332(String numEsq43332);
    
}
