package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqTres extends JpaRepository<EsqTresModel, Integer>{
	
//	List<EsqTresModel> findByBetween(int i, int j);
    
}
