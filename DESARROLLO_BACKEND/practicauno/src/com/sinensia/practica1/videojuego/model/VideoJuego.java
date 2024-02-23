package com.sinensia.practica1.videojuego.model;

import java.util.Date;
import java.util.Objects;

public class VideoJuego {
    /*2.- Estamos diseñando una aplicación en Java para gestionar videojuegos.
    Cada videojuego dispone de las siguientes propiedades:
- código (String)
- título (String)
- categoría (enumeración)
- fecha de lanzamiento (Date)
- fabricante (String)
- precio (double)
* categoria -> Elegir entre diferentes categorías.
Crear el modelo (POJO) en Java. Se valorará positivamente que el POJO sea "perfecto"
    */
    private String codigo;
    private String titulo;
    private Categoria categoria;
    private Date fechaDeLanzamiento;
    private String fabricante;
    private double precio;

    public VideoJuego() {
    }

    public VideoJuego(String codigo, String titulo, Categoria categoria, Date fechaDeLanzamiento, String fabricante, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoJuego)) return false;
        VideoJuego that = (VideoJuego) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", categoria=" + categoria +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }
}
