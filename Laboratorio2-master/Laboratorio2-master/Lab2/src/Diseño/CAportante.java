/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.Aportante;
import LogicaNegocio.GestorPlataforma;
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
    
    int ac=0;
    
    class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            try{
                Aportante aportante=new Aportante(0.0, null, null, 0);
                fa.addAportante(aportante);
                fa.getAportantes().get(ac).setNombre(fa.getCampoNombre().getText());
                fa.getAportantes().get(ac).setApellido(fa.getCampoApellido().getText());
                fa.getAportantes().get(ac).setDinero(Double.parseDouble(fa.getCampoDinero().getText()));
                fa.getAportantes().get(ac).setCedula(Integer.parseInt(fa.getCampoCedula().getText()));
                gestor.addPrestamista(fa.getAportantes().get(ac));
                fa.getHecho().setText("Se ha agregado el Aportante");
                subirInfo();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CPromotor.class.getName()).log(Level.SEVERE, null, ex);
            }catch(NullPointerException n){
                Alert alert= new Alert(Alert.AlertType.ERROR,"Debe llenar todos los campos");
                alert.setTitle("Error");
                alert.showAndWait();
            }catch(NumberFormatException nf){
                Alert alert= new Alert(Alert.AlertType.ERROR,"Debe llenar todos los campos");
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
            fa.getHecho().setText("");
            
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.fa.show(singleton.getStage());
    }
    
     public void subirInfo() throws FileNotFoundException{
        PrintStream output=new PrintStream(new File("datos/Aportantes.txt"));
        for(int i=0;i<this.gestor.getPrestamistas().size()-ac;i++){
            output.println(this.gestor.getPrestamistas().get(i).getNombre()+" : "+ this.gestor.getPrestamistas().get(i).getApellido() +" : " + this.gestor.getPrestamistas().get(i).getCedula() + " : " + this.gestor.getPrestamistas().get(i).getDinero());
            
        }
         
       ac++; 
    }
    
    
}
