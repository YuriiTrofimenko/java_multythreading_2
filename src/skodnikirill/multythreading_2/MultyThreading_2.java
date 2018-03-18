/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skodnikirill.multythreading_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class MultyThreading_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Data d = new Data();
        Controller c1 = new Controller(d, 1, 10);
        Controller c2 = new Controller(d, 2, 10);
        Controller c3 = new Controller(d, 3, 10);
        
        //c1.doWork();
        //c2.doWork();
        
        Thread t1 = new Thread(() -> {
            try {
                c1.doWork();
            } catch (InterruptedException ex) {
                Logger.getLogger(MultyThreading_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                c2.doWork();
            } catch (InterruptedException ex) {
                Logger.getLogger(MultyThreading_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Thread t3 = new Thread(() -> {
            try {
                c3.doWork();
            } catch (InterruptedException ex) {
                Logger.getLogger(MultyThreading_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
