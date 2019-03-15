/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class CrowFunding extends Application{

    private Text titulo;
    private Button promotor;
    private Button aportante;
    private Button iniciativa;
    private HBox h;
    private FPromotor escena2;
    private FAportante faportante;
    private VBox v;
    private Scene scene;
    private Finiciativa finiciativa;

    public CrowFunding() {
        titulo= new Text("CROWFOUNDING");
        promotor=new Button("Agregar promotor");
        aportante=new Button("Agregar aportante:");
        iniciativa=new Button("Agregar iniciativa");
        h=new HBox(promotor,aportante,iniciativa);
        escena2=new FPromotor();
        faportante=new FAportante();
        finiciativa=new Finiciativa();
        v=new VBox(titulo,h);
        scene=new Scene(v,500,500);
    }
    
    
   
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        promotor.setOnAction(
                new EventHandler <ActionEvent>(){

                    @Override
                    public void handle(ActionEvent event) {
                        
                        escena2.show(primaryStage);
                    }
                }
        );
        
        aportante.setOnAction(
                new EventHandler <ActionEvent>(){

                    @Override
                    public void handle(ActionEvent event) {
                        
                        faportante.show(primaryStage);
                    }
                }
        );
        
        iniciativa.setOnAction(
                new EventHandler <ActionEvent>(){

                    @Override
                    public void handle(ActionEvent event) {
                        
                        finiciativa.show(primaryStage);
                    }
                }
        );
        
        VBox v=new VBox(titulo,h);
        Scene escena=new Scene(v,500,500);
        primaryStage.setScene(escena);
        primaryStage.show();
        
        
    }
    
     
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
     public void show(Stage stage){
        stage.setTitle("CrowFounding");
        stage.setScene(scene);
        stage.show();
    }
    
}
