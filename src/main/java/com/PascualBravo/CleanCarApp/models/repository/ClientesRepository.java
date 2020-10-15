package com.PascualBravo.CleanCarApp.models.repository;

import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesRepository extends CrudRepository<Clientes,Integer>{
    
}
