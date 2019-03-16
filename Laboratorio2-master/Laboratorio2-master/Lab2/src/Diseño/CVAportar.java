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
 * @author Lenovo
 */
public class CVAportar {
    private VAportar vaportar;
    private GestorPlataforma gestor;

    public CVAportar(GestorPlataforma gestor) {
        this.gestor = gestor;
        this.vaportar=new VAportar();
        this.vaportar.getAceptar().setOnAction(new Aceptar());
        this.vaportar.getRechazar().setOnAction(new Rechazar());
    }
    
    class Aceptar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Alert alert= new Alert(Alert.AlertType.INFORMATION,"Felicitaciones, su subasta ha sido subasta");
                alert.setTitle("Informacion");
                alert.showAndWait();
            
            CCrowFounding ccf=new CCrowFounding(gestor);
            ccf.mostrar();
        }    
           
            
        }
            
      class Rechazar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            //Crea la subasta con nuevos aportantes quitando el aportante que acaba de rechazar el promotos
        }
        
    }
      
      public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.vaportar.show(singleton.getStage());
    }
}
