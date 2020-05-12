import java.util.Scanner;

public class Phase_Four_Cities
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
		String city= sc.nextLine();
		sc.close();
    	
    	char[] carBar = city.toCharArray();
    
    	
    	for(int j = 8; j < 0; j--)
    		System.out.print(carBar [j]);
    	
    	 for(int j=carBar.length-1; j>=0; j--)
             System.out.println(j+"\t"+carBar[j]);
      
    }
}

