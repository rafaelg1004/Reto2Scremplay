package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {
    public static final Target BTN_TALLA= Target.the("Boton Para seleccionar talla").
            locatedBy("//div[@class='product-options productSize detailSizeProduct prelative']//div[@class='selectContainer']");
    public static final Target LBL_VALIDACION= Target.the("Label Nombre Producto").
            locatedBy("(//button[@id='AddToCart'])[1]");

    private CarritoUI(){
        throw new UnsupportedOperationException("Utility clase");
    }
}
