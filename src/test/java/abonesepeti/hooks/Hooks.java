package abonesepeti.hooks;

import abonesepeti.utilities.ConfigReader;
import abonesepeti.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;

import static abonesepeti.utilities.ReusableMethods.bekle;
import static abonesepeti.utilities.ReusableMethods.raporuAc;

public class Hooks {

    @BeforeAll
    public static void beforeAll() {
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));
    }

    @Before
    public void setUp() {
        Driver.getDriver().activateApp(ConfigReader.getProperty("AppPackage"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshotAs = Driver.getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotAs, "image/png", "Hata_Resmi");
        }
        Driver.getDriver().terminateApp(ConfigReader.getProperty("AppPackage"));
        bekle(5);
    }

    @AfterAll
    public static void afterAll() {
      //  Driver.uygulamayiKapat();
        Driver.serverKapat();
  //      raporuAc();
    }

}
