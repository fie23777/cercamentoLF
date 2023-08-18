package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEsqDois extends JpaRepository<FieEsq,EsqDoisModel, Integer>{
    
}
