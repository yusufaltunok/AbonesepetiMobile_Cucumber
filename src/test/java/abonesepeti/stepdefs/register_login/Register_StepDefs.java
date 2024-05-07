package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
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

    @When("Giris sayfasina ulasmak icin Atla butonuna tiklar")
    public void girisSayfasinaUlasmakIcinAtlaButonunaTiklar() {
        bekle(3);
        loginPage.atla.click();
    }

    @And("Yeni hesap olustur butonuna tiklar")
    public void yeniHesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("{string}, {string} bilgilerini girer")
    public void bilgileriniGirer(String telefon, String sifre) {

        registerPage.cepTelefonu.sendKeys(telefon);
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

    @Then("Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur")
    public void girmisOldugunuzEPostaAdresineAitUyelikBulunmaktadirUyariYazisiniGorur(){
      Assert.assertTrue(registerPage.hataMsg.isDisplayed());
    }

    @And("Google ikonuna tiklar")
    public void googleIkonunaTiklar() {
        registerPage.googleIcon.click();
    }

    @And("Kayitli bir google hesabi sec")
    public void kayitliBirGoogleHesabiSec() {
        registerPage.googleHesapSec.click();
    }

    @When("Kullanici eposta ile abonesepeti uygulamasina giris yapar")
    public void kullaniciEpostaIleAbonesepetiUygulamasinaGirisYapar() {
        loginPage.girisYapEposta("testermehmetemin@gmail.com","1234tester");
    }


    @And("Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar")
    public void kullaniciHesapOlusturmaSayfasinaUlasmakIcinAtlaButonunaTiklar() {
        loginPage.atla.click();
    }

    @And("Kullanici Yeni hesap olustur butonuna tiklar")
    public void kullaniciYeniHesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("Kullanici onceden kayitli olan {string}, {string}, {string}, {string} ve {string} bilgilerini girer")
    public void kullaniciOncedenKayitliOlanVeBilgileriniGirer(String ad, String soyad, String telefon, String eposta, String sifre) {
        registerPage.ad.sendKeys(ad);
        registerPage.soyad.sendKeys(soyad);
        registerPage.cepTelefonu.sendKeys(telefon);
        registerPage.ePosta.sendKeys(eposta);
        registerPage.sifre.sendKeys(sifre);

    }

    @When("Kullanici Abonesepeti uygulamasini acar")
    public void kullaniciAbonesepetiUygulamasiniAcar() {
    }


    @And("{string}, {string}, {string}, {string}, {string} bilgilerini girer")
    public void bilgileriniGirer(String arg0, String arg1, String arg2, String arg3, String arg4) {



}
