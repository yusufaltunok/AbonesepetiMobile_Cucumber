package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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


    @And("Kullanici uygulamaya girebilmek icin giris yapa tiklar")
    public void kullaniciUygulamayaGirebilmekIcinGirisYapaTiklar() {
        loginPage.girisYap.click();
    }



    @And("Kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        loginPage.girisYapButton.click();
    }

    @Then("Kullanici giris yapamadigini dogrular")
    public void kullaniciGirisYapamadiginiDogrular() {
        Assert.assertTrue(loginPage.sifre_uyarisi.isDisplayed());
        Assert.assertTrue(loginPage.eposta_uyarisi.isDisplayed());

    }

    @And("Kullanici e-posta alanini bos birakir")
    public void kullaniciEPostaAlaniniBosBirakir() {
        loginPage.e_PostaAdres.sendKeys("");
    }

    @And("Kullanici sifre alanini bos birakir")
    public void kullaniciSifreAlaniniBosBirakir() {
        loginPage.sifre.sendKeys("");
    }

    @And("Kullanici gecerli bir sifre girer")
    public void kullaniciGecerliBirSifreGirer() {
        loginPage.sifre.sendKeys("qqqqq1");
    }

    @Then("Kullanici eposta alani altinda uyari yazisi gorur.")
    public void kullaniciEpostaAlaniAltindaUyariYazisiGorur() {
        assertTrue(loginPage.eposta_uyarisi.isDisplayed());
    }

    @And("Kullanici gecerli bir eposta girer")
    public void kullaniciGecerliBirEpostaGirer() {
        loginPage.e_PostaAdres.sendKeys("salvatore@12345.hkh");
    }

    @Then("Kullanici sifre alani altinda uyari yazisi gorur.")
    public void kullaniciSifreAlaniAltindaUyariYazisiGorur() {
        assertTrue(loginPage.sifre_uyarisi.isDisplayed());
    }
}
