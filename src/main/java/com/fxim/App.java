package com.fxim;

import java.util.Scanner;

import net.objecthunter.exp4j.Expression;

public class App {

    public static void main(String[] args) {        
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expressao (1 variavel: X): ");
        Expression expressao = ReadLineUtils.lerExpressao(scanner);
        String lerCondicao = null;
        do {
            Double x = iteracao(scanner, expressao);
            System.out.println("Valor de x: " + x);
            lerCondicao = ReadLineUtils.lerCondicao(scanner);
        } while (!lerCondicao.equals("!close"));

        scanner.close();
        return;
    }    

    private static Double iteracao(Scanner scanner, Expression expressao){
        System.out.println("Calculando iteracao");
        System.out.println("Digite o valor do erro: ");
        Expression expErro = ReadLineUtils.lerExpressao(scanner);
        Double erro = expErro.evaluate();
        
        System.out.println("Digite o valor do a: ");
        Double a = scanner.nextDouble();
        System.out.println("Digite o valor do b: ");            
        Double b = scanner.nextDouble();

        Double x = 0.0;

        Long startTime = System.nanoTime();
        do {
            Double fa = calculaFuncao(expressao, a);
            Double fb = calculaFuncao(expressao, b);
            if(fa == 0){
                x = a;
                break;
            }

            if(fb == 0){
                x = b;
                break;
            }

            if(fa * fb > 0){
                throw new Error("Entre os valores de a: " + a + " e b: " + b + ", não existem raizes");
            }

            x = (a+b)/2;
            Double fx = calculaFuncao(expressao, x);

            if(fa * fx < 0){
                b = x;
            } else {
                a = x;
            }
            
        } while (erro < Math.abs(b-a));   
        Long endTime = System.nanoTime();
        Double time = (endTime-startTime)/1000000.0;
        System.out.println("Tempo de funcao: " + time + "ms");
        return x;
    }

    private static Double calculaFuncao(Expression expressao, Double x){
        expressao.setVariable("x", x);
        return expressao.evaluate();
    }
}
