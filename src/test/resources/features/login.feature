Feature: Inicio de sesion de usuario
  Esta funcionadad se encarga de hacer el inicio de usuarios previsamente registrados a la plataforma

  @Test1
  Scenario: Iniciar sesion correctamente
    Given el usuario esta previamente registrado y en la pagina de inicio
    When el usuarió ingresa su username y contraseña correctamente
    Then el usuario es redirigido a pagina principal de la plataforma

  @Test2
  Scenario: Iniciar sesion con credenciales invalidas
    Given el usuario esta previamente registrado y en la pagina de inicio
    When el usuario ingresa su usarname "johan_nicolas" y la contraseña "123"
    Then la pagina debe mostrar el mensaje "Error en las credenciales"