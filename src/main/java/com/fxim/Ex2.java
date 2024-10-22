package com.fxim;

import java.util.Scanner;

public class Ex2 {

    public static void execute() {        
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite a renda aplicada: ");
       Double rendaAplic = scanner.nextDouble();
       System.out.print("Digite o juros: ");
       Double juros = scanner.nextDouble();
       System.out.print("Digite a quantidade de meses: ");
       Integer meses = scanner.nextInt();

       Double rendaFinal = rendaAplic * Math.pow((1 + juros), meses);

       System.out.println("Renda final: " + rendaFinal);
       scanner.close();
    }    
}
