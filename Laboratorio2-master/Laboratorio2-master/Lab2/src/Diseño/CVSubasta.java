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
import javafx.scene.control.Alert;

/**
 *
 * @author ADMIN
 */
public class CVSubasta {
    private VSubasta vsubasta;
    private GestorPlataforma gestor;
    private Iniciativa iniciativa;

    public CVSubasta(GestorPlataforma gestor) {
        this.gestor = gestor;               
        this.vsubasta= new VSubasta();
        Iniciativa iniciativa=null;
        this.vsubasta.setIniciativa(iniciativa);
        this.vsubasta.getAceptar().setOnAction(new Aceptar());
        this.vsubasta.getRechazar().setOnAction(new Rechazar());
    }
    
    
    class Aceptar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Iniciativa iniciativa= vsubasta.getSubasta().getIniciativa();
            gestor.crearSubasta(iniciativa);
            Aportante aportante= vsubasta.getSubasta().getPosiblesCompradores().get(vsubasta.getAc());
            /*if(aportante.isComproIniciativa()){
                gestor.aceptarAportanteIniciativa(aportante, iniciativa);
            }else{
                Alert alert= new Alert(Alert.AlertType.ERROR,"Debe llenar todos los campos 1");
                alert.setTitle("Error");
                alert.showAndWait();
            }*/
            CVAportar aportar=new CVAportar(gestor);
            aportar.mostrarVista();
            
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

    public Iniciativa getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Iniciativa iniciativa) {
        this.iniciativa = iniciativa;
    }
    
    
    
    
}
