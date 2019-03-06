/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.GestorPlataforma;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author ADMIN
 */
public class CAportante {
    private FAportante fa;
    private GestorPlataforma gestor;

    public CAportante(GestorPlataforma gestor) {
        this.gestor = gestor;
        fa=new FAportante();
        fa.getAgregar().setOnAction(new Agregar());
        fa.getVolver().setOnAction(new Volver());
    }
    
    class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            fa.getAportante().setNombre(fa.getCampoNombre().getText());
            fa.getAportante().setApellido(fa.getCampoApellido().getText());
            fa.getAportante().setDinero(Double.parseDouble(fa.getCampoDinero().getText()));
            gestor.addPrestamista(fa.getAportante());
            
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
        this.fa.show(singleton.getStage());
    }
    
    
}
