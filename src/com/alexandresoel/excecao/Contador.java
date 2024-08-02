package com.alexandresoel.excecao;

import com.alexandresoel.modelo.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois );

        }catch (ParametrosInvalidosException e){
            throw new ParametrosInvalidosException();
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem;i++){
            System.out.println("Imprimindo o numero: "+i);
        }
    }
}
