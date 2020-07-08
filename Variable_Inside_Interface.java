/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface Test{
    int A=10;
    static int B=20;
    static final int C=30;
    final int D=40;
}
public class Main
{
	public static void main(String[] args) {
		System.out.println(Test.A);
		System.out.println(Test.B);
		System.out.println(Test.C);
		System.out.println(Test.D);
	}
}
