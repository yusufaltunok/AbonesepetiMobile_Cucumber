package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;

import io.appium.java_client.AppiumBy;


import abonesepeti.utilities.ReusableMethods;

import io.appium.java_client.AppiumBy;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;
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


    @And("Kullanici telefon sekmesine tiklar.")
    public void kullaniciTelefonSekmesineTiklar() {
        loginPage.telefon.click();
    }

    @And("Kullanici cep telefonu alanini bos birakir")
    public void kullaniciCepTelefonuAlaniniBosBirakir() {
        loginPage.cepTelefonu.sendKeys("");
    }

    @Then("Kullanici eksik bilgiler ile giris yapamadigini dogrular")
    public void kullaniciEksikBilgilerIleGirisYapamadiginiDogrular() {
        assertTrue(loginPage.ceptelefonu_uyarisi.isDisplayed());
    }

    @And("Kullanici e-posta butonuna tiklar")
    public void kullaniciEPostaButonunaTiklar() {
        loginPage.e_Posta.click();
    }

    @And("Kullanici gecerli bir telefon numarasi girer")
    public void kullaniciGecerliBirTelefonNumarasiGirer() {
        loginPage.cepTelefonu.sendKeys("5056771625");
    }

    @And("Kullanici sifremi unuttum butonuna tiklar")
    public void kullaniciSifremiUnuttumButonunaTiklar() {
        loginPage.sifremiUnuttum.click();
    }

    @And("Kullanici Kodu Gonder butonuna tiklar")
    public void kullaniciKoduGonderButonunaTiklar() {
        loginPage.koduGonder.click();
    }

    @And("Kullanici cep telefonuna gelen {int} rakamli OTP kodunu girer")
    public void kullaniciCepTelefonunaGelenRakamliOTPKodunuGirer(int arg0) {
    }

    @And("Kullanici Dogrula butonuna tiklar")
    public void kullaniciDogrulaButonunaTiklar() {
    }

    @And("Kullanici sifreyi tekrar girer")
    public void kullaniciSifreyiTekrarGirer() {
    }

    @And("Kullanici sifreyi kaydet butonuna tiklar")
    public void kullaniciSifreyiKaydetButonunaTiklar() {
    }

    @Then("Kullanici sifrenin basarili bir sekilde degistirildigini dogrular")
    public void kullaniciSifreninBasariliBirSekildeDegistirildiginiDogrular() {
    }

    @Then("Kullanici Kodu Gonder butonunun tiklanabilir olmadigini dogrular")
    public void kullaniciKoduGonderButonununTiklanabilirOlmadiginiDogrular() {
          By id = AppiumBy.id("com.abonesepeti.app:id/btn_get_code");
//        System.out.println(driver.findElement(id).getText());

//      System.out.println("getAttribute = " + driver.findElement(id).getAttribute("selected"));
        String selected = driver.findElement(id).getAttribute("selected");
        assertEquals("false", selected);

    }

}




