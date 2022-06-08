/**
 * 
 */
package capitulo3.destroyingobjects;

import java.lang.Override;

/**
 * @author luis.monzon
 *
 */
public class DestroyingObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DestroyingObjects obj = new DestroyingObjects();

		obj = null;

		DestroyingObjects a = new DestroyingObjects();
		DestroyingObjects b = new DestroyingObjects();

		b = a;

		System.gc();

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is performed by JVM");
	}

}