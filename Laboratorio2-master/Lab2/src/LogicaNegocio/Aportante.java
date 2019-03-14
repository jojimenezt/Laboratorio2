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
public class Aportante extends Persona{
    private int cedula;
    private double dinero;
    private boolean comproIniciativa;

    public Aportante(double dinero, String nombre, String apellido, int cedula) {
        super(nombre, apellido,cedula);
        this.dinero = dinero;
        this.comproIniciativa=false;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public boolean isComproIniciativa() {
        return comproIniciativa;
    }

    public void setComproIniciativa(boolean comproIniciativa) {
        this.comproIniciativa = comproIniciativa;
    }
    
    
}
