package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqDois extends JpaRepository<EsqDoisModel, Integer>{
	
//	List<EsqDoisModel> findByBetween(int i, int j);
    
}
