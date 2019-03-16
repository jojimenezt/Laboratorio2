/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.Subasta;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Lenovo
 */
public class VPrestamo {
    private Scene escena;
    private GridPane grid;
    private Text titulo;
    private Label tasaInteres;
    private TextField campoTasaInteres;
    
    private Label tiempoMeses;
    private TextField campoTiempoMeses;
    
    private Button agregar;
    private Button rechazar;
    private Button volver;
    private HBox caja;
    
    private Stage stage;

    public VPrestamo() {
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        stage=new Stage();
        
        titulo= new Text("Formulario de Subasta");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        tasaInteres= new Label("Tasa de interes a la iniciativa: ");
        grid.add(tasaInteres, 0, 1);
        
        campoTasaInteres=new TextField();
        grid.add(campoTasaInteres, 1, 1);
        
        tiempoMeses= new Label("Tiempo en meses del prestamo: ");
        grid.add(tiempoMeses, 0, 2);
        
        campoTiempoMeses=new TextField();
        grid.add(campoTiempoMeses, 1, 2);
        
        agregar= new Button("Agregar");
        volver=new Button("Volver");
        
        caja=new HBox(agregar,volver);
        grid.add(caja, 1, 3);
        escena=new Scene(grid,500,500);
    }
    
        public void show(Stage stage){
        stage.setTitle("CrowFounding");
        stage.setScene(escena);
        stage.show();
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Text getTitulo() {
        return titulo;
    }

    public void setTitulo(Text titulo) {
        this.titulo = titulo;
    }

    public Label getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Label tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public TextField getCampoTasaInteres() {
        return campoTasaInteres;
    }

    public void setCampoTasaInteres(TextField campoTasaInteres) {
        this.campoTasaInteres = campoTasaInteres;
    }

    public Label getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(Label tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public TextField getCampoTiempoMeses() {
        return campoTiempoMeses;
    }

    public void setCampoTiempoMeses(TextField campoTiempoMeses) {
        this.campoTiempoMeses = campoTiempoMeses;
    }

    public Button getRechazar() {
        return rechazar;
    }

    public void setRechazar(Button rechazar) {
        this.rechazar = rechazar;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

       
    public Button getAgregar() {
        return agregar;
    }

    public void setAgregar(Button agregar) {
        this.agregar = agregar;
    }
    
    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }

  
    public HBox getCaja() {
        return caja;
    }

    public void setCaja(HBox caja) {
        this.caja = caja;
    }

    
}
