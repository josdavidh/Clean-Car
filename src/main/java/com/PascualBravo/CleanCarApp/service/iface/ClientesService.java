package com.PascualBravo.CleanCarApp.service.iface;


import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import java.util.List;

public interface ClientesService {
    void create(Clientes clientes);
    
    List<Clientes> getAll();
    
    void update(int cedula,Clientes clientes);
    
    void delete(int cedula);
}
