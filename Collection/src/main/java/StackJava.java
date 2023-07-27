import java.util.Iterator;
import java.util.Stack;

public class StackJava {

	public static void main(String[] args) {
		
		
		Stack<String> stack= new Stack<String>();
		stack.add("Preeti");
		stack.add("Jaiswal");
		stack.add("Sita");
		stack.add("Jaiswal");
		stack.add("Smitha");
		
		//stack.pop();

		//stack.push("Jyoti");
		stack.peek();
		
		Iterator itr= stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
