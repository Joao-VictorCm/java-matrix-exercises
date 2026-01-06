package exercises_04;

import java.util.Scanner;

public class Cada_linha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 4;
	

		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Elemento [" + i + "," + j + "]");
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			int maior = 0;
			for(int j =0; j < n; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			
			System.out.println(maior);
		}

		
		sc.close();
	}

}
