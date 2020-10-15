package com.PascualBravo.CleanCarApp.service.iface;


import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import java.util.List;

public interface ClientesService {
    boolean create(Clientes clientes);
    
    List<Clientes> getAll();
    
    void update(int cedula,Clientes clientes);
    
    void delete(int cedula);
}
