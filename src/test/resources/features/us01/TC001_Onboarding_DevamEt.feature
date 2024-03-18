
Feature: Giris yap
  Scenario: Kullanici giris yapar
    When Abonesepeti uygulamasina giris yap
    And Giris sayfasi gelene kadar Devam Et butonuna tikla
    # And DEVAM ET butonuna tikladikca gelen onboarding ekranlarin goruntulendigini dogrula
    Then Login sayfasinin goruntulendigini dogrula