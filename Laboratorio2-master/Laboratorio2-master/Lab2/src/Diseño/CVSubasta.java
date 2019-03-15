/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.Aportante;
import LogicaNegocio.GestorPlataforma;
import LogicaNegocio.Iniciativa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author ADMIN
 */
public class CVSubasta {
    private VSubasta vsubasta;
    private GestorPlataforma gestor;

    public CVSubasta(GestorPlataforma gestor) {
        this.gestor = gestor;
        this.vsubasta= new VSubasta();
        
        this.vsubasta.getAceptar().setOnAction(new Aceptar());
        this.vsubasta.getRechazar().setOnAction(new Rechazar());
    }
    
    
    class Aceptar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Iniciativa iniciativa= vsubasta.getSubasta().getIniciativa();
            gestor.crearSubasta(iniciativa);
            Aportante aportante= vsubasta.getSubasta().getPosiblesCompradores().get(vsubasta.getAc());
            if(aportante.isComproIniciativa()){
                gestor.aceptarAportanteIniciativa(aportante, iniciativa);
            }else{
                //bota un alert que diga que no la ha comprado
            }
        }
    
    }
    
    class Rechazar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Iniciativa iniciativa= vsubasta.getSubasta().getIniciativa();
            Aportante aportante= vsubasta.getSubasta().getPosiblesCompradores().get(vsubasta.getAc());
            gestor.rechazarAportanteIniciativa(aportante, iniciativa);
            vsubasta.setAc(vsubasta.getAc()+1);
        }
        
    }
    
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.vsubasta.show(singleton.getStage());
    }
    
    
    
    
}
