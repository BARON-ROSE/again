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
public class grid extends outputtrue{
    public static void b() {
     int [][] array = new int [10][10];
       
       for(int i = 0; i < 10; i++){
        int ii = 0;
            while (ii < 10){
           
            System.out.printf("%2d", array[i][ii]);
            ii++;
            
            }
            System.out.println(); 
        }

    } 
}
