/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;
import LogicaNegocio.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
public class VAportar {
   private Stage stage;
    private Subasta subasta;
    private Scene escena;
    private Text titulo;
    private GridPane grid;
    
    private Label tasaInteres;
    private Label nombreTasaInteres;
    
    private Label meses;
    private Label cantMeses;
    
    private Label aor;
    
    private Button aceptar;
    private Button rechazar;
    private HBox caja;
    
    public VAportar() {
        stage= new Stage();
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        titulo= new Text("Informacion de la subasta");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        tasaInteres= new Label("Tasa de interes ");
        grid.add(tasaInteres, 0, 1);
        tasaInteres= new Label();
        grid.add(tasaInteres, 1, 1);
        
        cantMeses= new Label("Cantidad de meses: ");
        grid.add(cantMeses, 0, 2);
        cantMeses= new Label();
        grid.add(cantMeses, 1, 2);
        aor=new Label("Acepta o rechaza esta subasta");
        grid.add(aor, 0, 3);
        aceptar= new Button("Aceptar");
        rechazar= new Button("rechazar");
        
        caja=new HBox(aceptar,rechazar);
        grid.add(caja, 1, 4);
        
        escena=new Scene(grid,500,500);
    }
    
    public void show(Stage stage){
        stage.setTitle("Subasta");
        stage.setScene(escena);
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Text getTitulo() {
        return titulo;
    }

    public void setTitulo(Text titulo) {
        this.titulo = titulo;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Label getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Label tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Label getNombreTasaInteres() {
        return nombreTasaInteres;
    }

    public void setNombreTasaInteres(Label nombreTasaInteres) {
        this.nombreTasaInteres = nombreTasaInteres;
    }

    public Label getMeses() {
        return meses;
    }

    public void setMeses(Label meses) {
        this.meses = meses;
    }

    public Label getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(Label cantMeses) {
        this.cantMeses = cantMeses;
    }

    public Label getAor() {
        return aor;
    }

    public void setAor(Label aor) {
        this.aor = aor;
    }

    public Button getAceptar() {
        return aceptar;
    }

    public void setAceptar(Button aceptar) {
        this.aceptar = aceptar;
    }

    public Button getRechazar() {
        return rechazar;
    }

    public void setRechazar(Button rechazar) {
        this.rechazar = rechazar;
    }

    public HBox getCaja() {
        return caja;
    }

    public void setCaja(HBox caja) {
        this.caja = caja;
    }
    
}
