package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		String aCadena = a + ""; 
		int [] misCifras = new int [aCadena.length()];
		for (int i = 0; i<aCadena.length(); i++) {
			misCifras[i] = Integer.parseInt(aCadena.charAt(i)+"");
		}
		if(verificarBaseGabriel(misCifras)) {
			int resultado = 0;
			for (int i = 0; i<aCadena.length(); i++) {
				resultado = (int)(resultado + misCifras[i]*(Math.pow(2, aCadena.length() - i) - 1));
			}
			return resultado+"";
		}
		else
			return "El numero proporcionado no esta en base Gabriel.";
	}
	public boolean verificarBaseGabriel(int [] b) {
		int contadorDos = 0;
		int contadorMayor = 0;
		for (int i = 0; i<b.length; i++) {
			if (b[i] == 2)
				contadorDos++;
			else if (b[i] > 2)
				contadorMayor++;
		}
		if(contadorDos < 2 && contadorMayor == 0) {
			if(contadorDos == 0)
				return true;
			else {
				for (int i = 0; i<b.length; i++) {
					if (b[i] == 2 && b[i+1] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
}


