/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author thauan
 */
public class FiboRecursivo {
    
    int result = 0;
    
    public int fibo_recursivo(int num){
        if(num < 2 ) return num;
        else
            result = fibo_recursivo(num-1) + fibo_recursivo(num-2);
        
        return result;
    }
    
}
