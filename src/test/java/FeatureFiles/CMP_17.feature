Feature: Add-Edit-Delete Positions Under Human Resources Setup
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Positions
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | positions      |

    When Click on the element in the Dialog Content
      | addButton      |

    And User sends the keys in the Dialog Content
      | nameInput    | Yonetmen  |
      | shortName    | YNT       |

    And Click on the element in the Dialog Content
      | saveButton  |

    Then Success message should be displayed

  Scenario: Edit Positions
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | positions      |

    When User searches for the desired item in the Dialog Content
      | searchInput    | Yonetmen  |

    And Click on the element in the Dialog Content
      | searchButton  |
      | editButton    |

    And User sends the keys in the Dialog Content
      | nameInput    | Yonetmenim  |
      | shortName    | YNTM        |

    And Click on the element in the Dialog Content
      | saveButton  |

    Then Success message should be displayed

  Scenario: Delete Positions
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | positions      |

    When User searches for the desired item in the Dialog Content
      | searchInput    | Yonetmenim  |

    And Click on the element in the Dialog Content
      | searchButton         |
      | deleteButton         |
      | approveDeleteButton  |

    Then Success message should be displayed