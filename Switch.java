/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int x;
		System.out.println("Enter 1,2 or 3");
		Scanner ob=new Scanner(System.in);
		x=ob.nextInt();
		switch(x){
		    
		    case 1:
		        System.out.println("One");
		        break;
		        
		    case 2:
		        System.out.println("Two");
		        break;
		        
		    case 3:
		        System.out.println("Three");
		        break;
		        
		    default:
		        System.out.println("Wrong Choice");
		}
		  
		}
		
	}


