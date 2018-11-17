package structure;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Demo of 1.2 java.util.LinkedList class
 * using same example as my older LinkList class.
 * @author	Ian Darwin, http://www.darwinsys.com/
 * @version $Id: LinkedListDemo.java,v 1.7 2006/04/11 22:48:38 ian Exp $
 */
public class LinkedListDemo {
	public static void main(String[] argv) {
		System.out.println("Here is a demo of Java 1.2's LinkedList class");
		LinkedList<String> l = new LinkedList<String>();
		l.add(new Object().toString());
		l.add("Hello");
		l.add("end of the list");

		System.out.println("Here is a list of all the elements");
		ListIterator li = l.listIterator(0);
		while (li.hasNext())
			System.out.println("Next to: " + li.next());

		if (l.indexOf("Hello") < 0)
			System.err.println("Lookup does not work");
		else
			System.err.println("Lookup works");

		// Now, for added fun, let's walk the linked list backwards.
		while (li.hasPrevious()) {
			System.out.println("Back to: " + li.previous());
		}
	}
}
