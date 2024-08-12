package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqCinco extends JpaRepository<EsqCincoModel, Integer>{
	
//	List<EsqCincoModel> findByBetween(int i, int j);
    
}
