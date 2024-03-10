package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static abonesepeti.utilities.Driver.driver;
import static abonesepeti.utilities.ReusableMethods.bekle;
import static abonesepeti.utilities.ReusableMethods.visibleWait;

public class Register_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @When("Abonesepeti uygulamasina giris yap")
    public void abonesepeti_uygulamasina_giris_yap() {
    }
    @And("Giris sayfasi gelene kadar Devam Et butonuna tikla")
    public void giris_sayfasi_gelene_kadar_devam_et_butonuna_tikla() {
        visibleWait(Driver.getDriver(), registerPage.devamEt, 15);
        for (int i = 0; i < 8; i++) {
            registerPage.devamEt.click();
            bekle(1);
        }
    }
//    @Then("DEVAM ET butonuna tikladikca gelen onboarding ekranlarin goruntulendigini dogrula")
//    public void devam_et_butonuna_tikladikca_gelen_onboarding_ekranlarin_goruntulendigini_dogrula() {
//
//
//    }

    @Then("Login sayfasinin goruntulendigini dogrula")
    public void login_sayfasinin_goruntulendigini_dogrula() {
        Assert.assertTrue(loginPage.girisYap.isDisplayed());
    }

    @And("Giris sayfasina ulasmak icin Atla butonuna tikla")
    public void girisSayfasinaUlasmakIcinAtlaButonunaTikla() {
        bekle(3);
        registerPage.atla.click();
    }
}
