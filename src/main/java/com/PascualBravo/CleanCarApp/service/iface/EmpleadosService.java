package com.PascualBravo.CleanCarApp.service.iface;

import com.PascualBravo.CleanCarApp.models.entity.Empleados;
import java.util.List;


public interface EmpleadosService {
    void create(Empleados empleados);
    
    List<Empleados> getAll();
    
    void update(int cc, Empleados empleado);
    
    void delete(int cc);
}
