package ex4;

import java.util.Scanner;

public class Computadora {
    private String id;
    private String marca;
    private double peso;
    private double precio;
    private int ramEnGb;
    private int almacenamientoGb;

    //Declaro el Constructor con parametros
    public Computadora(String id, double precio, String marca) {
        this.id = id;
        this.precio = precio;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public int getRamEnGb() {
        return ramEnGb;
    }

    public void setRamEnGb(int ramEnGb) {
        this.ramEnGb = ramEnGb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
