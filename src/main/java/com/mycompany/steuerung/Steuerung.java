package com.mycompany.steuerung;

import com.mycompany.utils.Calculator;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Diese Klasse steuert den Mini-Konsolen-Taschenrechner. Sie ermöglicht die Auswahl von
 * mathematischen Operationen und die Verarbeitung von Benutzereingaben.
 */
public class Steuerung {
  /**
   * Startet die Steuerung des Taschenrechners. Es wird eine Benutzeroberfläche in der Konsole
   * bereitgestellt, die mathematische Operationen ermöglicht.
   */
  public void start() {
    // Ein Objekt der Klasse Calculator wird erstellt
    Calculator calculator = new Calculator();
    // Ein Objekt der Klasse Scanner wird erstellt
    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    // Eine boolean Variable wird erstellt mit dem Wert true
    boolean carryOn = true;

    System.out.println("Mini-Konsolen-Taschenrechner wurde gestartet.\n");

    while (carryOn) {
      System.out.println("Folgende Operatoren stehen zur Verfügung:\n");
      System.out.println("1: Addition\n");
      System.out.println("2: Subtraktion\n");
      System.out.println("3: Multiplikation\n");
      System.out.println("4: Division\n");
      System.out.println("5: Modulo\n");
      System.out.println("6: Beenden\n");
      System.out.println("Bitte wählen Sie einen aus:\n");

      int choice = scanner.nextInt();

      if (choice == 6) {
        carryOn = false;
        System.out.println("Mini-Konsolen-Taschenrechner wurde beendet");
        break;
      }

      if (choice < 1 || choice > 5) {
        System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
        continue;
      }

      double integer1 = getValidNumber(scanner, "Geben Sie Ihre erste Zahl ein: ");

      double integer2 = getValidNumber(scanner, "Geben Sie Ihre zweite Zahl ein: ");

      double result = 0;

      switch (choice) {
        case 1:
          result = calculator.addition(integer1, integer2);
          System.out.println("Ergebnis der Addition: " + result);
          break;
        case 2:
          result = calculator.subtraction(integer1, integer2);
          System.out.println("Ergebnis der Subtraktion: " + result);
          break;
        case 3:
          result = calculator.multiplication(integer1, integer2);
          System.out.println("Ergebnis der Multiplikation: " + result);
          break;
        case 4:
          result = calculator.division(integer1, integer2);
          System.out.println("Ergebnis der Division: " + result);
          break;
        case 5:
          result = calculator.modulo(integer1, integer2);
          System.out.println("Ergebnis von Modulo: " + result);
          break;
        default:
          continue;
      }
    }

    scanner.close();
  }

  /**
   * Fragt den Benutzer nach einer gültigen Zahl und gibt diese zurück.
   *
   * @param scanner das Scanner-Objekt für Benutzereingaben
   * @param prompt die Eingabeaufforderung für den Benutzer
   * @return die eingegebene gültige Zahl
   */
  private double getValidNumber(Scanner scanner, String prompt) {
    double number;
    while (true) {
      System.out.print(prompt);
      if (scanner.hasNextDouble()) {
        number = scanner.nextDouble();
        break;
      } else {
        System.out.println("Ungültige Zahl. Bitte geben Sie eine gültige Zahl ein.");
        scanner.next(); // Eingabepuffer leeren
      }
    }
    return number;
  }
}
