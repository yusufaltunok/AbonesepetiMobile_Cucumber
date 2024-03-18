
Feature: US01 Onboarding
  Scenario: TC01 Onboarding "Devam Et"
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Giris sayfasi gelene kadar Devam Et butonuna tiklar
    # And DEVAM ET butonuna tikladikca gelen onboarding ekranlarin goruntulendigini dogrula
    Then Login sayfasinin goruntulendigini dogrular