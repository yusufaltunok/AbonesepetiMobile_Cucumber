@TC010
Feature: US06 telefon ve sifre girilmeden giris yapilamamali

  Scenario: TC010  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici e-posta butonuna tiklar
    And Kullanici e-posta alanini bos birakir
    And Kullanici sifre alanini bos birakir
    And Kullanici sifremi unuttum butonuna tiklar
    And Kullanici cep telefonu alanini bos birakir
    And Kullanici Kodu Gonder butonuna tiklar
    Then Kullanici Kodu Gonder butonunun tiklanabilir olmadigini dogrular





  #Open Abonesepeti mobile app
  #Click on Atla button
  #Click on Giris Yap
  #Leave empty E-Posta field
  #Leave empty Sifre field
  #Click on Sifremi Unuttum button
  #Leave empty Cep Telefonu field
  #Click on Kodu Gonder button
  #Verify that you can not click on Kodu Gonder button