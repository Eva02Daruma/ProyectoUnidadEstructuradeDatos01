
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
public class Debito extends TarjetaBancaria{
    private double saldo;
    
    public Debito(){
        super();
        this.saldo=0.0;
    }
    public Debito(String nomBanco, Cliente c, double saldo){
        super(nomBanco, c);
        this.saldo=saldo;
    }
    public Debito(long num, String nomBanco, Rut r, String nom, double saldo){
        super(num, nomBanco,r, nom);
        this.saldo=saldo;
    }
    public Debito(Debito td){
        super(td.nomBanco,td.cliente,td.getNumero());
        this.saldo=td.saldo;
    }
    
    //"1009,ITAU,79733720-K,Capitán América,150000"
    public Debito(String td){
        super();
        String[] datos= td.split(",");
        long numero;
        numero=Long.parseLong(datos[0]);
        this.setNumero(numero);
        this.nomBanco=datos[1];
        Rut r;
        r= new Rut(datos[2]);
        this.cliente= new Cliente(r,datos[3]);
        this.saldo=Double.parseDouble(datos[4]);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(super.toString());
        s.append(",");
        s.append(this.saldo);
        
        return s.toString();
    }
    
    public boolean toSave(String archivo){
        try{
            FileWriter f= new FileWriter(archivo,true);
            PrintWriter pf= new PrintWriter(f);
            pf.println("D,"+this.toString());
            pf.close();
            f.close();
            return true;
        }
        catch(IOException ex){
            return false;
        }
    }
}
    

