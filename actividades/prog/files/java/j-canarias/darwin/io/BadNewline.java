package io;

/**
 * DON'T DO THIS. THIS IS BAD CODE.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: BadNewline.java,v 1.4 2004/09/08 20:12:56 ian Exp $
 */
public class BadNewline {
	//+
	String myName;
	public static void main(String[] argv) {
		BadNewline jack = new BadNewline("Jack Adolphus Schmidt, III");
		System.out.println(jack);
	}
	/**
	 * DON'T DO THIS. THIS IS BAD CODE.
	 */
	public String toString() {
		return "BadNewlineDemo@" + hashCode() + "\n" + myName;
	}

	// The obvious Constructor is not shown for brevity; it's in the code
	//-
	/* Constructor */
	public BadNewline(String s) {
		myName = s;
	}
}
