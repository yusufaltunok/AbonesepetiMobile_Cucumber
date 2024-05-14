@US02_TC07

Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC07 Yeni Hesap Olusturma Negatif Senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And Kullanici "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Hesap olustur butonuna tiklar
    Then Hesap olusturulamadigini dogrular


    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | test | test  | 5356901971 | testabc@abc.com | 123456 |






