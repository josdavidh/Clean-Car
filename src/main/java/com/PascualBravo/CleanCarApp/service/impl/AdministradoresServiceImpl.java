package com.PascualBravo.CleanCarApp.service.impl;

import com.PascualBravo.CleanCarApp.models.entity.Administradores;
import com.PascualBravo.CleanCarApp.models.repository.AdministradoresRepository;
import com.PascualBravo.CleanCarApp.service.iface.AdministradoresService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradoresServiceImpl implements AdministradoresService {

    @Autowired
    private AdministradoresRepository administradoresRepository;

    @Override
    public void create(Administradores administradores) {
        administradoresRepository.save(administradores);
    }

    @Override
    public List<Administradores> getAll() {
        List<Administradores> administradores = new ArrayList<>();
        administradoresRepository.findAll().forEach(administradores::add);
        return administradores;
    }

    @Override
    public void update(int cedulaAdmin, Administradores administradores) {
        Optional<Administradores> existAdministradores = administradoresRepository.findById(cedulaAdmin);
        if (existAdministradores.isPresent()){
            existAdministradores.get().setNombres(administradores.getNombres());
            existAdministradores.get().setApellidos(administradores.getApellidos());
            administradoresRepository.save(existAdministradores.get());
        }
    }

    @Override
    public void delete(int cedulaAdmin) {
        Optional<Administradores> existAdministradores = administradoresRepository.findById(cedulaAdmin);
        if (existAdministradores.isPresent()) {
            administradoresRepository.delete(existAdministradores.get());
        }
    }

}
