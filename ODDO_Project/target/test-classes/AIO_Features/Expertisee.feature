@Expertise
Feature: Expertise


  Scenario Outline: Consulter <Expertise>
    Given I am on Expertises
    When I click on <Expertise>
    Then title <Title> is displayed

    Examples: 
      | Expertise                   | Title                       |
      | Banque privé                | Banque privée               |
      | Private Assets              | PRIVATE ASSESTS             |
      | Recherche et Intermédiation | Recherche et Intermédiation |
