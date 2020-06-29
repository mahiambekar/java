/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		int i, sum=0;
		int[]arr=new int[5];
		System.out.println("Enter array elements");
		
		for(i=0;i<5;i++){
		    arr[i]= ob.nextInt();
		}
		
		System.out.println("your array:");
		for(i=0;i<5;i++){
		    sum=sum+arr[i];
		}
		System.out.println("sun is "+sum);
		
	}
}
