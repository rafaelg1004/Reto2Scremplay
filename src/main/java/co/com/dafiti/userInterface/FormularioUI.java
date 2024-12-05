package co.com.dafiti.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioUI {
    public static final Target BTN_CREAR_CUENTA= Target.the("Boton Crear cuenta ").
            locatedBy("//a[@class='rfloat button']");
    //input[@name='first_name']
    public static final Target TXT_NOMBRE= Target.the("Texto nombre").
            locatedBy("//input[@name='first_name']");
    public static final Target TXT_APELLIDO= Target.the("Texto apedellido ").
            locatedBy("//input[@name='last_name']");
    public static final Target TXT_EMAIL= Target.the("Texto Email").
            locatedBy("//input[@name='email']");
    public static final Target TXT_PASSWORD= Target.the("Texto Contraseña ").
            locatedBy("//input[@name='password']");
    public static final Target TXT_PASSWORD2= Target.the("Texto confirmar contraeña ").
            locatedBy("//input[@name='password2']");
    public static final Target BTN_TIPO_IDENTIFICACION= Target.the("Boton tipo de identificacion").
            locatedBy("//select[@id='identification_type']");
    public static final Target BTN_OPTION_IDENTIFICACION= Target.the("Boton opcion de identificacion").
            locatedBy("//option[@value='0']");

    public static final Target TXT_IDENTIFICACION= Target.the("Texto Identificacion").
            locatedBy("//input[@name='identification']");
    public static final Target TXT_FECHA= Target.the("Texto Fecha de nacimiento").
            locatedBy("//input[@name='birthday']");
    public static final Target BTN_GENERO= Target.the("Boton Genero").
            locatedBy("//select[@name='gender']");
    public static final Target BTN_OPTION_GENERO= Target.the("Boton opcion Genero").
            locatedBy("//option[normalize-space(text())='{0}']");
    public static final Target BTN_ACEPTO= Target.the("Boton Aceptacion").
            locatedBy("//input[@name='mandatory_policies']");
    public static final Target BTN_REGISTRAR= Target.the("Boton REGISTRAR").
            locatedBy("//button[normalize-space(text())='Registrarse']");

    public static final Target LBL_VALIDAR_REGISTRO= Target.the("Validar Registro").
            locatedBy("//div[contains(text(), 'Tu compra será registrada al correo')]");




    private FormularioUI(){

        throw new UnsupportedOperationException("Utility clase");
    }
}
