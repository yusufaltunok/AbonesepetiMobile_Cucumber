@us33
Feature: US33 Sil Onay Kutusu
  Scenario: TC04 Sil Onay Kutusu
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici anasayfada bulunan Abonelikler butonunu tiklar
    And kullanici herhangibir abonelik kurumunu tiklar
    And Kullanici herhangibir abonelik ismini tiklar
    And Kullanici sil butonuna tiklar
    And Kullanici devam et uyari yazisina tiklar
   Then Kullanici uyari onay yazisini dogrular