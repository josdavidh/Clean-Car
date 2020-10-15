package com.PascualBravo.CleanCarApp.service.iface;


import com.PascualBravo.CleanCarApp.models.entity.Servicios;
import java.util.List;

public interface ServiciosService {
    
    List<Servicios> getAll();
    
    public void update(int idServicios, Servicios servicios );
        
    
}
