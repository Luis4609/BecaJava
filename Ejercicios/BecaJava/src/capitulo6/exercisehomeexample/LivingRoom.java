/**
 * 
 */
package capitulo6.exercisehomeexample;

/**
 * @author luis.monzon
 *
 */
public class LivingRoom {

	private int numberOfTv;
	private String livingRoomType;

	public int getNumberOfTv() {
		return numberOfTv;
	}

	public void setNumberOfTv(int numberOfTv) {
		this.numberOfTv = numberOfTv;
	}

	public String getLivingRoomType() {
		return livingRoomType;
	}

	public void setLivingRoomType(String livingRoomType) {
		this.livingRoomType = livingRoomType;
	}

	/**
	 * @param numberOfTv
	 * @param livingRoomType
	 */
	public LivingRoom(int numberOfTv, String livingRoomType) {
		this.numberOfTv = numberOfTv;
		this.livingRoomType = livingRoomType;
	}

	public LivingRoom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
