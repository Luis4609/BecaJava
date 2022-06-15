/**
 * 
 */
package capitulo7.inheritance;

/**
 * @author luis.monzon
 *
 */
public class ChildClass extends ParentClass {

	ChildClass() {
		System.out.println("Constructor of Child");
	}

	public ChildClass(int age) {
		super("Child", age);
	}

	//
	void disp() {
		System.out.println("Child method");

		// Calling the disp method of the parent
		super.disp();
	}

	void disp2() {
		System.out.println(super.name + " is " + this.age + " years old.");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChildClass ch1 = new ChildClass();
		ChildClass ch2 = new ChildClass(5);
		
		ch1.disp();
		ch2.disp2();

	}

}
