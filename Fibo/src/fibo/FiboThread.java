/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thauan
 */
public class FiboThread extends Thread{
    private int num;
    public int result;
    
    public FiboThread(int num){
        super();
        this.num = num;
    }
    
    @Override
    public void run() {
        FiboRecursivo f = new FiboRecursivo();
        result = f.fibo_recursivo(num);
    }
}
