@US03_TC01
  Feature: US03 Google hesabı ile yeni hesap olusturma
    Scenario: TC01 Google hesabı ile yeni hesap olusturma pozitif senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici Google ikonuna tiklar
    And Kullanici acilan sayfada bir Google hesabi secer
    And Kullanici kayitli olmayan bir telefon numarasi girer
    And Kullanici gecerli bir sifre girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    And Telefona SMS ile gelen 4 haneli dogrulama kodunu girer
    And Dogrula butonuna tiklar
    Then Basarili bir sekilde hesap olusturuldugunu dogrular





#Google ikonuna tıkla.
#Sürdür butonuna tıkla
#Açılan sayfada bir Google hesabı seç
#Cep telefonu numarası gir (başında sıfır olmadan 10 haneli girilmeli)
#Şifre gir (en az 6 en fazla 16 karakter,en az 1 harf ve 1 rakam olmalı)
#Kullanıcı sözleşmesini kabul etmek için checkbox'ı tıkla.
#Hesap oluştur butonuna tıkla.
#Telefona SMS ile gelen 4 haneli doğrulama kodunu gir.
#Doğrula butonuna tıkla.
#Başarılı bir şekilde hesap oluşturulduğunu doğrula.