@profil
  Feature: US17 Bildirimler sayfasında bildiriler kapatılıp açılabilmeli

    Scenario: TC01 - Pozitif Senaryo
      When Kullanici Abonesepeti uygulamasina giris yapar
      And Kullanici anasayfada Profil linkine tiklar
      And Kullanici profil sayfasinda bildirimler linkine tiklar
      And Kullanici Bildirimler sayfasindaki WEB bildirim linkini kapatir
      And Kullanici Bildirimler sayfasindaki WEB bildirim linkinin kapatilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki WEB bildirim linkini acar
      And Kullanici Bildirimler sayfasindaki WEB bildirim linkinin acilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki MOBİL bildirim linkini kapatir
      And Kullanici Bildirimler sayfasindaki MOBİL bildirim linkinin kapatilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki MOBİL bildirim linkini acar
      And Kullanici Bildirimler sayfasindaki MOBİL bildirim linkinin acilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkini kapatir
      And Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkinin kapatilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkini acar
      And Kullanici Bildirimler sayfasindaki E-POSTA bildirim linkinin acilabildiğini dogrula
      And Kullanici Bildirimler sayfasindaki SMS bildirim linkini kapatir
      And Kullanici Bildirimler sayfasindaki SMS bildirim linkinin kapatilabildigini dogrula
      And Kullanici Bildirimler sayfasindaki SMS bildirim linkini acar
      Then Kullanici Bildirimler sayfasindaki SMS bildirim linkinin acilabildiğini dogrula


