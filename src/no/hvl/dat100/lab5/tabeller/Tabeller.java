package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	public static void main(String[] args) {
		int[] tabell = {1, 3, 5, 8};
		System.out.println(Arrays.toString(tabell));
		System.out.println(Arrays.toString(reverser(tabell)));
	}

	// a)
	public static void skrivUt(int[] tabell) {

		// throw new UnsupportedOperationException("skrivUt ikke implementert");
		System.out.print("[ ");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// throw new UnsupportedOperationException("tilStreng ikke implementert");
		StringBuilder out = new StringBuilder();
		out.append("[");
		for (int tall : tabell) {
			out.append(tall)
			   .append(",");
		}
		// må fjerne siste ,
		if (out.charAt(out.length() - 1) == ',') {
			out.deleteCharAt(out.length() - 1);
		}
		out.append("]");
		return out.toString();
	}

	// c)
	public static int summer(int[] tabell) {

		// throw new UnsupportedOperationException("summer ikke implementert");
		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		/*
		for (int i = 0; i < tabell.length; i++) {
			sum+=tabell[i];
		}*/
		/*
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}*/

		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// throw new UnsupportedOperationException("finnesTall ikke implementert");
		// brukte koden fra JP5 OppgaveG
		int i = 0;
		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return true;
			}
			i++;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// [1, 3, 5, 8]
		// [8, 5, 3, 1]

		int[] nyTab = new int[tabell.length];
		int j = tabell.length - 1;
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[j];
			j--;
		}

		return nyTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
