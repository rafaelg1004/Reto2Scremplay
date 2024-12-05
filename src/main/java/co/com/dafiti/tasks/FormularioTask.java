package co.com.dafiti.tasks;

import co.com.dafiti.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dafiti.userInterface.CarritoUI.BTN_IR_PAGAR;
import static co.com.dafiti.userInterface.FormularioUI.*;
import static co.com.dafiti.userInterface.InicioUI.TXT_BUSCADOR;
import static co.com.dafiti.userInterface.ProductoUI.BTN_IR_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormularioTask implements Task {
    private String nombre,apellido,correo,contraseña,identificacion,fecha,genero;



    public FormularioTask(String nombre,String apellido,String correo,String contraseña,String identificacion,String fecha, String genero){
        this.nombre =nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.contraseña=contraseña;
        this.identificacion= identificacion;
        this.fecha=fecha;
        this.genero=genero;


    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
            Click.on(BTN_CREAR_CUENTA),
            Enter.keyValues(nombre).into(TXT_NOMBRE),
            Enter.keyValues(apellido).into(TXT_APELLIDO),
            Enter.keyValues(correo).into(TXT_EMAIL),
            Enter.keyValues(contraseña).into(TXT_PASSWORD),
            Enter.keyValues(contraseña).into(TXT_PASSWORD2),
            ScrollJavaScript.to(BTN_TIPO_IDENTIFICACION.of(identificacion)),
            Click.on(BTN_TIPO_IDENTIFICACION),
            WaitUntil.the(BTN_OPTION_IDENTIFICACION, isVisible()).forNoMoreThan(150).seconds(),
            Click.on(BTN_OPTION_IDENTIFICACION),
            Enter.keyValues(identificacion).into(TXT_IDENTIFICACION),
            Enter.keyValues(fecha).into(TXT_FECHA),
            Click.on(BTN_GENERO),
            WaitUntil.the(BTN_OPTION_GENERO.of(genero), isVisible()).forNoMoreThan(150).seconds(),

            Click.on(BTN_OPTION_GENERO.of(genero)),


        Click.on(BTN_ACEPTO),
            //WaitUntil.the(BTN_CREAR_CUENTA, isVisible()).forNoMoreThan(150).seconds(),
            Click.on(BTN_REGISTRAR),
            WaitUntil.the(LBL_VALIDAR_REGISTRO, isVisible()).forNoMoreThan(150).seconds()





            );



    }
    public static FormularioTask conLosDatos(String nombre,String apellido,String correo,String contraseña,String identificacion,String fecha,String genero){

        return new FormularioTask(nombre, apellido, correo, contraseña, identificacion,fecha,genero);
    }
}
