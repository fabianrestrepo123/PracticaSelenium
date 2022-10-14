package test;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@RunWith(SerenityRunner.class)
public class testCases extends PageObject {

    //@Managed(driver="firefox") Puedo colocar cualquier navegador que tenga instanciado,es una forma de hacerlo
    @Managed
    WebDriver driver;

    @FindBy(name="q")
    WebElement googleSearch;

    @Title("Ejecutando el test de ingreso ")
    @Test
    public void doLogin() {

        open();//Dentro del serenity.properties debo habilitat la webdriver.base.url= http://google.com
        System.out.println(getTitle());
        // para que el metodo abierto open la pueda reconocer y abrir sin necesidad de hacer la linea 23
        //driver.get("http://google.com");
        //driver.findElement(By.name("q")).sendKeys("hola");
        //find(By.xpath("//*[@name='q']")).sendKeys("hola");//funciona si o si con el PageObject
        //$("//*[@name='q']").sendKeys("hola");//jQuery
        typeInto(googleSearch,"hola");//pendiente de consultar
    }


}
