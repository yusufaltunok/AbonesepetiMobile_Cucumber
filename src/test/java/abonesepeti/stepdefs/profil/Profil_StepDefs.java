package abonesepeti.stepdefs.profil;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
import abonesepeti.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Profil_StepDefs {
    ProfilPage profilPage = new ProfilPage();
    RegisterPage registerPage = new RegisterPage();

    LoginPage loginPage = new LoginPage();



    @Then("Kullanici Profil butonununa tiklar")
    public void kullaniciProfilButonununaTiklar() {
        profilPage.profil.click();
    }


    @And("Kullanici ad textbox'inda ad bilgisinin oldugunu dogrular")
    public void kullaniciAdTextboxIndaAdBilgisininOldugunuDogrular() {

    }

    @And("Kullanici soyad textbox'inda soyad bilgisinin oldugunu dogrular")
    public void kullaniciSoyadTextboxIndaSoyadBilgisininOldugunuDogrular() {

    }


    @And("Kullanici e-mail textbox'inda e-mail bilgisinin oldugunu dogrular")
    public void kullaniciEMailTextboxIndaEMailBilgisininOldugunuDogrular() {

    }


    @And("Kullanici TC kimlik numarasi textbox'inda onbir haneli kimlik bilgisinin oldugunu dogrular")
    public void kullaniciTCKimlikNumarasiTextboxIndaOnbirHaneliKimlikBilgisininOldugunuDogrular() {

    }

    @And("Kullanici cep telefonu textbox'inda on haneli cep telefonu bilgisinin oldugunu dogrular")
    public void kullaniciCepTelefonuTextboxIndaOnHaneliCepTelefonuBilgisininOldugunuDogrular() {

    }

    @And("Kullanici dogum tarihi bilgisinin oldugunu dogrular")
    public void kullaniciDogumTarihiBilgisininOldugunuDogrular() {


    }

    @Then("Kullanici Kişisel Bilgiler butonuna tiklar")
    public void kullaniciKişiselBilgilerButonunaTiklar() {

    }

    @And("Kullanici Kişisel Bilgiler sayfasinda oldugunu dogrular")
    public void kullaniciKişiselBilgilerSayfasindaOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisisel_bilgiler_title.isDisplayed());
    }

    @Then("Kullanici Kisisel Bilgiler butonuna tiklar ve sayfaya geçis yapar")
    public void kullaniciKisiselBilgilerButonunaTiklarVeSayfayaGeçisYapar() {


    }

    @Then("Kullanici Ad kutusunu temizler")
    public void kullaniciAdKutusunuTemizler() {
        registerPage.ad.clear();
    }

    @Then("Kullanici Ad kutusuna valid bir deger girer")
    public void kullaniciAdKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(0).sendKeys("new name");
    }

    @Then("Kullanici Soyad kutusunu temizler")
    public void kullaniciSoyadKutusunuTemizler() {
        registerPage.soyad.clear();
    }

    @Then("Kullanici Soyad kutusuna valid bir deger girer")
    public void kullaniciSoyadKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(1).sendKeys("new name");

    }

    @Then("Kullanici TC kutusunu temizler")
    public void kullaniciTCKutusunuTemizler() {
        registerPage.tc_textbox.clear();
    }

    @Then("Kullanici TC kutusuna valid bir deger girer")
    public void kullaniciTCKutusunaValidBirDegerGirer() {
        registerPage.tc_textbox.sendKeys("55510591258"); //aynı tc kullandım
    }

    @Then("Kullanici cep telefonu kutusunu temizler")
    public void kullaniciCepTelefonuKutusunuTemizler() {
        registerPage.cepTelefonu.clear();
    }

    @Then("Kullanici cep telefonu kutusuna valid bir deger girer")
    public void kullaniciCepTelefonuKutusunaValidBirDegerGirer() {
        registerPage.cepTelefonu.sendKeys("5056771625"); //aynı cep teli kullandım
    }

    @Then("Kullanici email kutusunu temizler")
    public void kullaniciEmailKutusunuTemizler() {
        registerPage.ePosta.clear();
    }

    @Then("Kullanici email kutusuna valid bir deger girer")
    public void kullaniciEmailKutusunaValidBirDegerGirer() {
        registerPage.ePosta.sendKeys("salvatore@12345.hkh"); //aynı eposta
    }


    @Then("Kullanici dogum tarihi kutusunu temizler")
    public void kullaniciDogumTarihiKutusunuTemizler() {
        registerPage.dogumTarihi.clear();
    }

    @Then("Kullanici dogum tarihi kutusuna valid bir deger girer")
    public void kullaniciDogumTarihiKutusunaValidBirDegerGirer() {
        registerPage.dogumTarihi.click();
        registerPage.header_year_click.click();
        registerPage.dogum_yili.click();
        registerPage.next_month.click();
        registerPage.select_day.click();
        registerPage.click_ok.click();
    }

    @Then("Kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        registerPage.kaydet_degisiklikler.click();

    }

    @Then("Kullanici geri tuşu ile profil sayfasina geciş yapar")
    public void kullaniciGeriTuşuIleProfilSayfasinaGecişYapar() {
        profilPage.back_button.click();
    }

    @And("Kullanici Kisisel Bilgiler' in basarili bir sekilde guncellendigini gorur")
    public void kullaniciKisiselBilgilerInBasariliBirSekildeGuncellendiginiGorur() {

        Assert.assertEquals("new name",registerPage.ad.getText());
        Assert.assertEquals("new surname",registerPage.soyad.getText());
        Assert.assertEquals("salvatore@12345.hkh",registerPage.ePosta.getText());
        Assert.assertEquals("5056771625",registerPage.tc_textbox.getText());



    }
    @And("Kullanici Profil butonunu tiklar")
    public void kullaniciProfilButonunuTiklar() {
        profilPage.profil.click();
    }

    @And("kullanici Odeme islem gecmisi yazisina tiklar")
    public void kullaniciOdemeIslemGecmisiYazisinaTiklar() {
        profilPage.odemeGecmisi.click();
    }

    @Then("Kullanici odeme gecmisini dogrular")
    public void kullaniciOdemeGecmisiniDogrular() {
        Assert.assertTrue(profilPage.odemeGecmisiDogrula.isDisplayed());
}
}