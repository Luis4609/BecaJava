/**
 * 
 */
package capitulo7.interfaceclass;

/**
 * @author luis.monzon
 *
 */
interface Inf1 {

	public void method1();

}

interface Inf2 extends Inf1 {

	default void newMethod() {
		System.out.println("Newly added default method");
	}

	static void anotherNewMethod() {
		System.out.println("Newly added static method");
	}

	public void method2();
}

interface Inf3 {

}

