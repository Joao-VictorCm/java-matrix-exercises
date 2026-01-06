package exercises_02;

import java.util.Scanner;

public class Soma_linhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a quantidade de linhas da matriz?");
		int qtdLinhas = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz?");
		int qtdColunas = sc.nextInt();
		int[] vect = new int[qtdLinhas];

		if(qtdLinhas <= 10 && qtdColunas  <= 10) {
			int[][] mat = new int[qtdLinhas][qtdColunas];

			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					System.out.println("Digite os elementos da " +(i+1)+"a. linha: ");
					mat[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < qtdLinhas; i++) {
				int somalinhas = 0;
				for (int j = 0; j < qtdColunas; j++) {
					somalinhas += mat[i][j];
				}
		
				vect[i] = somalinhas;
			}
			
			System.out.println("VETOR GERADO:");
			for(int i =0; i < qtdLinhas; i++) {
				System.out.println(vect[i]);
			}
			
		}else {
			System.out.println("O numero de linhas e colunas tem que ser de no maximo 10");
		}

		
		


		sc.close();

	}

}
