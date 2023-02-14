import java.util.*;
class Assessment2   

{  
   public static void main(String args[])  
   {  
      String original, reverse = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter the number or String");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("THIS NUMBER IS A PALINDROME");  
      else  
         System.out.println("This number is not a palindrome");   
   }  
}