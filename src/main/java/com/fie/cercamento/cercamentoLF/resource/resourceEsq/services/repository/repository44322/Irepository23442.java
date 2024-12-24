package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23442;

@Repository
public interface Irepository23442 extends JpaRepository<FieEsq23442, Integer> {

	boolean existsByNumEsq23442(String numEsq23442);
    
}
