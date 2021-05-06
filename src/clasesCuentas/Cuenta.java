/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCuentas;


import utiles.Rut;


/**
 *
 * @author ninavaldivia
 */
public class Cuenta {
        //atributos
    private long numCuenta;
    private String nomBanco;
    private Rut rut;
    private double saldo;
    private Estado estado;
    
    //1. Constructores
    public Cuenta(){        
        this.numCuenta= 0;
        this.nomBanco="Chile";
        this.rut=new Rut(); 
        this.saldo=0.0;
        this.estado=Estado.ACTIVA;
    }
    
    public Cuenta(long numCuenta, String nomBanco,
                  Rut rut, double saldo,
                  String estado){
        this.numCuenta =numCuenta;
        this.nomBanco=nomBanco;
        this.rut= new Rut(rut);
        this.saldo=saldo;
        this.estado= Estado.valueOf(estado);
    }
    
    public Cuenta(long numCuenta, String nomBanco,
                  Rut rut, double saldo,
                  Estado estado){
        this.numCuenta =numCuenta;
        this.nomBanco=nomBanco;
        this.rut= new Rut(rut);
        this.saldo=saldo;
        this.estado= estado;
    }
    
    public Cuenta(String cuenta){
        String[] datos;
        datos=cuenta.split(",");
        this.numCuenta= Long.parseLong(datos[0]);
        this.nomBanco=datos[1];
        this.rut=new Rut(datos[2]);        
        this.saldo=Double.parseDouble(datos[3]);
        this.estado=Estado.valueOf(datos[4]);      
    }
    
    public Cuenta(Cuenta cuenta){
        this.numCuenta=cuenta.numCuenta;
        this.nomBanco=cuenta.nomBanco;
        this.rut= new Rut(cuenta.rut);
        this.saldo=cuenta.saldo;
        this.estado=cuenta.estado;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }
    public void setRut(String rut){
        this.rut= new Rut(rut);
    }
    public void setRut(int rut){
        this.rut= new Rut(rut);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }   
}
