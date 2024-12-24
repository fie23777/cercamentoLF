package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43242;

@Repository
public interface Irepository43242 extends JpaRepository<FieEsq43242, Integer> {

	boolean existsByNumEsq43242(String numEsq43242);
    
}
