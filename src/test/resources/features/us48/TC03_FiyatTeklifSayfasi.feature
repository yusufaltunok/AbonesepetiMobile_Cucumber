@us48
Feature: US48 Fiyat teklif sayfasi
  Scenario: TC03 Fiyat teklif sayfasi
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Hizmet Al butonunu tiklar
    And Kullanici Ilaclama Hizmeti Al butonuna tiklar
    And Kullanici gerekli bilgileri girer
    And Kullanici Devam Et butonunaa tiklar
    Then Kullanici fiyat teklif sayfasini dogrular



