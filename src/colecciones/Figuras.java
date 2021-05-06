/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import clasesFiguras.Circulo;
import clasesFiguras.Cuadrado;
import clasesFiguras.Figura;
import clasesFiguras.Rectangulo;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import listaGenericaLLS.Lista;





/**
 *
 * @author ninavaldivia
 */
public class Figuras {
    private Lista<Figura> lista;
    
    public Figuras(){
        lista= new Lista();
    }
    
    //Constructor desde un archivo
    //Ci,x,y,radio
    //Sq,x,y,lado
    //Re,x,y,alto,ancho
    public Figuras(String archivo){
        lista= new Lista();
        try{
            FileReader f= new FileReader(archivo);
            Scanner s= new Scanner(f);
            //Ci - Sq - Re
            String linea;
            String[] datos;
            while(s.hasNextLine()){
                linea= s.nextLine();
                String figura= linea.substring(3);
                String tipo=linea.substring(0, 1); // inicia en 0 y termina en 1
                switch(tipo){
                    case "Ci":
                              Circulo c= new Circulo(figura);
                              lista.add(c);
                              break;
                    case "Sq":
                              Cuadrado q= new Cuadrado(figura);
                              lista.add(q);
                              break;
                    case "Re":
                              Rectangulo r= new Rectangulo(figura);
                              lista.add(r);
                              break;
                }
                
            }
            s.close();
            f.close();
        }
        catch(IOException e){
            
        }
    }
    
    public String toString(){
        return lista.toString();
    }
    
    public boolean add(Figura f){
        lista.addLast(f);
        return true;
    }
    
    public boolean remove(Figura f){
        return lista.remove(f);
    }
    
    public int totalRectangulos(){
        int total=0;
        for(Figura f: lista){
            if (f instanceof Rectangulo){
                total++;
            }
        }
        return total;
    }
    
    public String mostrarAreas(){
        StringBuilder s=new StringBuilder();
        double area;
        for(Figura fig: lista){
            if(fig instanceof Circulo){
                Circulo c= (Circulo)fig;
                area= c.calcularArea();
                s.append("Ci, ");
                s.append(c.toString()+" "+area+"\n");
            }
            else if(fig instanceof Cuadrado){
                Cuadrado r= (Cuadrado)fig;
                area= r.calcularArea();
                s.append("Cu, ");
                s.append(r.toString()+" "+area+"\n");
            }
             else if(fig instanceof Rectangulo){
                Rectangulo r= (Rectangulo)fig;
                area= r.calcularArea();
                s.append("Re, ");
                s.append(r.toString()+" "+area+"\n");
            }
        }
        return s.toString();
    }
    
    public double getPerimetroPrimerCirculo(){
        Iterator<Figura> it= lista.iterator();
        boolean esCirculo=false;
        double perimetro=0.0;
        Figura fig;
        while(it.hasNext() && !esCirculo){
            fig= it.next();
            if (fig instanceof Circulo){
                Circulo c=(Circulo)fig;
                perimetro= c.calcularPerimetro();
                esCirculo=true;
            }
        }
        return perimetro;
    }
   
}
