/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

/**
 *
 * @author reetu
 */
import java.util.Scanner;
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
 
        char[] reverse = new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            reverse[i]=word.charAt(i);
        }
        for(int i=reverse.length-1;i>=0;i--)
        {
            System.out.print(reverse[i]);
        }
    
    
    }
}
       

