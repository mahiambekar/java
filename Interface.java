/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface A{
    void add(int x,int y);
    public abstract void sub(int x,int y);
}
class Test implements A{
    @Override
    public void add(int x,int y){
        System.out.println(x+y);
    }
    @Override
    public void sub(int x,int y){
        System.out.println(x-y);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		t1.add(100,200);
		t1.sub(90,10);
	}
}
