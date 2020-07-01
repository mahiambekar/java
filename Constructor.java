/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test {
    int i,j;
    Test() {
        i=10;
        j=20;
        System.out.println("Constructor called");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Main
{
	public static void main(String[] args) {
	           Test t1= new Test();
	           t1.add();
	}
}
