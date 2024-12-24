package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41334;

@Repository
public interface Irepository41334 extends JpaRepository<FieEsq41334, Integer> {

	boolean existsByNumEsq41334(String numEsq41334);
    
}
