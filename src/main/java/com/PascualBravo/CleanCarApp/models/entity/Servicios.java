package com.PascualBravo.CleanCarApp.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicios")
public class Servicios {

    @Id
    @Column(name = "Id_Servicio")
    private int idServicios;

    @Column(name = "TIpo_Servicio")
    private String tipoServicio;

    @Column(name = "Valor")
    private double valorServicio;

    /**
     * @return the idServicios
     */
    public int getIdServicios() {
        return idServicios;
    }

    /**
     * @param idServicios the idServicios to set
     */
    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    /**
     * @return the tipoServicio
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * @param tipoServicio the tipoServicio to set
     */
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * @return the valorServicio
     */
    public double getValorServicio() {
        return valorServicio;
    }

    /**
     * @param valorServicio the valorServicio to set
     */
    public void setValorServicio(double valorServicio) {
        this.valorServicio = valorServicio;
    }
}
