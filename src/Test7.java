/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT309pc
 */
public class Test7 {
    public static void main(String[] args) {
        int a = 1;
        do{
            System.out.println("A");
            a+= 2 ;
            System.out.println("B");
               
        }while(a < 3 % 2 * 5);
        
        System.out.println("A is "+a);
    }
}

