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
public class Promotor extends Persona{
    private ArrayList<Iniciativa> iniciativa;

    public Promotor(String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.iniciativa = new ArrayList<>();
    }

    public ArrayList<Iniciativa> getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(ArrayList<Iniciativa> iniciativa) {
        this.iniciativa = iniciativa;
    }
    
    public void addIniciativa(Iniciativa iniciativa){
        this.iniciativa.add(iniciativa);
    }
   
    public Iniciativa presentarIniciativa(String nombreIniciativa ){
        Iniciativa iniciativa=null;
        for(int i=0;i<this.iniciativa.size();i++){
            if(this.iniciativa.get(i).getNombre().equals(nombreIniciativa)){
                iniciativa=this.iniciativa.get(i);
            }else{
                throw new NullPointerException("Iniciativa no encontrada");
            }
        }
        return iniciativa;
    }
    
    public double[] solicitarPrestamo(String nombreIniciativa){
        double valores[]= new double[3];//valorMax, valorMin, intervalo
        Iniciativa iniciativa= presentarIniciativa(nombreIniciativa);
        valores[0]=iniciativa.getValorMax();
        valores[1]=iniciativa.getValorMin();
        valores[2]=iniciativa.getIntervalo();
        return valores;        
    }
}
