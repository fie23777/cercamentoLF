package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43422;

@Repository
public interface Irepository43422 extends JpaRepository<FieEsq43422, Integer> {

	boolean existsByNumEsq43422(String numEsq43422);
    
}
