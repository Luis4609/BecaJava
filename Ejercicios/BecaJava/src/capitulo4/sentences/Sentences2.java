/**
 * 
 */
package capitulo4.sentences;

/**
 * , vamos a ver cómo usar operadores de asignación, aritméticos, unario y
 * generar datos random.
 * 
 * @author luis.monzon
 *
 */
public class Sentences2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int code; // the item code on each invoice
		int liters = 0; // the number of liters in each invoice
		float price = 0; // now the price is not asked per keyboard
		float invoice_amount; // This saves the amount of the current invoice.
		float total_invoicing; // the amount of all invoices
		int liters_cod1; // the total litres sold of product 1 on all invoices
		int over_600; // counter to keep track of all invoices over 600 €
		total_invoicing = 0;
		liters_cod1 = 0;
		over_600 = 0;
		total_invoicing = 0;
		code = 0;
		over_600 = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Invoice nº " + i);
			code = (int) (Math.random() * 2) + 1;
			System.out.println("product code: " + code);

			liters = (int) (Math.random() * 10) + 1;
			System.out.println("number (liters): " + liters);

			price = (int) (Math.random() * 300) + 200;
			System.out.println("price (litre): " + price);
		}

		invoice_amount = liters * price;

		total_invoicing += invoice_amount;
		// code == 1
		if (code == 1)
			liters_cod1 += liters;
		// >= 600
		if (invoice_amount >= 600)
			over_600++;

		System.out.println("\n\n\nSales Overview\n");
		// total invoicing
		System.out.println("Total invoicing: " + total_invoicing + "€");
		// liters of article 1
		System.out.println("Product sales 1: " + liters_cod1 + " liters");
		// Invoice of more than 600 euros
		System.out.println("Invoice over 600€: " + over_600);

	}

}
