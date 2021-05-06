/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCorreo;

/**
 *
 * @author ninavaldivia
 */
public class Correo {
    private String emisor;
    private String mensaje;
    
    public Correo(){
         emisor="SIN_DEFINIR";
         mensaje="VACÍO";
    }
    public Correo(String emisor, String mensaje){
        this.emisor=emisor;
        this.mensaje=mensaje;
    }
    public Correo(String correo){
        String[] datos= correo.split(",");
        this.emisor= datos[0];
        this.mensaje=datos[1];
    }
    public Correo(Correo correo){
        this.emisor= correo.emisor;
        this.mensaje= correo.mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String toString(){
        return emisor+","+mensaje;
    }
}
