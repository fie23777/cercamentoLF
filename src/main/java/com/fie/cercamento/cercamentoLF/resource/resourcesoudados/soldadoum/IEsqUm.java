package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqUm extends JpaRepository<EsqUmModel, Integer>{
	
//	List<EsqUmModel> findByBetween(int i, int j);
    
}
