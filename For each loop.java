/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[]arr=(10,20,30,40,50);
		int i;
		System.out.println("By using normal for loop");
		for (i=0;i<5;i++){
		    System.out.println(arr[i]);
		}
		System.out.println("By using for each loop");
		for (int x: arr){
		    System.out.println(x);
		}
	}
}
