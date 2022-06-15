/**
 * 
 */
package capitulo7.abstractclass;

/**
 * @author luis.monzon
 *
 */
public class Demo extends AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Demo obj = new Demo();

		obj.disp();
		obj.disp2();

		System.out.println("Suma: " + obj.sumOfTwo(32, 54));

	}

	@Override
	public void disp2() {
		System.out.println("overriding abstract method");

	}

	@Override
	public int sumOfTwo(int n1, int n2) {

		return n1 + n2;
	}

}
