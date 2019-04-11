import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double wurst = 4.20;
		double kaese = 2.30;
		double brot = 2.10;
		double dvd = 6.00;
		double btasche;
		int anzahl;
		double ergebnis;
		int[] arr = new int[5];
		
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Wie viel Geld haben sie ?:");
		anzahl = eingabe.nextInt();
		arr[0] = anzahl;
		btasche = anzahl;
		
		System.out.print("Käse Menge eingeben:");
		anzahl = eingabe.nextInt();
		arr[1] = anzahl;
		kaese = kaese * anzahl;
		
		System.out.print("Wurst Menge eingeben:");
		anzahl = eingabe.nextInt();
		arr[2] = anzahl;
		wurst = wurst * anzahl;
		
		System.out.print("Brot Menge eingeben:");
		anzahl = eingabe.nextInt();
		arr[3] = anzahl;
		brot = brot * anzahl;
		
		System.out.print("DVD Menge eingeben:");
		anzahl = eingabe.nextInt();
		arr[4] = anzahl;
		dvd = dvd * anzahl;
        ergebnis = kaese + wurst+brot+dvd;
        ergebnis = Math.round(ergebnis * 100.0) / 100.0;
        
        if (ergebnis > btasche) {
            System.out.println("Sie haben leider nicht genügend Geld für diesen Einkauf!");
            ergebnis = btasche - ergebnis;
            System.out.println("Fehlender Betrag:" + ergebnis);
        }
        else {
        System.out.println("Kaese" + "\t" + arr[1] + " x " + kaese + "\n");
        System.out.println("Wurst" + "\t" + arr[2] + " x " + wurst + "\n");
        System.out.println("Brot" + "\t" + arr[3] + " x " + brot +"\n");
        System.out.println("DVD" + "\t" + arr[4] + " x " + dvd + "\n");
        System.out.println("-----------------------------------------");
        
        System.out.println("Gesamt\t" + ergebnis);
        System.out.println("Gegeben\t" + btasche);
        ergebnis = btasche - ergebnis;
        System.out.println("\nZurück\t" + ergebnis);
        }
     
        
	}
	
}
