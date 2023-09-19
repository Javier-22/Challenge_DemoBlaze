#language: es

  Característica: Agregar productos al carro de compras en demo Blaze

    Como usuario
    Quiero ingresar a la pagina de demo blaze
    Para agregar productos al carro de compras y completar la compra

  @Prueba
    Escenario: compra exitosa productos demo blaze
    Dado que quiero ingresar a la pagina demo blaze
    Cuando agrego un producto Iphone 6 32gb al carro de compras
    Y agrego un producto Sony xperia z5 al carro de compras
    Y visualizo el producto en el carro de compras
    Y completo el formulario de compra con los sgts datos
    |nombre|pais    |ciudad  |numTarjeta|mes|anno|
    |Javier|Colombia|Buenavista|897956  |09 |2023|
    Entonces verifico el mensaje Thank you for your purchase!