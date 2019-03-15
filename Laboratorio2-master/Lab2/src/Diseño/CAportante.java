/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.GestorPlataforma;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                PrintStream output=new PrintStream(new File("datos/Aportantes.txt"));
                fa.getAportante().setNombre(fa.getCampoNombre().getText());
                fa.getAportante().setApellido(fa.getCampoApellido().getText());
                fa.getAportante().setDinero(Double.parseDouble(fa.getCampoDinero().getText()));
                fa.getAportante().setCedula(Integer.parseInt(fa.getCampoCedula().getText()));
                output.println(fa.getAportante().getNombre()+" : "+ fa.getAportante().getApellido() +" : " + fa.getAportante().getCedula() + " : " + fa.getAportante().getDinero());
                gestor.addPrestamista(fa.getAportante());
                fa.getHecho().setText("Se ha agregado el Aportante");
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
        this.fa.show(singleton.getStage());
    }
    
    
}
