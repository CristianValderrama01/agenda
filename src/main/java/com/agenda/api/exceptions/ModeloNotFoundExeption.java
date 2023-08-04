package com.agenda.api.exceptions;

public class ModeloNotFoundExeption extends RuntimeException{

    public ModeloNotFoundExeption(String mensaje){
        super(mensaje);
    }
}
