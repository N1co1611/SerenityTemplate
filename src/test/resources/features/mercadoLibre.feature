Feature: Búsqueda y compra de productos en MercadoLibre

  Scenario: El Comprador busca un producto y lo añade al carrito
    Given el Comprador está en la página de inicio de MercadoLibre
    When busca el producto "laptop"
    Then añade el primer producto al carrito