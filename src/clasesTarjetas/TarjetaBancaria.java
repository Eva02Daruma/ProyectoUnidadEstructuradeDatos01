package clasesTarjetas;

import utiles.Cliente;
import utiles.Rut;



/**
 * 
 * @author NVA
 */



 public class TarjetaBancaria extends Tarjeta{
    protected String nomBanco;
    protected Cliente cliente;
    
    
    public TarjetaBancaria(){
        super();
        nomBanco ="Banco Estado";
        cliente= new Cliente();
    }
    public TarjetaBancaria(long numero, String banco, Rut rut, String nombre){
        super(numero);
        this.nomBanco=banco;
        this.cliente= new Cliente(rut, nombre);
    }
    
    public TarjetaBancaria(String nomB,Cliente c,long numero){
        super(numero);
        this.nomBanco=nomB;
        this.cliente=new Cliente(c);
    }
    
    public TarjetaBancaria(String nomBanco, Cliente c){
        super();
        this.nomBanco=nomBanco;
        this.cliente=new Cliente(c);
    }
    
    public TarjetaBancaria(TarjetaBancaria tb){
        super(tb.getNumero());
        this.nomBanco=tb.nomBanco;
        this.cliente= new Cliente(tb.cliente);
    }
    
    public TarjetaBancaria(String tb){
        super();
        String []datos;
        datos=tb.split(",");
        int numero=Integer.parseInt(datos[0]);
        this.setNumero(numero);
//        this.numero=numero;
        nomBanco=datos[1];
        Rut r=new Rut(datos[2]);
        cliente=new Cliente(r,datos[3]);
     }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString(){        
         StringBuilder s = new StringBuilder();
         s.append(super.toString());
         s.append(",");
         s.append(nomBanco);
         s.append(",");
         s.append(cliente);        
         return s.toString();    
     }
    
   
}
