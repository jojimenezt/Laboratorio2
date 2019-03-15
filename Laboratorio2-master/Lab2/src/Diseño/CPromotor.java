package Diseño;

import LogicaNegocio.GestorPlataforma;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                PrintStream output=new PrintStream(new File("datos/Promotores.txt"));
                promotor.getPromotor().setNombre(promotor.getCampoNombre().getText());
                promotor.getPromotor().setApellido(promotor.getCampoApellido().getText());
                promotor.getPromotor().setCedula(Integer.parseInt(promotor.getCampoCedula().getText()));
                output.println(promotor.getPromotor().getNombre() + " : " + promotor.getPromotor().getApellido()+ " : "+ promotor.getPromotor().getCedula());
                gestor.addPromotor(promotor.getPromotor());
                promotor.getHecho().setText("Se ha agregado el promotor");
            } catch (FileNotFoundException ex) {
                System.out.println("");
            }
            
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
