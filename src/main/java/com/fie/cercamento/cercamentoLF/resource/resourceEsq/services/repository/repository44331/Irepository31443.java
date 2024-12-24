package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31443;

@Repository
public interface Irepository31443 extends JpaRepository<FieEsq31443, Integer> {

	boolean existsByNumEsq31443(String numEsq31443);
    
}
