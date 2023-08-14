package com.fie.cercamento.cercamentoLF.resource.resourcesoudados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.soldados.EsqUm;

@Repository
public interface IEsqUm extends JpaRepository<EsqUm, Integer>{
    
}
