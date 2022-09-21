// Package definieren
// Ich habe hier meins eingetragen, da ich alles im GitHub repository habe und so keine Fehlermeldung kommt.
package Main.Dalton;
// package ersteSchritte; 

import java.util.Scanner; // Importieren des Scanners für die Eingaben

// Klasse definieren umd Methoden schreiben zu können
public class Kapitel10 {

	// Definition der Main Methode, hier beginnt das Programm
	public static void main(String[] args) {

		// Erstellen (Definition) eines Scanner Objektes
		Scanner eingabe = new Scanner(System.in);

		// Ausgabe in die Konsole
		System.out.println("Welche Aufgaben soll bearbeitet werden (1, 2, 3, 4)?");

		// Lesen und Speichern eines nummerischen Wertes (Ganzzahlig / int)
		int wahl = eingabe.nextInt();

		// Überprüfen der Eingabe mit if {} else {} Abfrage
		// Dies wäre ebenfalls mit switch case möglich
		if (wahl == 1) {

			// Erneute system Ausgabe in die Konsole
			System.out.println("Geben Sie den Radius ein:");

			// Auslesen und Speichern des nächsten ganzzahligen nummerischen Wertes
			int radius = eingabe.nextInt();

			// Berechnung der Fläche
			double flaeche = Math.PI * radius * radius;

			// Ausgabe der Eingabe und der Fläche in die Konsole
			System.out.println("Der Radius beträgt " + radius + ", die Fläche  " + flaeche);

		} else if (wahl == 2) { // Erneute if abfrage

			// Ausgabe in die Konsole
			System.out.println("Geben Sie die Cent ein:");

			// Erneute Eingabe und Speicherung von einem ganzzahligen Wertes
			int cent = eingabe.nextInt();

			// Ausgabe mit integrierter Berechnung des Betrages in die Konsole
			System.out.println("Das ergibt " + cent / 100 + " Dollar und " + (cent % 100) + " Cent");

		} else if (wahl == 3) { // Erneute if Abfrage

			// Erneute ausgabe in die Konsole
			System.out.println("Geben Sie das Wechselgeld in Cent ein:");

			// Erneute Eingabe und Speicherung eines ganzzahligen nummerischen Wertes
			int cent = eingabe.nextInt();

			// Der folgende Teil berechnet die auszugebenen Werte nach einer Mathematischen/logischen Abfolge von Rechenoperationen
			int dollar = cent / 100;
			int rest = cent - dollar * 100;
			int quarter = rest / 25;
			rest = rest - quarter * 25;
			int dime = rest / 10;
			rest = rest - dime * 10;
			int nickel = rest / 5;
			rest = rest - nickel * 5;
			cent = rest;

			// Ausgabe von Eingabe und den Ergebnissen
			System.out.println("Das ergibt " + dollar + " Dollar, " + quarter + " Quarter, " + dime + " Dime, " + nickel

					+ " Nickel und " + cent + " Cent.");

		} else if (wahl == 4) { // Erneute if Abfrage

			// Erneute ausgabe in die Konsole
			System.out.println("Geben Sie die Spannung ein: ");

			// Erneute Eingabe und Speicherung eines ganzzahligen nummerischen Wertes
			int u = eingabe.nextInt();

			// Ausgabe in die Konsole
			System.out.println("Geben Sie den Widerstand ein:");

			// Erneute Eingabe und Speicherung eines ganzzahligen nummerischen Wertes
			int r = eingabe.nextInt();

			// Berechnung der Stromstärke
			double i = (u + 0.0) / r;

			// Ausgabe der Stromstärke
			System.out.println("Die Stromstärke beträgt " + i);

		} else { // Für den Fall einer falschen Eingabe 

			// Ausgabe in die Konsole
			System.out.println("Diese Option gibt es nicht.");
		
		}

	}

}

/*
 * Vorschläge:
 * 1. Scanner wurde nie geschlossen, dies kann potentiell eine Schwachstelle des Programmes darstellen
 * 2. Switch case an Stelle der wiederholten if Abfragen verwenden
 * 3. Eingaben als double, da man gerne 1,5 oder ähnliches als Eingabe für derartige Berechnung verwendet
 * */