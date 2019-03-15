/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.GestorPlataforma;
import LogicaNegocio.Promotor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author ADMIN
 */
public class CIniciativa {
    private GestorPlataforma gestor;
    private Promotor promotor;//toca asignarle un promotor a esta iniciativa
    private Finiciativa fi;

    public CIniciativa(GestorPlataforma gestor,Promotor promotor) {
        this.promotor=promotor;
        this.gestor = gestor;
        fi=new Finiciativa();
        fi.getAgregar().setOnAction(new Agregar());
        fi.getVolver().setOnAction(new Volver());
        
        
    }
    
    
    
     class Agregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            fi.getIniciativa().setNombre(fi.getCampoNombre().getText());
            fi.getIniciativa().setTipo(fi.getCampoTipo().getText());
            fi.getIniciativa().setDescripcion(fi.getCampoDescripcion().getText());
            fi.getIniciativa().setNumPrestamistas(Integer.parseInt(fi.getCampoNumPrestamistas().getText()));
            fi.getIniciativa().setValorMax(Integer.parseInt(fi.getCampoValorMax().getText()));
            fi.getIniciativa().setValorMin(Integer.parseInt(fi.getCampoValorMin().getText()));
            fi.getIniciativa().setIntervalo(Integer.parseInt(fi.getCampoIntervalo().getText()));
            fi.getHecho().setText("Se ha agregado el promotor");
            promotor.addIniciativa(fi.getIniciativa());
            
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
        this.fi.show(singleton.getStage());
    }
    
    
    
    
}
