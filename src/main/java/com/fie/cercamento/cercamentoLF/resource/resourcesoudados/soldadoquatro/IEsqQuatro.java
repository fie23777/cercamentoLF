package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqQuatro extends JpaRepository<EsqQuatroModel, Integer>{
    
//	List<EsqQuatroModel> findByBetween(int i, int j);
}
