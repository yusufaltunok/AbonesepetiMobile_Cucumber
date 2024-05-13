
@us18
Feature: Us18
  Scenario: TC01 Profilde Bize ulasin menusundeki valid bilgiler ile geri bildilim gonderilebildigi dogrulanabilmeli
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Profil butonununa tiklar
    And Bize ulasin menusune tiklar
    And Aciklama alanina aciklama girilir
    And Gonder butonuna tiklanir
    And Geri bildirim mesaji dogrulanir
