package com.PascualBravo.CleanCarApp.service.iface;

import com.PascualBravo.CleanCarApp.models.entity.Administradores;
import java.util.List;

public interface AdministradoresService {
    
    List<Administradores> getAll();
    
    public void create(Administradores administradores);
    
    public void update(int cedulaAdmin, Administradores administradores); 
    
    public void delete(int cedulaAdmin);
}
