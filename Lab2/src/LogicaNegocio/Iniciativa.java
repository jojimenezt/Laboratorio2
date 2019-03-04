package LogicaNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Iniciativa {
    private String nombre;
    private String tipo;
    private String descripcion;
    private int numPrestamistas;
    private double valorMax;
    private double valorMin;
    private double intervalo;
    private Aportante[] prestamistas;
    private boolean subastado=false;
    private double valorPosSubasta;

    public Iniciativa(String nombre, String tipo, String descripcion, int numPrestamistas, double valorMax, double valorMin, double intervalo, Aportante[] prestamistas, boolean subastado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.numPrestamistas = numPrestamistas;
        this.valorMax = valorMax;
        this.valorMin = valorMin;
        this.intervalo = intervalo;
        this.prestamistas = new Aportante[this.numPrestamistas];
        this.subastado = subastado;
        this.valorPosSubasta=0.0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPrestamistas() {
        return numPrestamistas;
    }

    public void setNumPrestamistas(int numPrestamistas) {
        this.numPrestamistas = numPrestamistas;
    }

    public Aportante[] getPrestamistas() {
        return prestamistas;
    }

    public void setPrestamistas(Aportante[] prestamistas) {
        this.prestamistas = prestamistas;
    }

    public double getValorMax() {
        return valorMax;
    }

    public void setValorMax(double valorMax) {
        this.valorMax = valorMax;
    }

    public double getValorMin() {
        return valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }

    public double getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(double intervalo) {
        this.intervalo = intervalo;
    }  

    public boolean isSubastado() {
        return subastado;
    }

    public void setSubastado(boolean subastado) {
        this.subastado = subastado;
    }

    public double getValorPosSubasta() {
        return valorPosSubasta;
    }

    public void setValorPosSubasta(double valorPosSubasta) {
        this.valorPosSubasta = valorPosSubasta;
    }
    
}
