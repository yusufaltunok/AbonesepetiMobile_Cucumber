@TC005
Feature: US06 sifre girilmeden giris yapilamamali

  Scenario: TC005  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici e-posta butonuna tiklar
    And Kullanici gecerli bir eposta girer
    And Kullanici sifre alanini bos birakir
    And Kullanici giris yap butonuna tiklar
    Then Kullanici sifre alani altinda uyari yazisi gorur.