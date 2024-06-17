package abonesepeti.stepdefs.yeniAbonelik;

import abonesepeti.pages.IslemlerPage;
//import abonesepeti.pages.YeniAbonelikPage;
import abonesepeti.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import static abonesepeti.pages.IslemlerPage.yeniAbonelikBaslatListesi1;

public class YeniAbonelik_StepDefs extends ReusableMethods {

    //YeniAbonelikPage yp = new YeniAbonelikPage();
    IslemlerPage islemlerPage = new IslemlerPage();

    @And("Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar fth")
    public void kullaniciIslemlerSayfasindaAbonelikIslemleriBasligiAltindaYerAlanAbonelikBaslatSekmesineTiklarfth(){
        bekle(3);
        islemlerPage.abonelikBaslatFth.click();
        bekle(2);
    }
    @When("Kullanici Yeni Abonelik sayfasinda Abonelik kategorilerini oldugunu dogrular")
    public void kullanici_yeni_abonelik_sayfasinda_abonelik_kategorilerini_oldugunu_dogrular() {

        int kategoriSayisi = 9; //normalde 14 sayfa kaydırma kullanılacak burada kaldık
        for (int i = 0; i <= kategoriSayisi ; i++) {

            try {
                yeniAbonelikBaslatListesi1(i).isDisplayed();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

}
