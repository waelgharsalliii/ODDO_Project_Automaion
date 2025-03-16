@QuisommeNous
Feature: Quissomme-nous



  @OP-TC-1 @AIO-FOLDER-Quis_somme-nous
  Scenario: Consulter Identifié
    Given I am in page ODDO-Qui sommes-nous-A propos
    When I click on identité
    Then Title ODDO BHF, make every day an opportunity is displayed

  @OP-TC-6 @AIO-FOLDER-Quis_somme-nous
  Scenario: Consulter Histoire
    Given I am in page ODDO-Qui sommes-nous-A propos
    When I click on Histoir
    Then title Histoire is displayed

  @OP-TC-7 @AIO-FOLDER-Quis_somme-nous
  Scenario: Consulter Gouvernance
    Given I am in page ODDO-Qui sommes-nous-A propos
    When I click on a Gouvernance
    Then A slider is displayed

  Scenario Outline: Consulter Engagements
    Given I am in page ODDO-Qui sommes-nous-A propos
    When I click on <option>
    Then <result>

    Examples: 
      | option                               | result                                                         |
      | Sengager pour nos collaborateurs     | A title Sengager pour nos collaborateurs and sliders displayed |
      | Limiter notre impact environnemental | A title Limiter notre impact environnemental is displayed      |
      | Agir pour une société solidaire      | A title Agir pour une société solidaire displayed              |

  Scenario: Télécharger Documents
    Given I am in page ODDO-Qui sommes-nous-A propos
    When I click on Rapport RSE 
    Then A file pdf Rapport RSE  displayed

