package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];
		arr[0][0] = 1;

		int[][] matrise8 = {{0, 0, 1, 1, 1, 1, 0, 0},
		                    {0, 1, 0, 0, 0, 0, 1, 0},
		                    {0, 1, 0, 0, 0, 0, 1, 0},
		                    {0, 0, 1, 1, 1, 1, 0, 0},
		                    {0, 1, 0, 0, 0, 0, 1, 0},
		                    {0, 1, 0, 0, 0, 0, 1, 0},
		                    {0, 1, 0, 0, 0, 0, 1, 0},
		                    {0, 0, 1, 1, 1, 1, 0, 0},};

		skrivUt(arr);
		skrivUt(matrise8);
		skrivUt(speile(matrise8));

		int[][] a       = {{1, 2, 3},
		                   {4, 5, 6},
		                   {7, 8, 9}};
		int[][] speilet = {{1, 4, 7},
		                   {2, 5, 8},
		                   {3, 6, 9}};
		skrivUt(speilet);
		skrivUt(speile(a));
	}

	// a)
	public static void skrivUt(int[][] matrise) {
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
		StringBuilder out = new StringBuilder();
		for (int[] tabell : matrise) {
			for (int tall : tabell) {
				out.append(tall);
				out.append(" ");
			}
			out.append("\n");
		}
		System.out.println(out);
		return out.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		// ikke optimalt, denne bør finne ut lengden til hver av under arrays og sette hver lik ti ldenne lengden
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i][j] != b[j][i]) {
					erLik = false;
				} else {
					erLik = true;
				}
			}
		}
		return erLik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		// forutsetter at alle del-tabeller er like store, noe som burde være et krav i en slik operasjon
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[j][i] = matrise[i][j];
			}
		}
		return speiletMatrise;
	}

	public static int[][] roterMedKlokken(int[][] matrise) {
		// denne roterer, ikke speiler, oops
		// forutsetter at alle del-tabeller er like store, noe som burde være et krav i en slik operasjon
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[j][matrise[i].length - 1 - i] = matrise[i][j];
			}
		}
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
