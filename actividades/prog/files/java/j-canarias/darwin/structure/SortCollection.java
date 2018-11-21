package structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Demonstrate use of Arrays.sort()
 * @version $Id: SortCollection.java,v 1.6 2006/04/11 22:48:38 ian Exp $
 */
public class SortCollection {
	public static void main(String[] unused) {
		List<String> l = new ArrayList<String>();
		l.add("painful");
		l.add("mainly");
		l.add("gaining");
		l.add("raindrops");
		
		Collections.sort(l);
		for (int i=0; i<l.size(); i++)
			System.out.println(l.get(i));
	}
}
