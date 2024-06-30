@us49
Feature: Abone Başlat sayfasinda, Yeni Abonelik altında abonelik tipi olarak ürünler ile ilgili islemler yapabilmeli
  Scenario: Abone Başlat sayfasinda, Yeni Abonelik altında abonelik tipi olarak ürünleri listeleyebilmeli
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Islemler butonuna tiklar
    And Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar fth
  And Kullanici Yeni Abonelik sayfasinda Abonelik kategorilerini oldugunu dogrular
  And Kullanici Yeni Abonelik sayfasinda Size Ozel Firsatlar basligini dogrular
  And Kullanici Yeni Abonelik sayfasinda Size Ozel Firsatlar basligindaki urunlerin tiklanabilir oldugu dogrulanir
  And Kullanici Yeni Abonelik sayfasinda Size Ozel Firsatlar basligindaki urunlerin detaylarina erisebilmeli
  And Kullanici Yeni Abonelik sayfasinda Size Ozel Firsatlar basligindaki urunlerden birine basvuru yapabilmeli
    #And Kullanici abonelik tipinden TV & Yayin secer.
    #Then Kullanici abonelik tipinden TV & Yayin secimi yapabildigini dogrular.