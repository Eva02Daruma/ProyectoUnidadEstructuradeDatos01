/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCuentas;

import utiles.Rut;

/**
 *
 * @author nina.valdivia
 */
public class CuentaCorriente extends Cuenta {
    private double cargoMantencion;
    
    public CuentaCorriente(){
        super();
        this.cargoMantencion= 4100.0;
    }
    
    public CuentaCorriente(double cargo){
        super();
        this.cargoMantencion= cargo;
    }
    
    public CuentaCorriente(long numCuenta, String nomBanco,
                  Rut rut,double saldo,
                  String estado, double cargo){
        super(numCuenta, nomBanco, rut, saldo, estado);
        this.cargoMantencion= cargo;
    }
    
     public CuentaCorriente(long numCuenta, String nomBanco,
                  Rut rut,double saldo,
                  Estado estado, double cargo){
        super(numCuenta, nomBanco, rut,saldo, estado);
        this.cargoMantencion= cargo;
    }
     
     public CuentaCorriente(String cc){
        super();
        String[] datos;
        datos=cc.split(",");
        setNumCuenta(Long.parseLong(datos[0]));
        setNomBanco(datos[1]);
        setRut(new Rut(datos[2]));
        setSaldo(Double.parseDouble(datos[3]));
        setEstado(Estado.valueOf(datos[4])); 
        this.cargoMantencion= Double.parseDouble(datos[5]);
     }
    
     public CuentaCorriente(CuentaCorriente cc){
        super(cc.getNumCuenta(), cc.getNomBanco(), cc.getRut(), 
              cc.getSaldo(), cc.getEstado());
        this.cargoMantencion= cc.cargoMantencion;
    }
     
     public String toString(){
         return super.toString() + cargoMantencion;
     }

    public double getCargoMantencion() {
        return cargoMantencion;
    }

    public void setCargoMantencion(double cargoMantencion) {
        this.cargoMantencion = cargoMantencion;
    }
     
     
    
}
