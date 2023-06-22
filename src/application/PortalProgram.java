/**
 * 
 */
package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Matos
 *
 */
public class PortalProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("How many for course A: ");
		int n1 = sc.nextInt();
		
		for(int i = 1; i <= n1; i++) {
			int num1 = sc.nextInt();
			cursoA.add(num1);
		}
		
		System.out.print("How many for course B: ");
		int n2 = sc.nextInt();
		
		for(int i = 1; i <= n2; i++) {
			int num2 = sc.nextInt();
			cursoB.add(num2);
		}
		
		System.out.print("How many for course C: ");
		int n3 = sc.nextInt();
		
		for(int i = 1; i <= n3; i++) {
			int num3 = sc.nextInt();
			cursoC.add(num3);
		}
		
		Set<Integer> totalAlunos = new HashSet<>(cursoA);
		totalAlunos.addAll(cursoB);
		totalAlunos.addAll(cursoC);
		
		System.out.println("Total students: " + totalAlunos.size());
		
		
		sc.close();

	}

}
