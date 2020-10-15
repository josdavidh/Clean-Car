package com.PascualBravo.CleanCarApp;

import com.PascualBravo.CleanCar.Vistas.Servicios;
import com.PascualBravo.CleanCarApp.controller.ClientesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanCarApplication {

    public static void main(String[] args) {
        Servicios frmServ = new Servicios();
        ClientesController clientesController = new ClientesController(frmServ);
        clientesController.iniciar();
        SpringApplication.run(CleanCarApplication.class, args);
        frmServ.setVisible(true);
    }

}
