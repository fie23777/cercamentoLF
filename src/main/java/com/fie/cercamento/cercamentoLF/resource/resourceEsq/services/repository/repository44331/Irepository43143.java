package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43143;

@Repository
public interface Irepository43143 extends JpaRepository<FieEsq43143, Integer> {

	boolean existsByNumEsq43143(String numEsq43143);
    
}
