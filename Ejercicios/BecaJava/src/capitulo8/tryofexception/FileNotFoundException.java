/**
 * 
 */
package capitulo8.tryofexception;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author luis.monzon
 *
 */
public class FileNotFoundException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C://file.txt");

			char[] a = new char[50];

			fr.read(a);

			for (char c : a) {

				System.out.println(c);
			}

		} catch (java.io.FileNotFoundException e) {

			System.out.println("File not found.");
		} catch (IOException e) {

			System.out.println("File could not be read/write.");
		}
	}

}
