package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24432;

@Repository
public interface Irepository24432 extends JpaRepository<FieEsq24432, Integer> {

	boolean existsByNumEsq24432(String numEsq24432);
    
}
