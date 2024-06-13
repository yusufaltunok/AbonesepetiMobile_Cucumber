@us48
Feature: US48 Rezervasyon
  Scenario: TC04 Rezervasyon
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Hizmet Al butonunu tiklar
    And Kullanici Ilaclama Hizmeti Al butonuna tiklar
    And Kullanici gerekli bilgileri girer
    And Kullanici Devam Et butonunaa tiklar
    And Kullanici zorunlu alanlari doldurur
    And Kullanici teklif sayfasinda bulunan Devam Et butonuna tiklar

