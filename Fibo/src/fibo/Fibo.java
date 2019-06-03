/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.Scanner;

/**
 *
 * @author thauan
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        FiboRecursivo f = new FiboRecursivo();
        Scanner teclado = new Scanner(System.in);
        int num,resultado;
        num = teclado.nextInt();
        long tempo_inicio = System.currentTimeMillis();
       System.out.println("----------------------------Fibonacci Recursivo----------------------------");
        resultado = f.fibo_recursivo(num);
        System.out.println("Numero = "+num+" Resultado = "+resultado);
        System.out.println("Tempo Gasto = "+(System.currentTimeMillis() - tempo_inicio));
        System.out.println("---------------------------Fibonacci Thread--------------------------------");
        long tempo_inicio2 = System.currentTimeMillis();
        FiboThread f1 = new FiboThread(num);
        FiboThread f2 = new FiboThread(num);
        f1.start();
        f2.start();
        f1.join();
        f2.join();
        System.out.println("Numero = "+num+" Resultado = "+f1.result);
        System.out.println("Numero = "+num+" Resultado = "+f2.result);
        System.out.println("Tempo Gasto = "+(System.currentTimeMillis() - tempo_inicio2));
       
    }
    
}
