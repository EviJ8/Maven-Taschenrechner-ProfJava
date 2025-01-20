package com.mycompany.app;

import com.mycompany.steuerung.Steuerung;

/** Die Hauptklasse der Anwendung. Diese Klasse enthält den Einstiegspunkt der Anwendung. */
public class App {
  /**
   * Der Einstiegspunkt der Anwendung.
   *
   * @param args die Kommandozeilenargumente
   */
  public static void main(String[] args) {
    // Ein Objekt der Klasse Steuerung wird erstellt
    Steuerung steuerung = new Steuerung();
    // Aufruf der Methode start(): Steuerung wird gestartet
    steuerung.start();
  }
}
