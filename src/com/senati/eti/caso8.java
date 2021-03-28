package com.senati.eti;

import java.util.Scanner;

public class caso8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Ingrese número........: ");
		int n = sc.nextInt();
		
		System.out.println("\nTABLA DEL " + n);
		System.out.println("==============");
		
		for (int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n * i));
		
		System.out.println("");
		
		for (int i = 2; i <= 15; i+=2)
			System.out.println(n + " x " + i + " = " + (n * i));
		
		
	}

}
