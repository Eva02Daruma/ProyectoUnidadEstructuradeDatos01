
package clasesTarjetas;

/**
 *
 * @author NVA
 */
public class Tarjeta {
    private static long generador=1000;
    private long numero;
    
    public Tarjeta(){
        generador++;
        numero=generador;
    }
    public Tarjeta(long num){
        numero=num;
    }
    public Tarjeta(Tarjeta t){
        numero= t.numero;
    }
    public void setNumero(long n){
        numero=n;
    }
    public long getNumero(){
        return numero;
    }
    public String toString(){
        return ""+numero;
    }
}
