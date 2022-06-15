/**
 * 
 */
package capitulo7.inheritance;

/**
 * @author luis.monzon
 *
 */
public class ParentClass {

	protected String name;
	protected int age;

	ParentClass() {
		System.out.println("Contructor of Parent");
	}

	ParentClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void disp() {
		System.out.println("Parent method");
	}

}
