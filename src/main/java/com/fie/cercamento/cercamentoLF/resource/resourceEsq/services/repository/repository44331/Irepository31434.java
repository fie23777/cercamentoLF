package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31434;

@Repository
public interface Irepository31434 extends JpaRepository<FieEsq31434, Integer> {

	boolean existsByNumEsq31434(String numEsq31434);
    
}
