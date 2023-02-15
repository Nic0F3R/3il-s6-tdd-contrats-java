package exo1_2;

public class BonjourAmi {

	public static String bonjourAmi(String pfNom) {
		
		String res = "";
		
		if(pfNom == null) {
			res = "Bonjour, ami.";
		} else {
			res = "Bonjour, " + pfNom + ".";
		}
		
		return res;
		
	}
	
}
