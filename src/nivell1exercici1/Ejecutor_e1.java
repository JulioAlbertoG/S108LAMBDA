package nivell1exercici1;

import java.util.*;


public class Ejecutor_e1 {

	
	private static List<String> list;
	private static List<String> mesos;
	public static void main(String[] args) {
		
		/*A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes 
		 * les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
		 * Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar 
		 * una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 
		 * lletres. Imprimeix el resultat.
		 */
		list = new ArrayList<String>();
		list.add("Joan");
		list.add("Antoni");
		list.add("Julio");
		list.add("Inma");
		list.add("María");
		list.add("Flora");
		list.add("Helena");
		
		
		buscaO(list);
		buscaOiCinc(list);
		
		/*
		 * Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista 
		 * amb una lambda.
		 */
		
		mesos = new ArrayList<String>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		
		mesos.forEach(mes ->System.out.println(mes));
		
		/*
		 * Fer la mateixa impressió del punt anterior, però mitjançant method reference. 
		 */
		
		mesos.forEach(System.out :: println);
		
		
		/*
		 * Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar 
		 * un double. Des del main() de la classe principal, instància la interfície i assiga-li 
		 * el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.
		 */
		
		FunctionalInterface fi = () -> 3.1415;
		System.out.println(fi.getPiValue());
		
		/*
		 * Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més 
		 * curta a més llarga.
		 */
		
		List<String> noms = new ArrayList<String>(); 
		noms.add("Josep");
		noms.add("María");
		noms.add("Giancarlo");
		noms.add("Alba");
		noms.add("Arnau");
		noms.add("Nùria");
		
	

		llistaCurtaALlarga(noms);
		
		/*
		 * Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a 
		 * més curta.
		 */
		
		llistaLlargaACurta(noms);
		
		
		/*
		 * Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de 
		 * rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície 
		 * creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com 
		 * a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el 
		 * resultat és correcte.
		 */
		
		Interface method = (paraula) -> {
			
			StringBuilder reverse = new StringBuilder(paraula);
			paraula = reverse.reverse().toString();
			
			return paraula;
			
		};
		
		//System.out.println(method.reverse("Julio"));
		
	}
	
	public static void buscaO (List<String> list2) {
		list2.removeIf(nom -> !(nom.contains("o")));
		list2.forEach(nom ->System.out.println(nom));
	}
	
	public static void buscaOiCinc(List<String> list3) {
		list3.removeIf(nom -> nom.length()<5);
		list3.forEach(nom ->System.out.println(nom));
	}
	public static void llistaCurtaALlarga(List<String> noms) {
		noms.sort((o1,o2) -> Integer.compare(o1.length(), o2.length()));
		
		noms.forEach(nom ->System.out.println(nom));
	}
	public static void llistaLlargaACurta(List<String> noms) {
		noms.sort((o1,o2) -> Collections.reverseOrder().compare(o1.length(), o2.length()));
		
		noms.forEach(nom ->System.out.println(nom));
	}

	
	

}
