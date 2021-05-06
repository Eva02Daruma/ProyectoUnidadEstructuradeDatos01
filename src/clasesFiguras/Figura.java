/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesFiguras;

/**
 *
 * @author ninavaldivia
 */
public class Figura {
    private Punto centro;
    
    public Figura(){
        centro= new Punto();
    }
    
    public Figura(Punto p){
        centro= new Punto(p);
    }
    
    public Figura(int x, int y){
        centro= new Punto(x,y);
    }
    
    public Figura(Figura f){
        centro= new Punto(f.centro);
    }
    public String toString(){
        return centro.toString();
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public void setCentro(int x, int y) {
        this.centro = new Punto(x,y);
    }
    
}
