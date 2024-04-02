Feature: US06 telefon ve sifre girilmeden giris yapilamamali

  Scenario: TC003  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici telefon sekmesine tiklar.
    And Kullanici cep telefonu alanini bos birakir
    And Kullanici sifre alanini bos birakir
    And Kullanici giris yap butonuna tiklar
    Then Kullanici eksik bilgiler ile giris yapamadigini dogrular

