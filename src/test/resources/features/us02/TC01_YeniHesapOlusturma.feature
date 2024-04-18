
@us02 @hepsi
Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC01 Yeni Hesap Olusturma Pozitif Senaryo
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    And Telefona SMS ile gelen 4 haneli dogrulama kodunu girer
    And Dogrula butonuna tiklar
    Then Basarili bir sekilde hesap olusturuldugunu dogrular

    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | test | test  | 5356901971 | testabc@abc.com | 123456 |