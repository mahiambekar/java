/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    void show(String ... names){
        for(String name: names){
            System.out.println(name);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		t1.show("abc");
		System.out.println("=============");
		t1.show("abc","xyz");
		System.out.println("=============");
		t1.show("abc","xyz","pqr");
	}
}
