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

    IslemlerPage islemlerPage = new IslemlerPage();

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

    @Then("Kullanici islemler sayfasinda Abonelik İslemleri basligi altinda yer alan Abonelik Baslat sekmesinin gorunur oldugunu dogrular.")
    public void kullaniciIslemlerSayfasindaAbonelikIslemleriBasligiAltindaYerAlanAbonelikBaslatSekmesininGorunurOldugunuDogrular() {
        Assert.assertTrue(islemlerPage.abonelikBaslat.isDisplayed());
    }
    @And("Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar.")
    public void kullaniciIslemlerSayfasindaAbonelikIslemleriBasligiAltindaYerAlanAbonelikBaslatSekmesineTiklar(){
        islemlerPage.abonelikBaslat.click();
    }
    @Then("Kullanici abonelik tipi listesinin goruntulendigini dogrular.")
    public void kullaniciAbonelikTipiListesininGoruntulendiginiDogrular()  {
        // Ilk elemanın görünürlüğünü kontrol etme
        Assert.assertTrue(islemlerPage.abonelikTipiListesi.get(0).isDisplayed());
        // Son elemanın görünürlüğünü kontrol etme
        int lastIndex = islemlerPage.abonelikTipiListesi.size() - 1;
        if (islemlerPage.abonelikTipiListesi.get(lastIndex).isDisplayed()) {
            System.out.println("Son abonelik tipi görüntülendi.");
        } else {
            System.out.println("Son abonelik tipi görüntülenemedi.");
        }
        Assert.assertTrue(islemlerPage.abonelikTipiListesi.get(lastIndex).isDisplayed());
    }

    @And("Kullanici abonelik tipinden TV & Yayin secer.")
    public void kullaniciAbonelikTipindenTVYayinSecer(){
        islemlerPage.abonelikTipiListesi.get(0).click();
    }

    @Then("Kullanici abonelik tipinden TV & Yayin secimi yapabildigini dogrular.")
    public void kullaniciAbonelikTipindenTVYayinSecimiYapabildiginiDogrular() {
        Assert.assertTrue(islemlerPage.titleTv.isDisplayed());
    }
    @And("Secilen abonelik tipi icin ozel firsatlar bilgileri goruntuler ve TV+ tiklar.")
    public void secilenAbonelikTipiIcinOzelFirsatlarBilgileriGoruntulerVeTVTiklar() {
        Assert.assertTrue(islemlerPage.sizeOzelFirsatlarListTitle.isDisplayed());
        //Assert.assertTrue(islemlerPage.sizeOzelFirsatlarStarImage.isDisplayed());
        islemlerPage.tvAndYayinList.get(2).click();
        islemlerPage.tvPremium1AylikSatinAlButton.click();
    }
    @Then("Kullanici TV+ sayfasina ulastigini dogrular.")
    public void kullaniciTVSayfasinaUlastiginiDogrular() {
        Assert.assertTrue(islemlerPage.urunDetayiTV.isDisplayed());
    }

    @And("Kullanici TV+ sayfasinda Satin Al butonuna tiklar.")
    public void kullaniciTVSayfasindaSatinAlButonunaTiklar() {
        islemlerPage.urunDetayiTvPlusSatinAlButton.click();

    }

    @And("Kullanici Yeni Abonelik Title ve Devam Et Butonunun Goruldugunu Dogrular.")
    public void kullaniciYeniAbonelikTitleVeDevamEtButonununGoruldugunuDogrular() {
        Assert.assertTrue(islemlerPage.yeniAbonelikTitle.isDisplayed());
        Assert.assertTrue(islemlerPage.yeniAbonelikDevamEtButton.isDisplayed());

    }


//    String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
//    Assert.assertEquals(toastMessage,"Please enter your name");

    @And("Kullanici hane ve kisi secip devam et butonuna tiklar")
    public void kullaniciHaneVeKisiSecipDevamEtButonunaTiklar() {
    }

    @Then("Kullanici Abeonelik Baslat sekmesine tiklar")
    public void kullaniciAbeonelikBaslatSekmesineTiklar() {

    }

    @Then("Kullanici {string} secer")
    public void kullaniciSecer(String arg0) {
    }

    @Then("Kullanici sırala sekmesine tiklar")
    public void kullaniciSıralaSekmesineTiklar() {
    }

    @And("Kullanici onerilen, artan fiyat, azalan fiyat listelemesi yapar")
    public void kullaniciOnerilenArtanFiyatAzalanFiyatListelemesiYapar() {
    }

    @And("Kullanici internet abonelik tipinde başvuru yapabilmeli")
    public void kullaniciInternetAbonelikTipindeBaşvuruYapabilmeli() {
    }

    @And("Kullanici internet+TV abonelik tipinde {string} butonunu görebilmeli ve geri tusu ile onceki sayfaya donebilmeli")
    public void kullaniciInternetTVAbonelikTipindeHemenBaşvurButonunuGörebilmeliVeGeriTusuIleOncekiSayfayaDonebilmeli() {
    }
}

