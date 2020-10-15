package com.PascualBravo.CleanCarApp.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Administradores")
public class Administradores {
    @Id
    @Column(name = "Cedula_Admin")
    private int cedulaAdmin;
    
    @Column(name = "Nombres")
    private String nombres;
    
    @Column(name = "Apellidos")
    private String apellidos;

    /**
     * @return the cedulaAdmin
     */
    public int getCedulaAdmin() {
        return cedulaAdmin;
    }

    /**
     * @param cedulaAdmin the cedulaAdmin to set
     */
    public void setCedulaAdmin(int cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
