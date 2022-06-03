@aleatoire
Feature: Je me redirige vers Aléatoire
  ETQ ouvrir l'onglet Aléatoire

  @aleatoire_ok
  Scenario: Ouvrir l'onglet Aléatoire
    Given Je suis connecté à l'application
    When Je clique sur Aléatoire
    Then Je me redirige vers Aléatoire
    And Je vérifie la présence des widgets 