/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.Aportante;
import LogicaNegocio.GestorPlataforma;
import LogicaNegocio.Promotor;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author ADMIN
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        //registrando el stage como una variable global
        Singleton singleton=Singleton.getSingleton();
        singleton.setStage(primaryStage);
        ArrayList<Promotor> promotores=new ArrayList<>();
        ArrayList<Aportante> aportantes=new ArrayList<>();
        GestorPlataforma gestor=new GestorPlataforma(0, promotores, aportantes, "gestor", "plataforma",1000000);
        CCrowFounding c= new CCrowFounding(gestor);
        c.mostrar();
        
       
    }
    
    
    
    public static void main(String[] args) {
         
        launch(args);
       
    


    
    }
    
}
