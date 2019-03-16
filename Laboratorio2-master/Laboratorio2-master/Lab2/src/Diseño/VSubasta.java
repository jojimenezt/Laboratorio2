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
 * @author ADMIN
 */
public class VSubasta {
    private Stage stage;
    private Subasta subasta;
    private Scene escena;
    private Text titulo;
    private GridPane grid;
    
    private Label nombre;
    private Label nombreIniciativa;
    
    private Label tipo;
    private Label tipoIniciativa;
    
    private Label descripcion;
    private Label descripcionIniciativa;
   
    private Label valor;
    private Label valorIniciativa;
    
    private Label aportante;
    private Label nombreAportante;
    private Label aor;
    private Iniciativa iniciativa;
    private Button aceptar;
    private Button rechazar;
    private HBox caja;
    private int ac=0;

    public VSubasta() {
        stage= new Stage();
        this.grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        titulo= new Text("Subasta de iniciativa");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0,0,2,1);
        
        nombre= new Label("Nombre de la iniciativa: ");
        grid.add(nombre, 0, 1);
        nombreIniciativa= new Label(this.iniciativa.getNombre());
        grid.add(nombre, 1, 1);
        
        tipo= new Label("Tipo de la iniciativa: ");
        grid.add(nombre, 0, 2);
        nombreIniciativa= new Label(this.iniciativa.getTipo());
        grid.add(nombre, 1, 2);
        
        descripcion= new Label("Descripcion de la iniciativa: ");
        grid.add(nombre, 0, 3);
        descripcionIniciativa= new Label(this.iniciativa.getDescripcion());
        grid.add(nombre, 1, 3);
        
        aportante= new Label("Aportante");
        grid.add(nombre, 0, 4);
        nombreAportante=new Label(subasta.getPosiblesCompradores().get(ac).getNombre());
        grid.add(nombre, 1, 4);
        aor=new Label("Acepta o rechaza esta subasta");
        grid.add(aor, 0, 5);
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

    public Label getNombre() {
        return nombre;
    }

    public void setNombre(Label nombre) {
        this.nombre = nombre;
    }

    public Label getNombreIniciativa() {
        return nombreIniciativa;
    }

    public void setNombreIniciativa(Label nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public Label getTipo() {
        return tipo;
    }

    public void setTipo(Label tipo) {
        this.tipo = tipo;
    }

    public Label getTipoIniciativa() {
        return tipoIniciativa;
    }

    public void setTipoIniciativa(Label tipoIniciativa) {
        this.tipoIniciativa = tipoIniciativa;
    }

    public Label getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Label descripcion) {
        this.descripcion = descripcion;
    }

    public Label getDescripcionIniciativa() {
        return descripcionIniciativa;
    }

    public void setDescripcionIniciativa(Label descripcionIniciativa) {
        this.descripcionIniciativa = descripcionIniciativa;
    }

    public Label getValor() {
        return valor;
    }

    public void setValor(Label valor) {
        this.valor = valor;
    }

    public Label getValorIniciativa() {
        return valorIniciativa;
    }

    public void setValorIniciativa(Label valorIniciativa) {
        this.valorIniciativa = valorIniciativa;
    }

    public Label getAportante() {
        return aportante;
    }

    public void setAportante(Label aportante) {
        this.aportante = aportante;
    }

    public Label getNombreAportante() {
        return nombreAportante;
    }

    public void setNombreAportante(Label nombreAportante) {
        this.nombreAportante = nombreAportante;
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

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public Iniciativa getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Iniciativa iniciativa) {
        this.iniciativa = iniciativa;
    }

    public HBox getCaja() {
        return caja;
    }

    public void setCaja(HBox caja) {
        this.caja = caja;
    }
    
    
}
