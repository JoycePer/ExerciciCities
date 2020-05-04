import java.lang.*;
import java.util.Scanner;
public class Phase_Three_Cities { 
	
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
		String city= sc.nextLine();
		sc.close();
    	
        for (int i=0;i<city.length(); i++) {
        	char ch = city.charAt(i);
        
        	if(Character.toString(ch).matches("a")) {
            
        		int newChar= 4;
        		city= city.substring(0, (i))
        		+ newChar
        		+ city.substring((i)+1); 
            
        	}
        
        	else {
        	}
        
        }
        System.out.print(city); 
      }
   }