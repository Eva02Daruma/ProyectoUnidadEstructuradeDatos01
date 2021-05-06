
package clasesTarjetas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import utiles.Cliente;
import utiles.Rut;

/**
 *
 * @author NVA
 */
public class Credito extends TarjetaBancaria {
    protected String nombreTarjeta;
    protected double cupoNacional;
    protected double gastoNacional;
    
    public Credito(){
        super();
        nombreTarjeta="visa";
        cupoNacional=500000.0;
        gastoNacional=0.0;
        
    }
    public Credito(String nombrebanco,Cliente c,String nomTarjeta){
        super(nombrebanco,c);
        nombreTarjeta=nomTarjeta;
        cupoNacional=500000.0;
        gastoNacional=0.0;
    }
    public Credito(String nombrebanco,Cliente c,String nomTarjeta,double cupo){
        super(nombrebanco,c);
        nombreTarjeta=nomTarjeta;
        cupoNacional=cupo;
        gastoNacional=0.0;
    }
    public Credito(String nombrebanco,Cliente c,String nomTarjeta,double cupo,double gasto){
        super(nombrebanco,c);
        nombreTarjeta=nomTarjeta;
        cupoNacional=cupo;
        gastoNacional=gasto;
    }
    public Credito(Credito c){
        super(c.nomBanco,c.getCliente());
        nombreTarjeta=c.nombreTarjeta;
        cupoNacional=c.cupoNacional;
        gastoNacional=c.gastoNacional;
    }
    public Credito(String cr){
        super();
        String []datos;
        datos=cr.split(",");
        int numero=Integer.parseInt(datos[0]);
        this.setNumero(numero);
        nomBanco=datos[1];
        Rut r=new Rut(datos[2]);
        cliente=new Cliente(r,datos[3]);
        nombreTarjeta=datos[4];
        cupoNacional=Double.parseDouble(datos[5]);
        gastoNacional=Double.parseDouble(datos[6]);
     }

    public String getnombreTarjeta() {
        return nombreTarjeta;
    }

    public void setnombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public double getCupoNacional() {
        return cupoNacional;
    }

    public void setCupoNacional(double cupoNacional) {
        this.cupoNacional = cupoNacional;
    }

    public double getGastoNacional() {
        return gastoNacional;
    }

    public void setGastoNacional(double gastoNacional) {
        this.gastoNacional = gastoNacional;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(",");
        s.append(this.nombreTarjeta);
        s.append(",");
        s.append(this.cupoNacional);
        s.append(",");
        s.append(this.gastoNacional);
         
        return s.toString();    
    }
    
    //-------------------------------------------------  MÉTODOS PROPIOS
    //PAGAR O ABONAR LA DEUDA NACIONAL
    
    public boolean pagarGastoNacional(double monto){
      return false;
        
    }
    
    //REALIZAR COMPRA NACIONAL CON LA TARJETA DE CRÉDITO
    public boolean comprarNacional(double monto){
      return false;
    }
    
    //ALMANCENAR DATOS DE LA TARJETA DE CRÉDITO
    public boolean toSave(String archivo){
        try{
            FileWriter f = new FileWriter(archivo);
            PrintWriter p=new PrintWriter(f);
            p.println("C,"+ this.toString());
            p.close();
            f.close();
            return true;
        }
        catch(IOException x){
            return false;
        }
        
    }
 }

