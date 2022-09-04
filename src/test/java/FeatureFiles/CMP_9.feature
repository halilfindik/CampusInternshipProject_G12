Feature: Add-Edit-Delete Document Types under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Position Categories
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | documentTypes |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | Lise Diplomasi |

    And Click on the element in the Dialog Content
      | arrowThree         |
      | dropDownOptionFour |

    And Click ROBOT TAB on the element in the Dialog Content

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Position Categories
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | documentTypes |

    When User searches for the desired item in the Dialog Content
      | searchInput | Lise Diplomasi |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | Universite Diplomasi |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Position Categories
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | documentTypes |

    When User searches for the desired item in the Dialog Content
      | searchInput | Universite Diplomasi |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed
