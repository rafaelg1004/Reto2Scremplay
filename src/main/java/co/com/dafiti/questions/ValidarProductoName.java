package co.com.dafiti.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;
public class ValidarProductoName implements Question  <Boolean> {
    protected Target element;
    public ValidarProductoName (Target element){
        this.element= element;

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).isEnabled();
    }

    public static Question<Boolean>value(Target element){
        return new ValidarProductoName(element);

    }
}
