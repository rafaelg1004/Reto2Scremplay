package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriaUI {

    public static final Target LBL_PRODUCTO= Target.the("Label Producto Categoria").
            locatedBy("//h3[text()='{0}']");
    public static final Target TBL_PRODUCTOS= Target.the("Tabla de los Producto").
            locatedBy("//div[@class='catalog-products']");

    private CategoriaUI(){
    throw new UnsupportedOperationException("Utility clase");
    }
}
