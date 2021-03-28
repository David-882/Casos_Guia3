package com.senati.eti;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		int i = 1, factorial = 1 ;
		
		if(n < 7) {
		while(i <= n) {
			factorial *= i;
			if (i < n)
				System.out.print(i + " * ");
			else
				System.out.println(i + " = " + factorial);
			
			i++;
		}
		}
		else {
			System.out.println("El número es superior a 7");
		}
			

	}

}
