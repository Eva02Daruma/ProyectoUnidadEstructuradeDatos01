/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.Scanner;
import queue.Queue;



/**
 *
 * @author NVA
 */
public class AppColas {
    public static void main(String[] args){
        Queue<String> qHeroes= new Queue();
        qHeroes.add("BATMAN");
        qHeroes.add("SPIDERMAN");
        qHeroes.add("SUPERMAN");
        qHeroes.add("IRONMAN");
        qHeroes.add("MUJER MARAVILLA");
        qHeroes.add("SUPERGIRL");
        qHeroes.add("ANTMAN");
        qHeroes.add("AQUAMAN");
        qHeroes.add("LINTERNA VERDE");
        qHeroes.add("CAPITAN AMÉRICA");
        
        System.out.println("Estado de la Cola de SuperHérores a la espera ....");
        System.out.println(qHeroes.toString());
        
        qHeroes.add("THOR");
        
        System.out.println("Estado de la Cola de SuperHérores a la espera ....");
        System.out.println(qHeroes.toString());
        
        if (!qHeroes.isEmpty()){
            String heroe= qHeroes.remove();
            System.out.println("Estado de la Cola de SuperHérores a la espera ....");
            System.out.println(qHeroes.toString());
            System.out.println("Super Héroe Eliminado:  "+heroe);
        }
//        
//        System.out.print("Ingrese Nombre de Super Héroe para agregarlo: ");
//        Scanner sc= new Scanner(System.in);
//        String heroe= sc.nextLine().toUpperCase();
        
        
    }
   
    
}
