package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int diferenciaRocas = a[1] - a[0];
		for(int i = 0; i<a.length - 1; i++) {
			if(a[i+1] - a[i] > diferenciaRocas)
				diferenciaRocas = a[i+1] - a[i];
		}
		if(diferenciaRocas < 50) {
			int miSalto = 0;
			int saltos = 0;
			int miSaltoMAX = 50;
			while (miSaltoMAX < a[a.length-1] ) {
				for(int i = 0; i<a.length; i++) {
					if(a[i] < miSaltoMAX)
						miSalto = a[i];			
				}
				miSaltoMAX = miSalto +50;
				saltos++;
			}
			return saltos + 1;
		}
		else
			return -1;
	
	}
}
