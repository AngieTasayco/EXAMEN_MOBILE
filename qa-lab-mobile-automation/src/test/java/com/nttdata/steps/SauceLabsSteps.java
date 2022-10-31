package com.nttdata.steps;

import com.nttdata.screens.SauceLabsScreen;
import org.junit.Assert;

public class SauceLabsSteps {

    SauceLabsScreen sauceLabsScreen;


    public void usuario(String user){
        sauceLabsScreen.ingresarUsuario(user);
    }

    public void password(String pass){
        sauceLabsScreen.ingresarPassword(pass);
    }

    public void clickLogin(){
        sauceLabsScreen.clickLogin();
    }

    public void getTitulo(String titulo){

        Assert.assertEquals(sauceLabsScreen.getTitulo(), titulo);

    }

    public void validarItem(){

        int items=sauceLabsScreen.item();
        System.out.println("Numero de item: "+items);
        Assert.assertTrue("num : "+items,items > 0);
    }

}
