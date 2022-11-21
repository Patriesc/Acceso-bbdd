package com.sfaci.concesionario.base;

import java.io.Serializable;
import java.util.Date;


public class Coche implements Serializable {

    public enum Combustible {
        GASOLINA, DIESEL
    }

    private String matricula;
    private String modelo;
    private Date fechaCompra;
    private float potencia;
    private Combustible combustible;
    private boolean hibrido;

    public Coche() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }

    @Override
    public String toString() {
        return matricula;
    }
}
