package Tema3;

public class Patrat extends ColorValidator implements Shape {

	private String fillColor;
	private int borderWidth;
	private double length;
	private static final String nume_forma = "Patrat";

	Patrat(String culoare, int contur, double latura) {
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

		// verificareaa lungimii laturii
		if (latura > 0) {
			length = latura;
		} else {
			System.out.println("Lungimea formei nu poate fi de valoare negativa");
		}
	}

	@Override
	public double getArea() {
		return length * length;
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
		System.out.println("* ".repeat((int) length));
		for (int i = 1; i <= (int) length - 2; i++) {
			System.out.println("* " + " ".repeat((int) length - 2) + "* ");
		}
		System.out.println("* ".repeat((int) length));
	}
}

