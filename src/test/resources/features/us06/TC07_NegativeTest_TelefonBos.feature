@TC007
Feature: US06 telefon ve sifre girilmeden giris yapilamamali

  Scenario: TC007  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici cep telefonu alanini bos birakir
    And Kullanici gecerli bir sifre girer
    And Kullanici giris yap butonuna tiklar
    Then Kullanici eksik bilgiler ile giris yapamadigini dogrular







    #Open Abonesepeti mobile app
    #Click on Atla button
    #Click on Giris Yap
    #Click on Telefon
    #Leave empty Cep Telefonu field
    #Enter a valid password into Sifre field
    #Click on Giris Yap button
    #Verify that you can not click on Giris Yap button