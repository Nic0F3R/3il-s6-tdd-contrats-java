package exo1_2;

public class BonjourAmi {

	public static String bonjourAmi(String pfNom) {
		
		String res = "";
		
		if(pfNom == null) {
			res = "Bonjour, ami.";
		} else {
			
			// Teste si le nom est tout en majuscules
			if(pfNom.equals(pfNom.toUpperCase())) {
				res = "BONJOUR, " + pfNom + ".";
			} else {
				res = "Bonjour, " + pfNom + ".";
			}
			
		}
		
		return res;
		
	}
	
}
