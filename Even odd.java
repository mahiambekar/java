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
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        x = ob.nextInt();
        if (x % 2 == 0) {
            System.out.println(" It is an Even number");
 
        } else {
            System.out.println("It is an Odd number");
        }

    }
}
