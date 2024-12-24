package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14433;

@Repository
public interface Irepository14433 extends JpaRepository<FieEsq14433, Integer> {

	boolean existsByNumEsq14433(String numEsq14433);
    
}
