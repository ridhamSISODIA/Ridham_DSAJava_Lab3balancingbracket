package completebrackettree;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class balancingbracket {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
	   // String input="[{}]";
	    boolean result=checkBalanceBracket(input);
	    if(result) 
	    {System.out.print("the entered string has balanced brackets");}
	    else
	    {System.out.print("the entered string do not contain balanced brackets");}
	 }
	static boolean checkBalanceBracket(String input)
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(c=='('||c=='{'||c=='[') 
			{
				stack.push(c);
				continue;
			}
//if only close bracket exists
			if(stack.isEmpty()) 
			{
				return false;
			}
			char temp;
			switch(c)
			{
			case')':
				temp=stack.pop();
				if(temp=='{'||temp==']') {return false;}
				break;
			case'}':
				temp=stack.pop();
				if(temp=='('||temp==']') {return false;}
				break;
			case']':
				temp=stack.pop();
				if(temp=='('||temp=='{') {return false;}
				break;
				default:
					System.out.print("not a correct bracket type");
			}
		}
		return stack.isEmpty();
		
	}
}
