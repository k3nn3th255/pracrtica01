
package com.practica01.service;


import com.practica01.domain.Arbol;
import java.util.List;


public interface ArbolService {
    // se define la firma del metodo que rescupera la lista 
    //de objetos tipo Arbol que son los registro de 
    //la tabla Arbol 
    public List<Arbol> getArbols(boolean activos);
    // se define la firma del metodo para recuperar un registro 
    //la tabla arbol , recuperando el registro que tiene el 
    //idArbol , si no lo encuentra retorna el null
    
    public Arbol getArbol(Arbol arbol);
    
    // se define la firma del metodo para recuperar un registro 
    //la tabla arbol , recuperando el registro que tiene el 
    //idArbol , si no lo encuentra retorna el null
    
    public void  save  (Arbol arbol);
    
    //se define la firma del metodo para eliminar un registro 
    //la tabal arbol , considerado idCsategoria 
    public void  delete  (Arbol arbol);
}