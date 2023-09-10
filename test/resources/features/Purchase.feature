@Purchase
  Feature: Sales
    As user want purchase one item from list product

    Scenario: User filter product list
      Given User open the website sauce demo
      When User input "standard_user" as a userName "secret_sauce" as a password
      Then User already on home page
      When User filter list product by "Name (Z to A)"
      And User click add to cart T-shirt Red and Sauce Labs Onesie
      And User click shopping cart button
      Then User already on shopping cart
      When User click Sauce Labs Onesie Remove Button
      And User click Checkout Button
      Then User already on Checkout Information Page
      When User Input "Bajol" as firstName, "Ijo" as a lastName and "97987" as postalCode
      And User click Continue Button on Cart Information
      Then User already on overviewPage
      When User click finishButton
      Then User already on checkout complete page



