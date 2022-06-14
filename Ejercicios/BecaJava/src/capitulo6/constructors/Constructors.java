/**
 * 
 */
package capitulo6.constructors;

/**
 * @author luis.monzon
 *
 */
public class Constructors {

	private int var;

	/**
	 * 
	 */
	public Constructors() {
		var = 10;
	}

	/**
	 * @param var
	 */
	public Constructors(int var) {
		this.var = var;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Constructors constr1 = new Constructors();

		System.out.println(constr1.getVar());

	}

}
