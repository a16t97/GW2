Feature: Додавання товару до кошика

  Scenario: Додавання товару до кошика
    Given Користувач відкриває сторінку товару
    When Користувач натискає кнопку "Add to cart"
    Then Товар додається до кошика
