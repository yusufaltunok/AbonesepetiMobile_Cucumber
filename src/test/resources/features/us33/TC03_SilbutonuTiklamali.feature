@us33
Feature: US33 Sil Butonu Tiklamali
  Scenario: TC03 Sil Butonu Tiklamali
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici anasayfada bulunan Abonelikler butonuna tiklar
    And kullanici herhangibir abonelik kurumunu tiklar
    And Kullanici herhangibir abonelik ismini tiklar
    And Kullanici sil butonuna tiklar
    Then kullanici Aboneligi sil uyari yazisini dogrular