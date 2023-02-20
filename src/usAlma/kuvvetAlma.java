package usAlma;

import java.util.Scanner;

public class kuvvetAlma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Taban sayısını giriniz: ");
		int taban = input.nextInt();
		
		System.out.println("Kuvvet sayısını giriniz: ");
		int kuvvet = input.nextInt();
		
		System.out.println("Sonucunuz: " + usAlma(taban,kuvvet));
		
		
		
		

	}
	
	
	static int usAlma(int taban,int kuvvet) {
		if (kuvvet==0) {
			return 1;
		}
		return taban*usAlma(taban , (kuvvet-1));
		
	}

}
