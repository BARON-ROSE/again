/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprog2acts;

import java.io.File;

/**
 *
 * @author User
 */
public class fde extends cavg {
    public static void e() {
       File myFile = new File("C:\\Users\\User\\practice");
       
       if (myFile.exists()){
       System.out.println("this file or directory exists");
       
       }else{
       System.out.println("this file or directory do not exists");
       }
       
       
    }
    
}
