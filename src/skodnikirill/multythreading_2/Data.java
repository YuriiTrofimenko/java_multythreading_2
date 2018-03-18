/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skodnikirill.multythreading_2;

/**
 *
 * @author student
 */
public class Data {
    
    private int state = 1;

    public int getState() {
        return state;
    }
    
    public void tik(){
        System.out.print("tik-");
        state = 2;
    }
    
    public void tak(){
        System.out.print("tak-");
        state = 3;
    }
    
     public void tuk(){
        System.out.println("tuk");
        state = 1;
    }
}
