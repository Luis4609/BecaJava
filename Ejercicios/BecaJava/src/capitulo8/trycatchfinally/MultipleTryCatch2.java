/**
 * 
 */
package capitulo8.trycatchfinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author luis.monzon
 *
 */
public class MultipleTryCatch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			FileInputStream file = new FileInputStream("author.txt");

			int k;
			while ((k = file.read()) != -1) {
				System.out.print((char) k);
			}

			file.close();

		} catch (FileNotFoundException e) {

			System.out.println("Source file does not exist.\n" + e);
		} catch (IOException e) {

			System.out.println("Some I/O problem.\n" + e);
		}
	}

}
