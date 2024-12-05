#language: es

Característica:  Automatizar Dafiti E-Commerce

  @AgregarCarrito

  Esquema del escenario: Agregar Producto Al Carrito Y hacer la Compra

    Dado  Que me encuentro en la pagina '<url>'
    Cuando  busco el producto '<producto>'
    Entonces Visualizare '<producto>' en el carrito
    Y Creare un usuario con los datos  '<nombre>','<apellido>','<correo>','<contraseña>','<identificacion>','<fecha>' ,'<genero>'

    Ejemplos:
      |url|producto|nombre|apellido|correo|contraseña|identificacion|fecha|genero|
   ##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |https://www.dafiti.com.co/   |Camiseta Infantil Verde Botella Mp 1940   |rafael   |gracia   |asffdgggh@gahd.com   |Samuel0920   |106788544   |04/10/1994   |Masculino|
   |https://www.dafiti.com.co/   |Camiseta Manga Corta Infantil Niña Patprimo Rosa 86090333-4632   |maria   |petro   |fffsggdf@asidg.com   |Samuel0920   |154323564   |04/10/1995   |Femenino|





