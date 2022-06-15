package capitulo7.abstractclass;

abstract class AbstractDemo {

	/**
	 * 
	 */
	public void disp() {
		System.out.println("Concrete method of parent class");
	}
	
	public abstract void disp2();
	
	public abstract int sumOfTwo(int n1, int n2);
}
