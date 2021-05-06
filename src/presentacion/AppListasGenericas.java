/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;


import java.util.Iterator;
import static java.util.Spliterators.iterator;
import listaGenericaLLS.Lista;

/**
 *
 * @author nina.valdivia
 */
public class AppListasGenericas {
    public static void main(String[] args){
        Lista<String> miListaString = new Lista();
        Lista<Integer> miListaInt = new Lista();
        Lista<Double> miListaDouble= new Lista();
        Lista<Object> lista= new Lista();
        
        lista.addLast("Hola");
        lista.addLast(3);
        lista.addLast(12.5);
        
        
        
        miListaString.addLast("Arica");
        miListaString.addLast("Iquique");
        miListaString.addLast("Copiapó");
        miListaString.addLast("La Serena");
        miListaString.addLast("Valparaíso");
        
        System.out.println("Lista de Ciudades: \n"+miListaString.toString());
        
        miListaInt.addLast(12);
        miListaInt.addLast(458);
        miListaInt.addLast(25);
        
        System.out.println("Lista de Números Enteros: \n"+miListaInt.toString());
        
        miListaDouble.addLast(12.5);
        miListaDouble.addLast(50.0);
        
         System.out.println("Lista de Números double: \n"+miListaDouble.toString());
         
        
        for(String ciudad: miListaString){
            if (ciudad.equals("Copiapó")){
                System.out.println("\n\nUsando For each:  Hace calor en Copiapó\n");
            }
            
        }
         
         
        //Esto lo agregué después, ya que nuestra Lista Genérica es ITERABLE:
        //2da. forma de utilizar
        
        Iterator<String> it= miListaString.iterator();
        boolean encontrado=false;
        while (it.hasNext()  && !encontrado){
            String ciudad= it.next();
             if (ciudad.equals("Copiapó")){
                System.out.println("\n\nUsando iterator en while:  Hace calor en Copiapó\n");
            }
        }
         
         
         
         
         if (miListaString.remove("Santiago")){
             System.out.println("Eliminado Santiago de la lista");
         }
         else{
             System.out.println("Santiago NO está en la lista");
         }
         
         System.out.println("Lista de Ciudades: \n"+miListaString.toString());
         
         if (miListaString.remove("La Serena")){
             System.out.println("Eliminado La Serena de la lista");
         }
         else{
             System.out.println("La Serena NO está en la lista");
         }
         
         System.out.println("Lista de Ciudades: \n"+miListaString.toString());
          
         if (miListaString.remove("Arica")){
             System.out.println("Eliminado Arica de la lista");
         }
         else{
             System.out.println("Arica NO está en la lista");
         }
         
          System.out.println("Lista de Ciudades: \n"+miListaString.toString());
          
          
    }
}
