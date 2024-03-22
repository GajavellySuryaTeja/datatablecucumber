Feature: Practice datatable

  Scenario: ohrm practice datatable
    Given open browser for datatable practice
    And passing the url for datatable practice
    Then username and password credentials for datatable practice
      | username | password     |
      | admin    | admin123456  |
      | Admin    | admin654     |
      | surya    | surya9632145 |
      | raju     | raju963214   |
      | pavan    | paven123     |
      | badri    | badri123     |
      | Admin    | admin123     |
    When close browser for datatable practice
