package co.com.dafiti.stepsDefinitions;

import co.com.dafiti.questions.ValidarProductoName;
import co.com.dafiti.tasks.BuscarProductoTask;
import co.com.dafiti.tasks.FacturacionTask;
import co.com.dafiti.tasks.FormularioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.dafiti.userInterface.CarritoUI.LBL_VALIDACION;
import static co.com.dafiti.userInterface.FormularioUI.LBL_VALIDAR_REGISTRO;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AgregarProductoStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la pagina {string}")
    public void queMeEncuentroEnLaPagina(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("robot").wasAbleTo(Open.url(url));



    }
    @Cuando("busco el producto {string}")
    public void buscoElProducto(String producto) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarProductoTask.conElProducto(producto),
                FacturacionTask.conElProducto(producto)
        );



    }
    @Entonces("Visualizare {string} en el carrito")
    public void visualizareEnElCarrito(String producto) {
        Ensure.that(LBL_VALIDACION.of(producto)).text().isEqualTo(producto);

    }
    @Entonces("Creare un usuario con los datos  {string},{string},{string},{string},{string},{string} ,{string}")
    public void creareUnUsuarioConLosDatos(String nombre, String apellido, String correo, String contraseña, String identificacion, String fecha, String genero) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FormularioTask.conLosDatos(nombre, apellido, correo, contraseña, identificacion,fecha,genero),

                Ensure.that(LBL_VALIDAR_REGISTRO).text().isEqualTo("Tu compra será registrada al correo")
        );
    }
}
