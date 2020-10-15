package com.PascualBravo.CleanCarApp.service.iface;

import com.PascualBravo.CleanCarApp.models.entity.Vehiculos;
import java.util.List;

public interface VehiculosService {
    void create(Vehiculos vehiculos);
    
    List<Vehiculos> getAll();
    
    void update(String placa,Vehiculos vehiculos);
    
    void delete(String placa);
}
