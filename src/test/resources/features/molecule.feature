@Feature-Molecular-Weight
Feature: Molecular weight feature

  @LS-XXXXX-The-Jira-Task-For-A-Big-Molecule
  Scenario: a big molecule
    Given My molecule has 12978 as a molecular weight
    When the molecule jumps 1 time(s)
    Then my molecule should be a big molecule

  @LS-XXXXX-The-Jira-Task-For-A-Tiny-Molecule
  Scenario: a tiny molecule
    Given My molecule has 500 as a molecular weight
    When the molecule jumps 5 time(s)
    Then my molecule should be a tiny molecule