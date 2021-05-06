/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import colaDinamica.Cola;


/**
 *
 * @author NVA
 */
public class Queue<T> {
    private Cola<T> cola;
    
    public Queue(){
        cola= new Cola();
    }
    public Queue(int n){
        cola= new Cola(n);
    }
    @Override
    public String toString(){
        return cola.toString();
    }
    public boolean isEmpty(){
        return cola.isEmpty();
    }
    public boolean add(T e){
        return cola.add(e);
    }
    public T remove(){
        return cola.remove();
    }
    
    
}
