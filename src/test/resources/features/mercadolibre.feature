Feature: Buscar y añadir al carrito

  Scenario: El comprador busca un producto y lo añade al carrito
    Given el comprador esta en la pagina de inicio de MercadoLibre
    When busca el producto "Laptop"
    Then añade el segundo producto al carrito, debe aparecer un mensaje "Hola"