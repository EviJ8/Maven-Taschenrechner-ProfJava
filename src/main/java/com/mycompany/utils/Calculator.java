package com.mycompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Eine Hilfsklasse, die grundlegende mathematische Operationen bereitstellt. */
public class Calculator {
  private static final Logger logger = LogManager.getLogger(Calculator.class);

  /**
   * Addiert zwei Zahlen.
   *
   * @param number1 die erste Zahl
   * @param number2 die zweite Zahl
   * @return die Summe der beiden Zahlen
   */
  public double addition(double number1, double number2) {
    // Return: Beide double-Werte werden addiert
    return number1 + number2;
  }

  /**
   * Subtrahiert die zweite Zahl von der ersten Zahl.
   *
   * @param number1 die erste Zahl
   * @param number2 die zweite Zahl
   * @return die Differenz der beiden Zahlen
   */
  public double subtraction(double number1, double number2) {
    // Return: Beide double-Werte werden subtrahiert
    return number1 - number2;
  }

  /**
   * Multipliziert zwei Zahlen.
   *
   * @param number1 die erste Zahl
   * @param number2 die zweite Zahl
   * @return das Produkt der beiden Zahlen
   */
  public double multiplication(double number1, double number2) {
    // Return: Beide double-Werte werden multipliziert
    return number1 * number2;
  }

  /**
   * Dividiert die erste Zahl durch die zweite Zahl.
   *
   * @param number1 die erste Zahl
   * @param number2 die zweite Zahl
   * @return das Ergebnis der Division oder 0, wenn die Division durch null erfolgt
   */
  public double division(double number1, double number2) {
    // If: Ueberpruefung, ob number2 = 0 ist
    if (number2 == 0) {
      // Wenn ja:
      // Logger: Ausgabe in der Konsole, dass es einen Fehler gab
      logger.error("Fehler: Division durch Null ist nicht erlaubt.\n");
      // Return: gibt den Wert 0 zurueck, um mit der while-Schleife in der Klasse Steuerung
      // fortzufahren
      return 0;
    }
    // Wenn nein:
    // Return: Beide double-Werte werden dividiert
    return number1 / number2;
  }

  /**
   * Berechnet den Modulo der ersten Zahl mit der zweiten Zahl.
   *
   * @param number1 die erste Zahl
   * @param number2 die zweite Zahl
   * @return das Ergebnis des Modulo oder 0, wenn die Division durch null erfolgt
   */
  public double modulo(double number1, double number2) {
    // If: Ueberpruefung, ob number2 = 0 ist
    if (number2 == 0) {
      // Wenn ja:
      // Logger: Ausgabe in der Konsole, dass es einen Fehler gab
      logger.error("Fehler: Modulo durch Null ist nicht erlaubt.\n");
      // Return: gibt den Wert 0 zurueck, um mit der while-Schleife in der Klasse Steuerung
      // fortzufahren
      return 0;
    }
    // Wenn nein:
    // Return: Beide double-Werte werden modulo berechnet
    return number1 % number2;
  }
}
