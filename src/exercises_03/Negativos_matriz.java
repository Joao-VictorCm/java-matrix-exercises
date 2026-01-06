package exercises_03;

import java.util.Scanner;

public class Negativos_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz?");
		int n = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz?");
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		if (n <= 10 && m <= 10) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.println("Elemento [" + i + "," + j + "]");
					mat[i][j] = sc.nextInt();
				}
			}

			System.out.println("VALORES VEGATIVOS");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (mat[i][j] < 0) {
						System.out.println(mat[i][j]);
					}
				}
			}
		} else {
			System.out.println("O numero de linhas e colunas tem que ser de no maximo 10");
		}

		sc.close();

	}

}
