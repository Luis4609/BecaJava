/**
 * 
 */
package capitulo6.exercisehomeexample;

/**
 * @author luis.monzon
 *
 */
public class House {

	// Atributos de area
	public static double area;
	public static String address;
	public static LivingRoom livingRoom;
	public static Kitchen kitchen;

	/**
	 * 
	 */
	public House() {
		area = 0.0d;
		address = "Unknown";
		livingRoom = new LivingRoom();
		kitchen = new Kitchen();
	}

	public static double getArea() {
		return area;
	}

	public static void setArea(double area) {
		House.area = area;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		House.address = address;
	}

	public static LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public static void setLivingRoom(LivingRoom livingRoomValue) {
		livingRoom.setNumberOfTv(livingRoomValue.getNumberOfTv());
		livingRoom.setLivingRoomType(livingRoomValue.getLivingRoomType());
	}

	public static Kitchen getKitchen() {
		return kitchen;
	}

	public static void setKitchen(Kitchen kitchenValue) {
		kitchen.setIndependent(kitchenValue.isIndependent());
		kitchen.setNumberOfStoves(kitchenValue.getNumberOfStoves());
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// new House
		House house = new House();

		// creating message
		String message = "House area: " + house.getArea() + "\n";
		message = message + "House address: " + house.getAddress() + ".\n";
		message = message + "Let's go inside the house:\n";
		message = message + "The house has a livingroom of type " + house.getLivingRoom().getLivingRoomType()
				+ " and with " + house.getLivingRoom().getNumberOfTv() + " TV's \n";
		message = message + "The house has a kitchen has " + house.getKitchen().getNumberOfStoves()
				+ " stoves and the kitchen is " + house.getKitchen().isIndependent() + " independent \n";

		message = message + "\n\n\tEnd!";

		System.out.println(message);

	}

}
