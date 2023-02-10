package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		double[]vetorA = new double[n];
		double[]vetorB = new double[n];
		double[]vetorC = new double[n];
		System.out.println("Digite os valores do vetor A:");
		
		for(int i=0;i<n;i++) {
			vetorA[i] = sc.nextDouble();
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0;i<n;i++) {
			vetorB[i] = sc.nextDouble();
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i=0;i<n;i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
	}

}
