/**
 * 
 */
package capitulo8.throwingruntimeexception;

/**
 * @author luis.monzon
 *
 */
public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {
			throw new RuntimeException("Age should be positive.");
		}
		this.age = age;
	}

	/**
	 * 
	 */
	public Person() {

	}

	/**
	 * @param age
	 */
	public Person(int age) {
		this.age = age;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Person person = new Person();
		try {
			person.setAge(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			System.out.println("Age should be positive");
		}

	}

}
