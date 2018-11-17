package numbers;

/**
 * Format a plural correctly, by hand.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: FormatPlurals.java,v 1.7 2004/09/08 20:12:48 ian Exp $
 */
public class FormatPlurals {
	public static void main(String[] argv) {
		report(0);
		report(1);
		report(2);
	}

	/** report -- using conditional operator */
	public static void report(int n) {
		System.out.println("We used " + n + " item" + (n==1?"":"s"));
	}
}
