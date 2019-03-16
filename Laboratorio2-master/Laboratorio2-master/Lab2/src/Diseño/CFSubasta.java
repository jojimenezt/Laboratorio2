/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;
import LogicaNegocio.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
/**
 *
 * @author Lenovo
 */
public class CFSubasta {
    private FSubasta subasta;
    private GestorPlataforma gestor;
    private Iniciativa iniciativa;

    public CFSubasta(GestorPlataforma gestor) {
        this.gestor = gestor;
        this.subasta=new FSubasta();
        this.subasta.getAgregar().setOnAction(new Agregar());
        this.subasta.getVolver().setOnAction(new Volver());
    }
    
    class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Iniciativa iniciativa=gestor.getIniciativa(Integer.parseInt(subasta.getCampoCedulaPromotor().getText()),subasta.getCampoNombreIniciativa().getText());
            try{
                CVSubasta subasta1 = new CVSubasta(gestor);
                subasta1.mostrarVista();
                subasta1.setIniciativa(iniciativa);
                
            }catch(NullPointerException n){
                Alert alert= new Alert(Alert.AlertType.ERROR,"Debe llenar todos los campos 1");
                alert.setTitle("Error");
                alert.showAndWait();
            }catch(NumberFormatException nf){
                Alert alert= new Alert(Alert.AlertType.ERROR,"Debe llenar todos los campos 2");
                alert.setTitle("Error");
                alert.showAndWait();
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
        this.subasta.show(singleton.getStage());
    }
}
