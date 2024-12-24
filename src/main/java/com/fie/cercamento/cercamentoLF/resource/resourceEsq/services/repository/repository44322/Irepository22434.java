package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22434;

@Repository
public interface Irepository22434 extends JpaRepository<FieEsq22434, Integer> {

	boolean existsByNumEsq22434(String numEsq22434);
    
}
