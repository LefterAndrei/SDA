package Teme;

import java.util.Scanner;

public class Exercitiul1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Adauga un numar real de la tastatura");
		int numar = read.nextInt();
		System.out.println("Adauga un alt numar real de la tastatura");
		int numar_2 = read.nextInt();
		int suma = numar + numar_2;
		int diferenta = numar-numar_2;
		int produs = numar*numar_2;
		System.out.println("Suma numerelor este: "+suma);
		System.out.println("Diferenta numerelor este: "+diferenta);
		System.out.println("Inmultirea numerelor este: "+produs);
		int avg = suma/2;
		System.out.println("Media este: "+avg);
		int max=numar;
		if(max<numar_2)
			max = numar_2;
		System.out.println("Maximul este: "+max);
		int min=numar;
		if(min>numar_2)
			min = numar_2;
		System.out.println("Minimul este: "+min);
		float distanta = Math.abs(diferenta);
		System.out.println("Distanta intre cele doua numere: "+ distanta);
		
		
	}

	
}