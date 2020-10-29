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
public class fdn extends fde{
    public static void d() {
        
        File file = new File ("C:\\Users\\User");
        String [] filelist = file.list();
        
        for (int i = 0;i <filelist.length; i++){
        
        System.out.println(filelist[i]);
        }
    }
    
}
