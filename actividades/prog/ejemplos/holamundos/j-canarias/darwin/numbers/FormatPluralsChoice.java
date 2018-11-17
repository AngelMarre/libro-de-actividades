package numbers;

import java.text.*;

/**
 * Format a plural correctly, using a ChoiceFormat.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: FormatPluralsChoice.java,v 1.6 2004/09/08 20:12:47 ian Exp $
 */
public class FormatPluralsChoice extends FormatPlurals {
	static double[] limits = { 0, 1, 2 };
	static String[] formats = { "items", "item", "items"};
	static ChoiceFormat myFormat = new ChoiceFormat(limits, formats);

	/** report -- using conditional operator */
	public static void report(int n) {
		System.out.println("We used " + n + " " + myFormat.format(n));
	}

	public static void main(String[] argv) {
		report(0);
		report(1);
		report(2);
	}
}
