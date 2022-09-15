Feature: Sands project tests

  Scenario Outline: Blackjack dealing
    Given These are the following cards dealt to the player
    Then Player should expect "<expectedoutcome>" for cards "<twocards>"

    Examples:
      | twocards  | expectedoutcome   | note        |
      | 2,2       | Split,Hit         | success     |
      | 2,3       | Hit               | success     |
      | A,A       | Split,Hit         | success     |
      | J,A11     | Blackjack         | success     |
      | A11,A11   | Split,Hit         | success     |
      | A11,10    | Blackjack         | success     |
      | A,3       | Hit               | success     |
      | A1,5      | Hit               | success     |
      | 3,3       | Hit               | failure     |
      | 7,5       | Split             | failure     |
      | A11,A     | Blackjack         | failure     |