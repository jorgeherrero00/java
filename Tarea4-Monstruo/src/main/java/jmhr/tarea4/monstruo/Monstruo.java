/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jmhr.tarea4.monstruo;

/**
 *
 * @author Jorge
 */
public class Monstruo {
    
    //Declaración de variables
    private String nombre;
    private int posicionX;
    private int posicionY;
    private String color;
    private boolean vivo = true;
    public enum COLOR{
        BLANCO,ROSA,AMARILO,ROJO,AZUL,VERDE
    }
    private int numMonstruosTotales;
    private int numMonstruosVivos;
    
    public static final int MIN_POSICION_X = 0;
    public static final int MAX_POSICION_X = 80;
    public static final int MIN_POSICION_Y = 0;
    public static final int MAX_POSICION_Y = 60;

    
    
    // Declaración del constructor monstruo
    public Monstruo(String nombre,int posicionX,int posicionY,String colorUsuario){
        this.nombre = nombre;
        //Comprobación de posición
        if (posicionX<MIN_POSICION_X||posicionX>MAX_POSICION_X && posicionY<MIN_POSICION_Y||posicionY>MAX_POSICION_Y) {
            this.posicionY = 0;
            this.posicionX = 0;
        } else{
            this.posicionX = posicionX;
            this.posicionY = posicionY;
        }

        // Comprobación de color pasado por el usuario
        COLOR [] c = COLOR.values();
        boolean colorEncontrado = false;
        for(COLOR color: c){
            if (color.name().equalsIgnoreCase(colorUsuario)) {
                colorEncontrado = true;
                break;
            }
        }
        
        if (colorEncontrado) {
            colorUsuario = color;
        }else{
            color = "Blanco";
        }
        
        vivo = true;
        
        numMonstruosTotales++;
        numMonstruosVivos++;        
    }
    
    //Constructor vacío
    public Monstruo(){
        nombre = "";
        posicionX = 0;
        posicionY = 0;
        color = "ROJO";
    }
    
    
    //GETTERS
    public String getNombre(){
        return nombre;        
    }
    
    public int getPosicionX(){
        return posicionX;
    }
    
    public int getPosicionY(){
        return posicionY;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getIsVivo(){
        return vivo;
    }
    
    public int getNumMonstruosTotales(){
        return numMonstruosTotales;
    }
    
    public int getNumMonstruosVivos(){
        return numMonstruosVivos;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPosicionX(int posicionX){
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY){
        this.posicionY = posicionY;
    }    
    
    public void setColor(String color){
        this.color = color;
    }
    
    //CAMBIO DE LA VARIABLE VIVO TRUE A FALSE
    public void muere(){
        if (vivo == false) {
            vivo = false;
        }

    }
    
    // MÉTODO DESPLAZARSE
    public void desplazarse(int unidadesX, int unidadesY, boolean derecha, boolean arriba){
        if (unidadesX<0 || unidadesY<0) {
            unidadesX = 0;
            unidadesY = 0;
        }else if(derecha == false){
            unidadesX = -unidadesX;
            
        }else if(arriba == false){
            unidadesY = -unidadesY;
        }
                
        }
    

    @Override
    public String toString(){
        return "El monstruo "+nombre+" está en la posición "+posicionX+", "+posicionY+", es de color "+color+" y está "+vivo;
    }
    }

