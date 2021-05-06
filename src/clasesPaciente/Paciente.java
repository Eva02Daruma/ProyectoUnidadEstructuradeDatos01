/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPaciente;

import utiles.Rut;

/**
 *
 * @author ninavaldivia
 */
public class Paciente {
    private Rut rut;
    private String nombrePaciente;
    private long numMovil;
    private Seguro seguro;
    private String medicoTratante;
    
    public Paciente(){
        this.rut= new Rut();
        this.nombrePaciente="SIN_DEFINIR";
        this.numMovil=0;
        this.seguro= Seguro.Particular;
        this.medicoTratante="SIN_DEFINIR";
    }
    
    public Paciente(Rut rut,String nombre, long celu,Seguro seguro, String medico){
        this.rut= new Rut(rut);
        this.nombrePaciente=nombre;
        this.numMovil=celu;
        this.seguro= seguro;
        this.medicoTratante=medico;
    }
    
    public Paciente(Rut rut, String nombre,long celu, String seguro, String medico){
        this.rut= new Rut(rut);        
        this.nombrePaciente=nombre;
        this.numMovil=celu;
        this.seguro= Seguro.valueOf(seguro);
        this.medicoTratante=medico;
    }
    
    public Paciente(String rut, String nombre, Seguro seguro, String medico){
        this.rut= new Rut(rut);
        this.nombrePaciente=nombre;
        this.seguro= seguro;
        this.medicoTratante=medico;
    }
    
    public Paciente(String rut, String nombre, long celu, String seguro, String medico){
        this.rut= new Rut(rut);
        this.nombrePaciente=nombre;
        this.numMovil=celu;
        this.seguro= Seguro.valueOf(seguro);
        this.medicoTratante=medico;
    }
    
    public Paciente(String paciente){
        String[] datos= paciente.split(",");
        this.rut= new Rut(datos[0]);
        this.nombrePaciente=datos[1];
        this.numMovil=Long.parseLong(datos[2]);
        this.seguro=Seguro.valueOf(datos[3]);
        this.medicoTratante=datos[4];
    }
    
    public Paciente(Paciente paciente){
        this.rut= new Rut(paciente.rut);
        this.nombrePaciente=paciente.nombrePaciente;
        this.numMovil=paciente.numMovil;
        this.seguro= paciente.seguro;
        this.medicoTratante=paciente.medicoTratante;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public long getNumMovil() {
        return numMovil;
    }

    public void setNumMovil(long numMovil) {
        this.numMovil = numMovil;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }
       
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(rut.toString());
        s.append(",");
        s.append(this.nombrePaciente);
        s.append(",");
        s.append(this.numMovil);
        s.append(",");        
        s.append(this.seguro.toString());
        return s.toString();
    }
}
