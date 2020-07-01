/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    int i;
    Test(int i){
        i=i;
    }
    void add(){
        System.out.println(i+i);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1= new Test(10);
		t1.add();
	}
}
