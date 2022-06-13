/**
 * 
 */
package capitulo5.string;

/**
 * @author luis.monzon
 *
 */
public class StringType {

	/**
	 * @param args
	 */
	public static void main(java.lang.String[] args) {

		// Array de Hello
		char[] helloArray = { 'H', 'e', 'l', 'l', 'o' };

		// Guardar el array de charts en String
		String helloString = new String(helloArray);

		System.out.println("Hello String: " + helloString);

		// Get the helloString length()
		int len = helloString.length();

		System.out.println("String Length is: " + len);

		// concat World to helloString
		helloString = helloString.concat(" World ");
		System.out.println(helloString);

		// methods of the String class
		System.out.println(helloString.charAt(6));
		System.out.println(helloString.indexOf('l'));
		System.out.println(helloString.substring(3));
		System.out.println(helloString.toUpperCase());
		System.out.println("Equals to: " + helloString.equals("ABC"));
		System.out.println("Start with letter: " + helloString.startsWith("a"));
		System.out.println(helloString.contains("o"));
		System.out.println(helloString.replace('e', 'a'));
		System.out.println(helloString.trim());
		
		String str = "world";
		
		StringBuilder sb = new StringBuilder(str);
		
		//methods of the StringBuilder class
		sb.reverse();
		
		System.out.println(sb);

	}

}
