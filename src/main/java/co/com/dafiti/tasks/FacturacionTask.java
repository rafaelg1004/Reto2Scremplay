package co.com.dafiti.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.CheckCheckboxOfElement;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.dafiti.userInterface.CarritoUI.BTN_IR_PAGAR;
import static co.com.dafiti.userInterface.CategoriaUI.LBL_PRODUCTO;
import static co.com.dafiti.userInterface.ProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FacturacionTask implements Task {

    private String producto;



    public FacturacionTask(String producto){
        this.producto =producto;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {

            Thread.sleep(3000);  // Espera de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(

                JavaScriptClick.on(BTN_TALLA),
                WaitUntil.the(BTN_OPTION_TALLA, isVisible()).forNoMoreThan(150).seconds(),
                JavaScriptClick.on(BTN_OPTION_TALLA),
                JavaScriptClick.on(BTN_AGREGAR_AL_CARRITO),
                WaitUntil.the(BTN_IR_CARRITO, isVisible()).forNoMoreThan(150).seconds(),
                Click.on(BTN_IR_CARRITO),
                JavaScriptClick.on(BTN_IR_PAGAR)


        );


    }
    public static FacturacionTask conElProducto(String producto){

        return new FacturacionTask(producto);
    }
}
