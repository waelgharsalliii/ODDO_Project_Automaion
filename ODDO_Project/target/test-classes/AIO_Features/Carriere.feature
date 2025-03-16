

Feature: Carrieres


  @OP-TC-13 @AIO-FOLDER-Carrières
  Scenario: Consulter Toutes nos offres
    Given I am on carrieres page
    When I click on les talents au coeur de notre stratégie
    And I click on Toutes nos offres
    Then Formulaire  Nos offres demploie is displayed

  @OP-TC-23 @AIO-FOLDER-Carrières
  Scenario: Consulter le temoignage - Directeur Corporate Finance - Paris
    Given I am on carrieres page
    When I click on nos collaborateurs témoignent
    Then title nos collaborateurs témoignent is displayed

  @OP-TC-38 @AIO-FOLDER-Carrières
  Scenario Outline: Consulter <title>
    Given I am on carrieres page
    When I click on <category>
    And I click on <title>
    Then title <title> is displayed

    Examples: 
      | category                                 | title                                      |
      | Une politique de développement RH engagé | Graduate Programs                          |
      | Une politique de développement RH engagé | L’innovation au cœur de notre politique RH |
      | Une politique de développement RH engagé | Développement des potentiels et mobilité   |
      | Une politique de développement RH engagé | Engagements                                |

  @OP-TC-43 @AIO-FOLDER-Carrières
  Scenario: Consulter le mot de la DRH
    Given I am on carrieres page
    When I click on le mot de la DRH
    Then I am on the text le mot de la DRH
