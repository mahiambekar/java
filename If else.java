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
		String s1="";
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter char");
		s1=ob.next();
		char ch=s1.charAt(0);
		x=ch;
		
		if(x>=65 && x<=90){
		    System.out.println("Capital letter");
		}
		else if(x>=97 && x<=122){
		    System.out.println("Small letter");
		}
		else if(x>=48 && x<=57){
		    System.out.println("Digit");
		}
		
		
		
	}
}
