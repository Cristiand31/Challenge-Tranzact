Feature: consumir un metodo get de una API validando todo el response body

  Background: configuracion inicial
    Given url 'https://restcountries.com'

  Scenario Outline: Consumir la API con el valor Country = <country> y validar todo el response body
    Given path '/v3.1/name/<country>'
    When method get
    Then status <responseCode>
    And print response
    And match response == read('<responseBody>')

    Examples:
      | country | responseCode | responseBody                  |
      | US      | 200          | ../data/responseUS.json       |
      | DE      | 200          | ../data/responseDE.json       |
      | GB      | 200          | ../data/responseGB.json       |
      | XX      | 404          | ../data/responseNotfound.json |

