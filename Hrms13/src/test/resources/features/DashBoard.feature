Feature: Dashboard

  @smoke
  Scenario: DashBoard menu view for admin
    When User is logged with valid admin credentials
    Then user see dashboard menuis is displayed
      | Admin | PIN | Leave | Time | Recruitmen | Performance | Dashboard | Directory |
