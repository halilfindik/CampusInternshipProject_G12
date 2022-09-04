Feature: Add-Edit-Delete Subject Categories Under Education Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:Add Subject Categories
    Given Click on the element in the Left Navigation Panel
      | education         |
      | setupFour         |
      | subjectCategories |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | Siber Security0 |
      | codeInput | Security 0     |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Subject Categories
    Given Click on the element in the Left Navigation Panel
      | education         |
      | setupFour         |
      | subjectCategories |

    When User searches for the desired item in the Dialog Content
      | searchInput | Siber Security0 |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | IT Manager0 |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Subject Categories
    Given Click on the element in the Left Navigation Panel
      | education         |
      | setupFour         |
      | subjectCategories |

    When User searches for the desired item in the Dialog Content
     | searchInput | IT Manager0 |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

   Then Success message should be displayed