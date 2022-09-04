Feature: Add-Edit-Delete Discounts under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Discounts
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | discounts  |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | descriptionInput | 15% for 2nd child |
      | codeInput        | MLT44             |
      | numericInput     | 44                |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Discounts
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | discounts  |

    When User searches for the desired item in the Dialog Content
      | searchInput | 15% for 2nd child |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | descriptionInput | Hi 20% for 2nd child |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Discounts
    Given Click on the element in the Left Navigation Panel
      | setupOne   |
      | parameters |
      | discounts  |

    When User searches for the desired item in the Dialog Content
      | searchInput | Hi 20% for 2nd child |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed