package Diseño;

import LogicaNegocio.GestorPlataforma;
import LogicaNegocio.Promotor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

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
    
    int ac=0; //posicion del promotro que va a escribir en el archivo
    
    class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            try{
                Promotor promotor2=new Promotor(null, null, 0);
                promotor.getPromotores().add(promotor2);               
                promotor.getPromotores().get(ac).setNombre(promotor.getCampoNombre().getText());
                promotor.getPromotores().get(ac).setApellido(promotor.getCampoApellido().getText());
                promotor.getPromotores().get(ac).setCedula(Integer.parseInt(promotor.getCampoCedula().getText()));
                gestor.addPromotor(promotor.getPromotores().get(ac));
                promotor.getHecho().setText("Se ha agregado el promotor");
            
            
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
            promotor.getHecho().setText("");
           
            
        }
        
        
        
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.promotor.show(singleton.getStage());
    }
    
    
    
    public void subirInfo() throws FileNotFoundException{
        PrintStream output=new PrintStream(new File("datos/Promotores.txt"));
        for(int i=0;i<this.gestor.getPromotor().size()-ac;i++){
            output.println(this.gestor.getPromotor().get(i).getNombre() + " : " + this.gestor.getPromotor().get(i).getApellido() + " : " + this.gestor.getPromotor().get(i).getCedula());
           
        }
         
       ac++; 
    }

    public FPromotor getPromotor() {
        return promotor;
    }

    public void setPromotor(FPromotor promotor) {
        this.promotor = promotor;
    }
    
    
    
    
}
