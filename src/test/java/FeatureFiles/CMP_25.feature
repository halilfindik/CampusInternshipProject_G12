Feature: Add-Edit-Delete School Locations under School Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Lacotions
    Given Click on the element in the Left Navigation Panel
      | Setup    |
      | SchoolSetup     |
      | Locations |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | Ravza |
      | shortName | 2661  |

      And Click on the element in the Dialog Content
      | locationType |

      And User sends the keys in the Dialog Content

      | Capactiy | 26612661 |



    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Lacotions
    Given Click on the element in the Left Navigation Panel
      | Setup    |
      | SchoolSetup     |
      | Locations |



    And Click on the element in the Dialog Content

      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | Maziyeh |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Lacotions
    Given Click on the element in the Left Navigation Panel
      | Setup    |
      | SchoolSetup     |
      | Locations |


    And Click on the element in the Dialog Content

      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed