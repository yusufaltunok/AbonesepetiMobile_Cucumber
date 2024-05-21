@us33
Feature: US33 Abonelik Bilgileri
  Scenario: TC02 Abonelik bilgileri
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici anasayfada bulunan Abonelikler butonuna tiklar
    Then kullanici abonelik ismi ve diğer ilgili bilgileri ile birlikte dogrular
