Feature: Add-Edit-Delete School Locations under School Setup (NoSearch)

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Locations
    Given Click on the element in the Left Navigation Panel
      | setupOne    |
      | schoolSetup |
      | locations   |

    When Wait until combo box to be clickable and click

    And Click on the element in the Dialog Content
      #| comboBox          |
      #| dropDownOptionTwo |
      | addButton         |

    And User sends the keys in the Dialog Content
      | nameInput | Warwic |
      | shortName | WRC    |

    And User sends the keys in the Dialog Content
      | capacity | 85 |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Locations
    Given Click on the element in the Left Navigation Panel
      | setupOne    |
      | schoolSetup |
      | locations   |

    When Wait until combo box to be clickable and click
      #| arrowOne    |

    And Click on the element in the Dialog Content
      | dropDownOptionTwo |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | Warwick |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Locations
    Given Click on the element in the Left Navigation Panel
      | setupOne    |
      | schoolSetup |
      | locations   |

    When User searches for the desired item in the Dialog Content
      | searchInput    | Warwick  |

    And Click on the element in the Dialog Content
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed