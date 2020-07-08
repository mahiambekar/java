/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface A{
    void add(int x,int y);
    
}
interface B{
    void sub(int x,int y);
}
class Test implements A,B{
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
		A r;
		r=new Test();
		r.add(100,200);
		r.sub(90,10);
	}
}
