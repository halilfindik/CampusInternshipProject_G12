Feature: Add-Edit-Delete Bank Accounts under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Bank Accounts
    Given Click on the element in the Left Navigation Panel
      | setupOne     |
      | parameters   |
      | bankAccounts |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput            | Grup Haydar            |
      | ibanInput            | TR32001000999990444456 |
      | integrationCodeInput | 44                     |

    And Click on the element in the Dialog Content
      | arrowThree         |
      | dropDownOptionFour |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Bank Accounts
    Given Click on the element in the Left Navigation Panel
      | setupOne     |
      | parameters   |
      | bankAccounts |

    When User searches for the desired item in the Dialog Content
      | searchInput | Grup Haydar |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | Maraba Haydar |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Bank Accounts
    Given Click on the element in the Left Navigation Panel
      | setupOne     |
      | parameters   |
      | bankAccounts |

    When User searches for the desired item in the Dialog Content
      | searchInput | Maraba Haydar |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed