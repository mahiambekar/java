/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    int i,j;
    Test(){
        i=10;
        j=20;
    }
    Test(int x,int y){
        i=x;
        j=y;
    }
    Test add(Test ob){
        Test temp=new Test();
        temp.i=this.i+ob.i;
        temp.j=this.j+ob.j;
        return temp;
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
		Test t2=new Test(30,40);
		Test t3;
		t3=t1.add(t2);
		t3.show();
	}
}
