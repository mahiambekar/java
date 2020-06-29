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
		int[][] arr= new int[3][3];
		int i,j;
		
		System.out.println("Enter array");
		for(i=0;i<3;i++){
		    for(j=0;j<3;j++){
		        arr[i][j]=ob.nextInt();
		    }
		}
		System.out.println("your array");
		for(i=0;i<3;i++){
		    for(j=0;j<3;j++){
		        System.out.print(" "+arr[i][j]);
		    }
		    System.out.println("");
		}
		
	}
}
