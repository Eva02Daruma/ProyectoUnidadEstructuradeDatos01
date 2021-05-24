/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesProyectoUnidad;

import utiles.Cliente;

/**
 *
 * @author jgalv
 */
public class Encomienda {
    private Cliente rut;
    private double valorDespacho;
    private int volumenEncomienda;
    
    public Encomienda(){
        this.rut = new Cliente();
        this.valorDespacho = 0.0;
        this.volumenEncomienda = 0;
  
    }
    
    public Encomienda(Cliente rut,double valorDes,int volEncom){
        this.rut = rut;
        this.valorDespacho = valorDes;
        this.volumenEncomienda = volEncom; 
    }
    
    public Encomienda(Encomienda encomienda){
        this.rut = encomienda.rut;
        this.valorDespacho = encomienda.valorDespacho;
        this.volumenEncomienda = encomienda.volumenEncomienda;
        
    }
    
    public Encomienda(String encomienda){
        String[] datos;
        datos = encomienda.split(",");
        this.rut = new Cliente(datos[0]);
        this.volumenEncomienda = Integer.parseInt(datos[1]);
        this.valorDespacho = Double.parseDouble(datos[2]);  
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(rut);
        s.append(",");
        s.append(volumenEncomienda);
        s.append(",");
        s.append(valorDespacho);
        return s.toString();
    }

    public Cliente getRut() {
        return rut;
    }

    public void setRut(Cliente rut) {
        this.rut = rut;
    }

    public double getValorDespacho() {
        return valorDespacho;
    }

    public void setValorDespacho(double valorDespacho) {
        this.valorDespacho = valorDespacho;
    }

    public int getVolumenEncomienda() {
        return volumenEncomienda;
    }

    public void setVolumenEncomienda(int volumenEncomienda) {
        this.volumenEncomienda = volumenEncomienda;
    }
    
    
    
}
