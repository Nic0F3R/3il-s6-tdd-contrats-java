
public class FizzBuzz {

	/**
	 * @param pfNombre
	 * @return Fizz si multiple de 3, Buzz si multiple de 5, sinon retourne la chaîne du nombre
	 * 
	 * @author Nicolas Ferrayé
	 */
	public static String fizzBuzz(int pfNombre) {
		
		String res = "";
		
		if(Integer.valueOf(pfNombre) % 3 == 0 && Integer.valueOf(pfNombre) % 5 == 0) {
			res = "FizzBuzz";
		} else if(Integer.valueOf(pfNombre) % 3 == 0) {
			res = "Fizz";
		} else if(Integer.valueOf(pfNombre) % 5 == 0) {
			res = "Buzz";
		} else {
			res = Integer.toString(pfNombre);
		}
		
		return res;
		
	}
}
