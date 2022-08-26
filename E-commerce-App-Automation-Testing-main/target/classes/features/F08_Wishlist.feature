@smoke

Feature:  F08_WishList  |  any user could add  any product to his WishList

  Scenario: user can add any card to WishList

    Given click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
    Then assert on success message and his background color



    Scenario: user verify that his card already added in his WishList

      Given  click on wishlist button on the same product
      When click on wishlist button
      Then assert that Qty value bigger than 0


