package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24342;

@Repository
public interface Irepository24342 extends JpaRepository<FieEsq24342, Integer> {

	boolean existsByNumEsq24342(String numEsq24342);

    
}
