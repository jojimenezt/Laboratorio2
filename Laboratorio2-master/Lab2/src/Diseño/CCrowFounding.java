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
public class CCrowFounding {
    CrowFunding cf;
    GestorPlataforma gestor;

    public CCrowFounding(GestorPlataforma gestor) {
        this.gestor = gestor;
        cf=new CrowFunding();
        cf.getPromotor().setOnAction(new Ep());
        cf.getAportante().setOnAction(new Ea());
        cf.getIniciativa().setOnAction(new Ei());
        cf.getSubasta().setOnAction(new ESubasta());
    }
    int ac=0;//revisar asignacion del promotor a la iniciativa que se agregue
    
    class Ep implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            CPromotor cp=new CPromotor(gestor);
            cp.mostrarVista();
        }
        
    }
    
    class Ea implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            CAportante ca=new CAportante(gestor);
            ca.mostrarVista();
        }
        
    }
    
    
    class Ei implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if(gestor.getPromotor().size()==0) throw new IndexOutOfBoundsException("Debes inscribir al promotor de la iniciativa");
            CIniciativa ci=new CIniciativa(gestor,gestor.getPromotor().get(ac));
            ci.mostrarVista();
            ac++;
        }
        
    }
    
    class ESubasta implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            CVSubasta subasta= new CVSubasta(gestor);
            subasta.mostrarVista();
        }
        
    }
    
    
    public void mostrar(){
        Singleton singleton=Singleton.getSingleton();
        this.cf.show(singleton.getStage());

    }
    
    
}
