package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44313;

@Repository
public interface Irepository44313 extends JpaRepository<FieEsq44313, Integer> {

	boolean existsByNumEsq44313(String numEsq44313);
    
}
