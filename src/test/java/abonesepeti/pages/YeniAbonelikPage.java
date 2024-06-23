package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YeniAbonelikPage {
    public YeniAbonelikPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
      //  @AndroidFindBy (id ="")
    //            public WebElement yeniAbonelikButtonFth;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Abonelik başlat\")")
    public WebElement abonelikBaslatFth;

    public static WebElement yeniAbonelikBaslatListesi2(int idx) {
        List<String> yeniAbonelikBaslatList = new ArrayList<>
                (Arrays.asList("TV & Yayın", "İnternet", "İnternet+Tv", "Tv", "Su Arıtma", "Miniklere Özel", "Eğitim", "Ev Koruma", "Dergi", "Eğlence & Müzik", "Dijital Kod", "Hediye Kartı", "Güvenlik", "Diğer"));
        String element = yeniAbonelikBaslatList.get(idx);
        //@AndroidFindBy(uiAutomator = "newUiSelector().text("+element+")");
        //By byElement = MobileBy.androidUIAutomator("new UiSelector().text(\"" + element + "\")");
        By byElement = AppiumBy.androidUIAutomator("new UiSelector().text(\"" + element + "\")");
        WebElement webElement1 = Driver.getDriver().findElement(byElement);

        return webElement1;
    }

    //--------------------------------------------------------------------------------------------------------------
    // yeni eklenecek locatler bu satırın üzerine yazılabilir aşağıdaki yorum içerisindeki locateleri düzenleyeceğim (Fatih)

   /* @AndroidFindBy(uiAutomator = "newUiSelector().text("+yeniAbonelikBaslatListesi() +")")
    public WebElement TVYayin1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"İnternet\")")
    public WebElement internet1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"İnternet+Tv\")")
    public WebElement internetTv1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Tv\")")
    public WebElement TV1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Su Arıtma\")")
    public WebElement suAritma1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Miniklere Özel\")")
    public WebElement miniklereOzel1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Eğitim\")")
    public WebElement egitim1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Ev Koruma\")")
    public WebElement evKoruma1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Dergi\")")
    public WebElement dergi1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Eğlence & Müzik\")")
    public WebElement eglenceMuzik1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Dijital Kod\")")
    public WebElement dijitalKod1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Hediye Kartı\")")
    public WebElement hediyeKarti1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Güvenlik\")")
    public WebElement guvenlik1;
    @AndroidFindBy(uiAutomator = "newUiSelector().text(\"Diğer\")")
    public WebElement diger1;*/

    //---------------------------------------------------------------------------------------------

    }

