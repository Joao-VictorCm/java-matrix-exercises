package exercises_05;

import java.util.Scanner;

public class Soma_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz?");
		int qtdLinhas = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz?");
		int qtdColunas = sc.nextInt();

		int[][] mat1 = new int[qtdLinhas][qtdColunas];
		int[][] mat2 = new int[qtdLinhas][qtdColunas];
		int[][] soma = new int[qtdLinhas][qtdColunas];

		if(qtdLinhas <= 10 && qtdColunas <= 10) {
			System.out.print("Digite os elementos da matriz A?");
			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					System.out.println("Elemento [" + i + "," + j + "]");
					mat1[i][j] = sc.nextInt();
				}
			}

			System.out.print("Digite os elementos da matriz B?");
			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					System.out.println("Elemento [" + i + "," + j + "]");
					mat2[i][j] = sc.nextInt();
				}
			}

			System.out.println("Matriz soma:");
			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					soma[i][j] = mat1[i][j] + mat2[i][j];
					System.out.print(soma[i][j] + " ");
				}
				System.out.println();
			}

			sc.close();
		}else {
			System.out.println("O numero de linhas e colunas tem que ser de no maximo 10");
		}
	}

}
