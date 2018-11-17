package structure;

import java.util.prefs.Preferences;

/**
 * Simple demonstration of using Preferences.
 * @version $Id: PrefsDemo.java,v 1.6 2006/09/20 00:51:51 ian Exp $
 */
public class PrefsDemo {

	public static void main(String[] args) throws Exception {

		// Setup the Preferences for this application, by class.
		Preferences prefs = Preferences.userNodeForPackage(PrefsDemo.class);

		// Retrieve some preferences previously stored, with defaults in case
		// this is the first run.
		String text    = prefs.get("textFontName", "lucida-bright");
		String display = prefs.get("displayFontName", "lucida-blackletter");
		System.out.println(text);
		System.out.println(display);

		// Assume the user chose new preference values: Store them back.
		prefs.put("textFontName", "times-roman");
		prefs.put("displayFontName", "helvetica");

		// Toss in a couple more values for the curious who want to look
		// at how Preferences values are actually stored.
		Preferences child = prefs.node("/a/b");
		child.putInt("meaning", 42);
		child.putDouble("pi", Math.PI);

		prefs.exportSubtree(System.out);
	}
}
