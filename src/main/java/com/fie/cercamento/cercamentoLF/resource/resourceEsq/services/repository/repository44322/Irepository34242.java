package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44322;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34242;

@Repository
public interface Irepository34242 extends JpaRepository<FieEsq34242, Integer> {

	boolean existsByNumEsq34242(String numEsq34242);
    
}
