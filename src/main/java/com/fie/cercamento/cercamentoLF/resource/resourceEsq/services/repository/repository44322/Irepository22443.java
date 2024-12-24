package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22443;

@Repository
public interface Irepository22443 extends JpaRepository<FieEsq22443, Integer> {

	boolean existsByNumEsq22443(String numEsq22443);
    
}
