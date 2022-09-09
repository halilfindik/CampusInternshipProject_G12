Feature: Add-Edit-Delete Nationalities under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Nationalities
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | nationalities |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | Salvadorlu |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Nationalities
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | nationalities |

    When User searches for the desired item in the Dialog Content
      | searchInput    | Salvadorlu  |

    And Click on the element in the Dialog Content
      | searchButton  |
      | editButton    |

    And User sends the keys in the Dialog Content
      | nameInput | Salvadorian |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Nationalities
    Given Click on the element in the Left Navigation Panel
      | setupOne      |
      | parameters    |
      | nationalities |

    When User searches for the desired item in the Dialog Content
      | searchInput    | Salvadorian  |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed