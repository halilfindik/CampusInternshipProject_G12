Feature: Add-Edit-Delete Fields under Parameters Setup
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Fields
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | fields     |

    When Click on the element in the Dialog Content
      | addButtonAlternative  |

    And User sends the keys in the Dialog Content
      | nameInput    | TaxNumber |
      | codeInput    | TN        |

    When Click on the element in the Dialog Content
      | arrowTwo            |
      | dropDownOptionThree |

    And Click on the element in the Dialog Content
      | saveButton  |

    Then Success message should be displayed

  Scenario: Edit Fields
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | fields     |

    When User searches for the desired item in the Dialog Content
      | searchInput    | TaxNumber  |

    And Click on the element in the Dialog Content
      | searchButton  |
      | editButton    |

    And User sends the keys in the Dialog Content
      | nameInput    | TurkishTaxNumber  |
      | codeInput    | TTN               |

    And Click on the element in the Dialog Content
      | saveButton  |

    Then Success message should be displayed

  Scenario: Delete Fields
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | fields     |

    When User searches for the desired item in the Dialog Content
      | searchInput    | TurkishTaxNumber  |

    And Click on the element in the Dialog Content
      | searchButton         |
      | deleteButton         |
      | approveDeleteButton  |

    Then Success message should be displayed
