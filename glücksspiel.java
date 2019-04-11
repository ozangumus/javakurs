/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	
		
		//Variablen
		String name;
		String name2;
		int max = 100;
		int min = 1;
		int spieler1;
		int spieler2;
		String q;
		int punktea = 0;
		int punkteb = 0;
		
    //Eingaben
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Spieler 1, bitte geben Sie ihren Namen ein:");
		name = eingabe.next();
		
		System.out.print("Spieler 2, bitte geben Sie ihren Namen ein:");
		name2 = eingabe.next();
		
    // <-Schleifenanfang - Spieler 1 und 2 geben jeweils eine Zahl 1 ->
		do {
		System.out.print(name + " geben Sie bitte eine Zahl ein:");
		spieler1 = eingabe.nextInt();
		
		System.out.print(name2 + " geben Sie bitte eine Zahl ein:");
		spieler2 = eingabe.nextInt();
		
    // <- Random Zahl wird generiert ->
		Random rn = new Random();
        int result = rn.nextInt(max - min + 1) + min;
        //System.out.println(result);
		
		spieler1 = result - spieler1;
		spieler2 = result - spieler2;
		/*<- Wenn die Zahl nach der Subtraktion eine negative Zahl 
    */ ist wird sie hier zu einer positiven umgewandelt ->
		if (spieler1 < 0) {
		    spieler1 = Math.abs(spieler1);
		}
		
		if(spieler2 < 0) {
		    spieler2 = Math.abs(spieler2);
		}
		
    
		if(spieler1 == result) {
		    System.out.println(name + " hat gewonnen");
		} else if (spieler2 == result) {
		    System.out.println(name2 + " hat gewonnen");
		    punkteb = punkteb +1;
		} else if(spieler1 == result) {
		    punktea = punktea +1;
		}
		else if (spieler2 > spieler1) {
		    System.out.println(name + " hat gewonnen");
		    punktea += 1;
		} else if (spieler1 > spieler2) {
		    System.out.println(name2 + " hat gewonnen");
		    punkteb += 1;
		}
    // <- Ausgaben von Punktestand, gesuchter Zahl und Abfrage ob man noch einmal spielen möchte -> 
		System.out.println("Die Gesuchte Zahl war:" + result);
		System.out.print("\n======= Punktestand ===================");
		System.out.print("\n" + name + ":" + punktea);
		System.out.print("\t" + name2 + ":" + punkteb);
		System.out.print("\nMöchten Sie nochmal spielen?: ");
		q = eingabe.next();
		
	} while (q.equals("j"));
	    
	}
} 
