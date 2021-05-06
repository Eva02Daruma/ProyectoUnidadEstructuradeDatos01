/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import clasesCorreo.Correo;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import stack.Stack;

/**
 *
 * @author ninavaldivia
 */
//Colección de correos
public class Bandeja {
    private Stack<Correo> recibidos;
    
    public Bandeja(){
        recibidos= new Stack();
    }
    public Bandeja(String arc){
        recibidos= new Stack();
        try{
            FileReader f= new FileReader(arc);
            Scanner s= new Scanner(f);
            String linea;
            
            while (s.hasNextLine()){
                linea= s.nextLine();
                Correo c= new Correo(linea);
                recibidos.push(c);
            }
            s.close();
            f.close();
            
        }     
        catch(IOException ex){
            
        }
    }
    
    public String toString(){
        return recibidos.toString();
    }
    
    public boolean agregar(Correo c){
        return recibidos.push(c);
    }
    
    public Correo obtener(){
        if(!recibidos.isEmpty()){
            return recibidos.pop();
        }
        return null;
    }
    
    
}
