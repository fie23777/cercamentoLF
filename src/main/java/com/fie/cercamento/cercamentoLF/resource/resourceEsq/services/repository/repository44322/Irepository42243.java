package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42243;

@Repository
public interface Irepository42243 extends JpaRepository<FieEsq42243, Integer> {

	boolean existsByNumEsq42243(String numEsq42243);
    
}
