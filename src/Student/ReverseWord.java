/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;
import java.util.Scanner;
/**
 *
 * @author jessy
 //ask user to enter a word
//Store the word in a string
//create a character array same length as the word which user has entered
//store each character from the word in the charcter array
//print the character array in reverse
*/

public class ReverseWord {
    public static void main(String[] args){
        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] myLetters=new char[word.length()];
        for(int i=0 ;i<myLetters.length;i++){
            myLetters[i]=word.charAt(i);
            System.out.print(myLetters[i]);
        }
        System.out.println();
        System.out.println("printing in reverse");
        
        for(int i =myLetters.length-1;i>=0;i--){
            System.out.print(myLetters[i]);
        }
    }
}
