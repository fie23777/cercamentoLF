package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42324;

@Repository
public interface Irepository42324 extends JpaRepository<FieEsq42324, Integer> {

	boolean existsByNumEsq42324(String numEsq42324);
    
}
