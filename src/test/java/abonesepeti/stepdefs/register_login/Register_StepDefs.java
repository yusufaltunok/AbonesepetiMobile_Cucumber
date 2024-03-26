package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static abonesepeti.utilities.ReusableMethods.bekle;
import static abonesepeti.utilities.ReusableMethods.visibleWait;

public class Register_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @And("Giris sayfasi gelene kadar Devam Et butonuna tiklar")
    public void giris_sayfasi_gelene_kadar_devam_et_butonuna_tiklar() {
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

    @Then("Login sayfasinin goruntulendigini dogrular")
    public void login_sayfasinin_goruntulendigini_dogrular() {
        Assert.assertTrue(loginPage.girisYap.isDisplayed());
    }

    @And("Giris sayfasina ulasmak icin Atla butonuna tiklar")
    public void girisSayfasinaUlasmakIcinAtlaButonunaTiklar() {
        bekle(3);
        registerPage.atla.click();
    }

    @And("Yeni hesap olustur butonuna tiklar")
    public void yeniHesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("{string}, {string}, {string}, {string}, {string} bilgilerini girer")
    public void bilgileriniGirer(String ad, String soyad, String telefon, String mail, String sifre) {
        registerPage.ad.sendKeys(ad);
        registerPage.soyad.sendKeys(soyad);
        registerPage.cepTelefonu.sendKeys(telefon);
        registerPage.ePosta.sendKeys(mail);
        registerPage.sifre.sendKeys(sifre);
    }


    @And("Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar")
    public void kullaniciSozlesmesiniKabulEtmekIcinCheckboxITiklar() {
        registerPage.sozlesmeCheckBox.click();
    }

    @And("Hesap olustur butonuna tiklar")
    public void hesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("Telefona SMS ile gelen {int} haneli dogrulama kodunu girer")
    public void telefonaSMSIleGelenHaneliDogrulamaKodunuGirer(int arg0) {

    }

    @And("Dogrula butonuna tiklar")
    public void dogrulaButonunaTiklar() {
    }

    @Then("Basarili bir sekilde hesap olusturuldugunu dogrular")
    public void basariliBirSekildeHesapOlusturuldugunuDogrular() {
    }
}
