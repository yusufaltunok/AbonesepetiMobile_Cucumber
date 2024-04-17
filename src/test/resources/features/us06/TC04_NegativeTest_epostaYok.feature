@TC004

Feature: US06 e_posta girilmeden giris yapilamamali

  Scenario: TC004  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici e-posta butonuna tiklar
    And Kullanici e-posta alanini bos birakir
    And Kullanici gecerli bir sifre girer
    And Kullanici giris yap butonuna tiklar
    Then Kullanici eposta alani altinda uyari yazisi gorur.