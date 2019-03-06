package Diseño;

import LogicaNegocio.GestorPlataforma;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CPromotor {
    private FPromotor promotor;
    private GestorPlataforma gestor;

    public CPromotor(GestorPlataforma gestor) {
        this.gestor=gestor;
        this.promotor=new FPromotor();
        this.promotor.getAgregar().setOnAction(new Agregar());
        this.promotor.getVolver().setOnAction(new Volver());
        
    }
    
    
     class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            promotor.getPromotor().setNombre(promotor.getCampoNombre().getText());
            promotor.getPromotor().setApellido(promotor.getCampoNombre().getText());
            gestor.addPromotor(promotor.getPromotor());
        }
        
    }
    
    
    class Volver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            CCrowFounding ccf=new CCrowFounding(gestor);
            ccf.mostrar();
            
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.promotor.show(singleton.getStage());
    }
    
    
    
    
    
}
