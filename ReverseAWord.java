/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author erkoc
 */
public class ReverseAWord {
    
    
    public static void main(String[] args) {
        String test = "HelloWorld";
        System.out.println(test);
        System.out.println(reverse(test));        
    }
    
    
    public static String reverse(String str){
        if(str == null || str.isEmpty()){
            return str;
        }       
        String reverse = "";
        for(int i = str.length() -1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
      
        return reverse;
    }
    
}
