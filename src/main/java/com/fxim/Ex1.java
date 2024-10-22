package com.fxim;

import java.util.Scanner;

public class Ex1 {

    public static void execute() {        
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite seu nome: ");
       String nome = scanner.nextLine();
       System.out.print("Digite sua idade: ");
       Integer idade = scanner.nextInt();

       System.out.println(nome + ", sua idade e: " + idade);
       scanner.close();
    }    
}
