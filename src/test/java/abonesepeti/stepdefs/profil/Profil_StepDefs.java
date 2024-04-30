package abonesepeti.stepdefs.profil;

import abonesepeti.pages.AnasayfaPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static abonesepeti.utilities.Driver.driver;

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
    public void kullaniciKişiselBilgilerButonunaTiklar() {
        bekle(2);
        profilPage.kisisel_bilgiler_button.click();
    }

    @And("Kullanici Kişisel Bilgiler sayfasinda oldugunu dogrular")
    public void kullaniciKişiselBilgilerSayfasindaOldugunuDogrular() {
        Assert.assertTrue(profilPage.kisisel_bilgiler_title.isDisplayed());
    }

    @Then("Kullanici Kisisel Bilgiler butonuna tiklar ve sayfaya geçis yapar")
    public void kullaniciKisiselBilgilerButonunaTiklarVeSayfayaGeçisYapar() {
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
        Assert.assertEquals("new name",profilPage.kisiselBilgiler.get(0).getText());
        Assert.assertEquals("new surname",profilPage.kisiselBilgiler.get(1).getText());
        Assert.assertEquals("salvatore@12345.hkh",profilPage.kisiselBilgiler.get(2).getText());
        Assert.assertEquals("55510591258",profilPage.kisiselBilgiler.get(3).getText());
        Assert.assertEquals("(505) 677 16 25",profilPage.kisiselBilgiler.get(4).getText());
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


    @Then("Kullanici Hesabimi Sil butonuna tiklar")
    public void kullaniciHesabimiSilButonunaTiklar() {
        profilPage.hesabimiSil_button.click();
    }

    @Then("Kullanici Yinede Sil ve Iptal butonlarını goruntuler")
    public void kullaniciYinedeSilVeIptalButonlarınıGoruntuler() {
        Assert.assertTrue(profilPage.yinedeSil_button.isDisplayed());
        Assert.assertTrue(profilPage.iptal_silmeIslemi.isDisplayed());
    }

    @Then("Kullanici Iptal butonuna tiklar ve profil sayfasında kaldıgını dogrular")
    public void kullaniciIptalButonunaTiklarVeProfilSayfasındaKaldıgınıDogrular() {
        profilPage.iptal_silmeIslemi.click();
        Assert.assertTrue(profilPage.profilSAyfasi_text.isDisplayed());
    }


    @Then("Kullanici Yinede Sil butonunu tiklar")
    public void kullaniciYinedeSilButonunuTiklar() {
        profilPage.yinedeSil_button.click();
    }

    @Then("Kullanici mevcut sifre textboxina sifresini girer")
    public void kullaniciMevcutSifreTextboxinaSifresiniGirer() {
        profilPage.mevcutSifre_textbox.click();
        profilPage.mevcutSifre_textbox.sendKeys("123456");
    }

    @Then("Kullanici sifrenin yanindaki goz simgesine tiklar")
    public void kullaniciSifreninYanindakiGozSimgesineTiklar() {
        profilPage.sifreGoruntule.click();
    }

    @Then("Kullanici gecerli sifresini girdigini dogrular")
    public void kullaniciGecerliSifresiniGirdiginiDogrular() {
        Assert.assertEquals("123456",profilPage.sifreText.getText());

    }

    @Then("Kullanici sil butonunu tiklar")
    public void kullaniciSilButonunuTiklar() {
        profilPage.delete_account.click();
    }

    @Then("Kullanici musteri uyari mesajini goruntuler")
    public void kullaniciMusteriUyariMesajiniGoruntuler() {
        Assert.assertTrue(profilPage.hesabimiSil_uyariMessaji.isDisplayed());
    }

    @Then("Kullanici Sil ve Devam Et butonlarinin tiklanabilir oldugunu dogrular")
    public void kullaniciSilVeDevamEtButonlarininTiklanabilirOldugunuDogrular() {
        Assert.assertTrue(profilPage.devamEt_text.isDisplayed());
        Assert.assertTrue(profilPage.sil.isDisplayed());
    }

    @And("Kullanici silinen hesap bilgileri ile giris yapamadigini dogrular ve tamam butonuna tiklar")
    public void kullaniciSilinenHesapBilgileriIleGirisYapamadiginiDogrularVeTamamButonunaTiklar() {
        Assert.assertTrue(profilPage.eslesenHesapBulunamadi_messaji.isDisplayed());
        profilPage.tamam_müsteri_messaji.click();
    }
}