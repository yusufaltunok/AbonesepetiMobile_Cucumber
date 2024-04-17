@us05_TC002 @hepsi

Feature: US05 Onceden kayitli bilgiler ile Yeni Hesap Olusturamamali

  Scenario Outline: TC002 Yeni Hesap Olusturamama - negative Senaryo
    When Kullanici Abonesepeti uygulamasini acar
    And Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici Yeni hesap olustur butonuna tiklar
    And Kullanici onceden kayitli olan "<ad>", "<soyad>", "<cep telefonu>", "<e-posta>" ve "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    Then Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur
    Examples:
      | ad     | soyad | cep telefonu | e-posta             | sifre  |
      | tester | yusuf | 5056771625   | salvatore@12345.hkh | qqqqq1 |






      #Abonesepeti mobil uygulamasını aç.
      #Giriş yapmadan önce gelen ekranda "ATLA" butonuna tıkla
      #Yeni hesap oluştur butonuna tıkla
      #Onceden kayıtlı olan hesaba ait ad bilgisi girer.
      #Aynı kayıtlı olan hesaba ait soyad bilgisi girer.
      #Aynı kayıtlı olan bir cep telefonu numarası gir (başında sıfır olmadan 10 haneli girilmeli)
      #Aynı kayıtlı olan hesaba ait e-posta bilgisi girer.
      #Aynı Kayıtlı numaraya ait şifre gir
      #Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
      #Hesap oluştur butonuna tıkla.
      #Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur


