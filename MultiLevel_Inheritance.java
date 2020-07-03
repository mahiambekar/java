/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    A(){
        System.out.println("in A");
    }
}
class B extends A{
    B(){
        System.out.println("in B");
    }
}
class C extends B{
    C(){
        System.out.println("in C");
    }
}
public class Main
{
	public static void main(String[] args) {
		C ob =new C();
	}
}
