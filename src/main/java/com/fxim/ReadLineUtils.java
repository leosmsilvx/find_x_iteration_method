package com.fxim;

import java.util.Scanner;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class ReadLineUtils {

    public static Expression lerExpressao(Scanner scn){
        String strExpressao = scn.nextLine();

        Expression expressao = new ExpressionBuilder(strExpressao)
            .variables("x")
            .build();

        return expressao;
    }

    public static String lerCondicao(Scanner scn){        
        System.out.print("Digite '!close' para finalizar: ");
        String close = scn.nextLine();
        close = scn.nextLine();
        return close;
    }
}
