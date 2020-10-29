/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprog2acts;

/**
 *
 * @author User
 */
public class cavg extends cpyarray{
     public static void f() {
     float [] gle = {45,10,4,4,4};
     
     float input = 0;
         for(int i = 0;i < gle.length;i++){
         
         input = input + gle[i] / gle.length;
         }
         
         System.out.println(input);
    }
    
}
