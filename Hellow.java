/*
public class Hellow {
	static int x=5;
	
	static int y=9;
	static {
		if(x==5)
		{
		x = 10;
		System.out.println("in ststic blcok");
		}
		else
		y = 5;
		}
	void hellow()
	{
		System.out.println("hellow cons");
	}
}
class B extends Hellow
{
	void B()
	{this();
	
		System.out.println("B constr");
	}
	void B(int i)
	{
	
		System.out.println("B constr "+i);
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub

int z;

B b=new B();

System.out.println("Hellow ");


}
}*/
import java.util.*;

public class Hellow {

   static void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
   }

   static void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
Arrays.asList("","");
      showpush(st, 42);
      showpush(st, 66);
      showpush(st, 99);
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      } catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
   }
}