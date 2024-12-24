package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43134;

@Repository
public interface Irepository43134 extends JpaRepository<FieEsq43134, Integer> {

	boolean existsByNumEsq43134(String numEsq43134);
    
}
