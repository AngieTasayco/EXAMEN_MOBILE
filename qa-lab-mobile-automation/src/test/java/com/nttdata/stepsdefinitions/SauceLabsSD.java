package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsSD {

    @Steps
    SauceLabsSteps sauceLabsSteps;

    @Given("me encuentro en la APP de SauceLabs")
    public void meEncuentroEnLaAPPDeSauceLabs() { }

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String usuario) {
        sauceLabsSteps.usuario(usuario);
    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String password) {
        sauceLabsSteps.password(password);
    }

    @And("hago click en LOGIN")
    public void hagoClickEnLOGIN() {
        sauceLabsSteps.clickLogin();
    }

    @Then("valido que se muestre el titulo de {string}")
    public void validoQueSeMuestreElTituloDe(String titulo) {
        sauceLabsSteps.getTitulo(titulo);
    }

    @And("valido que se exista un item")
    public void validoQueSeExistaUnItem() {
        sauceLabsSteps.validarItem();
    }
}
