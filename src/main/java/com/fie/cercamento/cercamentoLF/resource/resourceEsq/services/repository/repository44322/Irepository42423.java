package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42423;

@Repository
public interface Irepository42423 extends JpaRepository<FieEsq42423, Integer> {

	boolean existsByNumEsq42423(String numEsq42423);
    
}
