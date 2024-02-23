package com.sinensia.practica1.ayuntamiento.model;

import java.util.Date;

public class Lectura {
    private double temperatura;
    private double presionAtmosferica;
    private double velocidadViento;
    private Date fechaHora;

    public Lectura() {
    }

    public Lectura(double temperatura, double presionAtmosferica, double velocidadViento, Date fechaHora) {
        this.temperatura = temperatura;
        this.presionAtmosferica = presionAtmosferica;
        this.velocidadViento = velocidadViento;
        this.fechaHora = fechaHora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPresionAtmosferica() {
        return presionAtmosferica;
    }

    public void setPresionAtmosferica(double presionAtmosferica) {
        this.presionAtmosferica = presionAtmosferica;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Lectura{" +
                "temperatura=" + temperatura +
                ", presionAtmosferica=" + presionAtmosferica +
                ", velocidadViento=" + velocidadViento +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
