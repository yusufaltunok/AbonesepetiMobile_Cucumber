@TC008
Feature: US06 telefon ve sifre girilmeden giris yapilamamali

  Scenario: TC008  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici gecerli bir telefon numarasi girer
    And Kullanici sifre alanini bos birakir
    And Kullanici giris yap butonuna tiklar
    Then Kullanici sifre alani altinda uyari yazisi gorur.





  #Open Abonesepeti mobile app
  #Click on Atla button
  #Click on Giris Yap
  #Click on Telefon
  #Enter a valid 10 digit phone number
  #Leave empty Sifre field
  #Click on Giris Yap button
  #Verify that you can not click on Giris Yap button