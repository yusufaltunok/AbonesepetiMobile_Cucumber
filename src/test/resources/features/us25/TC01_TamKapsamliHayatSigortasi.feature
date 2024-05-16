@US25_TC01
Feature: Us25 - Tam Kapsamli Hayat Sigortasi

  Scenario: TC01 - Tam Kapsamli Hayat Sigortasi satin alma islemi

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Hizmet Al bbutonunu tiklar
    Then Kullanici Anadolu Hayat Gelecegim sekmesi tiklar
    Then Kullanici Sigorta Urunlerim basligi altında Tam Kapsamli Hayat Sigortasi butonu tikklar
    Then Kullanici hayat sigortasisayfasinda oldugunu dogrular
    Then Kullanici Satin Al butonunun gorur
    Then Kullanici Satin Al butonunu tiklar
    Then Kullanici Anandolu Hayat Emeklilik banka uygulamasi sayfasina ulasir