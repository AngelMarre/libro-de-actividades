package structure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * Demonstrate the Set interface
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: SetDemo.java,v 1.7 2006/04/11 22:48:38 ian Exp $
 */
public class SetDemo {
	public static void main(String[] argv) {
		//+
		Set<String> h = new HashSet<String>();
		h.add("One");
		h.add("Two");
		h.add("One"); // DUPLICATE
		h.add("Three");
		Iterator it = h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//-
	}
}
