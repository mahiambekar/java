/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    int i;
    A(){
        i=10;
        System.out.println("A class constructor executed");
    }
}
class B extends A{
    int j;
    B(){
        j=20;
        System.out.println("B class constructor executed");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Main
{
	public static void main(String[] args) {
		B ob=new B();
		ob.add();
	}
}
