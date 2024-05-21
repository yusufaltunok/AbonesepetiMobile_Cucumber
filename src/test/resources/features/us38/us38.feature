Feature: Kullanici_yeni_dergi_aboneligi_baslatabilmeli
  Scenario: Dergi aboneligi baslatabilmeli secilen ürünler sepete eklenebilmeli ve satın alınabilmeli
    And Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Hizmet Al butonuna tiklar
    And Kullanici Dergi Aboneligi Baslat menusune tiklar
    And Kullanici Dergi Aboneligi Kategoriler butonuna tiklar
    And Kullanici Dergi Aboneligi "İs Dunyasi" kategroisine tiklar
    And Kullanici Dergi Aboneligi "Ekonomist" Dergisine tiklar
    And Kullanici Secilen dergiyi sepete ekler
    And Kullanici Dergi Aboneligi sepeti ikonuna butonuna tiklar
    And Kullanici Dergi Aboneligi icin odemeye git butonuna tiklar
    #And Kullanici Dergi Aboneligi odeme gecerli bilgileri girer Odemeye devam et Butonuna tiklar