/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import stack.Stack;

//import java.util.Stack;


/**
 *
 * @author ninavaldivia
 */
public class AppStacks {
    public static void main(String[] args){
        Stack<String> nomina= new Stack();
        
        nomina.push("Javiera");
        nomina.push("Luis");
        nomina.push("Ana");
        nomina.push("Hugo");
        nomina.push("Ema");
        nomina.push("Pepito");
        
        System.out.println("Nómina:\n"+ nomina.toString());
        
        if(!nomina.isEmpty()){
            System.out.println("Último ingresado: "+ nomina.pop().toString() );
        }
        
        System.out.println("\nNómina:\n"+ nomina.toString());
    }
}
