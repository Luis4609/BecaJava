/**
 * 
 */
package capitulo5.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author luis.monzon
 *
 */
public class DateTimeType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Date date1 = new Date();

		System.out.println("Date: " + date1.toString());

		Date dateNow = new Date();

		// formater for the actual date
		SimpleDateFormat formatDate = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		// show the current date
		System.out.println("Date formated with simpleDate: " + formatDate.format(dateNow));

		Date date2 = new Date();

		String str = String.format("%1$s %2$tB %2$td, %2$ty", "Due date:", date2);

		// show date with the format of a String
		System.out.println("String format: " + str);

		SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy-MM-dd");

		String input = "1818-11-11";

		System.out.println("String input = " + input + " Parses as: ");

		Date date3 = null;

		try {
			date3 = formatDate2.parse(input);
			System.out.println("Show date3: " + date3);

		} catch (ParseException e) {
			System.out.println("Unparseable using " + formatDate2);
			e.printStackTrace();
		}

	}

}
