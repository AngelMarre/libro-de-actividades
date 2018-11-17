package numbers;

/**
 * Show real values.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: StrictFP.java,v 1.4 2004/09/08 20:12:49 ian Exp $
 */
public class StrictFP {
	public static strictfp void main(String[] argv) {
		double alpha = 8e+307;
		System.out.println(mulNotStrict(alpha));
		System.out.println(mulStrictFP(alpha));
		System.out.println(2 * alpha);
	}

	static double mulNotStrict(double a) {
		return a * 4 * 0.5;
	}
	static strictfp double mulStrictFP(double a) {
		return a * 4 * 0.5;
	}
}
