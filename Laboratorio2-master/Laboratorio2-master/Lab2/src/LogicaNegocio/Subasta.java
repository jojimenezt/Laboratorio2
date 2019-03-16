package LogicaNegocio;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Subasta {
    private ArrayList<Aportante> posiblesCompradores;
    private Iniciativa iniciativa;
    private double valorMax;
    private double valorMin;
    private double intervalo;
    private double tasa;
    private int tiempoMeses;
    
    public Subasta(double tasa, int tiempoMeses,Iniciativa iniciativa) {
        this.valorMax = iniciativa.getValorMax();
        this.valorMin = iniciativa.getValorMin();
        this.intervalo = iniciativa.getIntervalo();
        this.tasa = tasa;
        this.tiempoMeses = tiempoMeses;
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

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public int getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public Iniciativa getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Iniciativa iniciativa) {
        this.iniciativa = iniciativa;
    }

    public ArrayList<Aportante> getPosiblesCompradores() {
        return posiblesCompradores;
    }

    public void setPosiblesCompradores(ArrayList<Aportante> posiblesCompradores) {
        this.posiblesCompradores = posiblesCompradores;
    }
    
    
    
    
    
}
