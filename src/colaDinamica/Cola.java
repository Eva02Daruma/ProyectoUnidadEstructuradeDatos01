/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaDinamica;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import listaGenericaLLS.Nodo;


/**
 *
 * @author NVA
 */
public class Cola<T> {
    private Nodo<T> ini;
    private Nodo<T> fin;
    
    public Cola(){
        //Nodo basura
        ini= new Nodo();
        fin= ini;
    }
    
    public Cola(int t){
        //Nodo basura
        ini= new Nodo();
        fin= ini;
    }
    
    
    
    public boolean isEmpty(){
        return ini==fin;
    }
    
    //SE agrega en un nodo basura
    public boolean add(T e){
        fin.setInfo(e);
        Nodo<T> p= new Nodo();
        fin.setLink(p);
        fin= fin.getLink();
        return true;
    }
    
    //La aplicación debe consultar isEmpty() ANTES de invocar a remove()
    public T remove(){
        T e= ini.getInfo();
        ini= ini.getLink();
        return e;
    }
    
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        Nodo<T> p= ini;
        //Recordar que el último nodo, apuntado por fin es Basura!! Sin datos de la cola.
        while (p!=fin){
            s.append(p.getInfo().toString());
            s.append("\n");
            p=p.getLink();
        }
        
        return s.toString();
    }
    
}
