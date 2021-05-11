package Tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiul1 {

	public static void main(String[] args) throws IOException {

		int drum, v_oras, v_rezident, v_express, v_autostrada;

		v_oras = 50;
		v_rezident = 30;
		v_express = 100;
		v_autostrada = 130;

		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		// metoda 1

		System.out.println("Alegeti tipul de drum pentru metoda 1:");
		System.out.println("1.Oras");
		System.out.println("2.Zona rezidentiala");
		System.out.println("3.Drum expres");
		System.out.println("4.Autostrada");

		drum = Integer.parseInt(x.readLine());

		if (drum == 1) {
			System.out.println("Viteza maxima este: " + v_oras + "km/h");
		} else {
			if (drum == 2) {

				System.out.println("Viteza maxima este: " + v_rezident + "km/h");
			} else {
				if (drum == 3) {

					System.out.println("Viteza maxima este: " + v_express + "km/h");
				} else {
					if (drum == 4) {

						System.out.println("Viteza maxima este: " + v_autostrada + "km/h");
					} else {
						System.out.println("Drumul nu este valabil");
					}
				}
			}
		}

		if (drum == 1) {
			System.out.println("Viteza maxima este: " + v_oras + "km/h");
		} else if (drum == 2) {
			System.out.println("Viteza maxima este: " + v_rezident + "km/h");
		} else if (drum == 3) {
			System.out.println("Viteza maxima este: " + v_express + "km/h");
		} else if (drum == 4) {
			System.out.println("Viteza maxima este: " + v_autostrada + "km/h");
		} else {
			System.out.println("Drumul nu este valabil");
		}

		// metoda 3

		System.out.println("Alegeti tipul de drum pentru metoda 3:");
		System.out.println("1.Oras");
		System.out.println("2.Zona rezidentiala");
		System.out.println("3.Drum expres");
		System.out.println("4.Autostrada");

		drum = Integer.parseInt(x.readLine());

		switch (drum) {
		case 1:
			System.out.println("Viteza maxima este: " + v_oras + "km/h");
			break;
		case 2:
			System.out.println("Viteza maxima este: " + v_rezident + "km/h");
			break;
		case 3:
			System.out.println("Viteza maxima este: " + v_express + "km/h");
			break;
		case 4:
			System.out.println("Viteza maxima este: " + v_autostrada + "km/h");
			break;
		default:
			System.out.println("Drumul nu este valabil");

		}

	}

}