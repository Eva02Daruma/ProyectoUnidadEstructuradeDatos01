/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaGenericaArreglos;


import java.util.Iterator;

/**
 * Arreglo genérico:  Arreglo cuyos elementos son del tipo de dato T
 * Iterable
 * @author Nina
 */
public class Lista <T> implements Iterable<T>{
    private T[] v;
    private int tope; //Posición último elemento
       
    public Lista(){
        //si no se indica, se asume un arreglo de tamaño 100.
        
        v= (T[])new Object[100];
        tope=-1; //Arreglo vacío.
    }
    public Lista(int n){
        v= (T[])new Object[n];
        tope=-1; //Arreglo vacío.
    }
    public Lista(Lista<T> c){
        v= (T[])new Object[c.v.length];
        tope=c.tope;
        
        for(int i=0; i<tope;i++){
            v[i]= (T)c.v[i];  //Referencia es de tipo Object
        }
    }
    
    public int getSize(){
        return tope+1;
    }
    
    public String toString(){      
        StringBuilder s= new StringBuilder();
        s.append("v=[\n");
        for(int i=0; i<=tope; i++){
            s.append(i+": " + v[i].toString()+"\n");
        }
        s.append("]");
        return s.toString();
    }  
    
         
    // ------------ Propios
    public boolean add(T objeto){
        tope++;     
            
        if (tope < v.length ){
            v[tope]=objeto;
            return true;
        }
        else{
            tope--;
            return false;
        }
    }
    
    public void clear(){
        tope= -1;
    }
    
    public boolean contains(T e){
        boolean esta=false;
        int i=0;
        while(i<=tope && !esta){
            if( v[i].equals(e)){
                esta=true;
            }
            else{
                i++;
            }
        }        
        return esta;
    }
    
    public T get(int pos){
        if (pos<=tope){
            return v[pos];
        }
        return null;
    }
    
    private int indexOf(T objeto){
        boolean esta=false;
        int i=0;
        while (i<=tope && !esta){
            if (v[i].equals(objeto)){
                esta=true;
            }
            else{
                i++;
            }
        }
        if (esta)
            return i; 
        return -1; //acuerdo
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
    
    
    public boolean remove(T e){
        boolean encontrado=false;
        int i=0;
        while(i<=tope && !encontrado){
            if (e.equals(v[i])){
                encontrado=true;
            }
            else{
               i++; 
            }
        }
        //Eliminar
        if (encontrado){
            for(int k= i; k<tope; k++){
                v[k]=v[k+1];
            }
            tope--;
        }
        
        return encontrado;
    }
    
    
    public boolean set(int i, T e){
        try{
            v[i]=e;
            return true;
        }
        catch(IndexOutOfBoundsException ex){
            return false;
        }
    }
    
    public int size(){
        return tope+1;
    }
    
    //Iterable
    public Iterator<T> iterator(){
        return new MiClase();
    }
    
    public class MiClase implements Iterator<T>{
        private int actual;
        
        public MiClase(){
            actual=0;
        }
        
        public boolean hasNext(){
            return actual<=tope;
        
            
//            if (actual <= tope){
//                return true;
//            }else{
//                return false;
//            }
        }
        public T next(){
            T e=v[actual];
            actual++;
            return e;
        }
    }
    
    //Retorna y Elimina el último elemento ingresado
    public T remove(){
        T e= v[tope];
        tope--;
        return e;
    }
 
    public T peek(){
        return v[tope];
    }
}
