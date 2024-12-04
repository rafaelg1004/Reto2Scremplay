package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {

    public static final Target LBL_NOMBRE_PRODUCTO= Target.the("Label Nombre Producto").
            locatedBy("//h3[text()='{0}']");
    public static final Target BTN_AGREGAR_AL_CARRITO= Target.the("Boton Agregar Carrito").
            locatedBy("(//button[@id='AddToCart'])[1]");


    private ProductoUI(){
        throw new UnsupportedOperationException("Utility clase");
}
}
