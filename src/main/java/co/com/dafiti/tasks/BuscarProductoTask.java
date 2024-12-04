package co.com.dafiti.tasks;

import co.com.dafiti.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import co.com.dafiti.exeptions.ProductoNoencontradoExeption;
import static co.com.dafiti.userInterface.CategoriaUI.*;
import static co.com.dafiti.userInterface.InicioUI.*;
import static co.com.dafiti.userInterface.ProductoUI.LBL_NOMBRE_PRODUCTO;
import static io.ous.jtoml.impl.Token.TokenType.Key;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoTask implements Task {
    private String producto;

    public BuscarProductoTask(String producto) {
        this.producto = producto;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR),
                Enter.keyValues(producto).into(TXT_BUSCADOR).thenHit(Keys.ENTER),
                Check.whether(WebElementQuestion.stateOf(TBL_PRODUCTOS), WebElementStateMatchers.isVisible())
                        .andIfSo(
                                WaitUntil.the(LBL_PRODUCTO.of(producto), isVisible()).forNoMoreThan(150).seconds(),
                             //   ScrollJavaScript.to(LBL_PRODUCTO.of(producto)),
                                JavaScriptClick.on(LBL_PRODUCTO.of(producto))
                        )
        );
        if (!LBL_NOMBRE_PRODUCTO.of(producto).resolveFor(actor).isPresent()) {
            throw new ProductoNoencontradoExeption("No se encuentra el producto a buscar");}



    }
    public static BuscarProductoTask conElProducto(String producto) {
        return new BuscarProductoTask(producto);
    }
}
