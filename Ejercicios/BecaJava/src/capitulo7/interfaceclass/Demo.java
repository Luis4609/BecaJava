package capitulo7.interfaceclass;

/**
 * @author luis.monzon
 *
 */
public class Demo implements Inf2, Inf3 {

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {

		Inf2 obj = new Demo();

		obj.newMethod();

		Inf2.anotherNewMethod();

		//
		obj.method1();
		obj.method2();

	}
}
