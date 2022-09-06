Feature: Add-Edit-Delete Nationalities under Paremeters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Nationalities
    Given Click on the element in the Left Navigation Panel
      | Nationalitiessetup    |
      | Natparameters     |
      | nationalitiess |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | sabitt |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Nationalities
    Given Click on the element in the Left Navigation Panel
      | Nationalitiessetup |
      | Natparameters      |
      | nationalitiess     |

    And Click on the element in the Dialog Content

      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | dengee |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Nationalities
    Given Click on the element in the Left Navigation Panel
      | Nationalitiessetup |
      | Natparameters      |
      | nationalitiess     |

    And Click on the element in the Dialog Content

      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed