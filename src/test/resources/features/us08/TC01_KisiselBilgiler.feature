
@rabia
Feature: Us08

  Scenario: TC01 Kayıtlı Kisisel Bilgiler Goruntulenebilir Olmali

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Profil butonununa tiklar
    Then Kullanici Kisisel Bilgiler butonuna tiklar
    And Kullanici Kisisel Bilgiler sayfasinda oldugunu dogrular
    And Kullanici ad textbox'inda ad bilgisinin oldugunu dogrular
    And Kullanici soyad textbox'inda soyad bilgisinin oldugunu dogrular
    And Kullanici TC kimlik numarasi textbox'inda onbir haneli kimlik bilgisinin oldugunu dogrular
    And Kullanici cep telefonu textbox'inda on haneli cep telefonu bilgisinin oldugunu dogrular
    And Kullanici e-mail textbox'inda e-mail bilgisinin oldugunu dogrular
    And Kullanici dogum tarihi bilgisinin oldugunu dogrular




    #Navigate to Profil Page
    #Click on Kisisel Bilgiler
    #Kisisel Bilgiler Title'i gorulur
    #Ad gorulur
    #Soyad gorulur
    #11 haneli TC Kimlik Numarasi gorulur
    #10 haneli Cep Telefonu gorulur
    #E-mail gorulur
    #Dogum Tarihi gorulur
