/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesFiguras;

/**
 *
 * @author nina.valdivia
 */
public class Triangulo extends Figura{
    private int a;
    private int b;
    private int c;
    
    public Triangulo(){
        super();
        this.a=1;
        this.b=1;
        this.c=1;
    }
    
    public Triangulo(int a, int b, int c){
        super();
        if((a+b)>c && (b+c)>a && (c+a>b)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            this.a=1;
            this.b=1;
            this.c=1;
        }
    }
    
    public Triangulo(Punto p, int a, int b, int c){
        super(p);
         if((a+b)>c && (b+c)>a && (c+a>b)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            this.a=1;
            this.b=1;
            this.c=1;
        }
    }
    public Triangulo(int x, int y, int a, int b, int c){
        super(x,y);
         if((a+b)>c && (b+c)>a && (c+a>b)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            this.a=1;
            this.b=1;
            this.c=1;
        }
    }
    //"0,0,3,5,4"
     public Triangulo(String triangulo){
        super();
        String[]datos = triangulo.split(",");
        int x= Integer.parseInt(datos[0]);
        int y= Integer.parseInt(datos[1]);
        this.setCentro(new Punto(x,y));
        int a=Integer.parseInt(datos[2]);
        int b=Integer.parseInt(datos[3]);
        int c=Integer.parseInt(datos[4]);
        if((a+b)>c && (b+c)>a && (c+a>b)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            this.a=1;
            this.b=1;
            this.c=1;
        }  
    }
    public Triangulo(Triangulo t){
        super(t.getCentro());
        this.a=t.a;
        this.b=t.b;
        this.c=t.c;
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("Tr,"+super.toString());
        s.append(",");
        s.append(this.a);
        s.append(",");
        s.append(this.b);
        s.append(",");
        s.append(this.c);
        return s.toString();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double calcularArea(){
        double s=semiPerimetro();
        double valor= (s - a)*(s - b)*(s -c);
        return Math.sqrt(s*valor);
    }
    
    private double semiPerimetro(){
        return (a + b + c)/2;
    }
    
    public int calcularPerimetro(){
        return (a + b + c);
    }
    
    public TipoTriangulo tipoTriangulo(){
        if (a==b && b==c && a==c){
            return TipoTriangulo.Equilatero;
        }
        else if(a==b || b==c || c==a ){
            return TipoTriangulo.Isosceles;
        }
        else{
            return TipoTriangulo.Escaleno;
        }         
    }
    
    public double calcularHa(){
        double s=semiPerimetro();
        double valor= (s - a)*(s - b)*(s -c);
        return (2/this.a)*Math.sqrt(s*valor);
    }
    public double calcularHb(){
        double s=semiPerimetro();
        double valor= (s - a)*(s - b)*(s -c);
        return (2/this.b)*Math.sqrt(s*valor);
    }
    public double calcularHc(){
        double s=semiPerimetro();
        double valor= (s - a)*(s - b)*(s -c);
        return (2/this.c)*Math.sqrt(s*valor);
    }
    
}
