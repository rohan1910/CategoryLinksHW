Feature: Category Links
  Background: User is on homepage

  @computers
  Scenario: Computers link
    Given User is on homepage
    When User clicks on the computer link
    Then User should be directed to computer page

    @electronics
    Scenario: Electronics link
      Given User is on homepage
      When User clicks on the electronics link
      Then User should be directed to the electronics page

      @apparel
      Scenario: Apparel link
        Given User is on homepage
        When User clicks on apparel link
        Then User should be directed to apparel page

        @digital
        Scenario: Digital downloads link
          Given User is on homepage
          When User clicks on the digital downloads link
          Then User should be directed to digital downloads page

          @books
          Scenario: Books link
            Given User is on homepage
            When User clicks on books link
            Then User should be directed to the books page

            @jewelry
            Scenario: Jewelry link
              Given User is on homepage
              When User clicks on jewelry link
              Then User should be directed to the jewelry page

              @giftcards
              Scenario: Gift cards link
                Given User is on homepage
                When User clicks on the gift cards link
                Then User should be directed to the gift cards page




