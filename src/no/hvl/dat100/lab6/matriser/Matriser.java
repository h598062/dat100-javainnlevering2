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
		speile(matrise8);
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
				;
			}
			out.append("\n");
		}
		System.out.println(out);
		return out.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("skaler ikke implementert");
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
