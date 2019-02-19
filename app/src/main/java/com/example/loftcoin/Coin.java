package com.example.loftcoin;

import com.google.gson.annotations.SerializedName;

public class Coin {
      public String id;
      public String name;
      public String symbol;
      @SerializedName("price_usd")
      public double priceUsd;
      @SerializedName("percent_change_24h")
      public double percentChange;


    /* "id": "bitcoin",
        "name": "Bitcoin",
        "symbol": "BTC",
        "rank": "1",
        "price_usd": "3933.12700415",
        "price_btc": "1.0",
        "24h_volume_usd": "9971183073.57",
        "market_cap_usd": "69011826353.0",
        "available_supply": "17546300.0",
        "total_supply": "17546300.0",
        "max_supply": "21000000.0",
        "percent_change_1h": "0.15",
        "percent_change_24h": "5.43",
        "percent_change_7d": "8.3",
        "last_updated": "1550553086"*/
}
