package com.PascualBravo.CleanCarApp.service.impl;


import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import com.PascualBravo.CleanCarApp.models.repository.ClientesRepository;
import com.PascualBravo.CleanCarApp.service.iface.ClientesService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;
    
    @Override
    public void create(Clientes clientes) {
        clientesRepository.save(clientes);
    }

    @Override
    public List<Clientes> getAll() {
       List<Clientes> clientes=new ArrayList<>();
       clientesRepository.findAll().forEach(clientes::add);
       return clientes;
    }

    @Override
    public void update(int cedula, Clientes clientes) {
       Optional<Clientes> existClientes=clientesRepository.findById(cedula);
        if (existClientes.isPresent()) {
            existClientes.get().setNombre(clientes.getNombre());
            existClientes.get().setTelefono(clientes.getTelefono());
            clientesRepository.save(existClientes.get());
        }
    }

    @Override
    public void delete(int cedula) {
        Optional<Clientes> existClientes=clientesRepository.findById(cedula);
        if (existClientes.isPresent()) {
            clientesRepository.delete(existClientes.get());
        }
    }
    
}
