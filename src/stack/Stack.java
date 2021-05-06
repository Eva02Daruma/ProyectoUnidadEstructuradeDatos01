/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import listaGenericaLLS.Lista;
//import listaGenericaArrayList.Lista;
//import listaGenericaArreglos.Lista;


/**
 *
 * @author ninavaldivia
 */
public class Stack<T> {
    private Lista<T> stack;
    
    public Stack(){
        stack= new Lista();
    }
    
    public Stack(int n){
        stack= new Lista(n);
    }

    public Lista<T> getStack() {
        return stack;
    }

    public void setStack(Lista<T> stack) {
        this.stack = stack;
    }
    
    //Sobre-escribirlo
    public String toString(){
        //return stack.toString();
        StringBuilder s= new StringBuilder();
        Stack<T> aux= new Stack();
        
        T e;
        while (!this.isEmpty()){
            e= this.pop();
            aux.push(e);
            s.append(e.toString());
            s.append("\n");
        }
        //Restaurar el stack original
        while(!aux.isEmpty()){
            e= aux.pop();
            this.push(e);
        }
        return s.toString();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public boolean push(T e){
        return stack.add(e);
    }
    
    public T pop(){
        return stack.remove();
    }
    
    //Retornar el último elemento agregado
    public T peek(){
        return stack.peek();
    }
}
