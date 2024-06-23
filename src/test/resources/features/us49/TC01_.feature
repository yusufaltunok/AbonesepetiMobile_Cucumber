@us49
Feature: Abone Başlat sayfasinda, Yeni Abonelik altında abonelik tipi olarak ürünler ile ilgili islemler yapabilmeli
  Scenario: Abone Başlat sayfasinda, Yeni Abonelik altında abonelik tipi olarak ürünleri listeleyebilmeli
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar fth
  And Kullanici Yeni Abonelik sayfasinda Abonelik kategorilerini oldugunu dogrular
    #And Kullanici abonelik tipinden TV & Yayin secer.
    #Then Kullanici abonelik tipinden TV & Yayin secimi yapabildigini dogrular.