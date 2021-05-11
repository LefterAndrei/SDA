package Tema3;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		char metoda;
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		List<Shape> shapes = new ArrayList<>();

		System.out.println("Alegeti metoda de  rulare:");
		System.out.println("Automat (a)");
		System.out.println("Manual (m)");

		metoda = (x.readLine().charAt(0));

		int ok = 1;
		while (ok != 0) {

			switch (metoda) {
			case 'a':
				shapes.add(new Patrat("#3fd156", 1, 5));
				shapes.add(new Dreptunghi("#1a235d", 2, 5, 7));
				shapes.add(new Cerc("#3bd184", 1, 6));
				shapes.add(new Patrat("#789ec1", 3, 8));
				shapes.add(new Dreptunghi("#9012fa", 2, 8, 9));
				shapes.add(new Cerc("#89ad2c", 2, 4));
				
				ok = 0;
				break;

			case 'm':

				System.out.println("Alegeti forma:");
				System.out.println("Patrat (p)");
				System.out.println("Dreptunghi (d)");
				System.out.println("Cerc (c)");

				char forma;
				forma = (x.readLine().charAt(0));

				switch (forma) {

				case 'p':
					System.out.println("Introduceti culoarea:");
					String color_p = x.readLine();

					System.out.println("Introduceti grosimea conturului:");
					int thick_p = Integer.parseInt(x.readLine());

					System.out.println("Introduceti lungimea laturii:");
					double length_p = Double.parseDouble(x.readLine());

					shapes.add(new Patrat(color_p, thick_p, length_p));

					break;

				case 'd':
					System.out.println("Introduceti culoarea");
					String color_d = x.readLine();

					System.out.println("Introduceti grosimea conturului:");
					int thick_d = Integer.parseInt(x.readLine());

					System.out.println("Introduceti lungimea:");
					double length_d = Double.parseDouble(x.readLine());

					System.out.println("Introduceti latimea:");
					double width_d = Double.parseDouble(x.readLine());

					shapes.add(new Dreptunghi(color_d, thick_d, length_d, width_d));
					System.out.println("Doriti adaugarea unei noi forme?");
					System.out.println("Da (y)");
					System.out.println("Nu (n)");

					break;

				case 'c':
					System.out.println("Introduceti culoarea");
					String color_c = x.readLine();

					System.out.println("Introduceti grosimea conturului:");
					int thick_c = Integer.parseInt(x.readLine());

					System.out.println("Introduceti raza cercului:");
					double radius = Double.parseDouble(x.readLine());

					shapes.add(new Cerc(color_c, thick_c, radius));
					break;

				default:
					System.out.println("Varianta selectata nu este corecta");

				}

				break;

			default:
				System.out.println("Metoda selectata nu este corecta");
			}

			System.out.println("Doriti adaugarea altei forme?");
			System.out.println("Da (y)");
			System.out.println("Nu (n)");

			char valid = x.readLine().charAt(0);
			if (valid == 'y') {
				
			} else {
				ok = 0;
			}

		}

		for (int i = 0; i <= shapes.size() - 1; i++) {
			System.out.println("Shape name: " + shapes.get(i).getName());
			System.out.println("Shape Area: " + shapes.get(i).getArea() + " cm^2");
			System.out.println("Shape Fill Color: " + shapes.get(i).getHexFillColor());
			System.out.println("Shape Border Width: " + shapes.get(i).getBorderWidth());
			System.out.println("Shape Drawing:");
			shapes.get(i).draw();
		}

	}

}
