package abonesepeti.stepdefs.profil;

import abonesepeti.pages.AnasayfaPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.HashMap;
import java.util.Map;


import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Profil_StepDefs extends ReusableMethods {

    ProfilPage profilPage = new ProfilPage();

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AnasayfaPage anasayfaPage = new AnasayfaPage();


    @Then("Kullanici Profil butonununa tiklar")
    public void kullaniciProfilButonununaTiklar() {
        anasayfaPage.profil.click();
    }


    @And("Kullanici ad textbox'inda ad bilgisinin oldugunu dogrular")
    public void kullaniciAdTextboxIndaAdBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(0).isDisplayed());
    }

    @And("Kullanici soyad textbox'inda soyad bilgisinin oldugunu dogrular")
    public void kullaniciSoyadTextboxIndaSoyadBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(1).isDisplayed());
    }


    @And("Kullanici e-mail textbox'inda e-mail bilgisinin oldugunu dogrular")
    public void kullaniciEMailTextboxIndaEMailBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(2).isDisplayed());
    }


    @And("Kullanici TC kimlik numarasi textbox'inda onbir haneli kimlik bilgisinin oldugunu dogrular")
    public void kullaniciTCKimlikNumarasiTextboxIndaOnbirHaneliKimlikBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(3).isDisplayed());
    }

    @And("Kullanici cep telefonu textbox'inda on haneli cep telefonu bilgisinin oldugunu dogrular")
    public void kullaniciCepTelefonuTextboxIndaOnHaneliCepTelefonuBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(4).isDisplayed());
    }

    @And("Kullanici dogum tarihi bilgisinin oldugunu dogrular")
    public void kullaniciDogumTarihiBilgisininOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisiselBilgiler.get(5).isDisplayed());
    }

    @Then("Kullanici Kişisel Bilgiler butonuna tiklar")
    public void kullaniciKisiselBilgilerButonunaTiklar() {
        bekle(2);
        profilPage.kisisel_bilgiler_button.click();
    }

    @And("Kullanici Kişisel Bilgiler sayfasinda oldugunu dogrular")
    public void kullaniciKisiselBilgilerSayfasindaOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisisel_bilgiler_title.isDisplayed());
    }

    @Then("Kullanici Kisisel Bilgiler butonuna tiklar ve sayfaya geçis yapar")
    public void kullaniciKisiselBilgilerButonunaTiklarVeSayfayaGecisYapar() {
        profilPage.kisisel_bilgiler_button.click();
        Assert.assertTrue(profilPage.kisisel_bilgiler_title.isDisplayed()); //gecis yaptıgını dogrular
    }

    @Then("Kullanici Ad kutusunu temizler")
    public void kullaniciAdKutusunuTemizler() {
        profilPage.kisiselBilgiler.get(0).clear();
    }

    @Then("Kullanici Ad kutusuna valid bir deger girer")
    public void kullaniciAdKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(0).sendKeys("new name");
    }

    @Then("Kullanici Soyad kutusunu temizler")
    public void kullaniciSoyadKutusunuTemizler() {
        profilPage.kisiselBilgiler.get(1).clear();
    }

    @Then("Kullanici Soyad kutusuna valid bir deger girer")
    public void kullaniciSoyadKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(1).sendKeys("new surname");
    }

    @Then("Kullanici TC kutusunu temizler")
    public void kullaniciTCKutusunuTemizler() {

        profilPage.kisiselBilgiler.get(3).clear();
    }

    @Then("Kullanici TC kutusuna valid bir deger girer")
    public void kullaniciTCKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(3).sendKeys("55510591258"); //aynı tc kullandım
    }

    @Then("Kullanici cep telefonu kutusunu temizler")
    public void kullaniciCepTelefonuKutusunuTemizler() {
        profilPage.kisiselBilgiler.get(4).clear();
    }

    @Then("Kullanici cep telefonu kutusuna valid bir deger girer")
    public void kullaniciCepTelefonuKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(4).sendKeys("5056771625"); //aynı cep teli kullandım
    }

    @Then("Kullanici email kutusunu temizler")
    public void kullaniciEmailKutusunuTemizler() {
        profilPage.kisiselBilgiler.get(2).clear();
    }

    @Then("Kullanici email kutusuna valid bir deger girer")
    public void kullaniciEmailKutusunaValidBirDegerGirer() {
        profilPage.kisiselBilgiler.get(2).sendKeys("salvatore@12345.hkh"); //aynı eposta
    }


    @Then("Kullanici dogum tarihi kutusunu temizler")
    public void kullaniciDogumTarihiKutusunuTemizler() {
        profilPage.kisiselBilgiler.get(5).clear();
    }

    @Then("Kullanici dogum tarihi kutusuna valid bir deger girer")
    public void kullaniciDogumTarihiKutusunaValidBirDegerGirer() {
        //profilPage.kisiselBilgiler.get(5).sendKeys("12/12/2000");
        profilPage.kisiselBilgiler.get(5).click();
        registerPage.header_year_click.click();

    }

    @Then("Kullanici geri tusu ile profil sayfasina gecis yapar")
    public void kullaniciGeriTusuIleProfilSayfasinaGecisYapar() {
        profilPage.back_button.click();
    }

    @Then("Kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        registerPage.kaydet_degisiklikler.click();

    }


    @And("Kullanici Kisisel Bilgiler' in basarili bir sekilde guncellendigini gorur")
    public void kullaniciKisiselBilgilerInBasariliBirSekildeGuncellendiginiGorur() {
        Assert.assertEquals("new name", profilPage.kisiselBilgiler.get(0).getText());
        Assert.assertEquals("new surname", profilPage.kisiselBilgiler.get(1).getText());
        Assert.assertEquals("salvatore@12345.hkh", profilPage.kisiselBilgiler.get(2).getText());
        Assert.assertEquals("55510591258", profilPage.kisiselBilgiler.get(3).getText());
        Assert.assertEquals("(505) 677 16 25", profilPage.kisiselBilgiler.get(4).getText());
        // Assert.assertEquals("12/12/2000",profilPage.kisiselBilgiler.get(5).getText());


    }

    @And("Kullanici Profil butonunu tiklar")
    public void kullaniciProfilButonunuTiklar() {
        anasayfaPage.profil.click();
    }

    @And("kullanici Odeme islem gecmisi yazisina tiklar")
    public void kullaniciOdemeIslemGecmisiYazisinaTiklar() {
        profilPage.odemeGecmisi.click();
    }

    @Then("Kullanici odeme gecmisini dogrular")
    public void kullaniciOdemeGecmisiniDogrular() {
        Assert.assertTrue(profilPage.odemeGecmisiDogrula.isDisplayed());
    }

    @And("Kullanici Çıkis Yap'a tıklar")
    public void kullaniciCikisYapATiklar() {

        scrollGesture(driver, profilPage.kisisel_bilgiler_button, "down", 20.0, 1000);

        profilPage.cikisyap.click();
    }

    @Then("Kullanici Evet'e tıklar")
    public void kullaniciEvetETiklar() {
        profilPage.evet.click();
    }

    @And("Bize ulasin menusune tiklar")
    public void bizeUlasinMenusuneTiklar() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bize Ulaşın\"))"));
        profilPage.bizeUlasin_button.click();
    }


    @And("Aciklama alanina aciklama girilir")
    public void aciklamaAlaninaAciklamaGirilir() {

    }    

   // profilPage.aciklama_textbox.click();
   // profilPage.aciklama_textbox.sendKeys("Bu Test Mesajidir");



    @And("Gonder butonuna tiklanir")
    public void gonderButonunaTiklanir() {
        profilPage.button_Gonder_Bize_Ulasin.click();
    }

    @And("Geri bildirim mesaji dogrulanir")
    public void geriBildirimMesajiDogrulanir() {
        String expectedMessage = "Geri bildiriminiz tarafımıza ulaşmıştır. En kısa sürede dönüş yapılacaktır.";

        Assert.assertEquals(expectedMessage,profilPage.GeribildirimMesaji_text.getText());
    }


    @And("Kullanici anasayfada Profil linkine tiklar")
    public void kullaniciAnasayfadaProfilLinkineTiklar() {
        profilPage.profil.click();

    }

    @And("Kullanici profil sayfasinda bildirimler linkine tiklar")
    public void kullaniciProfilSayfasindaBildirimlerLinkineTiklar() {
        profilPage.bildirimler.click();
    }

    @And("Kullanici Bildirimler sayfasindaki WEB bildirim linkini kapatir")
    public void kullaniciBildirimlerSayfasindakiWEBBildirimLinkiniKapatir() {
    }

    @And("Kullanici Bildirimler sayfasindaki WEB bildirim linkinin kapatilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiWEBBildirimLinkininKapatilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki WEB bildirim linkini acar")
    public void kullaniciBildirimlerSayfasindakiWEBBildirimLinkiniAcar() {
    }

    @And("Kullanici Bildirimler sayfasindaki WEB bildirim linkinin acilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiWEBBildirimLinkininAcilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki MOBİL bildirim linkini kapatir")
    public void kullaniciBildirimlerSayfasindakiMOBİLBildirimLinkiniKapatir() {
    }

    @And("Kullanici Bildirimler sayfasindaki MOBİL bildirim linkinin kapatilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiMOBİLBildirimLinkininKapatilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki MOBİL bildirim linkini acar")
    public void kullaniciBildirimlerSayfasindakiMOBİLBildirimLinkiniAcar() {
    }

    @And("Kullanici Bildirimler sayfasindaki MOBİL bildirim linkinin acilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiMOBİLBildirimLinkininAcilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkini kapatir")
    public void kullaniciBildirimlerSayfasindakiEPOSTABildirimLinkiniKapatir() {
    }

    @And("Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkinin kapatilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiEPOSTABildirimLinkininKapatilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkini acar")
    public void kullaniciBildirimlerSayfasindakiEPOSTABildirimLinkiniAcar() {
    }

    @And("Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkinin acilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiEPOSTABildirimLinkininAcilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki SMS bildirim linkini kapatir")
    public void kullaniciBildirimlerSayfasindakiSMSBildirimLinkiniKapatir() {
    }

    @And("Kullanici Bildirimler sayfasindaki SMS bildirim linkinin kapatilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiSMSBildirimLinkininKapatilabildiginiDogrula() {
    }

    @And("Kullanici Bildirimler sayfasindaki SMS bildirim linkini acar")
    public void kullaniciBildirimlerSayfasindakiSMSBildirimLinkiniAcar() {

    }
    @When("Kullanici Sifremi Degistir butonuna tiklar")
    public void kullaniciSifremiDegistirButonunaTiklar() {
        profilPage.Sifremi_Degistir.click();
    }

    @When("Mevcut Sifre alanina eski sifre girilir")
    public void mevcutSifreAlaninaEskiSifreGirilir() {
        profilPage.Mevcut_Sifre.sendKeys("111115");
    }

    @When("Yeni Sifre alanina valid eski sifreden farkli sifre girilir")
    public void yeniSifreAlaninaValidEskiSifredenFarkliSifreGirilir() {
        profilPage.Yeni_Sifre.sendKeys("111116");
    }

    @When("Yeni Sifre Dogrulama alanina bir onceki stepte girilen sifre girilir")
    public void yeniSifreDogrulamaAlaninaBirOncekiStepteGirilenSifreGirilir() {
        profilPage.YeniSifre_Dogrulama.sendKeys("111116");
    }


    @When("Kullanici Kaydete tiklar")
    public void kullaniciKaydeteTiklar() {
        profilPage.Kaydet_SifreDegistir.click();
        bekle(2);

    }

    @Then("Kullanici Bildirimler sayfasindaki SMS bildirim linkinin acilabildigini dogrula")
    public void kullaniciBildirimlerSayfasindakiSMSBildirimLinkininAcilabildiginiDogrula() {
    }

}
