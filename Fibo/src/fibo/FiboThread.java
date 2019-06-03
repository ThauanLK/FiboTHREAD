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
    
    public  FiboThread(int num){
        this.num = num;
    }

    @Override
    public void run() {
        if(num < 2) result = num;
        else{
            try{
                FiboThread f1 = new FiboThread(num-1);
                FiboThread f2 = new FiboThread(num-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                result = f1.result + f2.result;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    }
    
}
