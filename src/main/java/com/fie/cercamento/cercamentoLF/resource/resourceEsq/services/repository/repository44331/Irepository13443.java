package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13443;

@Repository
public interface Irepository13443 extends JpaRepository<FieEsq13443, Integer> {

	boolean existsByNumEsq13443(String numEsq13443);
    
}
