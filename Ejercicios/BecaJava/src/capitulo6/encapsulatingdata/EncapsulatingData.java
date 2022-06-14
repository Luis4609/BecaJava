/**
 * 
 */
package capitulo6.encapsulatingdata;

/**
 * @author luis.monzon
 *
 */
public class EncapsulatingData {

	private int ssn;
	private String empName;
	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EncapsulatingData obj = new EncapsulatingData();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setSsn(131231232);
		
		System.out.println("Employe name: " + obj.getEmpName());
		System.out.println("Employe age: " + obj.getEmpAge());
		System.out.println("Employe ssn: " + obj.getSsn());

	}

}
