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
        System.out.println("Constructor without args called");
    }
    Test(int x, int y){
        i=x;
        j=y;
        System.out.println("Constructor  with args called");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Main
{
	public static void main(String[] args) {
	           Test t1= new Test(100,200);
	           t1.add();
	           Test t2=new Test();
	           t2.add();
	}
}
