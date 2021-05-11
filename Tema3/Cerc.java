
package Tema3;

public class Cerc extends ColorValidator implements Shape {
	private String fillColor;
	private int borderWidth;
	private double radius;
	private static final String nume_forma = "Cerc";

	Cerc(String culoare, int contur, double raza) {

		// verificarea culorii
		if (validate(culoare)) {
			fillColor = culoare.toUpperCase();
		} else {
			System.out.println("Codul de culoare nu reprezinta un cod valid");
			//throw new IllegalArgumentException("Codul culorii nu este valid");
		}

		// Validarea conturului
		if (contur > 0) {
			borderWidth = contur;
		} else {
			System.out.println("Conturul formei nu poate fi 0 sau de valoare negativa");
		}

		// Verificarea razei
		if (raza > 0) {
			radius = raza;
		} else {
			System.out.println("Raza cercului nu poate fi 0 sau de valoare negativa");
		}
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String getName() {
		return nume_forma;
	}

	@Override
	public String getHexFillColor() {
		return fillColor;
	}

	@Override
	public int getBorderWidth() {
		return borderWidth;
	}

	@Override
	public void draw() {

		for (int i = 0; i <= (int) radius - 1; i++) {
			System.out.println(" ".repeat((int) radius - i) + "*" + " ".repeat(i) + " ".repeat(i) + "*"
					+ " ".repeat((int) radius - i));
		}

		for (int i = (int) radius - 1; i >= 0; i--) {
			System.out.println(" ".repeat((int) radius - i) + "*" + " ".repeat(i) + " ".repeat(i) + "*"
					+ " ".repeat((int) radius - i));
		}
	}

}
