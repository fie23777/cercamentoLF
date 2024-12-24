package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43341;

@Repository
public interface Irepository43341 extends JpaRepository<FieEsq43341, Integer> {

	boolean existsByNumEsq43341(String numEsq43341);
    
}
