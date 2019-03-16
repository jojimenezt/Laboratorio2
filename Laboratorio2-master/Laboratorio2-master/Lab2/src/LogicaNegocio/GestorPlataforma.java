package LogicaNegocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class GestorPlataforma extends Persona{
    private double fondo;
    private ArrayList<Promotor> promotor;
    private ArrayList<Aportante> prestamistas;
    private Subasta subasta;
    private boolean comprado;

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
    
    public GestorPlataforma(double fondo, ArrayList<Promotor> promotor, ArrayList<Aportante> prestamistas, String nombre, String apellido, int cedula) {
        super(nombre, apellido,cedula);
        this.fondo = fondo;
        this.promotor = promotor;
        this.prestamistas = prestamistas;
        Iniciativa iniciativa=new Iniciativa();
        this.subasta= new Subasta(0.0,0,iniciativa);
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public ArrayList<Promotor> getPromotor() {
        return promotor;
    }

    public void setPromotor(ArrayList<Promotor> promotor) {
        this.promotor = promotor;
    }

    public ArrayList<Aportante> getPrestamistas() {
        return prestamistas;
    }

    public void setPrestamistas(ArrayList<Aportante> prestamistas) {
        this.prestamistas = prestamistas;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }
    
    public void addPromotor(Promotor promotor){
        this.promotor.add(promotor);
    }
    
    public void addPrestamista(Aportante prestamista){
        this.prestamistas.add(prestamista);
    }
    
    public void addDinero(Aportante prestamista, double dinero){
        setFondo(this.fondo+dinero);
        prestamista.setDinero(prestamista.getDinero()-dinero);
    }
    
    public void tramitarPrestamo(Promotor promotor, String inciativa, double dinero){
        setFondo(this.fondo-dinero);
        Iniciativa iniciativa=promotor.presentarIniciativa(inciativa);
        if(iniciativa.isSubastado()==false && dinero>=iniciativa.getValorMin() && dinero<=iniciativa.getValorMax()){
            iniciativa.setValorPosSubasta(dinero);
            iniciativa.setSubastado(true);
        }else{
            if(dinero<iniciativa.getValorMin()){
                throw new IllegalArgumentException("El monto otorgado es insuficiente para la iniciativa");
    
            }else{
                throw new IllegalArgumentException("El monto excede el valor maximo de la iniciativa");
            }
        }
    }
    
    public ArrayList<Aportante> crearSubasta(Iniciativa iniciativa){
        subasta.setIniciativa(iniciativa);
        
        this.subasta.setValorMax(iniciativa.getValorMax());
        this.subasta.setValorMin(iniciativa.getValorMin());
        this.subasta.setIntervalo(iniciativa.getIntervalo());
        ArrayList<Aportante> posiblesCompradores = new ArrayList<>();
        for(int i=0;i<=this.prestamistas.size();i++){
                posiblesCompradores.add(this.prestamistas.get(i));
        }
        subasta.setPosiblesCompradores(posiblesCompradores);
        return posiblesCompradores;
    }
    
    public void procesarSubasta(Iniciativa iniciativa){
        if(iniciativa.getValorMin() > iniciativa.getValorMax()){
            return;
        }else{
            ArrayList<Aportante> posiblesCompradores = crearSubasta(iniciativa);
            for (int i=0;i<=posiblesCompradores.size();i++){
                if(posiblesCompradores.get(i).getDinero()>=iniciativa.getValorMax()){
                    //mostrar pestaña compra por parte prestamista
                    if(posiblesCompradores.get(i).isComproIniciativa()){//Si en algun momento aceptan la subasta se cancela el ciclo, y tramitamos prestamo
                        break;
                    }    
                }
            }
            if(comprado){
                // estableces tasa etc
                //tramitar prestamo
                //mandar datos promotor
            }
            else{
                iniciativa.setValorMax(iniciativa.getValorMax()-iniciativa.getIntervalo());
                procesarSubasta(iniciativa);
            }
        }
    }
    
    public void eliminarPosibleComprador(String nombre,Iniciativa iniciativa){
        ArrayList<Aportante> aportantes= crearSubasta(iniciativa);
        for(int i=0;i<aportantes.size();i++){
            if(aportantes.get(i).getNombre().equals(nombre)){
                aportantes.remove(i);
            }
        }
    }
    //Metodo que hace que un aportante acepte iniciativa
    public void aceptarAportanteIniciativa(Aportante aportante, Iniciativa iniciativa){
        aportante.setComproIniciativa(true);
        iniciativa.setSubastado(true);
    }
    
    public ArrayList<Aportante> rechazarAportanteIniciativa(Aportante aportante, Iniciativa iniciativa){
        ArrayList<Aportante> posiblesCompradores2= new ArrayList<>();
        posiblesCompradores2= crearSubasta(iniciativa);
        for(int i=0;i<posiblesCompradores2.size();i++){
            if(posiblesCompradores2.get(i).equals(aportante)){
                posiblesCompradores2.remove(i);
            }
        }
        
        return posiblesCompradores2;
        
    }
    
    public Iniciativa getIniciativa(int cedulaPromotor, String nombreIniciativa){
        Iniciativa resultado=null;
        Promotor promotorResultado=null;
        for (int i = 0; i < this.promotor.size(); i++) {
            if(this.promotor.get(i).getCedula()==cedulaPromotor){
                promotorResultado=this.promotor.get(i);
            }
        }
        for (int i = 0; i < promotorResultado.getIniciativa().size(); i++) {
            if(promotorResultado.getIniciativa().get(i).getNombre().equals(nombreIniciativa)){
                resultado=promotorResultado.getIniciativa().get(i);
            }
        }
        return resultado;
    }
}
