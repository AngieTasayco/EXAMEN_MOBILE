package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SauceLabsScreen extends PageObject {


    @AndroidFindBy(accessibility = "test-Username")
    private WebElement usuario;

    @AndroidFindBy(accessibility = "test-Password")
    private WebElement password;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement login;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement products;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<WebElement> item;


    public void ingresarUsuario(String user){
        System.out.println("usuario: "+user);
        getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        usuario.sendKeys(user);
    }

    public void ingresarPassword(String pass){
        System.out.println("usuario: "+pass);
        getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        password.sendKeys(pass);
    }

    public void clickLogin(){
        System.out.println("clickLogin");
        login.click();
    }

    public String getTitulo(){
        return products.getText();
    }

    public int item(){

        return item.size();
    }

}
