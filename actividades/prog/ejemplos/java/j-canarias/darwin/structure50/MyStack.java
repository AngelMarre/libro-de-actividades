package structure50;

/** A lax Stack implementation.
 * @version $Id: MyStack.java,v 1.6 2005/04/15 20:02:56 ian Exp $
 */
public class MyStack<T> {
	private int ix = 0;
	public static final int MAX = 10;
	private T[] data = (T[])new Object[MAX];

	public void push(T obj) {
		data[ix++] = obj;
	}

	public boolean hasNext() {
		return ix > 0;
	}

	public boolean hasRoom() {
		return ix < MAX;
	}

	public T pop() {
		if (hasNext()) {
			return data[--ix];
		}
		throw new ArrayIndexOutOfBoundsException(-1);
	}
}
