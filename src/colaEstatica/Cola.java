/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colaEstatica;

/**
 *
 * @author NVA
 */
public class Cola <T>{
    private T[] v;
    private int ini;
    private int fin;
    
    public Cola(){
        v= (T[]) new Object[100];
        ini=0;
        fin=99;
    }
    
    public Cola(int t){
        v= (T[]) new Object[t];
        ini=0;
        fin=t-1;
    }
    
    public boolean isEmpty(){
        return  ini == (fin+1)% v.length;
    }
    
    private boolean isFull(){
        return ini == (fin+2)% v.length;
    }
    
    public boolean add(T e){
        if (!this.isFull()){
            fin= (fin+1)%v.length;v[fin]= e;
            return true;
        }
        return false;
    }
    
    public T remove(){
        T e= v[ini];
        ini = (ini +1)%v.length;
        return e;
    }
    
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        int pos= ini;
        while (pos!=fin){
            s.append(v[pos].toString());
            s.append("\n");
            pos= (pos+1)%v.length;
        }
        s.append(v[pos].toString());
        
        return s.toString();
   }
    
    
       
   
}
