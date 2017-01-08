package br.com.tatica;

public class Principal {

	private static String POINTS = ":";
	private static String HASHSS = "#";

	public static void main(String[] args) {
		printImage();
	}

	// o programa consistiu basicamente em encontrar a função do indice inicial de saida dos '#'
	// e da quantidade de '#' por linha
	public static void printImage() {
		int lines = 10;
		int lineSize = 45;
		int threshold = 0;
		int hashIndex = 0;
		for (int i = 0; i < lines; i++) {
			if (i < 5) {
				hashIndex = (22 - (3 * i));
			} else {
				hashIndex += 3;
			}

			int hashTimes = (1 + (threshold * 3));
			for (int j = 0; j < lineSize; j++) {
				if (j == hashIndex) {
					for (int k = 0; k < hashTimes; k++) {
						System.out.print(HASHSS);
						j++;
					}
				} else {
					System.out.print(POINTS);
				}
			}

			if (i < 4) {
				threshold += 2;
			} else {
				threshold -= 2;
			}

			System.out.println("");
		}
	}
}
