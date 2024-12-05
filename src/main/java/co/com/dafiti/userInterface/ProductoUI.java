package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {

    public static final Target LBL_NOMBRE_PRODUCTO= Target.the("Label Nombre Producto").
            locatedBy("//h3[text()='{0}']");
    public static final Target LBL_PRECIO= Target.the("Label precio del producto").
            locatedBy("///span[@id='price_box_1' and @class='prd-price special-price' and contains(normalize-space(text()), '$')]");
    public static final Target BTN_TALLA= Target.the("Boton Para seleccionar talla").
            locatedBy("(//div[@class='selectContainer']//span[@class='rfloat icon icon-arrow-down'])[1]");
    public static final Target BTN_OPTION_TALLA= Target.the("Boton Para seleccionar una de las tallas").
            locatedBy("//ul[@id='sizesListDropdownUl']//li[@class='prd-option-item opt-item-0']");

    public static final Target BTN_AGREGAR_AL_CARRITO= Target.the("Boton Agregar Carrito").
            locatedBy("(//button[@id='AddToCart'])[1]");
    public static final Target BTN_IR_CARRITO= Target.the("Boton Ir Al Carrito").
            locatedBy("//div[@class='hdCart rfloat hdFloatingCart']");


    private ProductoUI(){
        throw new UnsupportedOperationException("Utility clase");
}
}
