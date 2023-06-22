/**
 * 
 */
package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Testa a utilizacao da interface Set
 * 
 * @author Matos
 *
 */
public class SetProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String [] paises = new String[] {"Brasil", "Colombia", "Argentina", "Uruguai", "Paraguai", "Chile"};
		
		Set<String> pHSet = new HashSet<>();
		for(int i = 0; i < paises.length; i++) {
			pHSet.add(paises[i]);
		}
		pHSet.add("Equador");
		pHSet.add("Venezuela");
		System.out.println("Utilizando HashSet: " + pHSet);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Set<String> pTSet = new TreeSet<>();
		for(int i = 0; i < paises.length; i++) {
			pTSet.add(paises[i]);
		}
		pTSet.add("Equador");
		pTSet.add("Venezuela");
		System.out.println("Utilizando TreeSet: " + pTSet);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Set<String> pLHSet = new LinkedHashSet<>();
		for(int i = 0; i < paises.length; i++) {
			pLHSet.add(paises[i]);
		}
		pLHSet.add("Equador");
		pLHSet.add("Venezuela");
		System.out.println("Utilizando LinkedHashSet: " + pLHSet);

	}

}
