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
@Table(name = "Perfil")
public class Perfil {
    @Id
    @Column(name = "Id_Perfil")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerfil;
    
    @Column(name = "Usuario")
    private String usuario;
    
    @Column(name = "Password")
    private String password;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Cedula_Admin")
    private Administradores cedulaAdmin;

    /**
     * @return the idPerfil
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * @param idPerfil the idPerfil to set
     */
    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the cedulaAdmin
     */
    public Administradores getCedulaAdmin() {
        return cedulaAdmin;
    }

    /**
     * @param cedulaAdmin the cedulaAdmin to set
     */
    public void setCedulaAdmin(Administradores cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }
    
    
}
