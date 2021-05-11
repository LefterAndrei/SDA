package Tema3;

public class Dreptunghi extends ColorValidator implements Shape {

	private String fillColor;
	private int borderWidth;
	private double length, width;
	private static final String nume_forma = "Dreptunghi";

	Dreptunghi(String culoare, int contur, double lungime, double latime) {

		// verificarea conturului
		if (contur > 0) {
			borderWidth = contur;
		} else {
			System.out.println("Conturul formei nu poate fi 0 sau de valoare negativa");
		}

		// verificarea culorii
		if (validate(culoare)) {
			fillColor = culoare.toUpperCase();
		} else {
			System.out.println("Codul de culoare nu reprezinta un cod valid");
			//throw new IllegalArgumentException("Codul culorii nu este valid");
		}

		// verificareaa lungimii laturilor
		if ((lungime > 0) && (latime > 0)) {
			length = lungime;
			width = latime;
		} else {
			System.out.println("Dimensiunile nu pot fi 0 sau de valoare negativa");
		}

	}

	@Override
	public double getArea() {
		return length * width;
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
		System.out.println("*".repeat((int) length));
		for (int i = 1; i <= (int) width - 2; i++) {
			System.out.println("*" + " ".repeat((int) length - 2) + "*");
		}
		System.out.println("*".repeat((int) length));
	}
}
