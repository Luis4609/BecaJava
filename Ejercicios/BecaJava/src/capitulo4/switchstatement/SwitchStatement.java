package capitulo4.switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {

		int i = 2;

		switch (i) {
		case 1:
			System.out.println("Case 1: " + i);
			break;
		case 2:
			System.out.println("Case 2: " + i);
			break;
		case 3:
			System.out.println("Case 3: " + i);
			break;
		case 4:
			System.out.println("Case 4: " + i);
			break;
		default:
			System.out.println("Default with value: " + i);
		}
	}

}
