/**
 * 
 */
package capitulo4.sentences;

/**
 * generar datos, calcular la media de números negativos y positivos y calcular
 * la cantidad de ceros.
 * 
 * @author luis.monzon
 *
 */
public class Sentences1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		int cont_zeros; // the zero counter
		int cont_pos; // positive counter
		int cont_neg; // negative counter
		int sum_pos, sum_neg; // sum of the positive and negative numbers
		float average_pos, average_neg; // positive and negative averages can have decimal places
		cont_zeros = 0;
		cont_pos = 0;
		cont_neg = 0;
		sum_pos = 0;
		sum_neg = 0;

		for (int i = 0; i <= 10; i++) {
			num = (int) (Math.random() * 7) + 1;
			System.out.println("Random number: " + num);

			if (num == 0) {
				cont_zeros++;
			} else {
				if (num > 0) {
					cont_pos++;
					sum_pos += num;
				} else {
					cont_neg++;
					sum_neg += num;
				}
			}
		}

		// Zeros
		System.out.println("The number of zeros entered is: " + cont_zeros);

		// Positives
		if (cont_pos == 0) {
			System.out.println("You cant do the average of the positives");
		} else {
			average_pos = (float) sum_pos / cont_pos;
			System.out.println("Average of positives: " + average_pos);

		}
		// Negatives
		if (cont_pos == 0) {
			System.out.println("You can't do the average of the negatives.");
		} else {
			average_neg = (float) sum_neg / cont_neg;
			System.out.println("Average of negatives: " + average_neg);
		}

	}

}
