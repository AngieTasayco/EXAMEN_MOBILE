Feature: Acceso a SauceLabs

  @SL
  Scenario: Login correcto a SauceLabs
    Given me encuentro en la APP de SauceLabs
    When ingreso el usuario "standard_user"
    And ingreso la clave "secret_sauce"
    And hago click en LOGIN
    Then valido que se muestre el titulo de "PRODUCTS"
    And valido que se exista un item