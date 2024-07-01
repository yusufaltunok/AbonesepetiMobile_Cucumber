Feature: Gelecek Plani Teklifi Al
  Scenario: Anadolu Hayat Gelecegim linkinden urunleri satin alabilmeli

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Hizmet Al butonunu tiklar
    Then Kullanici Anadolu Hayat Gelecegim sekmesi tiklar
    Then Kullanici bireysel emeklilik urunleri basligi altindaki urunlere tiklar, satin alir.