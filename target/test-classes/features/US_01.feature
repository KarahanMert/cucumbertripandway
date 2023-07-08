Feature: Bir ziyaretçi olarak siteyi kullanabilmek icin web sitesine erişebildiğimi doğrulayabilmeliyim

  Scenario: Açılan browserda https://qa.tripandway.com/ adresine gidebilmeli ve anasayfaya ulaşılabildiği doğrulanmalı
    Given  TripandwayUrl adresine gidilir
    Then Ana sayfanın açıldığını doğrula
    Then Sayfayı kapatır

