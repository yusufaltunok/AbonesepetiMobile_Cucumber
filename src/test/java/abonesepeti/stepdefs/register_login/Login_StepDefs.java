package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @When("Kullanici Abonesepeti uygulamasina giris yapar")
    public void kullanici_abonesepeti_uygulamasina_giris_yapar() {
        loginPage.girisYapTelefon("5056771625","qqqqq1");
    }

    @Then("Kullanici Uygulamada basarili bir sekilde oturum acildigini dogrular")
    public void kullaniciUygulamadaBasariliBirSekildeOturumAcildiginiDogrular() {
        assertTrue(loginPage.profil.isDisplayed());
    }
}
