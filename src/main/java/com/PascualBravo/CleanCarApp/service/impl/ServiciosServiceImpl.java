package com.PascualBravo.CleanCarApp.service.impl;


import com.PascualBravo.CleanCarApp.models.entity.Servicios;
import com.PascualBravo.CleanCarApp.models.repository.ServiciosRepository;
import com.PascualBravo.CleanCarApp.service.iface.ServiciosService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosServiceImpl implements ServiciosService {

    @Autowired
    ServiciosRepository serviciosRepository; 
    
    
    @Override
    public List<Servicios> getAll(){
        List<Servicios> servicios = new ArrayList<>();
        serviciosRepository.findAll().forEach(servicios::add);
        return servicios; 
    }

    @Override
    public void update(int idServicios, Servicios servicios) {
        Optional<Servicios> existServicios = serviciosRepository.findById(idServicios);
        if(existServicios.isPresent()){
            existServicios.get().setTipoServicio(servicios.getTipoServicio());
            existServicios.get().setValorServicio(servicios.getValorServicio());
            serviciosRepository.save(existServicios.get());
        }
    }

    
    
}
