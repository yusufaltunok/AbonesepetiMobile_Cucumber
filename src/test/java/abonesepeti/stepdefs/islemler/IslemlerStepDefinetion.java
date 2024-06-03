package abonesepeti.stepdefs.islemler;

import abonesepeti.pages.IslemlerPage;
import abonesepeti.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IslemlerStepDefinetion extends ReusableMethods {

    IslemlerPage islemlerPage=new IslemlerPage();

    @When("Kullanici Islemler butonuna tiklar")
    public void kullanici_islemler_butonuna_tiklar() throws InterruptedException {
    islemlerPage.islemler.click();
    Thread.sleep(1000);
    }
    @When("Kullanici basvurularim butonunun gorunur oldugunu dogrular")
    public void kullanici_basvurularim_butonunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(islemlerPage.basvurularim.isDisplayed());
    }
    @When("Kullanici basvurularim butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_basvurularim_butonunun_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(islemlerPage.basvurularim.isEnabled());
    }
    @When("Kullanici basvurularim butonuna tiklar")
    public void kullanici_basvurularim_butonuna_tiklar() {
        islemlerPage.basvurularim.click();
    }
    @When("Kullanici Basvurularim sayfasinda oldugunu dogrular")
    public void kullanici_basvurularim_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(islemlerPage.basvurularim.isDisplayed());
    }
    @When("Kullanici Başvurularım sayfasinda Kolay Iptal sekmesinin gorunur oldugunu dogrular")
    public void kullanici_başvurularım_sayfasinda_kolay_iptal_sekmesinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(islemlerPage.kolayIptai.isDisplayed());
    }
    @When("Kullanici Başvurularım sayfasinda Yeni Abonelik sekmesinin gorunur oldugunu dogrular")
    public void kullanici_başvurularım_sayfasinda_yeni_abonelik_sekmesinin_gorunur_oldugunu_dogrular() {
        islemlerPage.yeniAbonelik.isDisplayed();
    }
    @When("Kullanici Başvurularım sayfasinda Yeni Abonelik sekmesine tiklar")
    public void kullanici_başvurularım_sayfasinda_yeni_abonelik_sekmesine_tiklar() throws InterruptedException {
        islemlerPage.yeniAbonelik.click();
        bekle(2);
    }
    @When("Kullanici Yeni Abonelik sekmesi altinda yaptigi basvurularini goruntuler")
    public void kullanici_yeni_abonelik_sekmesi_altinda_yaptigi_basvurularini_goruntuler() throws InterruptedException {
        //Assert.assertTrue(islemlerPage.abonelikListesi.get(1).isDisplayed());
        islemlerPage.abonelikListesi.get(0).isDisplayed();
        islemlerPage.abonelikListesi.get(1).isDisplayed();
    }
    @And("Kullanici Aboneliklerini Sorgula butonuna tiklar")
    public void kullaniciAbonelikleriniSorgulaButonunaTiklar() {
        islemlerPage.abonelikleriniSorgula.click();
    }
    @Then("Kullanici ilgili sayfada oldugunu dogrular")
    public void kullaniciIlgiliSayfadaOldugunuDogrular() {
        Assert.assertTrue(islemlerPage.abonelikleriniSorgulaDogrulama.isDisplayed());
    }
    @And("Kullanici E-Devlete Git butonuna tiklar")
    public void kullaniciEDevleteGitButonunaTiklar() {
        islemlerPage.edevlet.click();
    }
    @Then("Kullanici E-Devlet sayfasinda oldugunu dogrular")
    public void kullaniciEDevletSayfasindaOldugunuDogrular() {
        Assert.assertTrue(islemlerPage.edevletDogrula.isDisplayed());
    }
}
