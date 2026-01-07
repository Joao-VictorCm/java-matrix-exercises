package exercises_06;

import java.util.Scanner;

public class Acima_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = 4;

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				soma += mat[i][j];
			}
		}

		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
	}

}
