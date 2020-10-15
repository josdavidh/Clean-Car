package com.PascualBravo.CleanCarApp.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.Table;

@Entity
//@Table(name = "Empleados")
public class Empleados {
    @Id
    @Column(name = "Cedula_Emp")
    private int ccEmpleado;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Slario")
    private double salario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Jefe")
    private Administradores idJefe;

    /**
     * @return the ccEmpleado
     */
    public int getCcEmpleado() {
        return ccEmpleado;
    }

    /**
     * @param ccEmpleado the ccEmpleado to set
     */
    public void setCcEmpleado(int ccEmpleado) {
        this.ccEmpleado = ccEmpleado;
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
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the idJefe
     */
    public Administradores getIdJefe() {
        return idJefe;
    }

    /**
     * @param idJefe the idJefe to set
     */
    public void setIdJefe(Administradores idJefe) {
        this.idJefe = idJefe;
    }
}
