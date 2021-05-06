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
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;
    
    public Rectangulo(){
        super();
        alto=1.0;
        ancho=1.0;
    }
    
    public Rectangulo(double alto, double ancho){
        super();
        this.alto=alto;
        this.ancho= ancho;
    }

    public Rectangulo(Punto c, double alto, double ancho){
        super(c);
        this.alto=alto;
        this.ancho=ancho;
    }
    public Rectangulo(int x, int y, double alto, double ancho){
        super(x,y);
        this.alto=alto;
        this.ancho=ancho;
    }
    public Rectangulo(String rec){
        super();
        String[] datos=rec.split(",");
        int x= Integer.parseInt(datos[0]);
        int y= Integer.parseInt(datos[1]);
        Punto p= new Punto(x,y);
        this.setCentro(p);
        this.alto=Double.parseDouble(datos[2]);
        this.ancho=Double.parseDouble(datos[3]);
    }
    public Rectangulo(Rectangulo rec){
        super(rec.getCentro());
        this.alto=rec.alto;
        this.ancho=rec.ancho;
    }
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Re,"+super.toString());
        s.append(",");
        s.append(alto);
        s.append(",");
        s.append(ancho);
        
        return s.toString();
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double calcularArea(){
        return alto*ancho;
    }
    public double calcularPerimetro(){
        return 2*alto + 2*ancho;
    }
}
