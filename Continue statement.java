/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[]arr={1,2,3,4,3,4,3};
		for(int x:arr){
		    if(x==3){
		        continue;
		    }
		    System.out.println(x);
		    //output 1 2 4 4 
		}
	}
}
