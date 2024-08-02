package com.alexandresoel.modelo;

public class ParametrosInvalidosException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
