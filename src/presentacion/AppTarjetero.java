/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import colecciones.Tarjetero;

/**
 *
 * @author ninavaldivia
 */
public class AppTarjetero {
    public static void main(String[] args){
        Tarjetero tarjetero= new Tarjetero("tarjetas.txt");
        System.out.println("Tarjetero:\n"+ tarjetero.toString());
        if(tarjetero.esDebito()){
            System.out.println("Es Débito.....");
        }
        else{
            System.out.println("Es CRÉDITO.....");
        }
        System.out.println("\nTarjetero:\n"+ tarjetero.toString());
        
        System.out.println("Total Gasto Nacional: $"+ tarjetero.montoTotalGastoNacional());
        
        System.out.println("\nTarjetero:\n"+ tarjetero.toString());
    }
   
}
