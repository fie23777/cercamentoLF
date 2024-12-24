package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32334;

@Repository
public interface Irepository32334 extends JpaRepository<FieEsq32334, Integer> {

	boolean existsByNumEsq32334(String numEsq32334);
    
}
