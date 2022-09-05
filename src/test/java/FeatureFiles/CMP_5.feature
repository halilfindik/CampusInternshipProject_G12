Feature: Add-Edit-Delete Attestations under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Attestations
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | Attestations   |

    When Click on the element in the Dialog Content
      | addButton |

    And User sends the keys in the Dialog Content
      | nameInput | Sari Cizmeli Mehmet Aga |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Attestations
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | Attestations   |

    When User searches for the desired item in the Dialog Content
      | searchInput | Sari Cizmeli Mehmet Aga |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sends the keys in the Dialog Content
      | nameInput | Sari Paltolu Mehmet Aga |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Attestations
    Given Click on the element in the Left Navigation Panel
      | humanResources |
      | setupThree     |
      | Attestations   |

    When User searches for the desired item in the Dialog Content
      | searchInput | Sari Paltolu Mehmet Aga |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | approveDeleteButton |

    Then Success message should be displayed