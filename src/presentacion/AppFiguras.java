/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import clasesFiguras.Circulo;
import clasesFiguras.Cuadrado;
import clasesFiguras.Rectangulo;
import colecciones.Figuras;

/**
 *
 * @author nina.valdivia
 */
public class AppFiguras {
    public static void main(String[] args){
        Figuras dibujo= new Figuras();
        
        Cuadrado sq1= new Cuadrado(4);
        Cuadrado sq2= new Cuadrado(3,2,10);
        Circulo c1= new Circulo(1,5,6);
        Circulo c2= new Circulo(3);
        Rectangulo r1= new Rectangulo(4,4,12,5);
        Rectangulo r2= new Rectangulo(8,2);
        dibujo.add(c1);
        dibujo.add(sq1);
        dibujo.add(c2);
        dibujo.add(r2);
        
        System.out.println("Figuras\n" + dibujo.toString());
        System.out.println("Figuras y áreas\n"+dibujo.mostrarAreas());

    }
}
