/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT309pc
 */
public class Test5 {
    public static void main(String[] args) {
        String name = "Mahachai";
        
        switch(name.length()){
            case 3 :  System.out.println("A");
                      System.out.println("B");
                      break;
            case 7 :  System.out.println("C");
                      break;
            case 8 :  System.out.println("D");
                      System.out.println("E");
                      break;
            case 10 : System.out.println("F");
                      break;
            default : System.out.println("G");   
                      System.out.println("H");      
        }
        System.out.println("I");    
    }
}
