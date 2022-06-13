/**
 * 
 */
package capitulo5.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author luis.monzon
 *
 */
public class ArrayListType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create a new ArrayList object
		ArrayList<String> obj = new ArrayList<String>();

		// add elements to obj
		obj.add("Juan");
		obj.add("Harry");
		obj.add("Carlos");
		obj.add("David");
		obj.add("Pablo");

		System.out.println("Elements of the arrayList: " + obj);

		// add new elements
		obj.add("Juan");
		obj.add("Juan");

		// remove
		obj.remove("David");
		obj.remove("Harry");

		// set Robin in index 0
		obj.set(0, "Robin");

		// show if the array is empty
		System.out.println("Is empty: " + obj.isEmpty());

		System.out.println("Size: " + obj.size());

		System.out.println("Is Carla on the array: " + obj.contains("Carla"));

		System.out.println("Current array list: " + obj);

		// sort array obj
		Collections.sort(obj);

		System.out.println("Current array list after being sorted: " + obj);

		obj.clear();

		System.out.println("Clear, is Empty now: " + obj);

	}

}
