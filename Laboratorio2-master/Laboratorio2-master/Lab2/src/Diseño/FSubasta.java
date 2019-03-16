/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;
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
public class FSubasta {
    private Scene escena;
    private GridPane grid;
    private Text titulo;
    private Label cedulaPromotor;
    private TextField campoCedulaPromotor;
    
    private Label nombreIniciativa;
    private TextField campoNombreIniciativa;
    
    private Label hecho;
  
    private Button agregar;
    private Button volver;
    private HBox caja;
    
    private Stage stage;

    public FSubasta() {
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        stage=new Stage();
        
        titulo= new Text("Formulario de Subasta");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        cedulaPromotor= new Label("Cedula Promotor: ");
        grid.add(cedulaPromotor, 0, 1);
        
        campoCedulaPromotor=new TextField();
        grid.add(campoCedulaPromotor, 1, 1);
        
        nombreIniciativa= new Label("Nombre Iniciativa: ");
        grid.add(nombreIniciativa, 0, 2);
        
        campoNombreIniciativa=new TextField();
        grid.add(campoNombreIniciativa, 1, 2);
        hecho=new Label("");
        grid.add(hecho, 0, 3);
        
        agregar= new Button("Agregar");
        volver=new Button("Volver");
        
        caja=new HBox(agregar,volver);
        grid.add(caja, 1, 4);
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

    public Label getCedulaPromotor() {
        return cedulaPromotor;
    }

    public void setCedulaPromotor(Label cedulaPromotor) {
        this.cedulaPromotor = cedulaPromotor;
    }

    public TextField getCampoCedulaPromotor() {
        return campoCedulaPromotor;
    }

    public void setCampoCedulaPromotor(TextField campoCedulaPromotor) {
        this.campoCedulaPromotor = campoCedulaPromotor;
    }

    public Label getNombreIniciativa() {
        return nombreIniciativa;
    }

    public void setNombreIniciativa(Label nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public TextField getCampoNombreIniciativa() {
        return campoNombreIniciativa;
    }

    public void setCampoNombreIniciativa(TextField campoNombreIniciativa) {
        this.campoNombreIniciativa = campoNombreIniciativa;
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

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }  

}
