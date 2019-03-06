/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;
import LogicaNegocio.*;
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
public class Finiciativa {
    private Stage stage;
    private Iniciativa iniciativa;
    private Scene escena;
    private GridPane grid;
    private Text titulo;
    private Label nombre;
    private TextField campoNombre;
    
    private Label tipo;
    private TextField campoTipo;
    
    private Label descripcion;
    private TextField campoDescripcion;
    
    private Label numPrestamistas;
    private TextField campoNumPrestamistas;
    
    private Label valorMax;
    private TextField campoValorMax;
    
    private Label valorMin;
    private TextField campoValorMin;
    
    private Label intervalo;
    private TextField campoIntervalo;
    
   
    
  
    private Button agregar;
    private Button  volver;
    private HBox caja;
    
    public Finiciativa() {
        stage= new Stage();
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        titulo= new Text("Formulario de Inicativa");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        nombre= new Label("Nombre: ");
        grid.add(nombre, 0, 1);
        
        campoNombre=new TextField();
        grid.add(campoNombre, 1, 1);
        
        tipo= new Label("Tipo: ");
        grid.add(tipo, 0, 2);
        
        campoTipo=new TextField();
        grid.add(campoTipo, 1, 2);
        
        descripcion=new Label("Descripcion: ");
        grid.add(descripcion, 0, 3);
        
        campoDescripcion=new TextField();
        grid.add(campoDescripcion, 1, 3);
        
        numPrestamistas=new Label("Numero de prestamistas: ");
        grid.add(numPrestamistas, 0, 4);
        
        campoNumPrestamistas=new TextField();
        grid.add(campoNumPrestamistas, 1, 4);
        
        valorMax=new Label("Valor maximo: ");
        grid.add(valorMax, 0, 5);
        
        campoValorMax=new TextField();
        grid.add(campoValorMax, 1, 5);
        
        valorMin=new Label("Valor minimo: ");
        grid.add(valorMin, 0, 6);
        
        campoValorMin=new TextField();
        grid.add(campoValorMin, 1, 6);
        
        intervalo=new Label("Intervalo en subasta: ");
        grid.add(intervalo, 0, 7);
        
        campoIntervalo=new TextField();
        grid.add(campoIntervalo, 1, 7);
        
        agregar= new Button("Agregar");
         volver=new Button("Volver");
        
        caja=new HBox(agregar, volver);
        grid.add(caja, 1, 9);
        escena=new Scene(grid,900,900);
        iniciativa=new Iniciativa(null, null, null, 0, 0, 0, 0, null, false);
        
       
        
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

    

    public Button getAgregar() {
        return agregar;
    }

    public void setAgregar(Button agregar) {
        this.agregar = agregar;
    }

    public Button getVolver() {
        return  volver;
    }

    public void setVolver(Button  volver) {
        this. volver =  volver;
    }

    public HBox getCaja() {
        return caja;
    }

    public void setCaja(HBox caja) {
        this.caja = caja;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Iniciativa getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Iniciativa iniciativa) {
        this.iniciativa = iniciativa;
    }

    public Label getTipo() {
        return tipo;
    }

    public void setTipo(Label tipo) {
        this.tipo = tipo;
    }

    public TextField getCampoTipo() {
        return campoTipo;
    }

    public void setCampoTipo(TextField campoTipo) {
        this.campoTipo = campoTipo;
    }

    public Label getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Label descripcion) {
        this.descripcion = descripcion;
    }

    public TextField getCampoDescripcion() {
        return campoDescripcion;
    }

    public void setCampoDescripcion(TextField campoDescripcion) {
        this.campoDescripcion = campoDescripcion;
    }

    public Label getNumPrestamistas() {
        return numPrestamistas;
    }

    public void setNumPrestamistas(Label numPrestamistas) {
        this.numPrestamistas = numPrestamistas;
    }

    public TextField getCampoNumPrestamistas() {
        return campoNumPrestamistas;
    }

    public void setCampoNumPrestamistas(TextField campoNumPrestamistas) {
        this.campoNumPrestamistas = campoNumPrestamistas;
    }

    public Label getValorMax() {
        return valorMax;
    }

    public void setValorMax(Label valorMax) {
        this.valorMax = valorMax;
    }

    public TextField getCampoValorMax() {
        return campoValorMax;
    }

    public void setCampoValorMax(TextField campoValorMax) {
        this.campoValorMax = campoValorMax;
    }

    public Label getValorMin() {
        return valorMin;
    }

    public void setValorMin(Label valorMin) {
        this.valorMin = valorMin;
    }

    public TextField getCampoValorMin() {
        return campoValorMin;
    }

    public void setCampoValorMin(TextField campoValorMin) {
        this.campoValorMin = campoValorMin;
    }

    public Label getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Label intervalo) {
        this.intervalo = intervalo;
    }

    public TextField getCampoIntervalo() {
        return campoIntervalo;
    }

    public void setCampoIntervalo(TextField campoIntervalo) {
        this.campoIntervalo = campoIntervalo;
    }
    
    
}
