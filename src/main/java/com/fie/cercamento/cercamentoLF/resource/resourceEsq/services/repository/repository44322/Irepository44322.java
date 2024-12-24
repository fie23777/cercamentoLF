package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44322;

@Repository
public interface Irepository44322 extends JpaRepository<FieEsq44322, Integer> {

	boolean existsByNumEsq44322(String numEsq44322);
    
}
