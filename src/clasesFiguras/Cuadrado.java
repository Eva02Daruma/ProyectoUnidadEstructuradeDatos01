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
public class Cuadrado extends Rectangulo{
    
    public Cuadrado(){
        super();
    }
    public Cuadrado(double lado){
        super(lado, lado);
        
    }
    public Cuadrado(Punto x, double lado){
        super(x, lado, lado);
    }
    public Cuadrado(int x, int y, double lado){
        super();
        Punto p= new Punto(x,y);
        this.setAncho(lado);
        this.setAlto(lado);
    }
    public Cuadrado(String c){
        super();
        String[] datos= c.split(",");
        int x= Integer.parseInt(datos[0]);
        int y= Integer.parseInt(datos[1]);
        Punto p= new Punto(x,y);
        this.setCentro(p);
        this.setAlto(Double.parseDouble(datos[2]));
        this.setAncho(Double.parseDouble(datos[2]));
    }
    
    public Cuadrado(Cuadrado c){
        super(c.getCentro(), c.getAlto(), c.getAncho());      
    }
    
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Sq,"+getCentro().toString());
        s.append(",");
        s.append(getAncho());
        
        return s.toString();
    }
    
    
}
