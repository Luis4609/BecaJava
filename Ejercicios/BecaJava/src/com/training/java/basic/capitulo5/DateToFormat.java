/**
 * 
 */
package com.training.java.basic.capitulo5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Se deberá hacer un programa que saque por pantalla la fecha y hora actual con
 * varios formatos y en varios idiomas.
 * 
 * @author luis.monzon
 *
 */
public class DateToFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TESTING DATE

		// TESTING LOCALDATETIME
		LocalDate localDateTime = LocalDate.now();
		System.out.println(localDateTime.plusDays(1));
		System.out.println(localDateTime.minusMonths(2));
		System.out.println(localDateTime.minusYears(2));

		// ZoneId
		dateWithZone();

		// date
		dateWithDate();

	}

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private static void dateWithZone() {

		ZoneId zoneIdParis = ZoneId.of("Europe/Paris");

		System.out.println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));

	}

	/**
	 * @return
	 */
	private static void dateWithDate() {

		// Show LOCALDATETIME
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println("Format1 localDateTime: " + localDateTime);

		// Show string format ISO
		String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Format2 with String and ISO Format: " + localDateString);

		// Show with a Pattern
		System.out.println("Format with pattern: " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

		System.out.println("Format with UK: " + localDateTime
				.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK)));

	}

}
