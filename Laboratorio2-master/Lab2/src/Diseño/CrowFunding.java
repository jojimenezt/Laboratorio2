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
public class CrowFunding {

    private Text titulo;
    private Button promotor;
    private Button aportante;
    private Button iniciativa;
    private HBox h;
    private VBox v;
    private Scene scene;
    

    public CrowFunding() {
        titulo= new Text("CROWFOUNDING");
        promotor=new Button("Agregar promotor");
        aportante=new Button("Agregar aportante:");
        iniciativa=new Button("Agregar iniciativa");
        h=new HBox(promotor,aportante,iniciativa);
        v=new VBox(titulo,h);
        scene=new Scene(v,500,500);
    }
    
  
        
        public void show(Stage stage){
        stage.setTitle("CrowFounding");
        stage.setScene(scene);
        stage.show();
        }

    public Text getTitulo() {
        return titulo;
    }

    public void setTitulo(Text titulo) {
        this.titulo = titulo;
    }

    public Button getPromotor() {
        return promotor;
    }

    public void setPromotor(Button promotor) {
        this.promotor = promotor;
    }

    public Button getAportante() {
        return aportante;
    }

    public void setAportante(Button aportante) {
        this.aportante = aportante;
    }

    public Button getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Button iniciativa) {
        this.iniciativa = iniciativa;
    }

    public HBox getH() {
        return h;
    }

    public void setH(HBox h) {
        this.h = h;
    }

    public VBox getV() {
        return v;
    }

    public void setV(VBox v) {
        this.v = v;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
        
        
        
    }
    
    
    
