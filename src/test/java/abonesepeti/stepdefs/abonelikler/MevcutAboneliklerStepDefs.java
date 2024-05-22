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
    }

    @And("kullanici herhangibir abonelik kurumunu tiklar")
    public void kullaniciHerhangibirAbonelikKurumunuTiklar() {
        
    }
    @And("Kullanici herhangibir abonelik ismini tiklar")
    public void kullaniciHerhangibirAbonelikIsminiTiklar() {
    }

    @And("Kullanici sil butonuna tiklar")
    public void kullaniciSilButonunaTiklar() {
        
    }

    @Then("kullanici Aboneligi sil uyari yazisini dogrular")
    public void kullaniciAboneligiSilUyariYazisiniDogrular() {
        
    }

    @And("Kullanici devam et uyari yazisina tiklar")
    public void kullaniciDevamEtUyariYazisinaTiklar() {


    }

    @Then("Kullanici uyari onay yazisini dogrular")
    public void kullaniciUyariOnayYazisiniDogrular() {
    }

    @And("Kullanici anasayfada bulunan Abonelikler butonunu tiklar")
    public void kullaniciAnasayfadaBulunanAboneliklerButonunuTiklar() {
        mevcutAbonelikPage.aboneliklerButton.click();
    }
}
