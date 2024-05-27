package abonesepeti.stepdefs.abonelikler;

import abonesepeti.pages.*;
import abonesepeti.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MevcutAboneliklerStepDefs extends ReusableMethods {


    MevcutAbonelikPage mevcutAbonelikPage = new MevcutAbonelikPage();
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    ProfilPage profilPage = new ProfilPage();

    HizmetAlPage hizmetAlPage = new HizmetAlPage();

    LoginPage loginPage=new LoginPage();

    @And("Kullanici Anasayfada bulunan Abonelikler butonuna tiklar")
    public void kullaniciAnasayfadaBulunanAboneliklerButonunaTiklar() {
        mevcutAbonelikPage.aboneliklerButton.click();
    }
    @And("Kullanici acilan sayfadaki abonelik listesini dogrular")
    public void kullaniciAcilanSayfadakiAbonelikListesiniDogrular() {
        Assert.assertTrue(mevcutAbonelikPage.abonelikListeDogrulama.isDisplayed());
    }
    @Then("kullanici abonelik ismi ve diğer ilgili bilgileri ile birlikte dogrular")
    public void kullaniciAbonelikIsmiVeDigerIlgiliBilgileriIleBirlikteDogrular() {
Assert.assertTrue(mevcutAbonelikPage.abonelikListeDogrulama.isDisplayed());
    }

    @And("kullanici herhangibir abonelik kurumunu tiklar")
    public void kullaniciHerhangibirAbonelikKurumunuTiklar() {
        mevcutAbonelikPage.abonelikListeDogrulama.click();
        
    }
    @And("Kullanici herhangibir abonelik ismini tiklar")
    public void kullaniciHerhangibirAbonelikIsminiTiklar() {
        mevcutAbonelikPage.abonelikIsim.click();
    }

    @And("Kullanici sil butonuna tiklar")
    public void kullaniciSilButonunaTiklar() {
        mevcutAbonelikPage.sil.click();
    }

    @Then("kullanici Aboneligi sil uyari yazisini dogrular")
    public void kullaniciAboneligiSilUyariYazisiniDogrular() {
       Assert.assertTrue(mevcutAbonelikPage.abonelikSilDogrula.isDisplayed());
    }

    @And("Kullanici devam et uyari yazisina tiklar")
    public void kullaniciDevamEtUyariYazisinaTiklar() {
     //   mevcutAbonelikPage.devamEt.click();


    }

    @Then("Kullanici uyari onay yazisini dogrular")
    public void kullaniciUyariOnayYazisiniDogrular() {
        mevcutAbonelikPage.iptal.click();
    }

    @And("Kullanici anasayfada bulunan Abonelikler butonunu tiklar")
    public void kullaniciAnasayfadaBulunanAboneliklerButonunuTiklar() {
        mevcutAbonelikPage.aboneliklerButton.click();
    }
}
