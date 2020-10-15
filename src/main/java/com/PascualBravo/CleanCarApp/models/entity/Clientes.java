package com.PascualBravo.CleanCarApp.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {

    @Id
    @Column(name = "Cedula_Clnt")
    private int ccCliente;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Telefono")
    private String telefono;

    /**
     * @return the ccCliente
     */
    public int getCcCliente() {
        return ccCliente;
    }

    /**
     * @param ccCliente the ccCliente to set
     */
    public void setCcCliente(int ccCliente) {
        this.ccCliente = ccCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
