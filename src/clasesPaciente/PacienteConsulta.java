/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPaciente;

import utiles.Fecha;
import utiles.Rut;

/**
 *
 * @author ninavaldivia
 */
public class PacienteConsulta  extends Paciente{
    private String especialidad;
    private Sede sede;
    
    public PacienteConsulta(){
        super();
        this.especialidad="SIN_DEFINIR";
        this.sede=Sede.SIN_DEFINIR;
    }   
    public PacienteConsulta(Rut rut, String nombre, long celu, String seguro, String medico,
                            String especialidad, String sede){
        super(rut,nombre,celu,seguro,medico);
        this.especialidad=especialidad;
        this.sede=Sede.valueOf(sede);
    }
    public PacienteConsulta(String p){
        super();
        String[]datos= p.split(",");
        this.setRut(new Rut(datos[0]));
        this.setNombrePaciente(datos[1]);
        this.setNumMovil(Long.parseLong(datos[2]));
        this.setSeguro(Seguro.valueOf(datos[3]));
        this.setMedicoTratante(datos[4]);
        
        this.especialidad=datos[5];
        this.sede=Sede.valueOf(datos[6]);
        
    }    
    public PacienteConsulta(PacienteConsulta p){
        super(p.getRut(), p.getNombrePaciente(),p.getNumMovil(),p.getSeguro(),p.getMedicoTratante());
        
        this.especialidad=p.especialidad;
        this.sede=p.sede;
    }
    
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(super.toString());
        s.append(",");
        s.append(this.especialidad);
         s.append(",");
        s.append(this.sede.toString());
        return s.toString();
    }
    
}
