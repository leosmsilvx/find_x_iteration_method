package com.fxim;

import java.util.Scanner;

public class Ex4 {

    public static void execute() {        
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite seu peso: ");
       Double peso = scanner.nextDouble();
       
       System.out.println("Digite sua altura: ");
       Double altura = scanner.nextDouble();

       Double imc = peso/Math.pow(altura,2);

       System.out.println("Seu IMC e: " + imc);
       scanner.close();
    }    

    public static String calculaGrauObesidade(Double imc){
    }
}
