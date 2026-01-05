package exercises_02;

import java.util.Scanner;

public class Soma_linhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int qtdLinhas = 2;
		int qtdColunas = 3;
		int vect[];


		int[][] mat = new int[qtdLinhas][qtdColunas];

		for (int i = 0; i < qtdLinhas; i++) {
			for (int j = 0; j < qtdColunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < qtdLinhas; i++) {
			int somalinhas = 0;
			for (int j = 0; j < qtdColunas; j++) {
				somalinhas += mat[i][j];
			}
			
			System.out.println(somalinhas);
			
		}


		sc.close();

	}

}
