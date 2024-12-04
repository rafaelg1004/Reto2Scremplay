#language: es

Característica:  Automatizar Dafiti E-Commerce

  @AgregarCarrito

  Esquema del escenario: Agregar Producto Al Carrito

    Dado  Que me encuentro en la pagina '<url>'
    Cuando  busco el producto '<producto>'
    Entonces Visualizare '<producto>' en el carrito
    Ejemplos:
      |url|producto|
##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |https://www.dafiti.com.co/   |Camiseta Infantil Verde Botella Mp 1940|
   |https://www.dafiti.com.co/   |Camiseta Manga Corta Infantil Niña Patprimo Rosa 86090333-4632|
   
