Feature: Sonidos de animales
  Scenario: Perro hace sonido
    Given un perro
    When hace un sonido
    Then el sonido es "Guau"

  Scenario: Gato hace sonido
    Given un gato
    When hace un sonido
    Then el sonido es "Miau"