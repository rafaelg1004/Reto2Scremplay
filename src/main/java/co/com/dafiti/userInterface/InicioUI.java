package co.com.dafiti.userInterface;


import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {

    public static final Target BTN_BUSCAR= Target.the("Bonton abrir Buscar")
            .locatedBy("//input[@id='searchInput']");
    public static final Target  TXT_BUSCADOR= Target.the("BUscador Inicio").
            locatedBy("//input[@id='searchInput']");


    private InicioUI(){
    throw new UnsupportedOperationException("Utility clase");

    }
}
