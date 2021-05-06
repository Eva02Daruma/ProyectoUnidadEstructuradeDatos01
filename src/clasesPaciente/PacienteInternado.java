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
public class PacienteInternado extends Paciente{
    private Estado estado;
    private int dias;
    
    public PacienteInternado(){
        super();
        this.estado=Estado.Tratamiento;
        this.dias=1;
    }    
    public PacienteInternado(Rut rut, String nombre, long celu, String seguro, String medico,
                            Estado estado){
        super(rut,nombre,celu,seguro,medico);
        this.estado=estado;
        this.dias=1;
    }
    public PacienteInternado(PacienteInternado p){
        super(p.getRut(), p.getNombrePaciente(),p.getNumMovil(),p.getSeguro(),p.getMedicoTratante());
        
        this.estado=p.estado;
        this.dias=p.dias;
    }    
    public PacienteInternado(String p){
        super();
        String[]datos= p.split(",");
        this.setRut(new Rut(datos[0]));
        this.setNombrePaciente(datos[1]);
        this.setNumMovil(Long.parseLong(datos[2]));
        this.setSeguro(Seguro.valueOf(datos[3]));
        this.setMedicoTratante(datos[4]);
        
        this.estado=Estado.valueOf(datos[5]);
        this.dias=Integer.parseInt(datos[6]);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(super.toString());
        s.append(",");
        s.append(this.estado.toString());
        s.append(",");
        s.append(this.dias);
        return s.toString();
    }
    
    public void aumentarDia(){
        this.dias++;
    }
}
