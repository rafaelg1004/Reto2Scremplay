package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target LBL_VALIDACION= Target.the("Label Nombre Producto").
            locatedBy("//a[text()='{0}'");

    public static final Target BTN_IR_PAGAR= Target.the("Boton para ir a pagar ").
            locatedBy("//div[@class='buttonsCart']//a[@class='rfloat btnAction mlm sel-cart-checkout-button']");

    private CarritoUI(){
        throw new UnsupportedOperationException("Utility clase");
    }
}
