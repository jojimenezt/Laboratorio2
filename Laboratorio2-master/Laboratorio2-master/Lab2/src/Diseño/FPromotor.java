/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import LogicaNegocio.*;
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
 * @author ADMIN
 */
public class FPromotor {
    private ArrayList<Promotor> promotores;
    private Scene escena;
    private GridPane grid;
    private Text titulo;
    private Label nombre;
    private TextField campoNombre;
    
    private Label apellido;
    private TextField campoApellido;
    
    private Label cedula;
    private TextField campoCedula;
    
    private Label hecho;
  
    private Button agregar;
    private Button volver;
    private HBox caja;
    
    private Stage stage;

    public FPromotor() {
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        stage=new Stage();
        
        titulo= new Text("Formulario de Promotor");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        nombre= new Label("Nombre: ");
        grid.add(nombre, 0, 1);
        
        campoNombre=new TextField();
        grid.add(campoNombre, 1, 1);
        
        apellido= new Label("Apellido: ");
        grid.add(apellido, 0, 2);
        
        campoApellido=new TextField();
        grid.add(campoApellido, 1, 2);
        
        cedula=new Label("Cedula: ");
        grid.add(cedula, 0, 3);
        
        campoCedula= new TextField();
        grid.add(campoCedula, 1, 3);
        
        hecho=new Label("");
        grid.add(hecho, 0, 4);
        
        agregar= new Button("Agregar");
        volver=new Button("Volver");
        
        caja=new HBox(agregar,volver);
        grid.add(caja, 1, 5);
        escena=new Scene(grid,500,500);
        promotores= new ArrayList<>();
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

    public Label getNombre() {
        return nombre;
    }

    public void setNombre(Label nombre) {
        this.nombre = nombre;
    }

    public TextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(TextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public Label getApellido() {
        return apellido;
    }

    public void setApellido(Label apellido) {
        this.apellido = apellido;
    }

    public TextField getCampoApellido() {
        return campoApellido;
    }

    public void setCampoApellido(TextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public Label getCedula() {
        return cedula;
    }

    public void setCedula(Label cedula) {
        this.cedula = cedula;
    }

    public TextField getCampoCedula() {
        return campoCedula;
    }

    public void setCampoCedula(TextField campoCedula) {
        this.campoCedula = campoCedula;
    }

    public Label getHecho() {
        return hecho;
    }

    public void setHecho(Label hecho) {
        this.hecho = hecho;
    }
    
    public Button getAgregar() {
        return agregar;
    }

    public void setAgregar(Button agregar) {
        this.agregar = agregar;
    }
    
    public void addPromotor(Promotor promotor){
        this.promotores.add(promotor);
    }

    public ArrayList<Promotor> getPromotores() {
        return promotores;
    }

    public void setPromotores(ArrayList<Promotor> promotores) {
        this.promotores = promotores;
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
