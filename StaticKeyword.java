/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    int i;
    static int j;
    
    Test(){
        i++;
        j++;
    }
    void show(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		t1.show();
		t2.show();
		t3.show();
	}
}
