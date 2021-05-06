/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import clasesTarjetas.Credito;
import clasesTarjetas.Debito;
import clasesTarjetas.TarjetaBancaria;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import stack.Stack;

/**
 *
 * @author ninavaldivia
 */
public class Tarjetero {
    private Stack<TarjetaBancaria> tarjetero;
    
    public Tarjetero(){
        tarjetero= new Stack();
        
    }
    public Tarjetero(String arch){
        tarjetero= new Stack();
        try{
            FileReader f= new FileReader(arch);
            Scanner s= new Scanner(f);
            String linea;
            String strTarjeta;
            char tipoTarjeta;
            while(s.hasNextLine()){
                linea=s.nextLine();
                tipoTarjeta=linea.charAt(0);
                strTarjeta=linea.substring(2);
                if (tipoTarjeta=='C'){
                    Credito c= new Credito(strTarjeta);
                    tarjetero.push(c);
                }
                else{
                    Debito d= new Debito(strTarjeta);
                    tarjetero.push(d);
                }
                
            }
            s.close();
            f.close();
            
        }
        catch(IOException ex){
            
        }
    }
    
    public String toString(){
        return tarjetero.toString();
    }

    public Stack<TarjetaBancaria> getTarjetero() {
        return tarjetero;
    }

    public void setTarjetero(Stack<TarjetaBancaria> tarjetero) {
        this.tarjetero = tarjetero;
    }
    
    public boolean esDebito(){
        TarjetaBancaria t= tarjetero.pop();
        tarjetero.push(t);
        if (t instanceof Debito){
            return true;
        }
        return false;
    }
    
    public double montoTotalGastoNacional(){
        double monto=0.0;
        Stack<TarjetaBancaria> s= new Stack();
        TarjetaBancaria t;
        while (!tarjetero.isEmpty()){    
            t=tarjetero.pop();
            s.push(t);
            if (t instanceof Credito){
                Credito c= (Credito)t;
                monto= monto + c.getGastoNacional();
            }
        }
        //Restaurar el stack tarjetero
        while (!s.isEmpty()){
            TarjetaBancaria e= s.pop();
            tarjetero.push(e);
        }
        
        return monto;
    }
}
