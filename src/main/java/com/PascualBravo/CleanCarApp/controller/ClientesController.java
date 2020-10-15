package com.PascualBravo.CleanCarApp.controller;

import com.PascualBravo.CleanCar.Vistas.Servicios;
import com.PascualBravo.CleanCarApp.models.entity.Clientes;
import com.PascualBravo.CleanCarApp.service.iface.ClientesService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientesController implements ActionListener {

    @Autowired
    ClientesService clientesService;

    Clientes clientes;

    private Servicios frmServicios;

    public ClientesController(Servicios fmrServ) {
        this.frmServicios = fmrServ;

        this.frmServicios.btnConfirmarServicio.addActionListener(this);
    }

    public void iniciar() {
        frmServicios.setLocationRelativeTo(null);
    }

    public void limpiar() {

        frmServicios.txtCedulaCliente.setText(null);
        frmServicios.txtNombreCliente.setText(null);
        frmServicios.txtTelefonoCliente.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmServicios.btnConfirmarServicio) {
            clientes.setCcCliente(Integer.parseInt(frmServicios.txtCedulaCliente.getText()));
            clientes.setNombre(frmServicios.txtNombreCliente.getText());
            clientes.setTelefono(frmServicios.txtTelefonoCliente.getText());

            if (clientesService.create(clientes) == true) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
    }

}
