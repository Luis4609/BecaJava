/**
 * 
 */
package capitulo6.exercisehomeexample;

/**
 * @author luis.monzon
 *
 */
public class Kitchen {

	private boolean isIndependent;
	private int numberOfStoves;

	public boolean isIndependent() {
		return isIndependent;
	}

	public void setIndependent(boolean isIndependent) {
		this.isIndependent = isIndependent;
	}

	public int getNumberOfStoves() {
		return numberOfStoves;
	}

	public void setNumberOfStoves(int numberOfStoves) {
		this.numberOfStoves = numberOfStoves;
	}

	/**
	 * @param isIndependent
	 * @param numberOfStoves
	 */
	public Kitchen(boolean isIndependent, int numberOfStoves) {
		this.isIndependent = isIndependent;
		this.numberOfStoves = numberOfStoves;
	}

	/**
	 * Empty constructor With the default values
	 */
	public Kitchen() {
		isIndependent = false;
		numberOfStoves = 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
