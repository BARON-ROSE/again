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
public class dcp extends grid{
    public static void a() {
        String text = "the quick brown fox";
        
       for(int i = 0;i < text.length();i++){
       
            if (text.charAt(i)  != ' '
           
                && text.charAt(i) != 'q'
                && text.charAt(i) != 'u'
                && text.charAt(i) != 'e'
                && text.charAt(i) != 'e'
                && text.charAt(i) != 'n') {
                 
                 System.out.println(text.charAt(i));
            }    
                 
       }
    }
}
