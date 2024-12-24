package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33342;

@Repository
public interface Irepository33342 extends JpaRepository<FieEsq33342, Integer> {

	boolean existsByNumEsq33342(String numEsq33342);
    
}
