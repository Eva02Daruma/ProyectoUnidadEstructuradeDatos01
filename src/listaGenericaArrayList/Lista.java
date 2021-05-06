/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaGenericaArrayList;

import java.util.ArrayList;


/**
 *
 * @author Nina
 */
public class Lista<T> extends ArrayList<T> {
    
    public Lista(){
        super();
    }
    public Lista(int n){
        super(n);
    }
    public Lista(Lista<T> c){
        super();
        for(T e: c){
            this.add(e);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        for(T t:this){
            s.append(t.toString() + "\n");
        }
        //s.substring(0,s.length()-2);
        return s.toString();
    }
    
    //Elimina el último elemento agregado
    public T remove(){
        int i= this.size();
        T e= this.get(i-1);
        this.remove(i-1);
        return e;
    }
    
    public T peek(){
        int i= this.size()-1;
        return this.get(i);
    }
}
