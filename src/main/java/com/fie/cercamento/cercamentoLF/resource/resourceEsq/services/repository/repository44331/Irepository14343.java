package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14343;

@Repository
public interface Irepository14343 extends JpaRepository<FieEsq14343, Integer> {

	boolean existsByNumEsq14343(String numEsq14343);
    
}
