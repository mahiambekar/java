/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    int i,j;
    void set(int x,int y){
    i=x;
    j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		t1.set(10,20);
		t2.set(30,40);
		t1.add();
		t2.add();
	}
}
