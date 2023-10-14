Feature: validar un POST para el registro de un nuevo pais

  Background: configuracion inicial
    Given url 'https://restcountries.com'


  Scenario Outline: consumir api con el metodo post y validar la respuesta
    Given path '/v3.1/country'
    And request { nombre: "<nombre>", alpha2_code: "<alpha2_code>", alpha3_code: "<alpha3_code>" }
    When method post
    Then status <status>
    And match response.nombre == '<nombre>'
    And match response.alpha2_code == '<alpha2_code>'
    And match response.alpha3_code == '<alpha3_code>'
    And print response

    Examples:
      | nombre         | alpha2_code | alpha3_code | status |
      | País de prueba | TC          | TCY         | 201    |
