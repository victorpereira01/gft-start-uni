package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Integer> getImpares(int min, int max) {
		List<Integer> aux = new ArrayList<Integer>();
		for(int i=min; i<=max; i++) {
			if(i%2 != 0) {
				aux.add(i);
			}
		}
		return aux;
	}
	
	private static void printImpares(List<Integer> impares) {
		for(int i=0; i<impares.size(); i++) {
			System.out.print(impares.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min, max;
		
		min = sc.nextInt();
		max = sc.nextInt();
		
		printImpares(getImpares(min, max));
		
		sc.close();
	}
}
