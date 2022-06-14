/**
 * 
 */
package capitulo6.overloadingmethods;

/**
 * @author luis.monzon
 *
 */
public class OverLoadingMethods {

	/**
	 * @param c
	 */
	public void disp(char c) {
		System.out.println(c);
	}

	/**
	 * @param c
	 * @param num
	 */
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}

	/**
	 * @param num
	 */
	public void disp(int num) {
		System.out.println(num);
	}

	/**
	 * @param num
	 * @param c
	 */
	public void disp(int num, char c) {
		System.out.println(num + " " + c);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OverLoadingMethods obj = new OverLoadingMethods();
		obj.disp('a');
		obj.disp('a', 10);
		obj.disp(2);
		obj.disp(10, 'a');

	}

}
