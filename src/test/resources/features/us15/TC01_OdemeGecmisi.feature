
@us15
Feature: US15 Odeme Gecmisi
  Scenario: TC01 Odeme Gecmisi
    When Kullanici Abonesepeti mobil uygulamasında "Anasayfaya" girer
    And Kullanici Profil butonunu tiklar
    And kullanici Odeme islem gecmisi yazisina tiklar
    Then Kullanici odeme gecmisini dogrular
