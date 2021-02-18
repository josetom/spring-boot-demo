package com.dex.exchange.binance;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.config.BinanceApiConfig;
import com.dex.constants.ExchangeConstants;

public class BinanceClient {

    private static BinanceApiRestClient binanceApiRestClient;

    public static BinanceApiRestClient getRestClient() {
        if(binanceApiRestClient == null) {
            BinanceApiConfig.setTestMode(true);
            BinanceApiClientFactory factory = BinanceApiClientFactory
                    .newInstance(ExchangeConstants.Binance.API_KEY, ExchangeConstants.Binance.SECRET_KEY);
            binanceApiRestClient = factory.newRestClient();
        }
        return binanceApiRestClient;
    }

}
