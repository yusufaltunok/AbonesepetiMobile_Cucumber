@TC009
Feature: US06 telefon ve sifre girilmeden giris yapilamamali

  Scenario: TC009  - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici uygulamaya girebilmek icin giris yapa tiklar
    And Kullanici e-posta alanini bos birakir
    And Kullanici sifre alanini bos birakir
    And Kullanici sifremi unuttum butonuna tiklar
    And Kullanici gecerli bir telefon numarasi girer
    And Kullanici Kodu Gonder butonuna tiklar
    And Kullanici cep telefonuna gelen 4 rakamli OTP kodunu girer
    And Kullanici Dogrula butonuna tiklar
    And Kullanici gecerli bir sifre girer
    And Kullanici sifreyi tekrar girer
    And Kullanici sifreyi kaydet butonuna tiklar
    Then Kullanici sifrenin basarili bir sekilde degistirildigini dogrular



    #Open Abonesepeti mobile app
    #Click on Atla button
    #Click on Giris Yap
    #Leave empty E-Posta field
    #Leave empty Sifre field
    #Click on Sifremi Unuttum button
    #Enter a valid 10 digit mobile phone number into Cep Telefonu field
    #Click on Kodu Gonder button
    #Enter 4 digit code which comes to your phone
    #Click on Dogrula button
    #Enter a new valid password into password field
    #Enter a same password with above into confirm password field
    #Click on Sifre Guncelle button
    #Verify that you can successfully update password and navigate to login page


