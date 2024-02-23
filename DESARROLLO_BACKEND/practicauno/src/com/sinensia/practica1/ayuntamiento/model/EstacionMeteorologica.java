package com.sinensia.practica1.ayuntamiento.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EstacionMeteorologica {

    private Integer codigo;
    private String nombre;
    private Direccion direccion;
    private Estado estado;
    private List<Lectura> lecturas = new ArrayList<>();

    public EstacionMeteorologica() {
    }

    public EstacionMeteorologica(Integer codigo, String nombre, Direccion direccion, Estado estado, List<Lectura> lecturas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.lecturas = lecturas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Lectura> getLecturas() {
        return lecturas;
    }

    public void setLecturas(List<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstacionMeteorologica)) return false;
        EstacionMeteorologica that = (EstacionMeteorologica) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "EstacionMeteorologica{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                ", estado=" + estado +
                ", lecturas=" + lecturas +
                '}';
    }
}
