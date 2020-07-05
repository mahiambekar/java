/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    void add(int x,int y){
        System.out.println(x+y);
    }
    void add (double x,double y){
        System.out.println(x+y);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		t1.add(1.2,2.3);
		t1.add(100,200);
	}
}
