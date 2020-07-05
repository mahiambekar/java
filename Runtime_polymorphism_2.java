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
class C extends B{
    void show(){
        System.out.println("In class C");
    }
}
public class Main
{
    static void disp(A r){
        r.show();
    }
	public static void main(String[] args) {
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		
		disp(ob1);
		disp(ob2);
		disp(ob3);
	}
}
