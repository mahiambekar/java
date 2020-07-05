/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    @Override
    public String toString(){
        return "This is object of A class";
    }
}
class B extends A{
    @Override
    public String toString(){
        return "This is object of B class";
    }
}
public class Main
{
	public static void main(String[] args) {
		A ob1=new A();
		B ob2=new B();
		System.out.println(ob1);
		System.out.println(ob2);
	}
}
