package co.com.dafiti.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.dafiti.userInterface.ProductoUI.*;

public class FacturacionTask implements Task {

    private String producto;



    public FacturacionTask(String producto){
        this.producto =producto;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_AGREGAR_AL_CARRITO)

        );

    }
    public static FacturacionTask conElProducto(String producto){

        return new FacturacionTask(producto);
    }
}
