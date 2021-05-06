/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import clasesCorreo.Correo;

/**
 *
 * @author ninavaldivia
 */
public class GestorDeCorreos {
    private Bandeja entrada;
    private Bandeja leidos;
    private Bandeja revisar;
    private Bandeja urgentes;
 
    public GestorDeCorreos(){
        entrada= new Bandeja();
        leidos= new Bandeja();
        revisar=new Bandeja();
        urgentes=new Bandeja();
    }
    public GestorDeCorreos(String arch){
        entrada= new Bandeja(arch);
        leidos= new Bandeja();
        revisar=new Bandeja();
        urgentes=new Bandeja();   
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Entrada\n");
        s.append(entrada.toString());
        s.append("\nLeídos\n:");
        s.append(leidos.toString());
        s.append("\nUrgentes\n:");
        s.append(urgentes.toString());
        s.append("\nRevisar\n:");
        s.append(revisar.toString());
        
        return s.toString();
    }
    
    public String toStringEntrada(){
        return entrada.toString();
    }
    public String toStringLeidos(){
        return leidos.toString();
    }
    public String toStringRecibidos(){
        return revisar.toString();       
    }
    public String toStringUrgentes(){
        return urgentes.toString();
    }
    
    public boolean agregarEnEntrada(Correo c){
        return entrada.agregar(c);
    }
    public boolean agregarEnLeidos(Correo c){
        return leidos.agregar(c);
    }
    public boolean agregarEnRevisar(Correo c){
        return revisar.agregar(c);
    }
    public boolean agregarEnUrgentes(Correo c){
        return urgentes.agregar(c);
    }
    
    public Correo obtenerDeEntrada(){
        return entrada.obtener();
    }
    public Correo obtenerDeLeidos(){
        return leidos.obtener();
    }
    public Correo obtenerDeRevisar(){
        return revisar.obtener();
    }
    public Correo obtenerDeUrgentes(){
        return urgentes.obtener();
    }
    
}
