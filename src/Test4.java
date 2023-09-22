import java.lang.String;
import java.lang.System;

public class Test4 {
    public static void main(String[] args) {
        String b = "Mod";
        
        System.out.println("abc".toUpperCase());
        System.out.println("ZYZ".toLowerCase());
        
        if(b.equals("mod") ){
            System.out.println("111");      
        }else if(b.toUpperCase().equals("MOD") ){
            System.out.println("222"); 
        }else if(b.toLowerCase().equals("mod") ){
            System.out.println("333"); 
        }else {
            System.out.println("444"); 
        }
    }
}
