Feature: Abonelik tiplerinde siralama yapma
  Scenario Outline: Abonelik tiplerinde, "Sirala" sekmesi tiklanabilmeli

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Islemler butonuna tiklar
    Then Kullanici Abeonelik Baslat sekmesine tiklar
    Then Kullanici "<Abonelik Tipi>" secer
    Then Kullanici sırala sekmesine tiklar
    And  Kullanici onerilen, artan fiyat, azalan fiyat listelemesi yapar
    And Kullanici internet abonelik tipinde başvuru yapabilmeli
    And Kullanici internet+TV abonelik tipinde 'hemen başvur' butonunu görebilmeli ve geri tusu ile onceki sayfaya donebilmeli

    Examples:
      |Abonelik Tipi  |
      |TV & Yayın |
      |İnternet |
      |İnternet+TV |
      |TV|
      |TV & Yayın |
      |Su Arıtma |
      |Miniklere Özel|
      |Eğitim |
      |Ev Koruma |
      |Dergi |
      |Eğlence & Müzik|
      |Dijital Kod|
      |Hediye Kartı|
      |Güvenlik|

