package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];
        arr[0][0] = 1;
        
        System.out.println("-------------------------------");

		for (int[] rad : arr) {
			
			for (int i : rad) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}

		System.out.println("-------------------------------");
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		// throw new UnsupportedOperationException("skrivUt ikke implementert");
		System.out.println("-------------------------------");

		for (int[] rad : matrise) {
			
			for (int i : rad) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}

		System.out.println("-------------------------------");
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("tilStreng ikke implementert");
		StringBuilder out = new StringBuilder();
		for (int[] tabell : matrise) {
			for (int tall : tabell) {
				out.append(tall);
				out.append(" ");
;			}
			out.append("\n");
		}
		System.out.println(out);
		return out.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
