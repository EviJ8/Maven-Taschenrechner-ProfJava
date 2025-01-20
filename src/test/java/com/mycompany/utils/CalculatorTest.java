package com.mycompany.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator calculator;

  // Vorbereitung vor jedem Test
  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  // Aufräumen nach jedem Test
  @AfterEach
  void tearDown() {
    calculator = null;
  }

  @Test
  void testAddition() {
    assertEquals(5.0, calculator.addition(2.0, 3.0), "Addition sollte 5.0 ergeben");
    assertEquals(-1.0, calculator.addition(-2.0, 1.0), "Addition sollte -1.0 ergeben");
    assertEquals(3.0, calculator.addition(0.0, 3.0), "Addition sollte 3.0 ergeben");
  }

  @Test
  void testSubtraction() {
    assertEquals(-1.0, calculator.subtraction(2.0, 3.0), "Subtraktion sollte -1.0 ergeben");
    assertEquals(-3.0, calculator.subtraction(-2.0, 1.0), "Subtraktion sollte -3.0 ergeben");
    assertEquals(3.0, calculator.subtraction(3.0, 0.0), "Subtraktion sollte 3.0 ergeben");
  }

  @Test
  void testMultiplication() {
    assertEquals(6.0, calculator.multiplication(2.0, 3.0), "Multiplikation sollte 6.0 ergeben");
    assertEquals(-2.0, calculator.multiplication(-2.0, 1.0), "Multiplikation sollte -2.0 ergeben");
    assertEquals(0.0, calculator.multiplication(0.0, 3.0), "Multiplikation sollte 0.0 ergeben");
  }

  @Test
  void testDivision() {
    assertEquals(2.0, calculator.division(6.0, 3.0), "Division sollte 2.0 ergeben");
    assertEquals(-2.0, calculator.division(-6.0, 3.0), "Division sollte -2.0 ergeben");
    assertEquals(0, calculator.division(6.0, 0), "Division durch Null sollte 0 zurückgeben");
  }

  @Test
  void testModulo() {
    assertEquals(1.0, calculator.modulo(7.0, 3.0), "Modulo sollte 1.0 ergeben");
    assertEquals(0.0, calculator.modulo(6.0, 3.0), "Modulo sollte 0.0 ergeben");
    assertEquals(
        -1.0, calculator.modulo(-7.0, 3.0), "Modulo mit negativen Zahlen sollte -1.0 ergeben");
    assertEquals(0, calculator.modulo(6.0, 0), "Modulo durch Null sollte 0 zurückgeben");
  }
}
