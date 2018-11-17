package strings;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Reverse a string by word.
 * @version $Id: StringReverse.java,v 1.8 2007/02/06 23:28:17 ian Exp $
 */
public class StringReverse {
	public static void main(String[] argv) {
		//+
		String s = "Father Charles Goes Down And Ends Battle";

		// Put it in the stack frontwards
		Stack<String> myStack = new Stack<String>();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			myStack.push(st.nextToken());
		}

		// Print the stack backwards
		System.out.print('"' + s + '"' + " backwards by word is:\n\t\"");
		while (!myStack.empty()) {
			System.out.print(myStack.pop());
			System.out.print(' ');
		}
		System.out.println('"');
		//-
	}
}
