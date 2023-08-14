package com.fie.cercamento.cercamentoLF.resource.resourcesoudados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.soldados.EsqDois;

@Repository
public interface IEsqDois extends JpaRepository<EsqDois, Integer>{
    
}
