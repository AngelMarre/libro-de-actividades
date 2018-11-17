package structure50;

/*
 * MediaFactory - give out Media enumeration constants
 * @version $Id: MediaFactory.java,v 1.5 2007/02/06 23:48:55 ian Exp $
 */
public class MediaFactory {

	public static void main(String[] args) {
		System.out.println(MediaFactory.getMedia("Book"));
	}
	public static Media getMedia(String s) {
		return Media.valueOf(s.toUpperCase());
	}
	public static Media getMedia(int n){
		return Media.values()[n];
	}
}
