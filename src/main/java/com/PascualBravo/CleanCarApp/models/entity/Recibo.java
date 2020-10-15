package com.PascualBravo.CleanCarApp.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Recibo")
public class Recibo {
    
    @Id
    @Column(name = "Cod_Recibo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codRecibo;
    
    @Column(name = "Total")
    private double total;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Cedula_Emp")
    private Empleados cedulaEmp;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Servicio")
    private Servicios idServico;

    /**
     * @return the codRecibo
     */
    public int getCodRecibo() {
        return codRecibo;
    }

    /**
     * @param codRecibo the codRecibo to set
     */
    public void setCodRecibo(int codRecibo) {
        this.codRecibo = codRecibo;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the cedulaEmp
     */
    public Empleados getCedulaEmp() {
        return cedulaEmp;
    }

    /**
     * @param cedulaEmp the cedulaEmp to set
     */
    public void setCedulaEmp(Empleados cedulaEmp) {
        this.cedulaEmp = cedulaEmp;
    }

    /**
     * @return the idServico
     */
    public Servicios getIdServico() {
        return idServico;
    }

    /**
     * @param idServico the idServico to set
     */
    public void setIdServico(Servicios idServico) {
        this.idServico = idServico;
    }
    
    
}

