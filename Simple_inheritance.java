/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    void show(){
        System.out.println("in base class");
    }
}
class B extends A{
    void disp(){
        System.out.println("in derived class");
    }
}
public class Main
{
	public static void main(String[] args) {
		B ob=new B();
		ob.show();
		ob.disp();
	}
}
