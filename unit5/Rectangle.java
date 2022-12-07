package shape;

/**
 * A 2D rectangle (wihtout coordinates)
 * @author Ken Loomis
 */
public class Rectangle {

	/* Identify the scopes of every variable in the
	 * class by adding a comment whether it is class,
	 * method, or block scoped. There are scope errors in
	 * three of the methods. Correct that errors and submit
	 * a copy of the correct code on ehillel.org
	 */

	/** The length of the rectangle **/
	private int length;
	/** The width of the rectangle **/
	private int width;

	/**
	 * Creates an rectangle with the given l and w.
	 * @param l The length
	 * @param w The width
	 */
	public Rectangle ( int l, int w ) {
		length = l;
		width = w;
	}

	/**
	 * Sets the width of the rectangle
	 * @param w The width
	 */
	public void setWidth ( int w ) {
		int width = w;
	}

	/**
	 * Sets the length of the rectangle
	 * @param l The length
	 */
	public void setLength ( int l ) {
		int length = l;
	}

	/**
	 * Produces the length of the rectangle
	 * @return the length
	 */
	public int getLength ( ) {
		return length;
	}

	/**
	 * Produces the width of the rectangle
	 * @return the width
	 */
	public int getWidth ( int w ) {
		return width;
	}

	/**
	 * Produces the area of the rectangle
	 * @param l The length
	 * @param w The width
	 * @return the area
	 */
	public int getArea ( int w, int l ) {
		return w * l;
	}

	@override
	public String toString() {
		return "Rectangle (" + l + "X" + w + ")";
	}
}
