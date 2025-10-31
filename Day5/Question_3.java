/*Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
		   
			  try {
		      String text = s.nextLine();
        //write your answer here
          System.out.println("Original string: " + text);
          checkVowels(text);
          System.out.println("String contains vowels");
    }catch(NoVowelsException e){
      System.out.println(" String does not contain any vowels");
    }
  }  
    
      public static void checkVowels(String text) throws NoVowelsException
      {
        if (!text.toLowerCase().matches(".*[aeiou].*")){
          throw new NoVowelsException();
        }
      }
    static class NoVowelsException extends Exception {

    }
}
