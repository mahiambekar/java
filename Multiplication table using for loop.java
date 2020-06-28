/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a,b,i;
		System.out.println("Enter number");
		a=ob.nextInt();
		i=1;
		while(i<=10) {
		    b=a*i;
		    System.out.println(b);
		    i++;
		}
	}
}
