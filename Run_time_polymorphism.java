/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    void show(){
        System.out.println("In class A");
        
    }
}
class B extends A{
    void show(){
        System.out.println("In class B");
    }
}
public class Main
{
	public static void main(String[] args) {
		B ob=new B();
		ob.show();
	}
}
