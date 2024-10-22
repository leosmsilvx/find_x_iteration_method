package com.fxim;

import java.util.Scanner;

public class Ex3 {

    public static void execute() {        
       Scanner scanner = new Scanner(System.in);

        int contador = 0;
        Double salarioTotal = Double.valueOf(0);
        while (true) {
            contador++;
            System.out.print("Digite o salario n"+contador+" (digite um valor negativo para sair): ");
            Double salario = scanner.nextDouble();
            if(salario < 0){
                contador--;
                break;
            }
            salarioTotal += salario;

        }
        
        Double media = salarioTotal/contador;

        System.out.println("Media: " + media);

       scanner.close();
    }    
}
