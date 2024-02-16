package edu.String03.Java;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		
		
	Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce un Texto: ");
		String verificar = sc.next();
		
		System.out.println("Introduce el caracter a contar: ");
		char caracterABuscar = sc.next().charAt(0);
		
		
		System.out.println(verificar.indexOf(caracterABuscar,verificar.length()-1));

	}

}
