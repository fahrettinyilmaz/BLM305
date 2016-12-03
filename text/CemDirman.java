/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blm305homework;

/**
 *
 * @author cem
 */
public class CemDirman implements Processor{

   public String process(String input) {
       char[] array = input.toCharArray();
       for (int i = 0; i < array.length; i++) {
           if (array[i] == 'ç' || array[i] == 'Ç') {
               array[i] = 'C';
           }else if (array[i] == 'a' || array[i] == 'A') {
               array[i] = 'e';
           }else if (array[i] == 'n' || array[i] == 'N') {
               array[i] = 'm';
           }           
       }       
        return array.toString();      
    }
    public String description(String source) {
        return source+" converted to CEM's character";
    }
    public String author() {
        return "Cem DIRMAN";
    }
    
}
