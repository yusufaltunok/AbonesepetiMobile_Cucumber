@us43
Feature: US43 Kart bilgileri
  Scenario: TC05 Kart bilgileri
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Hizmet Al butonunu tiklar
    And Kullanici Ilaclama Hizmeti Al butonuna tiklar
    And Kullanici gerekli bilgileri girer
    And Kullanici Devam Et butonunaa tiklar
    And Kullanici zorunlu alanlari doldurur
    And Kullanici teklif sayfasinda bulunan Devam Et butonuna tiklar
    And Kullanici sonraki sayfasinda bulunan Devam Et butonuna tiklar
    Then Kullanici kart bilgilerinin girilebildigini dogrular

