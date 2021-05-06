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
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        x=0;
        y=0;
    }
    
    public Punto(int x, int y){
        this.x= x;
        this.y= y;
    }
    
    public Punto(String p){
        String[] datos=p.split(",");
        this.x= Integer.parseInt(datos[0]);
        this.y= Integer.parseInt(datos[1]);
    }
    
    public Punto(Punto p){
        this.x= p.x;
        this.y= p.y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
