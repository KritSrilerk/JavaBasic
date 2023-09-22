/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT309pc
 */
public class Test9 {
    public static void main(String[] args) {
        int a;
        for(a = 1; a<=10 ; a+=2){
            System.out.println("A");
            if(a ==7){
                continue;
            }
            System.out.println("B");
        }
        System.out.println("a is " +a);
    }          
}
