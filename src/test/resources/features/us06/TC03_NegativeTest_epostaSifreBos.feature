Feature: US06 e_posta ve sifre girilmeden giris yapilamamali

  Scenario: TC003  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici e-posta alanini bos birakir
    And Kullanici sifre alanini bos birakir
    And Kullanici giris yap butonuna tiklar
    Then Kullanici giris yapamadigini dogrular

