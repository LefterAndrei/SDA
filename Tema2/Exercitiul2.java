package Tema2;

import java.util.*;

public class Exercitiul2 {

	public static void main(String[] args) {
		
		List<Double> temperaturi = new ArrayList<>();
		List<Double> temperaturi_normale = new ArrayList<>();
		List<Double> temperaturi_anormale = new ArrayList<>();
		
		temperaturi.add(36.9);
		temperaturi.add(37.1);
		temperaturi.add(39.0);
		temperaturi.add(38.5);
		temperaturi.add(35.9);
		temperaturi.add(37.0);
		
		for (int i=0; i<=temperaturi.size() - 1; i++)
			if(temperaturi.get(i) >= 37.0)
				temperaturi_normale.add(temperaturi.get(i));
			else
				temperaturi_anormale.add(temperaturi.get(i));
		
	System.out.println("Temperaturi normale: " + temperaturi_normale);
	System.out.println("Temperaturi anormale: " + temperaturi_anormale);

	}

}