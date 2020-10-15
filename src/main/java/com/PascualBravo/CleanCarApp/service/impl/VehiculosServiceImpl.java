package com.PascualBravo.CleanCarApp.service.impl;


import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import com.PascualBravo.CleanCarApp.models.entity.Vehiculos;
import com.PascualBravo.CleanCarApp.models.repository.ClientesRepository;
import com.PascualBravo.CleanCarApp.models.repository.VehiculosRepository;
import com.PascualBravo.CleanCarApp.service.iface.VehiculosService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculosServiceImpl implements VehiculosService {

    @Autowired
    private VehiculosRepository vehiculosRepository;
    
    @Autowired
    private ClientesRepository clientesRepository;
    
    @Override
    public void create(Vehiculos vehiculos) {
       Optional<Clientes> existCliente=clientesRepository.findById(vehiculos.getDueño().getCcCliente());
        if (existCliente.isPresent()) {
            vehiculosRepository.save(vehiculos);
        }
    }

    @Override
    public List<Vehiculos> getAll() {
       List<Vehiculos> vehiculos=new ArrayList<>();
       vehiculosRepository.findAll().forEach(vehiculos::add);
       return vehiculos;
    }

    @Override
    public void update(String placa, Vehiculos vehiculos) {
        Optional<Vehiculos> existVehiculos=vehiculosRepository.findById(placa);
        if (existVehiculos.isPresent()) {
            existVehiculos.get().setNombre(vehiculos.getNombre());
            existVehiculos.get().setModelo(vehiculos.getModelo());
            existVehiculos.get().setMarca(vehiculos.getMarca());
            existVehiculos.get().setColor(vehiculos.getColor());
            
            Optional<Clientes> existCliente=clientesRepository.findById(vehiculos.getDueño().getCcCliente());
            if (existCliente.isPresent()) {
                existVehiculos.get().setDueño(vehiculos.getDueño());
            }
            vehiculosRepository.save(existVehiculos.get());
        }
    }

    @Override
    public void delete(String placa) {
        Optional<Vehiculos> existVehiculos=vehiculosRepository.findById(placa);
        if (existVehiculos.isPresent()) {
            vehiculosRepository.delete(existVehiculos.get());
        }
    }
    
}
