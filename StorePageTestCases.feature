Feature: StorePageTestCases


 Scenario: Case_1 Product Check
    Given Navigate to Web Site
    When Product Click
    Then Product Detail Open Check

  Scenario: Case_2 Select Address
    Given Navigate to Web Site
    When Address click
    When Address input
    When Select Address
    Then Product list control
    And check Address


    Scenario: Case_3 Filter
      Given Navigate to Web Site
      When category filter click
      And Filter Select
      And Apply Click
      Then Listing Control

      Scenario: Case_4 Filtre Temizle
        Given Navigate to Web Site
        When category filter click
        And Filter Select
        And Apply Click
        And Temizle
        Then Url kontrol

        Scenario: Case_5 Page_2 Url Control
          Given Navigate to Web Site
          When Scroll Page
          Then Url Control

          Scenario: Case_6 Kupon Check
            Given Navigate to Web Site
            When Change url go kupon page
            And Kupon click
            Then Kupon check and kupon add

              Given Navigate to Web Site
              When Change url go kupon page
              And Kupon click
              And Topla buton click
              Then Login control
















