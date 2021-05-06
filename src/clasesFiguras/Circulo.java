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
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(){
        super();
        radio=1.0;
    }
    
    public Circulo(double r){
        super();
        radio=r;
    }
    public Circulo(Punto centro, double radio){
        super(centro);
        this.radio= radio;
    }
    
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio= radio;
    }
    
    public Circulo(String circulo){
        super();
        String[]datos = circulo.split(",");
        int x= Integer.parseInt(datos[0]);
        int y= Integer.parseInt(datos[1]);
        this.setCentro(new Punto(x,y));
        this.radio=Double.parseDouble(datos[2]);
    }
    
    public Circulo(Circulo c){
        super(c.getCentro());
        this.radio=c.radio;
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Ci,"+super.toString());
        s.append(",");
        s.append(radio);
        return s.toString();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularPerimetro(){
        return 2* Math.PI * radio;
    }
    
    public double calcularArea(){
        return Math.PI * radio*radio;
    }
}
